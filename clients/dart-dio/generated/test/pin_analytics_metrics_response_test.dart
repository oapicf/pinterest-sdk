import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for PinAnalyticsMetricsResponse
void main() {
  final instance = PinAnalyticsMetricsResponseBuilder();
  // TODO add properties to the builder and call build()

  group(PinAnalyticsMetricsResponse, () {
    // The lifetime metric name and value.
    // BuiltMap<String, int> lifetimeMetrics
    test('to test the property `lifetimeMetrics`', () async {
      // TODO
    });

    // Array with the requested daily metric records
    // BuiltList<PinAnalyticsMetricsResponseDailyMetricsInner> dailyMetrics
    test('to test the property `dailyMetrics`', () async {
      // TODO
    });

    // The metric name and value over the requested period for each requested metric
    // BuiltMap<String, num> summaryMetrics
    test('to test the property `summaryMetrics`', () async {
      // TODO
    });

  });
}
