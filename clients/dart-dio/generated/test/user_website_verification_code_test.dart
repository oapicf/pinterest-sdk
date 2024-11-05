import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for UserWebsiteVerificationCode
void main() {
  final instance = UserWebsiteVerificationCodeBuilder();
  // TODO add properties to the builder and call build()

  group(UserWebsiteVerificationCode, () {
    // Code to check against the user claiming the website
    // String verificationCode
    test('to test the property `verificationCode`', () async {
      // TODO
    });

    // DNS TXT record to check against for the website to be claimed
    // String dnsTxtRecord
    test('to test the property `dnsTxtRecord`', () async {
      // TODO
    });

    // Metatag the verification process searchs for the website to be claimed
    // String metatag
    test('to test the property `metatag`', () async {
      // TODO
    });

    // File expected to find on the website being claimed
    // String filename
    test('to test the property `filename`', () async {
      // TODO
    });

    // A full html file to upload to the website in order for it to be claimed
    // String fileContent
    test('to test the property `fileContent`', () async {
      // TODO
    });

  });
}
