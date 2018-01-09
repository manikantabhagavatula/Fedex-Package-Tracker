package packet_tracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

class Dijkstra
  { 
//	static int SrcCity[] = new int[100000];
//	  static int DestCity[] = new int[100000];
	    
	
	static Vertex_point SrcCity[] = new Vertex_point[100000];
  static Vertex_point DestCity[] = new Vertex_point[100000];
  static Vertex_point PresCity[] = new Vertex_point[100000];
  
  
      public static void computePaths(Vertex_point source)
      {
          source.minDistance = 0.;
          PriorityQueue<Vertex_point> Vertex_pointQueue = new PriorityQueue<Vertex_point>();
  	Vertex_pointQueue.add(source);
  
  		while (!Vertex_pointQueue.isEmpty()) {
  	    Vertex_point u = Vertex_pointQueue.poll();
  
              // Visit each edge exiting u
              for (Edge e : u.adjacencies)
              {
                  Vertex_point v = e.target;
                  double weight = e.weight;
                  double distanceThroughU = u.minDistance + weight;
                  	if (distanceThroughU < v.minDistance) {
                  		Vertex_pointQueue.remove(v);
                  		v.minDistance = distanceThroughU ;
                  		v.previous = u;
                  		Vertex_pointQueue.add(v);
                  	}
              }
          }
      }
  
      public static List<Vertex_point> getShortestPathTo(Vertex_point target)
      {
          List<Vertex_point> path = new ArrayList<Vertex_point>();
          for (Vertex_point Vertex_point = target; Vertex_point != null; Vertex_point = Vertex_point.previous)
              path.add(Vertex_point);
     
          Collections.reverse(path);
          return path;
      }
  
      public Vertex_point[] calldij()
      
      {  
          Vertex_point v0 = new Vertex_point("Northborough");
  	Vertex_point v1 = new Vertex_point("Edison");
  	Vertex_point v2 = new Vertex_point("Pittsburgh");
  	Vertex_point v3 = new Vertex_point("Allentown");
  	Vertex_point v4 = new Vertex_point("Martinsburg");
  	Vertex_point v5 = new Vertex_point("Charlotte");
  	Vertex_point v6 = new Vertex_point("Atlanta");
  	Vertex_point v7 = new Vertex_point("Orlando");
  	Vertex_point v8 = new Vertex_point("Memphis");
  	Vertex_point v9 = new Vertex_point("Grove City");
  	Vertex_point v10 = new Vertex_point("Indianapolis");
  	Vertex_point v11 = new Vertex_point("Detroit");
  	Vertex_point v12 = new Vertex_point("New Berlin");
  	Vertex_point v13 = new Vertex_point("Minneapolis");
  	Vertex_point v14 = new Vertex_point("St.Louis");
  	Vertex_point v15 = new Vertex_point("Kansas");
  	Vertex_point v16 = new Vertex_point("Dallas");
  	Vertex_point v17 = new Vertex_point("Houston");
  	Vertex_point v18 = new Vertex_point("Denver");
  	Vertex_point v19 = new Vertex_point("Salt Lake City");
  	Vertex_point v20 = new Vertex_point("Phoenix");
  	Vertex_point v21 = new Vertex_point("Los Angeles");
  	Vertex_point v22 = new Vertex_point("Chino");
  	Vertex_point v23 = new Vertex_point("Sacramento");
  	Vertex_point v24 = new Vertex_point("Seattle");
  	
  
  	
  	
  	v0.adjacencies = new Edge[]{ new Edge(v11,  586),
  	                             new Edge(v3,  244),
  	                           new Edge(v1,  200)};
  	v1.adjacencies = new Edge[]{ new Edge(v0,  200),
  	                             new Edge(v3,  57),
  	                             new Edge(v5, 493),
  	                             new Edge(v4,  207),
  	                           new Edge(v7,  919)};
  	v2.adjacencies = new Edge[]{ new Edge(v3,  150), 
  			                     new Edge(v4,  153),
  			                     new Edge(v9,  179),
  			                   new Edge(v12,  445)};
 	v3.adjacencies = new Edge[]{ new Edge(v0,  244),
	                             new Edge(v1,  57),
 	                             new Edge(v4,  150),
 	                            new Edge(v11,  417),
 	                           new Edge(v2,  238)};
 	v4.adjacencies = new Edge[]{ new Edge(v1, 207),
 			                     new Edge(v3,  150),
 			                    new Edge(v9,  275),
 		
 			                     new Edge(v2,  153),
 			                  new Edge(v5,  319)};
 	v5.adjacencies = new Edge[]{ new Edge(v0,  81.77),
 	                             new Edge(v1,  493),
 	                             new Edge(v7, 485),
 	                             new Edge(v6,  246),
 	                            new Edge(v8,  521),
 	                           new Edge(v10,  403)};
 	v6.adjacencies = new Edge[]{ new Edge(v7,  389),
 	                             new Edge(v17,  706),
 	                            new Edge(v5,  246),
 	                            new Edge(v8, 352)
 	                           };
 	v7.adjacencies = new Edge[]{ new Edge(v1,  919),
                                 new Edge(v5,  485),
                                 new Edge(v6,  389)
                                                 };
 	v8.adjacencies = new Edge[]{ new Edge(v9,  473),
             new Edge(v5,  521),
             new Edge(v16, 440),
             new Edge(v6,  352),
            new Edge(v15,  373),
           new Edge(v14,  208)};
 	v9.adjacencies = new Edge[]{ new Edge(v4,  275),
             new Edge(v11,  207),
             new Edge(v2, 179),
             new Edge(v10,  165),
            new Edge(v8,  473),
                               };
 	v10.adjacencies = new Edge[]{ new Edge(v0,  81.77),
             new Edge(v13,  504),
             new Edge(v12, 231),
             new Edge(v5,  403),
            new Edge(v14,  229),
           new Edge(v9, 165)};
 	v11.adjacencies = new Edge[]{ new Edge(v0, 586),
             new Edge(v1,  417),
             new Edge(v9, 207),
             new Edge(v12,  260),
                                 };
 	v12.adjacencies = new Edge[]{ new Edge(v0,  81.77),
             new Edge(v2, 445),
             new Edge(v13, 295 ),
             new Edge(v10,  231)
                                 };
 	v13.adjacencies = new Edge[]{ new Edge(v12,  295),
             new Edge(v24,  1415),
             new Edge(v14, 444),
             new Edge(v15,  352),
            new Edge(v18,  697),
           new Edge(v10,  504)};
 	v14.adjacencies = new Edge[]{ 
             new Edge(v13, 444),
             new Edge(v8,  208),
            new Edge(v15,  247),
           new Edge(v10,  229)};
 	v15.adjacencies = new Edge[]{ new Edge(v13,  352),
             new Edge(v16,  500),
             new Edge(v14, 247),
             new Edge(v18,  559),
            new Edge(v8,  373),
           };
 	v16.adjacencies = new Edge[]{ new Edge(v15,  500),
             new Edge(v18,  668),
             new Edge(v17, 224),
             new Edge(v20,  892),
            new Edge(v8,  440),
           };
 	v17.adjacencies = new Edge[]{ new Edge(v16, 224),
             
             new Edge(v20, 1026),
             new Edge(v6,  706),
            };
 	v18.adjacencies = new Edge[]{ new Edge(v19,  374),
             new Edge(v20,  573),
             new Edge(v16, 668),
             new Edge(v15,  559),
            new Edge(v13,  697),
           new Edge(v24,  1033)};
 	v19.adjacencies = new Edge[]{ new Edge(v18,  374),
             new Edge(v24,  711),
             new Edge(v23, 534),
             new Edge(v22,  523),
            new Edge(v20,  484),
           };
 	v20.adjacencies = new Edge[]{ new Edge(v19,  484),
                    new Edge(v18,  573),
                    new Edge(v16, 892),
                    new Edge(v17,  1026),
                   new Edge(v22,  331),
                  new Edge(v21,  362)};
 	v21.adjacencies = new Edge[]{ new Edge(v22,  32),
             new Edge(v23,  331),
             new Edge(v20, 362),
            };
 	v22.adjacencies = new Edge[]{ new Edge(v21,  32),
             new Edge(v20,  331),
             new Edge(v19, 523),
             new Edge(v23,  349),
            };
 	v23.adjacencies = new Edge[]{ new Edge(v22,  349),
             new Edge(v19,  534),
             new Edge(v21, 331),
             new Edge(v24,  623),
            };
 	v24.adjacencies = new Edge[]{ new Edge(v23,  623),
             new Edge(v19,  711),
             new Edge(v18, 1033),
             new Edge(v13,  1415),
            };
 	
 	Vertex_point[] vertices = { v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24 };
 
    for(int a =0; a<100000; a++){
    	 int k = new Random().nextInt(vertices.length);
    	 SrcCity[a] = vertices[k];
    	 int l = new Random().nextInt(vertices.length);
    	 DestCity[a] = vertices[l];
    	//SrcCity[a] = (int)Math.random()*25;
    	
    	//DestCity[a] = (int)Math.random()*25;
    	   
     }

    
         return vertices;
 
 
     }
      
      
      
      
      public List pathOf (Vertex_point src, Vertex_point dest,Vertex_point [] arr_city){
    //	  computePaths(src);
    //	  List<Vertex_point> path = getShortestPathTo(dest);
	//	return path;
    	  
    	  for (Vertex_point v : arr_city)
    	  {
    		  v.minDistance=Double.POSITIVE_INFINITY;
    		  v.previous=null;
    	  }
    	  computePaths(src);
    	  System.out.println("Distance    : " + dest.minDistance + " " + "miles");
     	 List<Vertex_point> path = getShortestPathTo(dest);
     	 System.out.println("Path        : " + path);
      	return path;
      	
      }
      public Vertex_point getSrcCities(int i)
      {
    	  //System.out.println(SrcCity[i] +""+ i);
    	  return SrcCity[i];
      }
      public Vertex_point getDesCities(int i)
      {
    	  return DestCity[i];
      }
      
      
      
   
      
 }  