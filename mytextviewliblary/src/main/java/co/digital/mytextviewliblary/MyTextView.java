package co.digital.mytextviewliblary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by clickapps on 23/10/17.
 */

public class MyTextView extends android.support.v7.widget.AppCompatTextView{




    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    private void customization(Context context,AttributeSet attrs){

//        Typeface face ;
//
//        TypedArray typedArray = this.getContext().obtainStyledAttributes(attrs, R.styleable.MyTextView_attrs);
//        String fontname = typedArray.getString(R.styleable.MyTextView_attrs_font_family);
//        if (fontname != null && fontname.length() > 0){
//            face = Typeface.createFromAsset(this.getContext().getAssets(),
//                    fontname);
//            this.setTypeface(face);
//            typedArray.recycle();
//        }

    }
}
