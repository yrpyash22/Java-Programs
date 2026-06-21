

// --------------------    JAVA COLLECTION FRAMEWORK  ==>> { Data Structure }    ---------------------//




// Following Data Structure element are used to jcf


//import java.util.List;           // Interface
import java.util.ArrayList;      // Class
import java.util.Vector;         // Class
import java.util.ArrayDeque;     // Class
import java.util.LinkedList;     // Class
import java.util.Stack;          // Class
import java.util.Queue;          // Interface
import java.util.Deque;          // Interface

import java.util.PriorityQueue;  // Class

import java.util.Map;            // Interface
import java.util.HashMap;        // Class
import java.util.SortedMap;      // Interface
import java.util.LinkedHashMap;  // Class
import java.util.TreeMap;        // Class

import java.util.Set;            // Interface
import java.util.HashSet;        // Class
import java.util.LinkedHashSet;  // Class
import java.util.TreeSet;        // Class
import java.util.SortedSet;      // Interface




public class Assignment_14_ {

    // [ 1 ]  List Interface --> import java.util.List;
    // [a]
    ArrayList<Integer> al = new ArrayList<>();
    Vector<Integer> v = new Vector<>();
    ArrayDeque<Integer> adq = new ArrayDeque<>();
    // [b]
    LinkedList<Integer> ll = new LinkedList<>();
    
    // [c]
    Stack<Integer> st = new Stack<>();
    // [d]
    Queue<Integer> ql = new LinkedList<>();
    Queue<Integer> qAdq = new ArrayDeque<>();
    Deque<Integer> dq = new ArrayDeque<>();




    // [ 2 ]  Heap (Priority Queue)
    PriorityQueue<Integer> pq = new PriorityQueue<>(); 
    


    // [ 3 ]  Hashing   <Key , value>

    Map<String, Integer> m = new HashMap<>();
    SortedMap<String, Integer> sm = new TreeMap<>();
    HashMap<String, Integer> hm = new HashMap<>();
    LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
    TreeMap<String, Integer> thm = new TreeMap<>();




    // [ 4 ]  Set 
    Set<Integer> s = new HashSet<>();
    HashSet<Integer> hs = new HashSet<>();
    LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
    TreeSet<Integer> ts = new TreeSet<>();
    SortedSet<Integer> ss = new TreeSet<>();





}
