#import <Foundation/Foundation.h>
#import "OAIError.h"
#import "OAIPinsList200Response.h"
#import "OAISearchPartnerPins200Response.h"
#import "OAISearchUserBoardsGet200Response.h"
#import "OAIApi.h"

/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/



@interface OAISearchApi: NSObject <OAIApi>

extern NSString* kOAISearchApiErrorDomain;
extern NSInteger kOAISearchApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Search pins by a given search term
/// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.
///
/// @param term Search term to look up pins.
/// @param countryCode Two letter country code (ISO 3166-1 alpha-2)
/// @param bookmark Cursor used to fetch the next page of items (optional)
/// @param locale Search locale. (optional)
/// @param limit Max search result size (optional) (default to @10)
/// 
///  code:200 message:"Success",
///  code:400 message:"Invalid pins",
///  code:0 message:"Unexpected error"
///
/// @return OAISearchPartnerPins200Response*
-(NSURLSessionTask*) searchPartnerPinsWithTerm: (NSString*) term
    countryCode: (NSString*) countryCode
    bookmark: (NSString*) bookmark
    locale: (NSString*) locale
    limit: (NSNumber*) limit
    completionHandler: (void (^)(OAISearchPartnerPins200Response* output, NSError* error)) handler;


/// Search user's boards
/// Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.
///
/// @param adAccountId Unique identifier of an ad account. (optional)
/// @param bookmark Cursor used to fetch the next page of items (optional)
/// @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional) (default to @25)
/// @param query Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)
/// 
///  code:200 message:"response",
///  code:0 message:"Unexpected error"
///
/// @return OAISearchUserBoardsGet200Response*
-(NSURLSessionTask*) searchUserBoardsGetWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    query: (NSString*) query
    completionHandler: (void (^)(OAISearchUserBoardsGet200Response* output, NSError* error)) handler;


/// Search user's Pins
/// Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.
///
/// @param query Search query. Can contain pin description keywords or comma-separated pin IDs.
/// @param adAccountId Unique identifier of an ad account. (optional)
/// @param bookmark Cursor used to fetch the next page of items (optional)
/// 
///  code:200 message:"Success",
///  code:404 message:"User not found",
///  code:0 message:"Unexpected error"
///
/// @return OAIPinsList200Response*
-(NSURLSessionTask*) searchUserPinsListWithQuery: (NSString*) query
    adAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    completionHandler: (void (^)(OAIPinsList200Response* output, NSError* error)) handler;



@end