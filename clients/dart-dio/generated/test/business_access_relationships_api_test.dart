import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for BusinessAccessRelationshipsApi
void main() {
  final instance = Openapi().getBusinessAccessRelationshipsApi();

  group(BusinessAccessRelationshipsApi, () {
    // Terminate business memberships
    //
    // Terminate memberships between the specified members and your business.
    //
    //Future<DeletedMembersResponse> deleteBusinessMembership(String businessId, MembersToDeleteBody membersToDeleteBody) async
    test('test deleteBusinessMembership', () async {
      // TODO
    });

    // Terminate business partnerships
    //
    // Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
    //
    //Future<DeletePartnersResponse> deleteBusinessPartners(String businessId, DeletePartnersRequest deletePartnersRequest) async
    test('test deleteBusinessPartners', () async {
      // TODO
    });

    // List business employers for user
    //
    // Get all of the viewing user's business employers.
    //
    //Future<GetBusinessEmployers200Response> getBusinessEmployers({ int pageSize, String bookmark }) async
    test('test getBusinessEmployers', () async {
      // TODO
    });

    // Get business members
    //
    // Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE
    //
    //Future<GetBusinessMembers200Response> getBusinessMembers(String businessId, { bool assetsSummary, BuiltList<MemberBusinessRole> businessRoles, String memberIds, int startIndex, String bookmark, int pageSize }) async
    test('test getBusinessMembers', () async {
      // TODO
    });

    // Get business partners
    //
    // Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.
    //
    //Future<GetBusinessPartners200Response> getBusinessPartners(String businessId, { bool assetsSummary, PartnerType partnerType, String partnerIds, int startIndex, int pageSize, String bookmark }) async
    test('test getBusinessPartners', () async {
      // TODO
    });

    // Update member's business role
    //
    // Update a member's business role within the business.
    //
    //Future<UpdateMemberResultsResponseArray> updateBusinessMemberships(String businessId, BuiltList<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody) async
    test('test updateBusinessMemberships', () async {
      // TODO
    });

  });
}
