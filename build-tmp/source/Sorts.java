import java.util.*;

public class Sorts
{
  public void bubbleSort(int[] list)
  {
    //your code here
    for (int i = 0; i < list.length; i ++) {
      for (int j = 0; j < list.length - i - 1; j ++) {
        if (list[j] > list[j + 1]) {
          int temp = list[j];
          list[j] = list[j + 1];
          list[j + 1] = temp;
        }
      }
    }
  }

  public void selectionSort(int[] list)
  {
    //your code here
    int flag, temp;
    for (int outer = 0; outer < list.length -1; outer ++) {
      flag = outer;
      for (int inner = outer + 1; inner < list.length; inner ++) {
        if (list[inner] < list[flag]) {
          flag = inner;
        }
      }
      temp = list[outer];
      list[outer] = list[flag];
      list[flag] = temp;
    }
  }

  public void insertionSort(int[] list)
  {
    //your code here
    for (int outer = 1; outer < list.length; outer ++) {
      int position = outer;
      int key = list[position];
      while (position > 0 && key < list[position - 1]) {
        list[position] = list[position - 1];
        position --;
      }
      list[position] = key;
    }   
  }

private void merge(int[] a, int first, int mid, int last) {
  int[] p = new int[mid - first];
  int[] q = new int[last - mid];

  int[] c = new int[p.length + q.length];
  int nP = 0;
  int nQ = 0;
  for (int i = 0; i < p.length + q.length; i ++) {
    if (nP == p.length) {
        c[i] = q[nQ];
        nQ ++;
    } else if (nQ == q.length) {
        c[i] = p[nP];
        nP ++;
    } else if (p[nP] < q[nQ]) {
        c[i] = p[nP];
        nQ ++;
    } else {
        c[i] = q[nQ];
        nQ ++;
    }
  }
  a = c;
}
  

  public void mergeSort(int[] a, int first, int last)
  {
    //your code here
    int mid = (first + last)/2;
    int[] p = new int[mid - first];
    int[] q = new int[last - mid];

    insertionSort(p);
    insertionSort(q);



    for (int i = 0; i < p.length; i ++) {
      a[i] = p[i];
    }
    for (int j = 0; j < q.length; j ++) {
      a[mid - first - 1 + j] = q[j];
    } 
  }
}

