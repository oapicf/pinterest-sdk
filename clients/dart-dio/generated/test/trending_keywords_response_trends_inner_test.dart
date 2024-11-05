import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for TrendingKeywordsResponseTrendsInner
void main() {
  final instance = TrendingKeywordsResponseTrendsInnerBuilder();
  // TODO add properties to the builder and call build()

  group(TrendingKeywordsResponseTrendsInner, () {
    // The keyword that is trending.
    // String keyword
    test('to test the property `keyword`', () async {
      // TODO
    });

    // The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
    // int pctGrowthWow
    test('to test the property `pctGrowthWow`', () async {
      // TODO
    });

    // The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
    // int pctGrowthMom
    test('to test the property `pctGrowthMom`', () async {
      // TODO
    });

    // The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
    // int pctGrowthYoy
    test('to test the property `pctGrowthYoy`', () async {
      // TODO
    });

    // TrendingKeywordsResponseTrendsInnerTimeSeries timeSeries
    test('to test the property `timeSeries`', () async {
      // TODO
    });

  });
}
