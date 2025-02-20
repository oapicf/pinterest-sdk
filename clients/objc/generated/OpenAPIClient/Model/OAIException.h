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





@protocol OAIException
@end

@interface OAIException : OAIObject

/* Exception error code. [optional]
 */
@property(nonatomic) NSNumber* code;
/* Exception message. [optional]
 */
@property(nonatomic) NSString* message;

@end
