import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateMMMReportRequest
void main() {
  final instance = CreateMMMReportRequestBuilder();
  // TODO add properties to the builder and call build()

  group(CreateMMMReportRequest, () {
    // Name of the Marketing Mix Modeling (MMM) report
    // String reportName
    test('to test the property `reportName`', () async {
      // TODO
    });

    // Metric report start date (UTC). Format: YYYY-MM-DD
    // String startDate
    test('to test the property `startDate`', () async {
      // TODO
    });

    // Metric report end date (UTC). Format: YYYY-MM-DD
    // String endDate
    test('to test the property `endDate`', () async {
      // TODO
    });

    // DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
    // String granularity
    test('to test the property `granularity`', () async {
      // TODO
    });

    // Level of the report
    // String level
    test('to test the property `level`', () async {
      // TODO
    });

    // List of targeting types
    // BuiltList<MMMReportingTargetingType> targetingTypes
    test('to test the property `targetingTypes`', () async {
      // TODO
    });

    // Metric and entity columns
    // BuiltList<MMMReportingColumn> columns
    test('to test the property `columns`', () async {
      // TODO
    });

    // A List of countries for filtering
    // BuiltList<TargetingAdvertiserCountry> countries
    test('to test the property `countries`', () async {
      // TODO
    });

  });
}
