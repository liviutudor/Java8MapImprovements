# Java8MapImprovements
Looks at the improvements in Map interface in Java 8.

This is the accompanying code for my blog post here which looks at the performance implications of using the following `Map` additions in Java 8:

* `getOrDefault`
* `computeIfAbsent`
* `computeIfPresent`

Please note that the code uses in particular `HashMap` instances throughout.

To run the code, simply run it via `gradle`:

```gradle clean build run```

The code will produce timing measurements in nanoseconds and write them to *stdout* so you can pipe the output to a CSV file then open this in Excel:

```gradle run > output.csv```

In fact, the code contains the performance timing measurements of this after running them on my Mac, in [Excel format](https://github.com/liviutudor/Java8MapImprovements/blob/master/output.xlsx) and [CSV format](https://github.com/liviutudor/Java8MapImprovements/blob/master/output.csv).
