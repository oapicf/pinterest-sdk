import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for MediaApi
void main() {
  final instance = Openapi().getMediaApi();

  group(MediaApi, () {
    // Register media upload
    //
    // Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file's contents as the request's <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href='/docs/api-features/creating-boards-and-pins/#creating-video-pins'>Learn more</a></strong> about video Pin creation.
    //
    //Future<MediaUpload> mediaCreate(MediaUploadRequest mediaUploadRequest) async
    test('test mediaCreate', () async {
      // TODO
    });

    // Get media upload details
    //
    // Get details for a registered media upload, including its current status.  <strong><a href='/docs/api-features/creating-boards-and-pins/#creating-video-pins'>Learn more</a></strong> about video Pin creation.
    //
    //Future<MediaUploadDetails> mediaGet(String mediaId) async
    test('test mediaGet', () async {
      // TODO
    });

    // List media uploads
    //
    // List media uploads filtered by given parameters.  <strong><a href='/docs/api-features/creating-boards-and-pins/#creating-video-pins'>Learn more</a></strong> about video Pin creation.
    //
    //Future<MediaList200Response> mediaList({ String bookmark, int pageSize }) async
    test('test mediaList', () async {
      // TODO
    });

  });
}
