import java.util.*;
class DataSet
{
    int distance;
    float time;
    public DataSet(int distance,float time)
    {
        this.distance=distance;
        this.time=time;
    }
}
class UserInput
{
   
  
    public void insert(List<DataSet> al,int distance,float time)
    {
        al.add(new DataSet(distance,time));
    }
}
class Measure
{
    
    public void measure(List<DataSet> al,List<Float> speed)
    {
        
        for(int i=0;i<al.size();i++)
        {
            float d=al.get(i).distance/al.get(i).time;
            speed.add(d);
        }
    }
}
class ShowResults
{
    
    public void display(List<DataSet> al,List<Float> speed)
    {
        for(int i=0;i<al.size();i++)
        {
            System.out.print("Calculated speed with distance "+al.get(i).distance+" km and time "+al.get(i).time+" hr = ");
            System.out.print(speed.get(i)+" m/sec");
        }
    }
}
public class Sample
{
	public static void main(String[] args) {
	    List<DataSet> al=new ArrayList<>();
	    List<Float> speed=new ArrayList<>();
	    UserInput inp=new UserInput();
	    Measure m=new Measure();
	    ShowResults rs=new ShowResults();
	    inp.insert(al,1200,5);
	    m.measure(al,speed);
	    rs.display(al,speed);
	}
}