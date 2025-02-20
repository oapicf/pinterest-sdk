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


#import "OAIAuthRespondInvitesBodyInvitesInnerAction.h"
@protocol OAIAuthRespondInvitesBodyInvitesInnerAction;
@class OAIAuthRespondInvitesBodyInvitesInnerAction;



@protocol OAIAuthRespondInvitesBodyInvitesInner
@end

@interface OAIAuthRespondInvitesBodyInvitesInner : OAIObject


@property(nonatomic) OAIAuthRespondInvitesBodyInvitesInnerAction* action;
/* Unique identifier of an invite. 
 */
@property(nonatomic) NSString* inviteId;

@end
