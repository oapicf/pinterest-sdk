import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CatalogsReportDistributionStats
void main() {
  final instance = CatalogsReportDistributionStatsBuilder();
  // TODO add properties to the builder and call build()

  group(CatalogsReportDistributionStats, () {
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
