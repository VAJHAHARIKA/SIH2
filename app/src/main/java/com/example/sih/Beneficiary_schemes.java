package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Beneficiary_schemes extends AppCompatActivity {
    Spanned text,t2,t3,t4;
    String s6,s5,s4,s3;
    TextView t,t11,t22,t33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beneficiary_schemes);
        t=(TextView)findViewById(R.id.t1);
        t11=(TextView)findViewById(R.id.textView);
        t22=(TextView)findViewById(R.id.textView2);
        t33=(TextView)findViewById(R.id.textview3);
        s6="http://agricoop.gov.in/sites/default/files/finalopguidelines.pdf";
        text = Html.fromHtml("<a href="+s6+">-->Integrated Scheme for Agricultural Marketing(ISAM) (effective since 01.04.2014)</a>");
        t.setMovementMethod(LinkMovementMethod.getInstance());
        t.setText(text);
        s5="http://enam.gov.in/web/";
        t2 = Html.fromHtml("<a href="+s5+">-->National Agriculture Market (e-NAM)</a>");
        t11.setMovementMethod(LinkMovementMethod.getInstance());
        t11.setText(t2);
        s4="http://agricoop.gov.in/sites/default/files/APLM_ACT_2017_0.pdf";
        t3 = Html.fromHtml("<a href="+s4+">-->Model Agricultural Produce and Livestock Marketing(Promotion & Facilitation) Act, 2017</a>");
        t22.setMovementMethod(LinkMovementMethod.getInstance());
        t22.setText(t3);
        s3="http://agricoop.gov.in/sites/default/files/Formulation%20of%20model%20Contract%20Farming%20Act-Soliciting%20views-comments.pdf";
        t4 = Html.fromHtml("<a href="+s3+">-->Formulation of Model Contract Farming (Promotion & Facilitation) Act, 2017 and soliciting views/comments of farmers, general public, experts, professional bodies and institutions thereon.</a>");
        t33.setMovementMethod(LinkMovementMethod.getInstance());
        t33.setText(t4);

    }
}
