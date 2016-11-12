# UnicodeNames

Categorizing unicodes and enabling easy references.  [More details](http://belvi.xyz/posts/Charting-Unicodes)

### Releases

| name        | category           | maven compile  | artifact link |
| ------------- |:-------------:| -----:|:-------------:|
| currency     | othersymbols | `compile 'com.github.kingsmentor:unicodenames-othersymbols-currency:1.0'` |[currency artifact](https://github.com/KingsMentor/UnicodeNames/blob/master/artifacts/UnicodeNames/OtherSymbols/unicodenames-othersymbols-currency-1.0.jar)|

### Usage
```
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String text = "balance is: "+ Currency.Dollar.getUnicodeSymbol() + "500 only";
        setContentView(R.layout.activity_main);
        // init textview
        textview.setText(text)

    }
```

### Contribution
You will agree with me that it is a large project.
Considering the fact that one of the goal is to make it available in different programming languagues,the project needs a whole lot of volunteers.

### Gettting started with Contributing
Clone the codebase, see the project structure, make a pull request or possibly send me a mail or open an Issue.


### License 


MIT License

Copyright (c) 2016 Nosakhare Belvi

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
