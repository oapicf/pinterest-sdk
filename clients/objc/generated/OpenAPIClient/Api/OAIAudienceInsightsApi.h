#import <Foundation/Foundation.h>
#import "OAIAudienceDefinitionResponse.h"
#import "OAIAudienceInsightType.h"
#import "OAIAudienceInsightsResponse.h"
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



@interface OAIAudienceInsightsApi: NSObject <OAIApi>

extern NSString* kOAIAudienceInsightsApiErrorDomain;
extern NSInteger kOAIAudienceInsightsApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Get audience insights
/// Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.
///
/// @param adAccountId Unique identifier of an ad account.
/// @param audienceInsightType Type of audience insights.
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAIAudienceInsightsResponse*
-(NSURLSessionTask*) audienceInsightsGetWithAdAccountId: (NSString*) adAccountId
    audienceInsightType: (OAIAudienceInsightType) audienceInsightType
    completionHandler: (void (^)(OAIAudienceInsightsResponse* output, NSError* error)) handler;


/// Get audience insights scope and type
/// Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
///
/// @param adAccountId Unique identifier of an ad account.
/// 
///  code:200 message:"Success",
///  code:0 message:"Unexpected error"
///
/// @return OAIAudienceDefinitionResponse*
-(NSURLSessionTask*) audienceInsightsScopeAndTypeGetWithAdAccountId: (NSString*) adAccountId
    completionHandler: (void (^)(OAIAudienceDefinitionResponse* output, NSError* error)) handler;



@end
