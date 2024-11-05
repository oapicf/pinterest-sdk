import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for TermsApi
void main() {
  final instance = Openapi().getTermsApi();

  group(TermsApi, () {
    // List related terms
    //
    // Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.
    //
    //Future<RelatedTerms> termsRelatedList(BuiltList<String> terms) async
    test('test termsRelatedList', () async {
      // TODO
    });

    // List suggested terms
    //
    // Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.
    //
    //Future<BuiltList<String>> termsSuggestedList(String term, { int limit }) async
    test('test termsSuggestedList', () async {
      // TODO
    });

  });
}
