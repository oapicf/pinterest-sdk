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


#import "OAICatalogsLocale.h"
#import "OAICatalogsProductGroupFilters.h"
#import "OAICountry.h"
@protocol OAICatalogsLocale;
@class OAICatalogsLocale;
@protocol OAICatalogsProductGroupFilters;
@class OAICatalogsProductGroupFilters;
@protocol OAICountry;
@class OAICountry;



@protocol OAICatalogsRetailListProductsByCatalogBasedFilterRequest
@end

@interface OAICatalogsRetailListProductsByCatalogBasedFilterRequest : OAIObject

/* Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. 
 */
@property(nonatomic) NSString* catalogType;
/* Catalog id pertaining to the retail product group. 
 */
@property(nonatomic) NSString* catalogId;

@property(nonatomic) OAICatalogsProductGroupFilters* filters;

@property(nonatomic) OAICountry* country;

@property(nonatomic) OAICatalogsLocale* locale;

@end
