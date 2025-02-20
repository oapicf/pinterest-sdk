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





@protocol OAIDeleteInvitesResultsResponseArrayItemsInnerException
@end

@interface OAIDeleteInvitesResultsResponseArrayItemsInnerException : OAIObject

/* Unique identifier of an invite. [optional]
 */
@property(nonatomic) NSString* inviteId;
/* Error message associated with the error in performing the action on the invite/request. [optional]
 */
@property(nonatomic) NSString* message;

@end
