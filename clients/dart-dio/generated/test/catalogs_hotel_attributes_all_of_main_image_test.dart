import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CatalogsHotelAttributesAllOfMainImage
void main() {
  final instance = CatalogsHotelAttributesAllOfMainImageBuilder();
  // TODO add properties to the builder and call build()

  group(CatalogsHotelAttributesAllOfMainImage, () {
    // <p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p>
    // String link
    test('to test the property `link`', () async {
      // TODO
    });

    // Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
    // BuiltList<String> tag
    test('to test the property `tag`', () async {
      // TODO
    });

  });
}
