package io.github.schierlm.webviewresourecbug;

import android.content.res.Resources;
import android.support.annotation.NonNull;

class MyResources extends Resources {
    public MyResources(Resources superResources) {
        super(superResources.getAssets(), superResources.getDisplayMetrics(), superResources.getConfiguration());
    }

    @NonNull
    @Override
    public String getString(int id) throws NotFoundException {
        if (id == R.string.localized_text) {
            return "This is the localized version of the example text, coming from the custom Resource subclass";
        }
        return super.getString(id);
    }
}
