const CODE = 
`<code>import java.util.Scanner;</code>`+
`<code>public class Matrix {</code>` +
`<code>   public static void main(String args[]) {</code>` +
`<code>      Scanner sc = new Scanner(System.in);</code>` +
`<code>      System.out.print("Enter Row Size: ");</code>` +
`<code>      int row = sc.nextInt();</code>` +
`<code>      System.out.print("Enter Column Size: ");</code>` +
`<code>      int col = sc.nextInt();</code>` +
`<code>      int arr[][] = new int[row][col];</code>` +
`<code>      System.out.println("&bsol;nEnter Matrix Elements: ");</code>` +
`<code>      for(int i=0; i&lt;row; i++) {</code>` +
`<code>         for(int j=0; j&lt;col; j++) {</code>` +
`<code>            arr[i][j] = sc.nextInt();</code>` +
`<code>         }</code>` +
`<code>      }</code>` +
`<code>      System.out.println("&bsol;nMatrix: ");</code>` +
`<code>      for(int i=0; i&lt;row; i++) {</code>` +
`<code>         for(int j=0; j&lt;col; j++) {</code>` +
`<code>            System.out.print(arr[i][j] &plus; "&bsol;t");</code>` +
`<code>         }</code>` + 
`<code>         System.out.println();</code>` + 
`<code>      }</code>` +
`<code>   }</code>` +
`<code>}</code>`
,
OUTPUT = 
`<code>Enter Row Size: 2</code>
<code>Enter Column Size: 3</code>
<code><br></code>
<code>Enter Matrix Elements:</code>
<code>1</code>
<code>2</code>
<code>3</code>
<code>4</code>
<code>5</code>
<code>6</code>
<code><br></code>
<code>Matrix:</code>
<code>1&nbsp;&nbsp;&nbsp;2&nbsp;&nbsp;&nbsp;3</code>
<code>4&nbsp;&nbsp;&nbsp;5&nbsp;&nbsp;&nbsp;6</code>`;
