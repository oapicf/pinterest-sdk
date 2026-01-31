import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for MediaApi
void main() {
  final instance = Openapi().getMediaApi();

  group(MediaApi, () {
    // Register media upload
    //
    // Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using `curl`, for example) to `upload_url` using the `Content-Type` header value. Send the media file's contents as the request's `file` parameter and also include all of the parameters from `upload_parameters`.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
    //
    //Future<MediaUpload> mediaCreate(MediaUploadCreate mediaUploadCreate) async
    test('test mediaCreate', () async {
      // TODO
    });

    // Get media upload details
    //
    // Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
    //
    //Future<Media> mediaGet(String mediaId) async
    test('test mediaGet', () async {
      // TODO
    });

    // List media uploads
    //
    // List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
    //
    //Future<MediaList200Response> mediaList({ String bookmark, int pageSize }) async
    test('test mediaList', () async {
      // TODO
    });

  });
}
