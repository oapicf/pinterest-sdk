import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for TermsOfServiceApi
void main() {
  final instance = Openapi().getTermsOfServiceApi();

  group(TermsOfServiceApi, () {
    // Get terms of service
    //
    // Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
    //
    //Future<TermsOfService> termsOfServiceGet(String adAccountId, { bool includeHtml, String tosType }) async
    test('test termsOfServiceGet', () async {
      // TODO
    });

  });
}
