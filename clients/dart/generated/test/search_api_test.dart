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


/// tests for SearchApi
void main() {
  // final instance = SearchApi();

  group('tests for SearchApi', () {
    // Search pins by a given search term
    //
    // <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.
    //
    //Future<SearchPartnerPins200Response> searchPartnerPins(String term, String countryCode, { String bookmark, String locale, int limit }) async
    test('test searchPartnerPins', () async {
      // TODO
    });

    // Search user's boards
    //
    // Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
    //
    //Future<SearchUserBoardsGet200Response> searchUserBoardsGet({ String adAccountId, String bookmark, int pageSize, String query }) async
    test('test searchUserBoardsGet', () async {
      // TODO
    });

    // Search user's Pins
    //
    // Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
    //
    //Future<PinsList200Response> searchUserPinsList(String query, { String adAccountId, String bookmark }) async
    test('test searchUserPinsList', () async {
      // TODO
    });

  });
}
