package basic_concepts;

import java.util.*;

public class GFG{

static void findArray(int A[], int n)
{
Map<Integer, Integer> hash = new HashMap<Integer, Integer>
();

int Array_size = 1;
int Array_index = 0;


hash.put(A[0], 1);
for (int i = 1; i <n; i++){

hash.put(A[i],hash.get(A[i]-1)==null? 1:hash.get(A[1]- 1)+1); 
if (Array_size < hash.get(A[1]))

{
if (Array_size < hash.get(A[1])) {

Array_size = hash.get(A[1]); 
Array_index = A[i];

} }

System.out.print("Array: ");
int start = Array_index-Array_size +1;
while (start <= Array_index)

{

System.out.print(start +" ");

start++;
}

}
}

  public static void main(String[] args) {

  int A[] = {2, 5, 3, 7, 4, 8, 5, 13, 6}; 
  int n = A.length;
  //int n2 = A.length;

  findArray(A, n);
}}

