package com.example.calculadoraa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bac,bc,btnraiz,btnmass,btnres,btnentre,btnmul,bequal,btnpunto,btnparent,
            btnparent2,btnsin,btncos,btntan,btnx2,bpi,btnxl,btnlog,btnln,btnx3;
    TextView tvuno,tvdos;

    String pi="3.12159265";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b0=findViewById(R.id.b0);

        bac=findViewById(R.id.btnac);
        bc=findViewById(R.id.btnc);
        btnraiz=findViewById(R.id.btnraiz);
        btnmass=findViewById(R.id.btnmas);
        btnres=findViewById(R.id.btnres);
        btnentre=findViewById(R.id.btnentre);
        btnmul=findViewById(R.id.btnmul);
        bequal=findViewById(R.id.bequal);
        btnpunto=findViewById(R.id.btnpunto);
        btnparent=findViewById(R.id.btnparent);
        btnparent2=findViewById(R.id.btnparent2);
        btnsin=findViewById(R.id.btnsin);
        btncos=findViewById(R.id.btncos);
        btntan=findViewById(R.id.btntan);
        btnx2=findViewById(R.id.btnx2);
        bpi=findViewById(R.id.bpi);
        btnxl=findViewById(R.id.btnxl);
        btnlog=findViewById(R.id.btnlog);
        btnln=findViewById(R.id.btnln);
        btnx3=findViewById(R.id.btnx3);

        tvuno=findViewById(R.id.tvuno);
        tvdos=findViewById(R.id.tvdos);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=tvdos.getText().toString();
                tvdos.setText(res+b1.getText().toString());
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=tvdos.getText().toString();
                tvdos.setText(res+b2.getText().toString());
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=tvdos.getText().toString();
                tvdos.setText(res+b3.getText().toString());
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=tvdos.getText().toString();
                tvdos.setText(res+b4.getText().toString());
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=tvdos.getText().toString();
                tvdos.setText(res+b5.getText().toString());
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=tvdos.getText().toString();
                tvdos.setText(res+b6.getText().toString());
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=tvdos.getText().toString();
                tvdos.setText(res+b7.getText().toString());
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=tvdos.getText().toString();
                tvdos.setText(res+b8.getText().toString());
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=tvdos.getText().toString();
                tvdos.setText(res+b9.getText().toString());
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=tvdos.getText().toString();
                tvdos.setText(res+b0.getText().toString());
            }
        });

        btnpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=tvdos.getText().toString();
                if (!res.contains(".")){
                    tvdos.setText(res+ btnpunto.getText().toString());
                }
            }
        });
        btnmass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=tvdos.getText().toString();
                if (!res.contains(".")){
                    tvdos.setText(res+ btnmass.getText().toString());
                }
            }
        });
        btnentre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=tvdos.getText().toString();
                if (!res.contains(".")){
                    tvdos.setText(res+ btnentre.getText().toString());
                }
            }
        });
        btnres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=tvdos.getText().toString();
                char last=res.charAt(res.length()-1);
                if (last!='-'){
                    tvdos.setText(res+ btnres.getText().toString());
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=tvdos.getText().toString();
                char last=res.charAt(res.length()-1);
                if (!res.equals("")){
                    tvdos.setText(res+ btnmul.getText().toString());
                }
            }
        });
        btnraiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=tvdos.getText().toString();
                double r=Math.sqrt(Double.parseDouble(res));
                String resultado=String.valueOf(r);
                tvdos.setText(resultado);
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=tvdos.getText().toString();
                String replacedString=res.replace('÷','/').replace('x','*');
                double resultado=eval(replacedString);
                String r=String.valueOf(resultado);
                tvdos.setText(r);
                tvuno.setText(res);
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvuno.setText("");
                tvdos.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res=tvdos.getText().toString();
                if (!res.equals("")){
                    res=res.substring(0,res.length()-1);
                    tvdos.setText(res);
                }
            }
        });
        btnparent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvdos.setText(tvdos.getText()+ "(");
            }
        });
        btnparent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvdos.setText(tvdos.getText()+ ")");
            }
        });

        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvdos.setText(tvdos.getText()+pi);
                tvuno.setText(bpi.getText());
            }
        });
        btnsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvdos.setText(tvdos.getText()+"sin");
            }
        });

        btncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvdos.setText(tvdos.getText()+"cos");
            }
        });
        btntan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvdos.setText(tvdos.getText()+"tan");
            }
        });
        btnxl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res= Integer.parseInt(tvdos.getText().toString());
                int fact=factorial(res);
                tvdos.setText(String.valueOf(fact));
                tvuno.setText(res + "!");
            }
        });
        btnx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d=Double.parseDouble(tvdos.getText().toString());
                double square=d*d;
                tvdos.setText(String.valueOf(square));
                tvuno.setText(d+"=");
            }
        });
        btnx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvdos.setText(tvdos.getText().toString()+"^"+ "(-1)");
            }
        });
        btnln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvdos.setText(tvdos.getText().toString()+"ln");
            }
        });
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvdos.setText(tvdos.getText().toString()+"log");
            }
        });
    }

    int factorial(int n){
        return (n==1 || n==0)? 1 : n* factorial(n-1);
    }


    public static double eval(final String str)
    {
        return new Object(){
            int pos=-1,ch;
            void nextChar(){
                ch=(++pos<str.length())? str.charAt(pos): -1;
            }
            boolean eat(int charToEat){
                while (ch ==' ')nextChar();
                if (ch==charToEat){
                    nextChar();
                    return true;
                }
                return false;
            }
            double parse(){
                nextChar();
                double X=parseExpression();
                if (pos <str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return X;
            }

            double parseExpression(){
                double X=parseTerm();
                for (;;){
                    if (eat('+')) X +=parseTerm();//adicion
                    else if (eat('-')) X -=parseTerm();//substraccion
                    else return X;
                }
            }
            double parseTerm(){
                double X =parseFactor();
                for (;;){
                    if (eat('*')) X *=parseFactor();//multiplicacion
                    else if (eat('/')) X /=parseFactor();//division
                    else return X;
                }
            }
            double parseFactor(){
                if (eat('+')) return  parseFactor();
                if (eat('-')) return  parseFactor();

                double X;
                int starPost=this.pos;
                if (eat('(')){
                    X=parseExpression();
                    eat(')');
                }else if ((ch>= '0'  && ch<='9')|| ch =='.'){ //numeros
                    while ((ch>= '0' && ch <='9')|| ch=='.')nextChar();
                    X=Double.parseDouble(str.substring(starPost,this.pos));

                }else if (ch>='a' && ch <='z'){//funciones
                    while (ch >= 'a' && ch <='z')nextChar();
                    String func=str.substring(starPost,this.pos);
                    X=parseFactor();
                    if (func.equals("sqrt")) X=Math.sqrt(X);

                    else if (func.equals("sin")) X=Math.sin(Math.toRadians(X));
                    else if (func.equals("cos")) X=Math.sin(Math.toRadians(X));
                    else if (func.equals("tan")) X=Math.sin(Math.toRadians(X));

                    else if (func.equals("log")) X=Math.log10(X);
                    else if (func.equals("ln")) X=Math.log(X);
                    else throw new RuntimeException("Unknown function: " + func);




                }else {
                    throw new RuntimeException("Unexpected:" + (char)ch);
                }
                if (eat('^'))X=Math.pow(X,parseFactor());
                return X;

            }
        }.parse();
    }
}