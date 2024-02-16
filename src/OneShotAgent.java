import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

import java.util.Scanner;

public class OneShotAgent extends Agent {

  protected void setup() {
    System.out.println("Agent "+ getLocalName() + " started.");
    addBehaviour(new MyOneShotBehaviour());
  }
  private class MyOneShotBehaviour extends OneShotBehaviour {

    public void action() {
      double x;
      Scanner leer = new Scanner(System.in);
      DataSet dataSet = new DataSet();
      DiscreteMaths discreteMaths = new DiscreteMaths();
      SLR slr = new SLR(dataSet, discreteMaths);

      slr.calculateIntersection();
      System.out.println("Ingrese x: ");
      x = leer.nextDouble();
      slr.prediction(x);

    }
    public int onEnd() {   
       myAgent.doDelete();
       return super.onEnd();
    } 
  }    // END of inner class ...Behaviour
}  
