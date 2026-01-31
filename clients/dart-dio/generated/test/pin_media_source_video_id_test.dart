import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for PinMediaSourceVideoID
void main() {
  final instance = PinMediaSourceVideoIDBuilder();
  // TODO add properties to the builder and call build()

  group(PinMediaSourceVideoID, () {
    // Content type for cover image Base64.
    // ContentType coverImageContentType
    test('to test the property `coverImageContentType`', () async {
      // TODO
    });

    // Cover image Base64.
    // String coverImageData
    test('to test the property `coverImageData`', () async {
      // TODO
    });

    // Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
    // int coverImageKeyFrameTime
    test('to test the property `coverImageKeyFrameTime`', () async {
      // TODO
    });

    // Cover image URL.
    // String coverImageUrl
    test('to test the property `coverImageUrl`', () async {
      // TODO
    });

    // Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
    // bool isStandard (default value: true)
    test('to test the property `isStandard`', () async {
      // TODO
    });

    // String mediaId
    test('to test the property `mediaId`', () async {
      // TODO
    });

    // String sourceType
    test('to test the property `sourceType`', () async {
      // TODO
    });

  });
}
