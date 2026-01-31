import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for QualityComponentDetails
void main() {
  final instance = QualityComponentDetailsBuilder();
  // TODO add properties to the builder and call build()

  group(QualityComponentDetails, () {
    // Coverage percentage for this event type.
    // num coverage
    test('to test the property `coverage`', () async {
      // TODO
    });

    // List of issues detected for this event type, if any.
    // BuiltList<QualityComponentIssue> issues
    test('to test the property `issues`', () async {
      // TODO
    });

    // Overlap percentage for this event type. Only populated for external_event_id
    // num overlap
    test('to test the property `overlap`', () async {
      // TODO
    });

  });
}
