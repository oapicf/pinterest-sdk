#import <Foundation/Foundation.h>
#import "OAIDetailedError.h"
#import "OAIError.h"
#import "OAIIntegrationLogsRequest.h"
#import "OAIIntegrationLogsSuccessResponse.h"
#import "OAIIntegrationMetadata.h"
#import "OAIIntegrationRecord.h"
#import "OAIIntegrationRequest.h"
#import "OAIIntegrationRequestPatch.h"
#import "OAIIntegrationsGetList200Response.h"
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



@interface OAIIntegrationsApi: NSObject <OAIApi>

extern NSString* kOAIIntegrationsApiErrorDomain;
extern NSInteger kOAIIntegrationsApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Delete commerce integration
/// Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
///
/// @param externalBusinessId External business ID for the integration.
/// 
///  code:204 message:"Commerce Integration deleted successfully",
///  code:0 message:"Unexpected error."
///
/// @return void
-(NSURLSessionTask*) integrationsCommerceDelWithExternalBusinessId: (NSString*) externalBusinessId
    completionHandler: (void (^)(NSError* error)) handler;


/// Get commerce integration
/// Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
///
/// @param externalBusinessId External business ID for the integration.
/// 
///  code:200 message:"Success",
///  code:404 message:"Integration not found.",
///  code:409 message:"Can't access this integration metadata.",
///  code:0 message:"Unexpected error."
///
/// @return OAIIntegrationMetadata*
-(NSURLSessionTask*) integrationsCommerceGetWithExternalBusinessId: (NSString*) externalBusinessId
    completionHandler: (void (^)(OAIIntegrationMetadata* output, NSError* error)) handler;


/// Update commerce integration
/// Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
///
/// @param externalBusinessId External business ID for the integration.
/// @param integrationRequestPatch Parameters to get create/update the Integration Metadata (optional)
/// 
///  code:200 message:"Success",
///  code:404 message:"Integration not found.",
///  code:409 message:"Can't access this integration metadata.",
///  code:0 message:"Unexpected error."
///
/// @return OAIIntegrationMetadata*
-(NSURLSessionTask*) integrationsCommercePatchWithExternalBusinessId: (NSString*) externalBusinessId
    integrationRequestPatch: (OAIIntegrationRequestPatch*) integrationRequestPatch
    completionHandler: (void (^)(OAIIntegrationMetadata* output, NSError* error)) handler;


/// Create commerce integration
/// Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
///
/// @param integrationRequest Parameters to get create/update the Integration Metadata (optional)
/// 
///  code:200 message:"Success",
///  code:404 message:"Integration not found.",
///  code:409 message:"Can't access this integration metadata.",
///  code:0 message:"Unexpected error."
///
/// @return OAIIntegrationMetadata*
-(NSURLSessionTask*) integrationsCommercePostWithIntegrationRequest: (OAIIntegrationRequest*) integrationRequest
    completionHandler: (void (^)(OAIIntegrationMetadata* output, NSError* error)) handler;


/// Get integration metadata
/// Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
///
/// @param _id Integration ID.
/// 
///  code:200 message:"Success",
///  code:404 message:"Integration not found.",
///  code:0 message:"Unexpected error."
///
/// @return OAIIntegrationRecord*
-(NSURLSessionTask*) integrationsGetByIdWithId: (NSString*) _id
    completionHandler: (void (^)(OAIIntegrationRecord* output, NSError* error)) handler;


/// Get integration metadata list
/// Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
///
/// @param bookmark Cursor used to fetch the next page of items (optional)
/// @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional) (default to @25)
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error."
///
/// @return OAIIntegrationsGetList200Response*
-(NSURLSessionTask*) integrationsGetListWithBookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(OAIIntegrationsGetList200Response* output, NSError* error)) handler;


/// Receives batched logs from integration applications.
/// This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
///
/// @param integrationLogsRequest Ingest log information from external integration application.
/// 
///  code:200 message:"Success.",
///  code:400 message:"Bad request.",
///  code:0 message:"Unexpected error"
///
/// @return OAIIntegrationLogsSuccessResponse*
-(NSURLSessionTask*) integrationsLogsPostWithIntegrationLogsRequest: (OAIIntegrationLogsRequest*) integrationLogsRequest
    completionHandler: (void (^)(OAIIntegrationLogsSuccessResponse* output, NSError* error)) handler;



@end