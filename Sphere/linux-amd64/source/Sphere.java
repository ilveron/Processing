/* autogenerated by Processing revision 1283 on 2022-08-01 */
import processing.core.*;
import processing.data.*;
import processing.event.*;
import processing.opengl.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class Sphere extends PApplet {

int radius = 100;

//Executed once (on startup)
 public void setup(){
  /* size commented out by preprocessor */;
  
}

//Executed after setup (continuously)
 public void draw(){
  noFill();
  lights();
  translate(500,500,50);
  camera(mouseX*1.3f, mouseY*1.3f, 10,
          0.0f, 0.0f, 0.0f,
          0.0f, 1.0f, 0.0f);
  
  background(100);
  sphere(radius);
}


  public void settings() { size(1280, 720, P3D); }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Sphere" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
