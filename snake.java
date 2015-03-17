import java.applet.Applet;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
public class snake extends Applet implements Runnable, KeyListener
{
    Random r=new Random();
    Thread t= null;
    int size=0;
    int m=5;
    int w=0;
    int z=0,k=50,p=50,o=0,v=0,sp;    
    int x=0,y=0,i=0,j=0;
    boolean stop=false,b=true,c=false,de=true,f=false,g=false;
    int[] d=new int[1000];
    int[] e=new int[1000];
    int q,s;
    public void init() 
    {
       
        setBackground(Color.CYAN);
        //setForeground(Color.orange);
        
        addKeyListener(this);
        //requestFocus();
        
        q=0;
        s=0;
    }
    public void start()
    {
        f=true;
        repaint();
     //   f=false;
        if(g)
        {t=new Thread(this);
        t.start();
        f=false;
    }}
    public void keyReleased(KeyEvent ke)
    {
    }
    public void keyTyped(KeyEvent ke)
    {
    }
    public void keyPressed(KeyEvent ke)
    {
        int key=ke.getKeyCode();
        switch(key)
        {
            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                if(z!=2)
                {
                d[0]=d[0]+10;
                if(d[0]>=500)
                    d[0]=0;
                w=1;               
                for(i=m;i>=0;i--)
                {
                   if((d[0]==d[i])&&(e[0]==e[i])&&(i!=0))
                   stop=true;
                }
                for(i=m;i>=0;i--)
                {
                   d[i+1]=d[i];
                   e[i+1]=e[i];
                   if(d[0]==d[m]&&e[0]==e[m]&&m!=0)
                   stop=true;
                }
                if(d[0]==q&&e[0]==s)
                {
                    m++;
                    q=(int)r.nextInt(10)*10;
                    s=(int)r.nextInt(10)*10;
                }
                }
                
                repaint();
                break;
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                if(z!=1)
                {
                d[0]=d[0]-10;
                if(d[0]<0)
                    d[0]=500;
                w=2;
                for(i=m;i>=0;i--)
               {
                    if(d[0]==d[i]&&e[0]==e[i]&&i!=0)
                       stop=true;
               }
                for(i=m;i>=0;i--)
                {
                   d[i+1]=d[i];
                   e[i+1]=e[i];
                  if(d[0]==d[m]&&e[0]==e[m]&&m!=0)
                       stop=true;
               }
                if(d[0]==q&&e[0]==s)
                { 
                   m++;
                   q=(int)r.nextInt(10)*10;
                   s=(int)r.nextInt(10)*10;
                }
                }
                 
                repaint();
                break;
            case KeyEvent.VK_W:
            case KeyEvent.VK_UP:
//                po=-25;
                if(z!=4)
                {
                e[0]=e[0]-10;
                if(e[0]<0)
                    e[0]=500;
                w=3;
                for(i=m;i>=0;i--)
                {
                     if(d[0]==d[i]&&e[0]==e[i]&&i!=0)
                       stop=true;
                }
                for(i=m;i>=0;i--)
                {
                    d[i+1]=d[i];
                    e[i+1]=e[i];
                    if(d[0]==d[m]&&e[0]==e[m]&&m!=0)
                       stop=true;
                }
                if(d[0]==q&&e[0]==s)
                {
                   m++;
                   q=(int)r.nextInt(10)*10;
                   s=(int)r.nextInt(10)*10;
                }
                }
                
                repaint();
                break;
            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
             //   po+=25;
                        if(z!=3)
                {
                e[0]=e[0]+10;
                if(e[0]>=500)
                    e[0]=0;
                w=4;
                for(i=m;i>=0;i--)
               {
                    if(d[0]==d[i]&&e[0]==e[i]&&i!=0)
                       stop=true;
               }
                for(i=m;i>=0;i--)
                {
                    d[i+1]=d[i];
                   e[i+1]=e[i];
                  if(d[0]==d[m]&&e[0]==e[m]&&m!=0)
                       stop=true;
               }
                if(d[0]==q&&e[0]==s)
                {
                    m++;
                    q=(int)r.nextInt(10)*10;
                    s=(int)r.nextInt(10)*10;
                }
                }
                repaint();
                break;
            case KeyEvent.VK_1:
                sp=100;
                g=true;
                t=new Thread(this);
        t.start();
        f=false;
                break;
                case KeyEvent.VK_2:
                sp=50;
                g=true;
                t=new Thread(this);
        t.start();
        f=false;
                break;
                    case KeyEvent.VK_3:
                sp=25;
                g=true;
                t=new Thread(this);
        t.start();
        f=false;
                break;
            default:
                break;
        }
        if(m%5==0&&m!=5&&b)
        {
            p=r.nextInt(10)*10;
            k=r.nextInt(10)*10;
            de=false;
            b=false;
        }
    }
    public void run()
    {
        try
        {
            for(;;)
            { switch(w)
            {
                case 1:d[0]+=10;
                if(d[0]>=500)
                    d[0]=0;
                z=1;
                 for(i=m;i>=0;i--)
               {
                    if(d[0]==d[i]&&e[0]==e[i]&&i!=0)
                       stop=true;
               }
                 for(i=m;i>=0;i--)
                 {
                     d[i+1]=d[i];
                   e[i+1]=e[i];
                  
                 }
                if(d[0]==q&&e[0]==s)
                {
                    m++;
                    q=(int)r.nextInt(10)*10;
                    s=(int)r.nextInt(10)*10;
                }
                
                    break;
                case 2:d[0]-=10;
                if(d[0]<0)
                    d[0]=500;
                z=2;
                 for(i=m;i>=0;i--)
               {
                    if(d[0]==d[i]&&e[0]==e[i]&&i!=0)
                       stop=true;}
                 for(i=m;i>=0;i--)
                 {
                   d[i+1]=d[i];
                   e[i+1]=e[i];
                   if(d[0]==d[m]&&e[0]==e[m]&&m!=0)
                       stop=true;
                 }
                if(d[0]==q&&e[0]==s)
                {
                    m++;
                    q=(int)r.nextInt(10)*10;
                    s=(int)r.nextInt(10)*10;
                }
                 
                    break;
                case 3:e[0]-=10;
                if(e[0]<0)
                    e[0]=500;
                z=3;
                 for(i=m;i>=0;i--)
                  {
                    if(d[0]==d[i]&&e[0]==e[i]&&i!=0)
                    stop=true;
                  }
                 for(i=m;i>=0;i--)
                 {
                   d[i+1]=d[i];
                   e[i+1]=e[i];
                  if(d[0]==d[m]&&e[0]==e[m]&&m!=0)
                       stop=true;
                 }
                if(d[0]==q&&e[0]==s)
                {
                    m++;
                    q=(int)r.nextInt(10)*10;
                    s=(int)r.nextInt(10)*10;
                }
                 
                break;
                case 4:e[0]+=10;
                if(e[0]>=500)
                    e[0]=0;
                z=4;
                 for(i=m;i>=0;i--)
               {
                    if(d[0]==d[i]&&e[0]==e[i]&&i!=0)
                       stop=true;
               }
                 for(i=m;i>=0;i--)
                 {
                   d[i+1]=d[i];
                   e[i+1]=e[i];
                   if(d[0]==d[m]&&e[0]==e[m]&&m!=0)
                       stop=true;
               }
                if(d[0]==q&&e[0]==s)
                {
                    m++;
                    q=(int)r.nextInt(10)*10;
                    s=(int)r.nextInt(10)*10;
                }
                    break;
                default:
                    break;
            }
            if(m%5==0&&m!=5&&b)
        {
            p=r.nextInt(10)*10;
            k=r.nextInt(10)*10;
            de=false;
            b=false;
        }
            if(p==d[0]&&k==e[0])
            {
                de=true;
                c=false;
                o+=2;
            }
            if(stop)
            {
                repaint();
                t.stop();
            }
                repaint();
                if(!de)
                { v+=1;c=true;}
                if(v==100)
                {
                    v=0;
                    de=true;
                    c=false;
                    repaint();
                }
                if(m%5!=0)
                    
                {
                    b=true;
                }
               Thread.sleep(sp);
            }
        }
        catch(InterruptedException e)
        {
        }
    }
   
    public void paint(Graphics g)
    {
         g.setColor(Color.black);
         g.fillRect(0, 0, 512, 512);
        if(!stop)
        {
                g.setColor(Color.red);
                g.fillOval(d[1], e[1], 10, 10);
                g.setColor(Color.GREEN);
        for(int i=2;i<=m;i++)
        {
            g.fillOval(d[i], e[i], 10, 10);
        }
        g.fillOval(q, s, 10, 10);
        if(c)
        {
            g.setColor(Color.BLUE);
            g.fillOval(p, k, 10, 10);
            g.setColor(Color.green);
        }
        
        }
        else
        {
            g.drawString("Game Over",400,400);
            g.drawString("Your Score= "+(m-5+o)*5 , 400, 500);
        }
       if(f)
       {
           g.setColor(Color.pink);
          
           g.drawString("SELECT LEVEL",250,250);
           g.drawString("1.EASY",250,275);
           g.drawString("2.MEDIUM",250,300);
           g.drawString("3.HARD",250,325);
           g.drawString("PRESS KEY",250,350);
         
           g.setColor(Color.yellow);
       }
    }
}
 
