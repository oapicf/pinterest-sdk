import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for AudienceSharingApi
void main() {
  final instance = Openapi().getAudienceSharingApi();

  group(AudienceSharingApi, () {
    // List accounts with access to an audience owned by an ad account
    //
    // List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
    //
    //Future<AdAccountsAudiencesSharedAccountsList200Response> adAccountsAudiencesSharedAccountsList(String audienceId, AudienceAccountType accountType, String adAccountId, { String bookmark, int pageSize }) async
    test('test adAccountsAudiencesSharedAccountsList', () async {
      // TODO
    });

    // List accounts with access to an audience owned by a business
    //
    // List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
    //
    //Future<AdAccountsAudiencesSharedAccountsList200Response> businessAccountAudiencesSharedAccountsList(String businessId, String audienceId, AudienceAccountType accountType, { String bookmark, int pageSize }) async
    test('test businessAccountAudiencesSharedAccountsList', () async {
      // TODO
    });

    // List received audiences for a business
    //
    // Get a list of received audiences for the given business.
    //
    //Future<SharedAudiencesForBusinessList200Response> sharedAudiencesForBusinessList(String businessId, { Order order, String bookmark, int pageSize }) async
    test('test sharedAudiencesForBusinessList', () async {
      // TODO
    });

    // Update audience sharing between ad accounts
    //
    // From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
    //
    //Future<AdAccountToAdAccountSharedAudience> updateAdAccountToAdAccountSharedAudience(String adAccountId, AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody adAccountToAdAccountSharedAudienceUpdateWithRequiredBody) async
    test('test updateAdAccountToAdAccountSharedAudience', () async {
      // TODO
    });

    // Update audience sharing from an ad account to businesses
    //
    // From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
    //
    //Future<AdAccountToBusinessSharedAudience> updateAdAccountToBusinessSharedAudience(String adAccountId, AdAccountToBusinessSharedAudienceUpdateWithRequiredBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody) async
    test('test updateAdAccountToBusinessSharedAudience', () async {
      // TODO
    });

    // Update audience sharing from a business to ad accounts
    //
    // From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
    //
    //Future<BusinessToAdAccountSharedAudience> updateBusinessToAdAccountSharedAudience(String businessId, BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody) async
    test('test updateBusinessToAdAccountSharedAudience', () async {
      // TODO
    });

    // Update audience sharing between businesses
    //
    // From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
    //
    //Future<BusinessToBusinessSharedAudience> updateBusinessToBusinessSharedAudience(String businessId, BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody) async
    test('test updateBusinessToBusinessSharedAudience', () async {
      // TODO
    });

  });
}
