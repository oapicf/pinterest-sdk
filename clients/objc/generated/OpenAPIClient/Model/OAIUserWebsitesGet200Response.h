#import <Foundation/Foundation.h>
#import "OAIObject.h"

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


#import "OAIUserWebsiteSummary.h"
@protocol OAIUserWebsiteSummary;
@class OAIUserWebsiteSummary;



@protocol OAIUserWebsitesGet200Response
@end

@interface OAIUserWebsitesGet200Response : OAIObject


@property(nonatomic) NSArray<OAIUserWebsiteSummary>* items;

@property(nonatomic) NSString* bookmark;

@end
