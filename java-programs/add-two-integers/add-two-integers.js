const index = 0, space = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;",
 OUTPUT = 
`Enter First Number: 20$n$
Enter Second Number: 30$n$
Sum = 50<br>`;

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
   httpRequest.open('GET', 'https://rupansamanta.github.io/coders/Java/Add%20Two%20Integers.java');
   httpRequest.send();
