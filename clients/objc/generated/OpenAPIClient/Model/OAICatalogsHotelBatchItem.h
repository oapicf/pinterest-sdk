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


#import "OAICatalogsCreateHotelItem.h"
#import "OAICatalogsDeleteHotelItem.h"
#import "OAICatalogsUpdatableHotelAttributes.h"
#import "OAICatalogsUpdateHotelItem.h"
#import "OAICatalogsUpsertHotelItem.h"
@protocol OAICatalogsCreateHotelItem;
@class OAICatalogsCreateHotelItem;
@protocol OAICatalogsDeleteHotelItem;
@class OAICatalogsDeleteHotelItem;
@protocol OAICatalogsUpdatableHotelAttributes;
@class OAICatalogsUpdatableHotelAttributes;
@protocol OAICatalogsUpdateHotelItem;
@class OAICatalogsUpdateHotelItem;
@protocol OAICatalogsUpsertHotelItem;
@class OAICatalogsUpsertHotelItem;



@protocol OAICatalogsHotelBatchItem
@end

@interface OAICatalogsHotelBatchItem : OAIObject

/* The catalog hotel id in the merchant namespace 
 */
@property(nonatomic) NSString* hotelId;

@property(nonatomic) NSString* operation;

@property(nonatomic) OAICatalogsUpdatableHotelAttributes* attributes;

@end