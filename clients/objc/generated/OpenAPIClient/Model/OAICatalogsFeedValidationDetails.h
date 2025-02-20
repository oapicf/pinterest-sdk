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


#import "OAICatalogsFeedValidationErrors.h"
#import "OAICatalogsFeedValidationWarnings.h"
@protocol OAICatalogsFeedValidationErrors;
@class OAICatalogsFeedValidationErrors;
@protocol OAICatalogsFeedValidationWarnings;
@class OAICatalogsFeedValidationWarnings;



@protocol OAICatalogsFeedValidationDetails
@end

@interface OAICatalogsFeedValidationDetails : OAIObject


@property(nonatomic) OAICatalogsFeedValidationErrors* errors;

@property(nonatomic) OAICatalogsFeedValidationWarnings* warnings;

@end
