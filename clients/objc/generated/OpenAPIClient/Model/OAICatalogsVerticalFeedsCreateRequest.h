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


#import "OAICatalogsFeedCredentials.h"
#import "OAICatalogsFeedProcessingSchedule.h"
#import "OAICatalogsFeedsCreateRequestDefaultLocale.h"
#import "OAICatalogsFormat.h"
#import "OAICatalogsHotelFeedsCreateRequest.h"
#import "OAICatalogsRetailFeedsCreateRequest.h"
#import "OAICatalogsType.h"
#import "OAICountry.h"
#import "OAINullableCurrency.h"
#import "OAIProductAvailabilityType.h"
@protocol OAICatalogsFeedCredentials;
@class OAICatalogsFeedCredentials;
@protocol OAICatalogsFeedProcessingSchedule;
@class OAICatalogsFeedProcessingSchedule;
@protocol OAICatalogsFeedsCreateRequestDefaultLocale;
@class OAICatalogsFeedsCreateRequestDefaultLocale;
@protocol OAICatalogsFormat;
@class OAICatalogsFormat;
@protocol OAICatalogsHotelFeedsCreateRequest;
@class OAICatalogsHotelFeedsCreateRequest;
@protocol OAICatalogsRetailFeedsCreateRequest;
@class OAICatalogsRetailFeedsCreateRequest;
@protocol OAICatalogsType;
@class OAICatalogsType;
@protocol OAICountry;
@class OAICountry;
@protocol OAINullableCurrency;
@class OAINullableCurrency;
@protocol OAIProductAvailabilityType;
@class OAIProductAvailabilityType;



@protocol OAICatalogsVerticalFeedsCreateRequest
@end

@interface OAICatalogsVerticalFeedsCreateRequest : OAIObject


@property(nonatomic) OAINullableCurrency* defaultCurrency;
/* A human-friendly name associated to a given feed. 
 */
@property(nonatomic) NSString* name;

@property(nonatomic) OAICatalogsFormat* format;

@property(nonatomic) OAICatalogsFeedsCreateRequestDefaultLocale* defaultLocale;

@property(nonatomic) OAICatalogsFeedCredentials* credentials;
/* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. 
 */
@property(nonatomic) NSString* location;

@property(nonatomic) OAICatalogsFeedProcessingSchedule* preferredProcessingSchedule;

@property(nonatomic) OAICatalogsType* catalogType;

@property(nonatomic) OAICountry* defaultCountry;

@property(nonatomic) OAIProductAvailabilityType* defaultAvailability;
/* Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future. [optional]
 */
@property(nonatomic) NSString* catalogId;

@end