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


/// tests for AudiencesApi
void main() {
  // final instance = AudiencesApi();

  group('tests for AudiencesApi', () {
    // Create audience
    //
    // Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.
    //
    //Future<Audience> audiencesCreate(String adAccountId, AudienceCreateRequest audienceCreateRequest) async
    test('test audiencesCreate', () async {
      // TODO
    });

    // Create custom audience
    //
    // Create a custom audience and find the audiences you want your ads to reach.
    //
    //Future<Audience> audiencesCreateCustom(String adAccountId, AudienceCreateCustomRequest audienceCreateCustomRequest) async
    test('test audiencesCreateCustom', () async {
      // TODO
    });

    // Get audience
    //
    // Get a specific audience given the audience ID.
    //
    //Future<Audience> audiencesGet(String adAccountId, String audienceId) async
    test('test audiencesGet', () async {
      // TODO
    });

    // List audiences
    //
    // Get list of audiences for the ad account.
    //
    //Future<AudiencesList200Response> audiencesList(String adAccountId, { String bookmark, String order, int pageSize, String ownershipType }) async
    test('test audiencesList', () async {
      // TODO
    });

    // Update audience
    //
    // Update (edit or remove) an existing targeting audience.
    //
    //Future<Audience> audiencesUpdate(String adAccountId, String audienceId, { AudienceUpdateRequest audienceUpdateRequest }) async
    test('test audiencesUpdate', () async {
      // TODO
    });

  });
}
