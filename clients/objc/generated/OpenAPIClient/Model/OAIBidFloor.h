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





@protocol OAIBidFloor
@end

@interface OAIBidFloor : OAIObject

/* A list of bid floors in micro currency. For example, [100000, 200000] [optional]
 */
@property(nonatomic) NSArray<NSNumber*>* bidFloors;
/* Always the string 'bidfloor' [optional]
 */
@property(nonatomic) NSString* type;

@end