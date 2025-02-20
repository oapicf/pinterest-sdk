#import <Foundation/Foundation.h>
#import "OAIBusinessAssetMembersGet200Response.h"
#import "OAIBusinessAssetPartnersGet200Response.h"
#import "OAIBusinessAssetsGet200Response.h"
#import "OAIBusinessMemberAssetsGet200Response.h"
#import "OAIBusinessMembersAssetAccessDeleteRequest.h"
#import "OAIBusinessPartnerAssetAccessGet200Response.h"
#import "OAICreateAssetGroupBody.h"
#import "OAICreateAssetGroupResponse.h"
#import "OAIDeleteAssetGroupBody.h"
#import "OAIDeleteAssetGroupResponse.h"
#import "OAIDeleteMemberAccessResultsResponseArray.h"
#import "OAIDeletePartnerAssetAccessBody.h"
#import "OAIDeletePartnerAssetsResultsResponseArray.h"
#import "OAIError.h"
#import "OAIPartnerType.h"
#import "OAIPermissionsWithOwner.h"
#import "OAIUpdateAssetGroupBody.h"
#import "OAIUpdateAssetGroupResponse.h"
#import "OAIUpdateMemberAssetAccessBody.h"
#import "OAIUpdateMemberAssetsResultsResponseArray.h"
#import "OAIUpdatePartnerAssetAccessBody.h"
#import "OAIUpdatePartnerAssetsResultsResponseArray.h"
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



@interface OAIBusinessAccessAssetsApi: NSObject <OAIApi>

extern NSString* kOAIBusinessAccessAssetsApiErrorDomain;
extern NSInteger kOAIBusinessAccessAssetsApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Create a new asset group.
/// Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.
///
/// @param businessId Unique identifier of the requesting business.
/// @param createAssetGroupBody 
/// 
///  code:200 message:"Success",
///  code:400 message:"Invalid parameters.",
///  code:0 message:"Unexpected error"
///
/// @return OAICreateAssetGroupResponse*
-(NSURLSessionTask*) assetGroupCreateWithBusinessId: (NSString*) businessId
    createAssetGroupBody: (OAICreateAssetGroupBody*) createAssetGroupBody
    completionHandler: (void (^)(OAICreateAssetGroupResponse* output, NSError* error)) handler;


/// Delete asset groups.
/// Delete a batch of asset groups.
///
/// @param businessId Unique identifier of the requesting business.
/// @param deleteAssetGroupBody 
/// 
///  code:200 message:"Success",
///  code:400 message:"Invalid parameters.",
///  code:0 message:"Unexpected error"
///
/// @return OAIDeleteAssetGroupResponse*
-(NSURLSessionTask*) assetGroupDeleteWithBusinessId: (NSString*) businessId
    deleteAssetGroupBody: (OAIDeleteAssetGroupBody*) deleteAssetGroupBody
    completionHandler: (void (^)(OAIDeleteAssetGroupResponse* output, NSError* error)) handler;


/// Update asset groups.
/// Update a batch of asset groups with the specified parameters.
///
/// @param businessId Unique identifier of the requesting business.
/// @param updateAssetGroupBody 
/// 
///  code:200 message:"Success",
///  code:400 message:"Invalid parameters.",
///  code:0 message:"Unexpected error"
///
/// @return OAIUpdateAssetGroupResponse*
-(NSURLSessionTask*) assetGroupUpdateWithBusinessId: (NSString*) businessId
    updateAssetGroupBody: (OAIUpdateAssetGroupBody*) updateAssetGroupBody
    completionHandler: (void (^)(OAIUpdateAssetGroupResponse* output, NSError* error)) handler;


/// Get members with access to asset
/// Get all the members the requesting business has granted access to on the given asset.
///
/// @param businessId Unique identifier of the requesting business.
/// @param assetId Unique identifier of a business asset.
/// @param bookmark Cursor used to fetch the next page of items (optional)
/// @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional) (default to @25)
/// @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to @0)
/// 
///  code:200 message:"Sucess",
///  code:0 message:"Unexpected error"
///
/// @return OAIBusinessAssetMembersGet200Response*
-(NSURLSessionTask*) businessAssetMembersGetWithBusinessId: (NSString*) businessId
    assetId: (NSString*) assetId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    startIndex: (NSNumber*) startIndex
    completionHandler: (void (^)(OAIBusinessAssetMembersGet200Response* output, NSError* error)) handler;


/// Get partners with access to asset
/// Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
///
/// @param businessId Unique identifier of the requesting business.
/// @param assetId Unique identifier of a business asset.
/// @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to @0)
/// @param bookmark Cursor used to fetch the next page of items (optional)
/// @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional) (default to @25)
/// 
///  code:200 message:"Sucess",
///  code:0 message:"Unexpected error"
///
/// @return OAIBusinessAssetPartnersGet200Response*
-(NSURLSessionTask*) businessAssetPartnersGetWithBusinessId: (NSString*) businessId
    assetId: (NSString*) assetId
    startIndex: (NSNumber*) startIndex
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIBusinessAssetPartnersGet200Response* output, NSError* error)) handler;


