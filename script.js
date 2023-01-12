const HEADER = document.getElementsByTagName('header')[0],
FOOTER = document.getElementsByTagName('footer')[0],
EXAMPLES_BOX = document.getElementById('examples-box');

headerFooter();

function headerFooter() {
   HEADER.innerHTML = 
         `<a href="https://rupansamanta.github.io/code-bar/" >
            <i class="fa-solid fa-terminal"></i>
            <span>Code Bar</span>
          </a>`;
   FOOTER.innerHTML = 
         `<div id="footer-logo">
            <a href="https://rupansamanta.github.io/code-bar/" >
              <i class="fa-solid fa-terminal"></i>
              <span>Code Bar</span>
            </a>
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
            <a href="https://www.programiz.com/java-programming/online-compiler/">Programiz Java Compiler</a>
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
               <span>Email</span>
            </a>
         </div>`;
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
   EXAMPLES_BOX.appendChild(div);
}

function setNumberCodeOuput(str, ind, code, output, opt) {
   let count = str.match(/<code/g).length;
   for (let i = 1; i <= count; i++) {
      let span = document.createElement('span');
      span.innerHTML = i;
      ind.appendChild(span);
   }
   code.innerHTML = str;
   opt.innerHTML = output;
}

function copy(str, elem) {
   navigator.clipboard.writeText(str);
   elem.innerText = 'Copied!';
   elem.style.color = 'aquamarine';
   elem.style.borderColor = 'aquamarine';
   setTimeout(function () {
      elem.innerText = 'Copy';
      elem.style.color = 'lightgray';
      elem.style.borderColor = 'lightgray';
   }, 1200);
}
function otherPrograms(main, type, desc, url) {
   let anchor = document.createElement('a'),
   div = document.createElement('div'),
   span = document.createElement('span');
   div.innerHTML += `
      <div style="background: linear-gradient(to right, #002dff, #ff0073); height: 6px"></div>
   `;
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
   main.appendChild(anchor);
}
