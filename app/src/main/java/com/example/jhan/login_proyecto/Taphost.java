package com.example.jhan.login_proyecto;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

/**
 * Created by JHAN  ARLY on 13/05/2015.
 */
public class Taphost extends ActionBarActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         //setContentView(R.layout.activity_main);


        ActionBar actionBar = getSupportActionBar();

        /**INDICAR TITULO Y SUBTITULO**/
        actionBar.setTitle("Registro Auxiliar Docente");
        actionBar.setSubtitle("Upeu Tarapoto");

        /**MODO TABS EN ACTIONBAR**/
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        /**CREAR TABS**/
        ActionBar.Tab tab = actionBar.newTab()
                .setText("Inicio")
                .setTabListener(new TabsListener(
                        this, "inicio", Inicio.class));
        actionBar.addTab(tab);

        tab = actionBar.newTab()
                .setText("Editar")
                .setTabListener(new TabsListener(
                        this, "editar", Editar.class));
        actionBar.addTab(tab);

        tab = actionBar.newTab()
                .setText("Formulas")
                .setTabListener(new TabsListener(
                        this, "formulas", Formulas.class));
        actionBar.addTab(tab);

        tab = actionBar.newTab()
                .setText("Ayuda")
                .setTabListener(new TabsListener(
                        this, "Ayuda", Ayuda.class));
        actionBar.addTab(tab);

    }
    public class TabsListener  implements ActionBar.TabListener {

        private Fragment fragment;
        private final String tag;

        public TabsListener(Activity activity, String tag, Class cls) {
            this.tag = tag;
            fragment = Fragment.instantiate(activity, cls.getName());
        }

        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
            ft.replace(android.R.id.content, fragment, tag);
        }

        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
            ft.remove(fragment);
        }

        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {}
    }
}

