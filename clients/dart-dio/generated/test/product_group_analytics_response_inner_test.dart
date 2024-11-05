import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ProductGroupAnalyticsResponseInner
void main() {
  final instance = ProductGroupAnalyticsResponseInnerBuilder();
  // TODO add properties to the builder and call build()

  group(ProductGroupAnalyticsResponseInner, () {
    // The ID of the product group that this metrics belongs to.
    // String PRODUCT_GROUP_ID
    test('to test the property `PRODUCT_GROUP_ID`', () async {
      // TODO
    });

    // Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
    // Date DATE
    test('to test the property `DATE`', () async {
      // TODO
    });

  });
}
