# allegheny2015-presentation

This repository contains the LaTeX source code and additional resources for a presentation that I, [Gregory M.
Kapfhammer](http://www.cs.allegheny.edu/sites/gkapfham), gave during an event at Allegheny College during the Spring
2015 academic semester. The presentation's source code uses a wide variety of LaTeX packages, such as `beamer` and
`minted`, in order to create each slide.  I have developed a custom theme for the display of the slides and the use of
full-screen photographs on the backgrounds.

You are welcome to use these slides as inspiration for your own presentation. If you find this example useful, could I
trouble you to star this repository and then acknowledge it in your own presentation slides? If you would like to learn
more about my research program, then you can checkout my
[gkapfham/research-bibliography](https://github.com/gkapfham/research-bibliography).

You can type the following command if you want to clone this repository:

```shell
git clone https://github.com/gkapfham/allegheny2015-presentation.git
```

Then, if you want to compile the presentation to a PDF, you should type the following commands.

```shell
cd allegheny2015-presentation
pdflatex -shell-escape allegheny2015-presentation.tex
pdflatex -shell-escape allegheny2015-presentation.tex
```

Please note that this has been tested on an Ubuntu 15.04 workstation running a very recent version of LaTeX that was
manually installed using the TeXLive installer. Additionally, you must ensure that your distribution has `minted`,
`pygments`, and the `pygments-solarized` color scheme installed for your LaTeX distribution.  It is worth noting that
you can also compile the paper using other LaTeX development tools, such as `latexmk`. If you are unable to compile the
presentation with your development tools and your execution environment, then please open a new issue and I will attempt
to resolve your concerns.


