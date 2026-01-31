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


/// tests for ConversionTagsApi
void main() {
  // final instance = ConversionTagsApi();

  group('tests for ConversionTagsApi', () {
    // Create conversion tag
    //
    // Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account's website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)
    //
    //Future<ConversionTag> conversionTagsCreate(String adAccountId, ConversionTagCreate conversionTagCreate) async
    test('test conversionTagsCreate', () async {
      // TODO
    });

    // Get conversion tag
    //
    // Get information about an existing conversion tag.
    //
    //Future<ConversionTag> conversionTagsGet(String adAccountId, String conversionTagId) async
    test('test conversionTagsGet', () async {
      // TODO
    });

    // List conversion tags
    //
    // List conversion tags associated with an ad account.
    //
    //Future<ConversionTagsList200Response> conversionTagsList(String adAccountId, { bool filterDeleted }) async
    test('test conversionTagsList', () async {
      // TODO
    });

    // Get Ocpm eligible conversion tags
    //
    // Get Ocpm eligible conversion tag events for an ad account.
    //
    //Future<Map<String, List<ConversionEventResponse>>> ocpmEligibleConversionTagsGet(String adAccountId) async
    test('test ocpmEligibleConversionTagsGet', () async {
      // TODO
    });

    // Get page visit conversion tags
    //
    // Get all page visit conversion tag events for an ad account.
    //
    //Future<PageVisitConversionTagsGet200Response> pageVisitConversionTagsGet(String adAccountId, { int pageSize, String order, String bookmark }) async
    test('test pageVisitConversionTagsGet', () async {
      // TODO
    });

  });
}
