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


#import "OAIAudienceDataParty.h"
#import "OAIAudienceRule.h"
#import "OAIAudienceSharingType.h"
@protocol OAIAudienceDataParty;
@class OAIAudienceDataParty;
@protocol OAIAudienceRule;
@class OAIAudienceRule;
@protocol OAIAudienceSharingType;
@class OAIAudienceSharingType;



@protocol OAIAudienceCreateCustomRequest
@end

@interface OAIAudienceCreateCustomRequest : OAIObject

/* Ad account ID. [optional]
 */
@property(nonatomic) NSString* adAccountId;
/* Audience name. 
 */
@property(nonatomic) NSString* name;

@property(nonatomic) OAIAudienceRule* rule;

@property(nonatomic) OAIAudienceSharingType* sharingType;

@property(nonatomic) OAIAudienceDataParty* dataParty;

@property(nonatomic) NSString* category;

@end
