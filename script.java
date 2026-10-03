```javascript
// ================= MOBILE MENU =================

const menuBtn =
    document.getElementById("menuBtn");

const navLinks =
    document.getElementById("navLinks");


menuBtn.addEventListener("click", function () {

    navLinks.classList.toggle("active");

});


// Close menu after clicking a link

const links =
    document.querySelectorAll(".nav-links a");


links.forEach(function (link) {

    link.addEventListener("click", function () {

        navLinks.classList.remove("active");

    });

});


// ================= SCROLL REVEAL =================

const revealElements =
    document.querySelectorAll(
        ".section-title, .about-text, .skill, .project-card, .education-card, .contact-section"
    );


revealElements.forEach(function (element) {

    element.classList.add("reveal");

});


function revealOnScroll() {

    const windowHeight =
        window.innerHeight;


    revealElements.forEach(function (element) {

        const elementTop =
            element.getBoundingClientRect().top;


        if (elementTop < windowHeight - 100) {

            element.classList.add("show");

        }

    });

}


window.addEventListener(
    "scroll",
    revealOnScroll
);


// Run when page opens

revealOnScroll();


// ================= TYPING EFFECT =================

const words = [

    "Computer Science Student",

    "Frontend Developer",

    "Web Developer",

    "Programmer"

];


let wordIndex = 0;

let charIndex = 0;

let deleting = false;


function typeEffect() {

    const typingElement =
        document.getElementById("typing");


    const currentWord =
        words[wordIndex];


    if (!deleting) {

        typingElement.textContent =
            currentWord.substring(
                0,
                charIndex + 1
            );

        charIndex++;


        if (
            charIndex ===
            currentWord.length
        ) {

            deleting = true;

            setTimeout(
                typeEffect,
                1500
            );

            return;
        }

    } else {

        typingElement.textContent =
            currentWord.substring(
                0,
                charIndex - 1
            );

        charIndex--;


        if (charIndex === 0) {

            deleting = false;

            wordIndex++;


            if (
                wordIndex ===
                words.length
            ) {

                wordIndex = 0;

            }

        }

    }


    setTimeout(
        typeEffect,
        deleting ? 50 : 100
    );

}


typeEffect();
```
