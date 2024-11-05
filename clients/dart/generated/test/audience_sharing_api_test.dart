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


/// tests for AudienceSharingApi
void main() {
  // final instance = AudienceSharingApi();

  group('tests for AudienceSharingApi', () {
    // List accounts with access to an audience owned by an ad account
    //
    // List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
    //
    //Future<AdAccountsAudiencesSharedAccountsList200Response> adAccountsAudiencesSharedAccountsList(String adAccountId, String audienceId, AudienceAccountType accountType, { int pageSize, String bookmark }) async
    test('test adAccountsAudiencesSharedAccountsList', () async {
      // TODO
    });

    // List accounts with access to an audience owned by a business
    //
    // List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
    //
    //Future<AdAccountsAudiencesSharedAccountsList200Response> businessAccountAudiencesSharedAccountsList(String businessId, String audienceId, AudienceAccountType accountType, { int pageSize, String bookmark }) async
    test('test businessAccountAudiencesSharedAccountsList', () async {
      // TODO
    });

    // List received audiences for a business
    //
    // Get a list of received audiences for the given business.
    //
    //Future<AudiencesList200Response> sharedAudiencesForBusinessList(String businessId, { String bookmark, String order, int pageSize }) async
    test('test sharedAudiencesForBusinessList', () async {
      // TODO
    });

    // Update audience sharing between ad accounts
    //
    // From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
    //
    //Future<SharedAudienceResponse> updateAdAccountToAdAccountSharedAudience(String adAccountId, SharedAudience sharedAudience) async
    test('test updateAdAccountToAdAccountSharedAudience', () async {
      // TODO
    });

    // Update audience sharing from an ad account to businesses
    //
    // From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
    //
    //Future<BusinessSharedAudienceResponse> updateAdAccountToBusinessSharedAudience(String adAccountId, BusinessSharedAudience businessSharedAudience) async
    test('test updateAdAccountToBusinessSharedAudience', () async {
      // TODO
    });

    // Update audience sharing from a business to ad accounts
    //
    // From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
    //
    //Future<SharedAudienceResponse> updateBusinessToAdAccountSharedAudience(String businessId, SharedAudience sharedAudience) async
    test('test updateBusinessToAdAccountSharedAudience', () async {
      // TODO
    });

    // Update audience sharing between businesses
    //
    // From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
    //
    //Future<BusinessSharedAudienceResponse> updateBusinessToBusinessSharedAudience(String businessId, BusinessSharedAudience businessSharedAudience) async
    test('test updateBusinessToBusinessSharedAudience', () async {
      // TODO
    });

  });
}
