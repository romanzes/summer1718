package p
import android.graphics.Color.*
import android.view.*
import android.view.animation.*
import kotlinx.android.synthetic.main.a.*
import p.p.R
class A:android.app.Activity(){val d=java.util.Random()
val L=ArrayList<View>()
override fun onCreate(b:android.os.Bundle?){super.onCreate(b)
setContentView(R.layout.a)
for(i in 0..60){val v=LayoutInflater.from(this).inflate(R.layout.d,q,false)as ViewGroup
val l=v.getChildAt(0)
val r=v.getChildAt(2)
fun b()=d.nextInt(256)
l.setBackgroundColor(argb(255,b(),b(),b()))
r.setBackgroundColor(argb(255,b(),b(),b()))
q.addView(v)
L.addAll(listOf(l,v.getChildAt(1),r))
val a=android.animation.ValueAnimator.ofFloat(1f,-1f)
a.addUpdateListener{v.scaleX=it.animatedValue as Float}
a.repeatCount=-1
a.repeatMode=2
a.duration=2000
a.currentPlayTime=i*100L
a.start()}
u()}fun u(){val P=2
val a=TranslateAnimation(P,2f,P,-.5f,P,d.nextFloat(),P,d.nextFloat())
a.duration=2000
p.startAnimation(a)
p.postDelayed({u()
if(L.size>0)L.removeAt(d.nextInt(L.size)).visibility=4},2000)}}
