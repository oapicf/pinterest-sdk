import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for KeywordUpdateBody
void main() {
  final instance = KeywordUpdateBodyBuilder();
  // TODO add properties to the builder and call build()

  group(KeywordUpdateBody, () {
    // Keywords to update. Object array. Each object has 2 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>For example: [{\"id\":\"2886610576653\", \"archived\": false}, {\"id\":\"2886610576654\",  \"archived\": true}, ...]
    // BuiltList<KeywordUpdate> keywords
    test('to test the property `keywords`', () async {
      // TODO
    });

  });
}
