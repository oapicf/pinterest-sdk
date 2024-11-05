import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ConversionApiResponse
void main() {
  final instance = ConversionApiResponseBuilder();
  // TODO add properties to the builder and call build()

  group(ConversionApiResponse, () {
    // Total number of events received in the request.
    // int numEventsReceived
    test('to test the property `numEventsReceived`', () async {
      // TODO
    });

    // Number of events that were successfully processed from the events.
    // int numEventsProcessed
    test('to test the property `numEventsProcessed`', () async {
      // TODO
    });

    // Specific messages for each event received. The order will match the order in which the events were received in the request.
    // BuiltList<ConversionApiResponseEventsInner> events
    test('to test the property `events`', () async {
      // TODO
    });

  });
}
