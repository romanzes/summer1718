package p
import android.graphics.Color.*
import android.view.*
import android.view.animation.*
import p.p.R
class A:android.app.Activity(){val d=java.util.Random()
val L=ArrayList<View>()
fun t(s:Int)=android.util.TypedValue.applyDimension(1,s*1f,resources.displayMetrics).toInt()
override fun onCreate(b:android.os.Bundle?){super.onCreate(b)
val c=android.widget.FrameLayout(this)
val q=android.widget.LinearLayout(this)
q.orientation=1
fun y(i:Int,j:Int)=ViewGroup.LayoutParams(i,j)
c.addView(q,y(-1,-1))
val p=View(this)
val j=android.graphics.drawable.ShapeDrawable(android.graphics.drawable.shapes.OvalShape())
j.paint.color=-0xeeee78
p.background=j
c.addView(p,y(t(20),t(20)))
setContentView(c,y(-1,-1))
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
fun u(){val P=2
val a=TranslateAnimation(P,2f,P,-.5f,P,d.nextFloat(),P,d.nextFloat())
a.duration=2000
p.startAnimation(a)
p.postDelayed({u()
if(L.size>0)L.removeAt(d.nextInt(L.size)).visibility=4},2000)}
u()}}
