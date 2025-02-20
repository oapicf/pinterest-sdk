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





@protocol OAICreateAssetAccessRequestErrorMessageInner
@end

@interface OAICreateAssetAccessRequestErrorMessageInner : OAIObject

/* Error code associated with the error in requesting asset access. [optional]
 */
@property(nonatomic) NSNumber* code;

@property(nonatomic) NSArray<NSString*>* messages;

@end
