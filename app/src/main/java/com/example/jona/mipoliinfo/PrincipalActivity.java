package com.example.jona.mipoliinfo;

import android.os.Bundle;

import android.app.Activity;

import android.support.v4.widget.DrawerLayout;

import android.view.MenuItem;
import android.widget.ArrayAdapter;

import android.widget.ListView;

import android.view.View;
import android.widget.AdapterView;
import android.app.FragmentManager;
import android.app.Fragment;
import android.app.FragmentTransaction;


import android.support.v7.app.ActionBarDrawerToggle;

import android.content.res.Configuration;



public class PrincipalActivity extends Activity {

    private String[] opciones;
    private ListView drawerList;

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;

    private int currentPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_principal);


        opciones = getResources().getStringArray(R.array.opciones);
        drawerList = (ListView)findViewById(R.id.drawer);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerList.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1,opciones));

        drawerList.setOnItemClickListener(new DrawerItemClickListener());

        if(savedInstanceState == null){
            selectItem(0);
        }

        //crear el actionbardrawerToggle
        drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open_drawer,R.string.Close_drawer){

            public void onDrawerClosed(View view){
                super.onDrawerClosed(view);
                invalidateOptionsMenu();
            }

            public void onDrawerOpened(View drawerView){
                super.onDrawerOpened(drawerView);
                invalidateOptionsMenu();
            }

        };

        drawerLayout.setDrawerListener(drawerToggle);

        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

        //fragmento correcto
        if(savedInstanceState != null){
            currentPosition = savedInstanceState.getInt("position");
            setActionBarTitle(currentPosition);

        }else{
            selectItem(0);
        }
        if(savedInstanceState != null){
            currentPosition = savedInstanceState.getInt("position");
            setActionBarTitle(currentPosition);
        }else{
            selectItem(0);
        }

        getFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener(){
                public void onBackStackChanged(){
                    FragmentManager fragMan = getFragmentManager();
                    Fragment fragment = fragMan.findFragmentByTag("visible_fragment");
                    if(fragment instanceof TopFragment){
                        currentPosition = 0;
                    }
                    if(fragment instanceof MiInfoFragment){
                        currentPosition = 1;
                    }
                    if(fragment instanceof HorarioFragment){
                        currentPosition = 2;
                    }
                    if(fragment instanceof ProfesoresFragment){
                        currentPosition = 3;
                    }
                    if(fragment instanceof TareasFragment){
                        currentPosition = 4;
                    }
                    if(fragment instanceof SaewFragment){
                        currentPosition = 5;
                    }
                    setActionBarTitle(currentPosition);
                    drawerList.setItemChecked(currentPosition, true);

                }
            }
        );



    }

    private class DrawerItemClickListener implements ListView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            selectItem(position);
        }
    }

    private void selectItem(int position){
        currentPosition = position;
        Fragment fragment;
        switch (position){
            case 1:
                fragment = new MiInfoFragment();
                break;
            case 2:
                fragment = new HorarioFragment();
                break;
            case 3:
                fragment = new ProfesoresFragment();
                break;
            case 4:
                fragment = new TareasFragment();
                break;
            case 5:
                fragment = new SaewFragment();
                break;

                default:
                    fragment = new TopFragment();
        }
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.content_frame, fragment, "visible_fragment");
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
        setActionBarTitle(position);
        drawerLayout.closeDrawer(drawerList);

        setActionBarTitle(position);

        //cerrar el drawer
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerLayout.closeDrawer(drawerList);

    }

    private void setActionBarTitle(int position){
        String title;
        if(position==0){
            title = getResources().getString(R.string.app_name);
        }else{
            title = opciones[position];

        }
        getActionBar().setTitle(title);
    }

   @Override //sync con el estado del ActionBar
    protected void onPostCreate(Bundle savedInstanceState){
       super.onPostCreate(savedInstanceState);
       drawerToggle.syncState();
   }

   @Override//cualquier configuracionde los cambios añ actionBarDrawerToggle
    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
   }

   @Override
    public boolean onOptionsItemSelected(MenuItem item){
       if(drawerToggle.onOptionsItemSelected(item)){
           return true;
       }
        switch (item.getItemId()){
           default:
               return super.onOptionsItemSelected(item);
        }
   }

   @Override
    public void onSaveInstanceState (Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("position",currentPosition);
   }


}
