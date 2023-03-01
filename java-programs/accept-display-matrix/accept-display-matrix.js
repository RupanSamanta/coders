const index = 1, space = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;",
 OUTPUT = `Enter Row Size: 2$n$
Enter Column Size: 3$n$
<br>Enter Matrix Elements:$n$
1$n$
3$n$
5$n$
2$n$
4$n$
6$n$
<br>Matrix:$n$
1${space}3${space}5$n$
2${space}4${space}6$n$
`;

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
   httpRequest.open('GET', 'https://rupansamanta.github.io/coders/Java/Input%20and%20Print%20Matrix.java');
   httpRequest.send();
