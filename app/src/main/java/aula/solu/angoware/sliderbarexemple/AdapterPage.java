package aula.solu.angoware.sliderbarexemple;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Pedro on 11/01/2019.
 */

public class AdapterPage extends FragmentStatePagerAdapter {
    int nOfTab;
    public AdapterPage(FragmentManager fm, int NOfTab) {
        super(fm);
        this.nOfTab = NOfTab;

    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FragmentCamera tab1 = new FragmentCamera();
                return tab1;
            case 1 :
                FragmentConversas tab2 = new FragmentConversas();
                return tab2;
            case 2:
                FragmentEstados tab3   = new FragmentEstados();
                return tab3;
            case 3:
                FragmentChamadas tab4  = new FragmentChamadas();
                return tab4;
            default:
                return null;
        }
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {

        return nOfTab;
    }
}
