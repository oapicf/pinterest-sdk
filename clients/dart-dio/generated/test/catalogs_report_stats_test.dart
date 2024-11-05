import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CatalogsReportStats
void main() {
  final instance = CatalogsReportStatsBuilder();
  // TODO add properties to the builder and call build()

  group(CatalogsReportStats, () {
    // String reportType
    test('to test the property `reportType`', () async {
      // TODO
    });

    // ID of the catalog entity.
    // String catalogId
    test('to test the property `catalogId`', () async {
      // TODO
    });

    // The event code that a diagnostics aggregated number references
    // int code
    test('to test the property `code`', () async {
      // TODO
    });

    // A human-friendly label for the event code (e.g, 'SPAM')
    // String codeLabel
    test('to test the property `codeLabel`', () async {
      // TODO
    });

    // Title message describing the diagnostic issue
    // String message
    test('to test the property `message`', () async {
      // TODO
    });

    // Number of occurrences of the issue
    // int occurrences
    test('to test the property `occurrences`', () async {
      // TODO
    });

    // An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
    // String severity
    test('to test the property `severity`', () async {
      // TODO
    });

    // Indicates if issue makes items ineligible for ads distribution
    // bool ineligibleForAds
    test('to test the property `ineligibleForAds`', () async {
      // TODO
    });

    // Indicates if issue makes items ineligible for organic distribution
    // bool ineligibleForOrganic
    test('to test the property `ineligibleForOrganic`', () async {
      // TODO
    });

  });
}
