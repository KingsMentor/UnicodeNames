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


#License
The MIT License (MIT). Please see the [License File](https://github.com/KingsMentor/MobileVisionBarcodeScanner/blob/master/README.md) for more information.
