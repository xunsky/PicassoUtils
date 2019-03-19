package picasso.utils.junx.com.picassoutils;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PicassoUtils {
    public static void load(String url,ImageView iv){

        if (iv==null)
            throw new NullPointerException("imageview is null!!");

        Picasso picasso = new Picasso.Builder(iv.getContext())
                .build();
        picasso.load(url)
                .into(iv);
    }
}
