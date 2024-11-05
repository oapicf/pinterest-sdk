import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RelatedTerms
void main() {
  final instance = RelatedTermsBuilder();
  // TODO add properties to the builder and call build()

  group(RelatedTerms, () {
    // First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // Total number of related terms returned
    // int relatedTermCount
    test('to test the property `relatedTermCount`', () async {
      // TODO
    });

    // The id of the advertiser.
    // BuiltList<RelatedTermsRelatedTermsListInner> relatedTermsList
    test('to test the property `relatedTermsList`', () async {
      // TODO
    });

  });
}
