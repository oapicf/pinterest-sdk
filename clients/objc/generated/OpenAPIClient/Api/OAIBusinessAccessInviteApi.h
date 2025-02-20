#import <Foundation/Foundation.h>
#import "OAIAuthRespondInvitesBody.h"
#import "OAICancelInvitesBody.h"
#import "OAICreateAssetAccessRequestBody.h"
#import "OAICreateAssetAccessRequestResponse.h"
#import "OAICreateAssetInvitesRequest.h"
#import "OAICreateInvitesResultsResponseArray.h"
#import "OAICreateMembershipOrPartnershipInvitesBody.h"
#import "OAIDeleteInvitesResultsResponseArray.h"
#import "OAIError.h"
#import "OAIGetInvites200Response.h"
#import "OAIInviteType.h"
#import "OAIRespondToInvitesResponseArray.h"
#import "OAIUpdateInvitesResultsResponseArray.h"
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



@interface OAIBusinessAccessInviteApi: NSObject <OAIApi>

extern NSString* kOAIBusinessAccessInviteApiErrorDomain;
extern NSInteger kOAIBusinessAccessInviteApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Create a request to access an existing partner's assets.
/// Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
///
/// @param businessId Unique identifier of the requesting business.
/// @param createAssetAccessRequestBody 
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAICreateAssetAccessRequestResponse*
-(NSURLSessionTask*) assetAccessRequestsCreateWithBusinessId: (NSString*) businessId
    createAssetAccessRequestBody: (OAICreateAssetAccessRequestBody*) createAssetAccessRequestBody
    completionHandler: (void (^)(OAICreateAssetAccessRequestResponse* output, NSError* error)) handler;


/// Cancel invites/requests
/// Cancel membership/partnership invites and/or requests.
///
/// @param businessId Business id
/// @param cancelInvitesBody A list with invite ids
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAIDeleteInvitesResultsResponseArray*
-(NSURLSessionTask*) cancelInvitesOrRequestsWithBusinessId: (NSString*) businessId
    cancelInvitesBody: (OAICancelInvitesBody*) cancelInvitesBody
    completionHandler: (void (^)(OAIDeleteInvitesResultsResponseArray* output, NSError* error)) handler;


/// Update invite/request with an asset permission
/// Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
///
/// @param businessId Unique identifier of the requesting business.
/// @param createAssetInvitesRequest A list of invites/requests together with the asset permissions to be assigned to the invite/request. 
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAIUpdateInvitesResultsResponseArray*
-(NSURLSessionTask*) createAssetInvitesWithBusinessId: (NSString*) businessId
    createAssetInvitesRequest: (OAICreateAssetInvitesRequest*) createAssetInvitesRequest
    completionHandler: (void (^)(OAIUpdateInvitesResultsResponseArray* output, NSError* error)) handler;


/// Create invites or requests
/// Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners
///
/// @param businessId Business id
/// @param createMembershipOrPartnershipInvitesBody An object with the properties: invite_type, partners, members, business_role
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAICreateInvitesResultsResponseArray*
-(NSURLSessionTask*) createMembershipOrPartnershipInvitesWithBusinessId: (NSString*) businessId
    createMembershipOrPartnershipInvitesBody: (OAICreateMembershipOrPartnershipInvitesBody*) createMembershipOrPartnershipInvitesBody
    completionHandler: (void (^)(OAICreateInvitesResultsResponseArray* output, NSError* error)) handler;


/// Get invites/requests
/// Get the membership/partnership invites and/or requests for the authorized user.
///
/// @param businessId Unique identifier of the requesting business.
/// @param isMember A boolean field to indicate whether the invite is to create a partnership or a membership. (optional) (default to @(YES))
/// @param inviteStatus A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. (optional)
/// @param inviteType Invite type to filter invites by. Only invites of the specified type will be returned. (optional)
/// @param bookmark Cursor used to fetch the next page of items (optional)
/// @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional) (default to @25)
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAIGetInvites200Response*
-(NSURLSessionTask*) getInvitesWithBusinessId: (NSString*) businessId
    isMember: (NSNumber*) isMember
    inviteStatus: (NSArray<NSString*>*) inviteStatus
    inviteType: (OAIInviteType) inviteType
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIGetInvites200Response* output, NSError* error)) handler;


/// Accept or decline an invite/request
/// Accept or decline invites or requests.
///
/// @param authRespondInvitesBody 
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAIRespondToInvitesResponseArray*
-(NSURLSessionTask*) respondBusinessAccessInvitesWithAuthRespondInvitesBody: (OAIAuthRespondInvitesBody*) authRespondInvitesBody
    completionHandler: (void (^)(OAIRespondToInvitesResponseArray* output, NSError* error)) handler;



@end
