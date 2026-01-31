import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for LabelCreateRequest
void main() {
  final instance = LabelCreateRequestBuilder();
  // TODO add properties to the builder and call build()

  group(LabelCreateRequest, () {
    // Labels that you are applying to the campaign.
    // BuiltList<LabelCreateRequestLabelsInner> labels
    test('to test the property `labels`', () async {
      // TODO
    });

    // Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
    // String parentId
    test('to test the property `parentId`', () async {
      // TODO
    });

  });
}
