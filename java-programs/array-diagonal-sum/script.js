const index = 2, space = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;",
 OUTPUT = 
`Enter Matrix (m×m) Size : 3$n$
<br>Enter Matrix Values :$n$
1$n$
3$n$
5$n$
7$n$
2$n$
4$n$
6$n$
8$n$
0$n$
<br>$n$
Matrix :$n$
1${space}3${space}5$n$
7${space}2${space}4$n$
6${space}8${space}0$n$
<br>$n$
Sum of Left Diagonal = 3$n$
Sum of Right Diagonal = 13`;

setTitle(index);

$('#copy').on('click', function () {
   copy($('#source-code').text(), $('#copy'));
});

for (let i = 0; i < PROGRAM.length; i++) {
   if (i != index) {
      otherPrograms (
         $('#other-programs'),
         PROGRAM [i].type,
         PROGRAM [i].title,
         '../'+PROGRAM [i].url
      );
   }
   if (i == 3)
      break;
}

   var httpRequest = new XMLHttpRequest();
   httpRequest.onreadystatechange = ()=> {
      if(httpRequest.readyState === 4) {
         if(httpRequest.status == 200) {
            setNumberCodeOuput(
               httpRequest.responseText.split('//n'),
               $('#line-number'), 
               $('#source-code'),
               OUTPUT,
               $('#sample-output')
            );
            hljs.highlightAll();
            console.clear();
         }
         else
            alert('Failed to Fetch Source Code\nPlease Refresh the Page');
      }
      else
         console.log('Loading...')
   }
   httpRequest.open('GET', 'https://raw.githubusercontent.com/RupanSamanta/coders/main/Java/Array%20Diagonal%20Sum');
   httpRequest.send();
