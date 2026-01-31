//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for MediaApi
void main() {
  // final instance = MediaApi();

  group('tests for MediaApi', () {
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
