#import <Foundation/Foundation.h>
#import "OAIBoard.h"
#import "OAIBoardSection.h"
#import "OAIBoardSectionsList200Response.h"
#import "OAIBoardUpdate.h"
#import "OAIBoardsList200Response.h"
#import "OAIBoardsListPins200Response.h"
#import "OAIError.h"
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



@interface OAIBoardsApi: NSObject <OAIApi>

extern NSString* kOAIBoardsApiErrorDomain;
extern NSInteger kOAIBoardsApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Create board section
/// Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
///
/// @param boardId Unique identifier of a board.
/// @param boardSection Create a board section.
/// @param adAccountId Unique identifier of an ad account. (optional)
/// 
///  code:201 message:"response",
///  code:400 message:"Invalid board section parameters.",
///  code:403 message:"Not authorized to create board sections.",
///  code:409 message:"Could not get exclusive access to the board to create a new section.",
///  code:500 message:"Could not create a new board section.",
///  code:0 message:"Unexpected error"
///
/// @return OAIBoardSection*
-(NSURLSessionTask*) boardSectionsCreateWithBoardId: (NSString*) boardId
    boardSection: (OAIBoardSection*) boardSection
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(OAIBoardSection* output, NSError* error)) handler;


/// Delete board section
/// Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
///
/// @param boardId Unique identifier of a board.
/// @param sectionId Unique identifier of a board section.
/// @param adAccountId Unique identifier of an ad account. (optional)
/// 
///  code:204 message:"Board section deleted successfully",
///  code:403 message:"Not authorized to delete board section.",
///  code:404 message:"Board section not found.",
///  code:409 message:"Board section conflict.",
///  code:0 message:"Unexpected error"
///
/// @return void
-(NSURLSessionTask*) boardSectionsDeleteWithBoardId: (NSString*) boardId
    sectionId: (NSString*) sectionId
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(NSError* error)) handler;


/// List board sections
/// Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
///
/// @param boardId Unique identifier of a board.
/// @param adAccountId Unique identifier of an ad account. (optional)
/// @param bookmark Cursor used to fetch the next page of items (optional)
/// @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional) (default to @25)
/// 
///  code:200 message:"response",
///  code:0 message:"Unexpected error"
///
/// @return OAIBoardSectionsList200Response*
-(NSURLSessionTask*) boardSectionsListWithBoardId: (NSString*) boardId
    adAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIBoardSectionsList200Response* output, NSError* error)) handler;


/// List Pins on board section
/// Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
///
/// @param boardId Unique identifier of a board.
/// @param sectionId Unique identifier of a board section.
/// @param adAccountId Unique identifier of an ad account. (optional)
/// @param bookmark Cursor used to fetch the next page of items (optional)
/// @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional) (default to @25)
/// 
///  code:200 message:"response",
///  code:403 message:"Not authorized to access Pins on board section.",
///  code:404 message:"Board or section not found.",
///  code:409 message:"Board section conflict.",
///  code:0 message:"Unexpected error"
///
/// @return OAIBoardsListPins200Response*
-(NSURLSessionTask*) boardSectionsListPinsWithBoardId: (NSString*) boardId
    sectionId: (NSString*) sectionId
    adAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIBoardsListPins200Response* output, NSError* error)) handler;


/// Update board section
/// Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
///
/// @param boardId Unique identifier of a board.
/// @param sectionId Unique identifier of a board section.
/// @param boardSection Update a board section.
/// @param adAccountId Unique identifier of an ad account. (optional)
/// 
///  code:200 message:"response",
///  code:400 message:"Invalid board section parameters.",
///  code:403 message:"Not authorized to update board section.",
///  code:409 message:"Board section conflict.",
///  code:0 message:"Unexpected error"
///
/// @return OAIBoardSection*
-(NSURLSessionTask*) boardSectionsUpdateWithBoardId: (NSString*) boardId
    sectionId: (NSString*) sectionId
    boardSection: (OAIBoardSection*) boardSection
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(OAIBoardSection* output, NSError* error)) handler;


/// Create board
/// Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
///
/// @param board Create a board using a single board json object.
/// @param adAccountId Unique identifier of an ad account. (optional)
/// 
///  code:201 message:"response",
///  code:400 message:"The board name is invalid or duplicated.",
///  code:0 message:"Unexpected error"
///
/// @return OAIBoard*
-(NSURLSessionTask*) boardsCreateWithBoard: (OAIBoard*) board
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(OAIBoard* output, NSError* error)) handler;


/// Delete board
/// Delete a board owned by the \"operation user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
///
/// @param boardId Unique identifier of a board.
/// @param adAccountId Unique identifier of an ad account. (optional)
/// 
///  code:204 message:"Board deleted successfully",
///  code:403 message:"Not authorized to delete the board.",
///  code:404 message:"Board not found.",
///  code:409 message:"Could not get exclusive access to delete the board.",
///  code:429 message:"This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.",
///  code:0 message:"Unexpected error"
///
/// @return void
-(NSURLSessionTask*) boardsDeleteWithBoardId: (NSString*) boardId
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(NSError* error)) handler;


/// Get board
/// Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
///
/// @param boardId Unique identifier of a board.
/// @param adAccountId Unique identifier of an ad account. (optional)
/// 
///  code:200 message:"response",
///  code:404 message:"Board not found.",
///  code:0 message:"Unexpected error"
///
/// @return OAIBoard*
-(NSURLSessionTask*) boardsGetWithBoardId: (NSString*) boardId
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(OAIBoard* output, NSError* error)) handler;


/// List boards
/// Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
///
/// @param adAccountId Unique identifier of an ad account. (optional)
/// @param bookmark Cursor used to fetch the next page of items (optional)
/// @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional) (default to @25)
/// @param privacy Privacy setting for a board. (optional)
/// 
///  code:200 message:"response",
///  code:0 message:"Unexpected error"
///
/// @return OAIBoardsList200Response*
-(NSURLSessionTask*) boardsListWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    privacy: (NSString*) privacy
    completionHandler: (void (^)(OAIBoardsList200Response* output, NSError* error)) handler;


/// List Pins on board
/// Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
///
/// @param boardId Unique identifier of a board.
/// @param bookmark Cursor used to fetch the next page of items (optional)
/// @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional) (default to @25)
/// @param creativeTypes Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
/// @param adAccountId Unique identifier of an ad account. (optional)
/// @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to @(NO))
/// 
///  code:200 message:"response",
///  code:404 message:"Board not found.",
///  code:0 message:"Unexpected error"
///
/// @return OAIBoardsListPins200Response*
-(NSURLSessionTask*) boardsListPinsWithBoardId: (NSString*) boardId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    creativeTypes: (NSArray<NSString*>*) creativeTypes
    adAccountId: (NSString*) adAccountId
    pinMetrics: (NSNumber*) pinMetrics
    completionHandler: (void (^)(OAIBoardsListPins200Response* output, NSError* error)) handler;


/// Update board
/// Update a board owned by the \"operating user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
///
/// @param boardId Unique identifier of a board.
/// @param boardUpdate Update a board.
/// @param adAccountId Unique identifier of an ad account. (optional)
/// 
///  code:200 message:"response",
///  code:400 message:"Invalid board parameters.",
///  code:403 message:"Not authorized to update the board.",
///  code:429 message:"This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.",
///  code:0 message:"Unexpected error"
///
/// @return OAIBoard*
-(NSURLSessionTask*) boardsUpdateWithBoardId: (NSString*) boardId
    boardUpdate: (OAIBoardUpdate*) boardUpdate
    adAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(OAIBoard* output, NSError* error)) handler;



@end
