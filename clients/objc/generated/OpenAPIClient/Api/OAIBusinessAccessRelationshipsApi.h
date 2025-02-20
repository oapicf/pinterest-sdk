#import <Foundation/Foundation.h>
#import "OAIDeletePartnersRequest.h"
#import "OAIDeletePartnersResponse.h"
#import "OAIDeletedMembersResponse.h"
#import "OAIError.h"
#import "OAIGetBusinessEmployers200Response.h"
#import "OAIGetBusinessMembers200Response.h"
#import "OAIGetBusinessPartners200Response.h"
#import "OAIMemberBusinessRole.h"
#import "OAIMembersToDeleteBody.h"
#import "OAIPartnerType.h"
#import "OAIUpdateMemberBusinessRoleBody.h"
#import "OAIUpdateMemberResultsResponseArray.h"
#import "OAIApi.h"

/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/



@interface OAIBusinessAccessRelationshipsApi: NSObject <OAIApi>

extern NSString* kOAIBusinessAccessRelationshipsApiErrorDomain;
extern NSInteger kOAIBusinessAccessRelationshipsApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Terminate business memberships
/// Terminate memberships between the specified members and your business.
///
/// @param businessId Business id
/// @param membersToDeleteBody List of members with role to delete.
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAIDeletedMembersResponse*
-(NSURLSessionTask*) deleteBusinessMembershipWithBusinessId: (NSString*) businessId
    membersToDeleteBody: (OAIMembersToDeleteBody*) membersToDeleteBody
    completionHandler: (void (^)(OAIDeletedMembersResponse* output, NSError* error)) handler;


/// Terminate business partnerships
/// Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
///
/// @param businessId Unique identifier of the requesting business.
/// @param deletePartnersRequest An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete. 
/// 
///  code:200 message:"Success",
///  code:404 message:"A supplied partner id doesn't exist",
///  code:0 message:"Unexpected error"
///
/// @return OAIDeletePartnersResponse*
-(NSURLSessionTask*) deleteBusinessPartnersWithBusinessId: (NSString*) businessId
    deletePartnersRequest: (OAIDeletePartnersRequest*) deletePartnersRequest
    completionHandler: (void (^)(OAIDeletePartnersResponse* output, NSError* error)) handler;


/// List business employers for user
/// Get all of the viewing user's business employers.
///
/// @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional) (default to @25)
/// @param bookmark Cursor used to fetch the next page of items (optional)
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAIGetBusinessEmployers200Response*
-(NSURLSessionTask*) getBusinessEmployersWithPageSize: (NSNumber*) pageSize
    bookmark: (NSString*) bookmark
    completionHandler: (void (^)(OAIGetBusinessEmployers200Response* output, NSError* error)) handler;


/// Get business members
/// Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE
///
/// @param businessId Unique identifier of the requesting business.
/// @param assetsSummary Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to @(NO))
/// @param businessRoles A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional)
/// @param memberIds A list of business members ids separated by comma. (optional)
/// @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to @0)
/// @param bookmark Cursor used to fetch the next page of items (optional)
/// @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional) (default to @25)
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAIGetBusinessMembers200Response*
-(NSURLSessionTask*) getBusinessMembersWithBusinessId: (NSString*) businessId
    assetsSummary: (NSNumber*) assetsSummary
    businessRoles: (NSArray<OAIMemberBusinessRole>*) businessRoles
    memberIds: (NSString*) memberIds
    startIndex: (NSNumber*) startIndex
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIGetBusinessMembers200Response* output, NSError* error)) handler;


/// Get business partners
/// Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.
///
/// @param businessId Unique identifier of the requesting business.
/// @param assetsSummary Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to @(NO))
/// @param partnerType Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. (optional)
/// @param partnerIds A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional)
/// @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to @0)
/// @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional) (default to @25)
/// @param bookmark Cursor used to fetch the next page of items (optional)
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAIGetBusinessPartners200Response*
-(NSURLSessionTask*) getBusinessPartnersWithBusinessId: (NSString*) businessId
    assetsSummary: (NSNumber*) assetsSummary
    partnerType: (OAIPartnerType) partnerType
    partnerIds: (NSString*) partnerIds
    startIndex: (NSNumber*) startIndex
    pageSize: (NSNumber*) pageSize
    bookmark: (NSString*) bookmark
    completionHandler: (void (^)(OAIGetBusinessPartners200Response* output, NSError* error)) handler;


/// Update member's business role
/// Update a member's business role within the business.
///
/// @param businessId Business id
/// @param updateMemberBusinessRoleBody List of objects with the member id and the business_role.
/// 
///  code:200 message:"response",
///  code:0 message:"Unexpected error"
///
/// @return OAIUpdateMemberResultsResponseArray*
-(NSURLSessionTask*) updateBusinessMembershipsWithBusinessId: (NSString*) businessId
    updateMemberBusinessRoleBody: (NSArray<OAIUpdateMemberBusinessRoleBody>*) updateMemberBusinessRoleBody
    completionHandler: (void (^)(OAIUpdateMemberResultsResponseArray* output, NSError* error)) handler;



@end
