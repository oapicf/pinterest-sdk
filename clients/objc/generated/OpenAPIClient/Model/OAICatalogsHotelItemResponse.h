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


#import "OAICatalogsHotelAttributes.h"
#import "OAICatalogsType.h"
#import "OAIPin.h"
@protocol OAICatalogsHotelAttributes;
@class OAICatalogsHotelAttributes;
@protocol OAICatalogsType;
@class OAICatalogsType;
@protocol OAIPin;
@class OAIPin;



@protocol OAICatalogsHotelItemResponse
@end

@interface OAICatalogsHotelItemResponse : OAIObject


@property(nonatomic) OAICatalogsType* catalogType;
/* The catalog hotel id in the merchant namespace [optional]
 */
@property(nonatomic) NSString* hotelId;
/* The pins mapped to the item [optional]
 */
@property(nonatomic) NSArray<OAIPin>* pins;

@property(nonatomic) OAICatalogsHotelAttributes* attributes;

@end