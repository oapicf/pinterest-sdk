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


#import "OAICatalogsCreativeAssetsItemErrorResponse.h"
#import "OAICatalogsHotelItemErrorResponse.h"
#import "OAICatalogsRetailItemErrorResponse.h"
#import "OAICatalogsType.h"
#import "OAIItemValidationEvent.h"
@protocol OAICatalogsCreativeAssetsItemErrorResponse;
@class OAICatalogsCreativeAssetsItemErrorResponse;
@protocol OAICatalogsHotelItemErrorResponse;
@class OAICatalogsHotelItemErrorResponse;
@protocol OAICatalogsRetailItemErrorResponse;
@class OAICatalogsRetailItemErrorResponse;
@protocol OAICatalogsType;
@class OAICatalogsType;
@protocol OAIItemValidationEvent;
@class OAIItemValidationEvent;



@protocol OAIItemResponseAnyOf1
@end

@interface OAIItemResponseAnyOf1 : OAIObject


@property(nonatomic) OAICatalogsType* catalogType;
/* The catalog item id in the merchant namespace [optional]
 */
@property(nonatomic) NSString* itemId;
/* Array with the errors for the item id requested [optional]
 */
@property(nonatomic) NSArray<OAIItemValidationEvent>* errors;
/* The catalog hotel id in the merchant namespace [optional]
 */
@property(nonatomic) NSString* hotelId;
/* The catalog creative assets id in the merchant namespace [optional]
 */
@property(nonatomic) NSString* creativeAssetsId;

@end
