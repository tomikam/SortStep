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
    int[] b = new int[last - first];
    int nA = first;
    int nB = mid + 1;
    for (int i = 0; i <= last; i ++) {
      if (nA > mid) {
        b[i] = a[nA];
        nA ++;
      } else if (nB > last) {
        b[i] = a[nB];
        nB ++;
      } else if (a[nA] > a[nB]) {
        b[i] = a[nB];
        nB ++;
      } else {
        b[i] = a[nA];
        nA ++;
      }
    }
    a = b;







    /*int[] x = new int[mid - first];
    for (int i = first; i < mid - first; i ++) {
      x[i] = a[i];
    }
    int[] y = new int[last - mid];
    for (int j = mid; j < last - mid; j ++) {
      x[j] = a[j];
    }
    int[] z = new int[last - first];
    int xIdx = 0;
    int yIdx = 0;
    for (int k = 0; k < last - first; k ++) {
      if (xIdx == mid - first) {
        z[k] = y[yIdx];
        yIdx ++;
      } else if (yIdx == last - mid) {
        z[k] = x[xIdx];
        xIdx ++;
      } else if (x[xIdx] < y[yIdx]) {
        z[k] = x[xIdx];
        xIdx ++;
      } else if (x[xIdx] < y[yIdx]) {
        z[k] = y[yIdx];
        yIdx ++;
      }
    }*/
  }

  public void mergeSort(int[] a, int first, int last)
  {
    //your code here
    int mid = (first + last)/2;
    if (first != last) {
      mergeSort(a, first, (first + last)/2);
      mergeSort(a, (first + last)/2, last);
    }
    merge(a, first, mid, last);
  }
}

