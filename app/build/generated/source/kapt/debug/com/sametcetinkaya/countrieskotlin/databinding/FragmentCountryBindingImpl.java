package com.sametcetinkaya.countrieskotlin.databinding;
import com.sametcetinkaya.countrieskotlin.R;
import com.sametcetinkaya.countrieskotlin.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCountryBindingImpl extends FragmentCountryBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCountryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentCountryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        this.countryCapital.setTag(null);
        this.countryCurrency.setTag(null);
        this.countryImage.setTag(null);
        this.countryLanguage.setTag(null);
        this.countryName.setTag(null);
        this.countryRegion.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.selectedCountry == variableId) {
            setSelectedCountry((com.sametcetinkaya.countrieskotlin.model.Country) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSelectedCountry(@Nullable com.sametcetinkaya.countrieskotlin.model.Country SelectedCountry) {
        this.mSelectedCountry = SelectedCountry;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.selectedCountry);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.sametcetinkaya.countrieskotlin.model.Country selectedCountry = mSelectedCountry;
        java.lang.String selectedCountryCountryName = null;
        java.lang.String selectedCountryImageUrl = null;
        java.lang.String selectedCountryCountryLanguage = null;
        java.lang.String selectedCountryCountryCapital = null;
        java.lang.String selectedCountryCountryCurrency = null;
        java.lang.String selectedCountryCountryRegion = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (selectedCountry != null) {
                    // read selectedCountry.countryName
                    selectedCountryCountryName = selectedCountry.getCountryName();
                    // read selectedCountry.imageUrl
                    selectedCountryImageUrl = selectedCountry.getImageUrl();
                    // read selectedCountry.countryLanguage
                    selectedCountryCountryLanguage = selectedCountry.getCountryLanguage();
                    // read selectedCountry.countryCapital
                    selectedCountryCountryCapital = selectedCountry.getCountryCapital();
                    // read selectedCountry.countryCurrency
                    selectedCountryCountryCurrency = selectedCountry.getCountryCurrency();
                    // read selectedCountry.countryRegion
                    selectedCountryCountryRegion = selectedCountry.getCountryRegion();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.countryCapital, selectedCountryCountryCapital);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.countryCurrency, selectedCountryCountryCurrency);
            com.sametcetinkaya.countrieskotlin.util.UtilKt.downloadImage(this.countryImage, selectedCountryImageUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.countryLanguage, selectedCountryCountryLanguage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.countryName, selectedCountryCountryName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.countryRegion, selectedCountryCountryRegion);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): selectedCountry
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}