#import <Foundation/Foundation.h>
#import "OAIObject.h"

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


#import "OAIAudienceRule.h"
#import "OAIAudienceUpdateOperationType.h"
@protocol OAIAudienceRule;
@class OAIAudienceRule;
@protocol OAIAudienceUpdateOperationType;
@class OAIAudienceUpdateOperationType;



@protocol OAIAudienceUpdateRequest
@end

@interface OAIAudienceUpdateRequest : OAIObject

/* Ad account ID. [optional]
 */
@property(nonatomic) NSString* adAccountId;
/* Audience name. [optional]
 */
@property(nonatomic) NSString* name;

@property(nonatomic) OAIAudienceRule* rule;
/* Audience description. [optional]
 */
@property(nonatomic) NSString* _description;

@property(nonatomic) OAIAudienceUpdateOperationType* operationType;

@end