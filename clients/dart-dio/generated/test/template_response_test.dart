import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for TemplateResponse
void main() {
  final instance = TemplateResponseBuilder();
  // TODO add properties to the builder and call build()

  group(TemplateResponse, () {
    // Template ID
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // ID of the Ad Account that owns the template
    // String adAccountId
    test('to test the property `adAccountId`', () async {
      // TODO
    });

    // IDs of the Ad Accounts that have access to this template
    // BuiltList<String> adAccountIds
    test('to test the property `adAccountIds`', () async {
      // TODO
    });

    // ID of the user who created the template
    // String userId
    test('to test the property `userId`', () async {
      // TODO
    });

    // Template Name
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // The number of days prior to the day the report will be delivered at which the report will start
    // num reportStartRelativeDaysInPast
    test('to test the property `reportStartRelativeDaysInPast`', () async {
      // TODO
    });

    // The number of days prior to the day the report will be delivered at which the report will end
    // num reportEndRelativeDaysInPast
    test('to test the property `reportEndRelativeDaysInPast`', () async {
      // TODO
    });

    // TemplateResponseDateRange dateRange
    test('to test the property `dateRange`', () async {
      // TODO
    });

    // MetricsReportingLevel reportLevel
    test('to test the property `reportLevel`', () async {
      // TODO
    });

    // DataOutputFormat reportFormat
    test('to test the property `reportFormat`', () async {
      // TODO
    });

    // A list of columns to be included in the report
    // BuiltList<String> columns
    test('to test the property `columns`', () async {
      // TODO
    });

    // Granularity granularity
    test('to test the property `granularity`', () async {
      // TODO
    });

    // The length of the sliding window over which view conversions will be attributed
    // num viewWindowDays
    test('to test the property `viewWindowDays`', () async {
      // TODO
    });

    // The length of the sliding window over which click conversions will be attributed
    // num clickWindowDays
    test('to test the property `clickWindowDays`', () async {
      // TODO
    });

    // The length of the sliding window over which engagement conversions will be attributed
    // num engagementWindowDays
    test('to test the property `engagementWindowDays`', () async {
      // TODO
    });

    // Conversion report time type
    // String conversionReportTimeType
    test('to test the property `conversionReportTimeType`', () async {
      // TODO
    });

    // A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:<br> \"field\": The column name<br> \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]<br> \"value\": A single value or a list of values
    // String filtersJson
    test('to test the property `filtersJson`', () async {
      // TODO
    });

    // A boolean value that indicates if the user owns the template
    // bool isOwnedByUser
    test('to test the property `isOwnedByUser`', () async {
      // TODO
    });

    // A boolean value that indicates if this template has been used to create a scheduled report
    // bool isScheduled
    test('to test the property `isScheduled`', () async {
      // TODO
    });

    // The surface used to create this template
    // String creationSource
    test('to test the property `creationSource`', () async {
      // TODO
    });

    // A boolean that indicates if the template has been deleted
    // bool isDeleted
    test('to test the property `isDeleted`', () async {
      // TODO
    });

    // Time of last update in seconds since Unix epoch
    // num updatedTime
    test('to test the property `updatedTime`', () async {
      // TODO
    });

    // A list of custom column IDs
    // BuiltList<String> customColumnIds
    test('to test the property `customColumnIds`', () async {
      // TODO
    });

    // Reporting template type
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // The filter on the conversion ingestion source method for conversion metrics
    // BuiltList<String> ingestionSources
    test('to test the property `ingestionSources`', () async {
      // TODO
    });

  });
}
