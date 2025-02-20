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


#import "OAICatalogsType.h"
#import "OAIItemValidationEvent.h"
@protocol OAICatalogsType;
@class OAICatalogsType;
@protocol OAIItemValidationEvent;
@class OAIItemValidationEvent;



@protocol OAICatalogsCreativeAssetsItemErrorResponse
@end

@interface OAICatalogsCreativeAssetsItemErrorResponse : OAIObject


@property(nonatomic) OAICatalogsType* catalogType;
/* The catalog creative assets id in the merchant namespace [optional]
 */
@property(nonatomic) NSString* creativeAssetsId;
/* Array with the errors for the item id requested [optional]
 */
@property(nonatomic) NSArray<OAIItemValidationEvent>* errors;

@end
