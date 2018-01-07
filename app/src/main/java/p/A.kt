package p
import android.graphics.Color.*
import android.graphics.drawable.GradientDrawable
import android.view.*
import android.view.animation.*
class A:android.app.Activity(){
val R=java.util.Random()
val A=ArrayList<View>()
fun d(s:Int)=android.util.TypedValue.applyDimension(1,s*1f,resources.displayMetrics).toInt()
override fun onCreate(b:android.os.Bundle?){
super.onCreate(b)
val F=android.widget.FrameLayout(this)
fun L()=android.widget.LinearLayout(this)
val c=L()
c.orientation=1
c.gravity=17
fun p(w:Int,h:Int)=ViewGroup.LayoutParams(w,h)
F.addView(c,p(-1,-1))
fun v()=View(this)
val p=v()
val j=android.graphics.drawable.ShapeDrawable(android.graphics.drawable.shapes.OvalShape())
j.paint.color=-0xeeee78
p.background=j
F.addView(p,p(d(20),d(20)))
setContentView(F,p(-1,-1))
val m=android.util.DisplayMetrics()
windowManager.defaultDisplay.getMetrics(m)
for(i in 0..m.heightPixels/d(10)){
val v=L()
v.gravity=17
val l=v()
val o=v()
o.background=GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,intArrayOf(-0x222223,-0x888889))
val r=v()
v.addView(l,p(d(10),d(10)))
v.addView(o,p(d(100),d(3)))
v.addView(r,p(d(10),d(10)))
fun b()=R.nextInt(256)
l.setBackgroundColor(argb(255,b(),b(),b()))
r.setBackgroundColor(argb(255,b(),b(),b()))
c.addView(v,p(d(120),-2))
A.addAll(listOf(l,o,r))
val a=android.animation.ValueAnimator.ofFloat(1f,-1f)
a.addUpdateListener{
v.scaleX=it.animatedValue as Float
}
a.repeatCount=-1
a.repeatMode=2
a.duration=2000
a.currentPlayTime=i*100L
a.start()
}
fun u(){
val a=TranslateAnimation(2,2f,2,-.5f,2,R.nextFloat(),2,R.nextFloat())
a.duration=2000
p.startAnimation(a)
p.postDelayed({
u()
if(A.size>0)A.removeAt(R.nextInt(A.size)).visibility=4
},2000)
}
u()
}
}