/// List business assets
/// Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
///
/// @param businessId Unique identifier of the requesting business.
/// @param permissions A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. (optional)
/// @param childAssetId A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. (optional)
/// @param assetGroupId An asset group unique identifier. Used to fetch assets contained within the specified asset group. (optional)
/// @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to @"AD_ACCOUNT")
/// @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to @0)
/// @param bookmark Cursor used to fetch the next page of items (optional)
/// @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional) (default to @25)
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAIBusinessAssetsGet200Response*
-(NSURLSessionTask*) businessAssetsGetWithBusinessId: (NSString*) businessId
    permissions: (NSArray<OAIPermissionsWithOwner>*) permissions
    childAssetId: (NSString*) childAssetId
    assetGroupId: (NSString*) assetGroupId
    assetType: (NSString*) assetType
    startIndex: (NSNumber*) startIndex
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIBusinessAssetsGet200Response* output, NSError* error)) handler;


/// Get assets assigned to a member
/// Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
///
/// @param businessId Unique identifier of the requesting business.
/// @param memberId The member id to fetch assets for.
/// @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to @"AD_ACCOUNT")
/// @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to @0)
/// @param bookmark Cursor used to fetch the next page of items (optional)
/// @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional) (default to @25)
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAIBusinessMemberAssetsGet200Response*
-(NSURLSessionTask*) businessMemberAssetsGetWithBusinessId: (NSString*) businessId
    memberId: (NSString*) memberId
    assetType: (NSString*) assetType
    startIndex: (NSNumber*) startIndex
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIBusinessMemberAssetsGet200Response* output, NSError* error)) handler;


/// Delete member access to asset
/// Terminate multiple members' access to an asset.
///
/// @param businessId Unique identifier of the requesting business.
/// @param businessMembersAssetAccessDeleteRequest List member assset permissions to delete.
/// 
///  code:200 message:"response",
///  code:0 message:"Unexpected error"
///
/// @return OAIDeleteMemberAccessResultsResponseArray*
-(NSURLSessionTask*) businessMembersAssetAccessDeleteWithBusinessId: (NSString*) businessId
    businessMembersAssetAccessDeleteRequest: (OAIBusinessMembersAssetAccessDeleteRequest*) businessMembersAssetAccessDeleteRequest
    completionHandler: (void (^)(OAIDeleteMemberAccessResultsResponseArray* output, NSError* error)) handler;


/// Assign/Update member asset permissions
/// Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
///
/// @param businessId Unique identifier of the requesting business.
/// @param updateMemberAssetAccessBody List of member asset permissions to create or update.
/// 
///  code:200 message:"response",
///  code:0 message:"Unexpected error"
///
/// @return OAIUpdateMemberAssetsResultsResponseArray*
-(NSURLSessionTask*) businessMembersAssetAccessUpdateWithBusinessId: (NSString*) businessId
    updateMemberAssetAccessBody: (OAIUpdateMemberAssetAccessBody*) updateMemberAssetAccessBody
    completionHandler: (void (^)(OAIUpdateMemberAssetsResultsResponseArray* output, NSError* error)) handler;


/// Get assets assigned to a partner or assets assigned by a partner
/// Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.
///
/// @param businessId Unique identifier of the requesting business.
/// @param partnerId The partner id to be bound to the Business
/// @param partnerType Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. (optional)
/// @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to @"AD_ACCOUNT")
/// @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to @0)
/// @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional) (default to @25)
/// @param bookmark Cursor used to fetch the next page of items (optional)
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAIBusinessPartnerAssetAccessGet200Response*
-(NSURLSessionTask*) businessPartnerAssetAccessGetWithBusinessId: (NSString*) businessId
    partnerId: (NSString*) partnerId
    partnerType: (OAIPartnerType*) partnerType
    assetType: (NSString*) assetType
    startIndex: (NSNumber*) startIndex
    pageSize: (NSNumber*) pageSize
    bookmark: (NSString*) bookmark
    completionHandler: (void (^)(OAIBusinessPartnerAssetAccessGet200Response* output, NSError* error)) handler;


/// Delete partner access to asset
/// Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.
///
/// @param businessId Unique identifier of the requesting business.
/// @param deletePartnerAssetAccessBody 
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAIDeletePartnerAssetsResultsResponseArray*
-(NSURLSessionTask*) deletePartnerAssetAccessHandlerImplWithBusinessId: (NSString*) businessId
    deletePartnerAssetAccessBody: (OAIDeletePartnerAssetAccessBody*) deletePartnerAssetAccessBody
    completionHandler: (void (^)(OAIDeletePartnerAssetsResultsResponseArray* output, NSError* error)) handler;


/// Assign/Update partner asset permissions
/// Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
///
/// @param businessId Unique identifier of the requesting business.
/// @param updatePartnerAssetAccessBody A list of assets and permissions to assign to your partners.
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAIUpdatePartnerAssetsResultsResponseArray*
-(NSURLSessionTask*) updatePartnerAssetAccessHandlerImplWithBusinessId: (NSString*) businessId
    updatePartnerAssetAccessBody: (OAIUpdatePartnerAssetAccessBody*) updatePartnerAssetAccessBody
    completionHandler: (void (^)(OAIUpdatePartnerAssetsResultsResponseArray* output, NSError* error)) handler;



@end
