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


/// tests for ConversionDeletionRequestsApi
void main() {
  // final instance = ConversionDeletionRequestsApi();

  group('tests for ConversionDeletionRequestsApi', () {
    // Create a conversion deletion request
    //
    // **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.
    //
    //Future<ConversionDeletionRequest> conversionDeletionRequestCreate(String adAccountId, ConversionDeletionRequestCreate conversionDeletionRequestCreate) async
    test('test conversionDeletionRequestCreate', () async {
      // TODO
    });

    // Delete a conversion deletion request
    //
    // **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from `ad_account_id` with `request_id`. This will cancel the request and prevent it from being processed. This can only be done if the request is in the `PENDING` status and before the 72 hours mark.
    //
    //Future<ConversionDeletionRequest> conversionDeletionRequestDelete(String requestId, String adAccountId) async
    test('test conversionDeletionRequestDelete', () async {
      // TODO
    });

    // Get a single conversion deletion request
    //
    // **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from `ad_account_id` with `request_id`.
    //
    //Future<ConversionDeletionRequest> conversionDeletionRequestGet(String requestId, String adAccountId) async
    test('test conversionDeletionRequestGet', () async {
      // TODO
    });

    // List conversion deletion requests
    //
    // **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified `ad_account_id`.
    //
    //Future<ConversionDeletionRequestList200Response> conversionDeletionRequestList(String adAccountId, { String bookmark, int pageSize, PinterestLibPaginationOrder order }) async
    test('test conversionDeletionRequestList', () async {
      // TODO
    });

  });
}
