package p
import android.graphics.Color.*
import android.graphics.drawable.GradientDrawable
import android.view.*
import android.view.animation.*
import android.widget.LinearLayout
class A:android.app.Activity(){val d=java.util.Random()
val L=ArrayList<View>()
fun t(s:Int)=android.util.TypedValue.applyDimension(1,s*1f,resources.displayMetrics).toInt()
override fun onCreate(b:android.os.Bundle?){super.onCreate(b)
val c=android.widget.FrameLayout(this)
val q=LinearLayout(this)
q.orientation=1
q.gravity=17
fun y(i:Int,j:Int)=ViewGroup.LayoutParams(i,j)
c.addView(q,y(-1,-1))
val p=View(this)
val j=android.graphics.drawable.ShapeDrawable(android.graphics.drawable.shapes.OvalShape())
j.paint.color=-0xeeee78
p.background=j
c.addView(p,y(t(20),t(20)))
setContentView(c,y(-1,-1))
for(i in 0..60){val v=LinearLayout(this)
v.gravity=17
val l=View(this)
val m=View(this)
m.background=GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,intArrayOf(-0x222223,-0x888889))
val r=View(this)
v.addView(l,y(t(10),t(10)))
v.addView(m,y(t(100),t(3)))
v.addView(r,y(t(10),t(10)))
fun b()=d.nextInt(256)
l.setBackgroundColor(argb(255,b(),b(),b()))
r.setBackgroundColor(argb(255,b(),b(),b()))
q.addView(v,y(t(120),-2))
L.addAll(listOf(l,m,r))
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
