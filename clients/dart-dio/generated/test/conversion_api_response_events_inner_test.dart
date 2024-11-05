import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ConversionApiResponseEventsInner
void main() {
  final instance = ConversionApiResponseEventsInnerBuilder();
  // TODO add properties to the builder and call build()

  group(ConversionApiResponseEventsInner, () {
    // Whether the event was processed successfully.
    // String status
    test('to test the property `status`', () async {
      // TODO
    });

    // Error message containing more information about why the event failed to be processed.
    // String errorMessage
    test('to test the property `errorMessage`', () async {
      // TODO
    });

    // Warning messages about any fields in the event which are not standard. These are not critical to event processing.
    // String warningMessage
    test('to test the property `warningMessage`', () async {
      // TODO
    });

  });
}
