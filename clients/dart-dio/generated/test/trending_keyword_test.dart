import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for TrendingKeyword
void main() {
  final instance = TrendingKeywordBuilder();
  // TODO add properties to the builder and call build()

  group(TrendingKeyword, () {
    // TrendingKeywordDemographics demographics
    test('to test the property `demographics`', () async {
      // TODO
    });

    // Indicates whether the keyword has a prediction available for the next 90 days.<br /> This field is only applicable when `include_prediction` query parameter is set to `true`. <br /> By default, the value is `false` and no prediction data is included in the response.
    // bool hasPrediction
    test('to test the property `hasPrediction`', () async {
      // TODO
    });

    // The keyword that is trending.
    // String keyword
    test('to test the property `keyword`', () async {
      // TODO
    });

    // The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
    // int pctGrowthMom
    test('to test the property `pctGrowthMom`', () async {
      // TODO
    });

    // The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
    // int pctGrowthWow
    test('to test the property `pctGrowthWow`', () async {
      // TODO
    });

    // The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
    // int pctGrowthYoy
    test('to test the property `pctGrowthYoy`', () async {
      // TODO
    });

    // PredictedTimeSeries predictedTimeSeries
    test('to test the property `predictedTimeSeries`', () async {
      // TODO
    });

    // TimeSeries timeSeries
    test('to test the property `timeSeries`', () async {
      // TODO
    });

  });
}
