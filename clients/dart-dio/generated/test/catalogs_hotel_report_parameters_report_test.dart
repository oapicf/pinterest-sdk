import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CatalogsHotelReportParametersReport
void main() {
  final instance = CatalogsHotelReportParametersReportBuilder();
  // TODO add properties to the builder and call build()

  group(CatalogsHotelReportParametersReport, () {
    // String reportType
    test('to test the property `reportType`', () async {
      // TODO
    });

    // ID of the feed entity.
    // String feedId
    test('to test the property `feedId`', () async {
      // TODO
    });

    // Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
    // String processingResultId
    test('to test the property `processingResultId`', () async {
      // TODO
    });

    // Unique identifier of a catalog. If not given, oldest catalog will be used
    // String catalogId
    test('to test the property `catalogId`', () async {
      // TODO
    });

  });
}
