package packet_tracker;
import java.util.*;
  import java.util.List;
  import java.util.ArrayList;
  import java.util.Collections;
  
  class Vertex_point implements Comparable<Vertex_point>
  {
     public final String name;
      public Edge[] adjacencies;
      public double minDistance = Double.POSITIVE_INFINITY;
      public Vertex_point previous;
      public Vertex_point(String argName) { name = argName; }
      
	public String toString() { return name; }
     public int compareTo(Vertex_point other)
      {
         return Double.compare(minDistance, other.minDistance);
     }
  
  }