headerFooter();
function setTitle(i) {
   $('title').first().text(PROGRAM[i].title + " - Coders");
   $('#page-title').text(PROGRAM[i].title);
}
function headerFooter() {
   $('header').first().html(
         `<div>
            <i class="fa-solid fa-terminal"></i>
            <span>Coders</span>
          </div>`
   );
   $('footer').first().html(
         `<div id="footer-logo">
            <i class="fa-solid fa-terminal"></i>
            <span>Coders</span>
         </div>
         <div class="blocks">
          <div>
            <p>Tutorials</p>
            <a href="https://www.w3schools.com/java/">W3Schools</a>
            <a href="https://www.learnjavaonline.org/">LearnJavaOnline</a>
            <a href="https://www.programiz.com/java-programming">Programiz</a>
            <a href="https://www.javatpoint.com/java-tutorial">Javatpoint</a>
         </div>
         <div>
            <p>Compiler</p>
            <a href="https://www.programiz.com/java-programming/online-compiler/">Programiz</a>
            <a href="https://play.google.com/store/apps/details?id=ru.iiec.jvdroid">Jvdroid</a>
           </div>
         </div>
         <div id="social-media">
            <a href="https://github.com/RupanSamanta">
               <i class="fa-brands fa-github"></i>
               <span>Github</span>
            </a>
            <a href="https://wa.me/qr/UDSMVCEH2MKNB1">
               <i class="fa-brands fa-whatsapp"></i>
               <span>WhatsApp</span>
            </a>
            <a href="mailto:rupansamanta936@gmail.com">
               <i class="fa-solid fa-envelope"></i>
               <span>Gmail</span>
            </a>
         </div>`
      );
}

function generateExample(i, title, url) {
   let div = document.createElement('div'),
   span = document.createElement('span'),
   anchor = document.createElement('a');
   span.innerHTML = i;
   span.setAttribute('class', 'index');
   div.appendChild(span);
   span = document.createElement('span');
   span.innerHTML = title;
   anchor.appendChild(span);
   anchor.setAttribute('href', 'java-programs/'+url);
   div.appendChild(anchor);
   div.setAttribute('class', 'examples');
   $('#examples-box').append(div);
}

function setNumberCodeOuput(arr, ind, code, output, opt) {
   var space = "";
   for (let i = 1; i <= arr.length; i++) {
      let span = document.createElement('span'),
      str = arr[i-1].trim();
      span.innerHTML = i;
      ind.append(span);
      if (str[str.length-1] == "}")
         space = space.substring(0, space.length-3);
      code.append(`<code>${space+str}<code>`);
      if (str[str.length-1] == "{")
         space += "   ";
   }
   output = output.split('$n$');
   for (let i=0; i<output.length; i++)
      opt.append(`<code>${output[i]}</code>`);
}

function copy(str, elem) {
   navigator.clipboard.writeText(str);
   elem.text('Copied!');
   elem.css({'color': 'aquamarine',
      'border-color': 'aquamarine'
   });
   setTimeout(function () {
      elem.text('Copy');
      elem.css({'color': 'lightgray',
         'border-color': 'lightgray'
      });
   }, 1200);
}
function otherPrograms(main, type, desc, url) {
   let anchor = document.createElement('a'),
   div = document.createElement('div'),
   span = document.createElement('span');
   div.innerHTML += 
   `<div style="background: linear-gradient(to right, hsl(${random(360,100)}deg,100%,50%), 
       hsl(${random(360,100)}deg,100%,50%)); height: 6px;"></div>`;
   span.innerText = type;
   span.setAttribute('class', 'type');
   div.appendChild(span);
   span = document.createElement('span');
   span.innerText = desc;
   span.setAttribute('class', 'desc');
   div.appendChild(span);
   div.setAttribute('class', 'other-box');
   anchor.appendChild(div);
   anchor.setAttribute('href', url);
   main.append(anchor);
}

function random (max, min) {
   return Math.floor(Math.random() * (max - min + 1) + min);
}
