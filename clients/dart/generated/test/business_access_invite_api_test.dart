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


/// tests for BusinessAccessInviteApi
void main() {
  // final instance = BusinessAccessInviteApi();

  group('tests for BusinessAccessInviteApi', () {
    // Create a request to access an existing partner's assets.
    //
    // Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
    //
    //Future<CreateAssetAccessRequestResponse> assetAccessRequestsCreate(String businessId, CreateAssetAccessRequestBody createAssetAccessRequestBody) async
    test('test assetAccessRequestsCreate', () async {
      // TODO
    });

    // Cancel invites/requests
    //
    // Cancel membership/partnership invites and/or requests.
    //
    //Future<DeleteInvitesResultsResponseArray> cancelInvitesOrRequests(String businessId, CancelInvitesBody cancelInvitesBody) async
    test('test cancelInvitesOrRequests', () async {
      // TODO
    });

    // Update invite/request with an asset permission
    //
    // Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
    //
    //Future<UpdateInvitesResultsResponseArray> createAssetInvites(String businessId, CreateAssetInvitesRequest createAssetInvitesRequest) async
    test('test createAssetInvites', () async {
      // TODO
    });

    // Create invites or requests
    //
    // Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners
    //
    //Future<CreateInvitesResultsResponseArray> createMembershipOrPartnershipInvites(String businessId, CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody) async
    test('test createMembershipOrPartnershipInvites', () async {
      // TODO
    });

    // Get invites/requests
    //
    // Get the membership/partnership invites and/or requests for the authorized user.
    //
    //Future<GetInvites200Response> getInvites(String businessId, { bool isMember, List<String> inviteStatus, InviteType inviteType, String bookmark, int pageSize }) async
    test('test getInvites', () async {
      // TODO
    });

    // Accept or decline an invite/request
    //
    // Accept or decline invites or requests.
    //
    //Future<RespondToInvitesResponseArray> respondBusinessAccessInvites(AuthRespondInvitesBody authRespondInvitesBody) async
    test('test respondBusinessAccessInvites', () async {
      // TODO
    });

  });
}
