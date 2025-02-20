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
#import "OAICatalogsProductGroupFiltersRequest.h"
#import "OAICountry.h"
@protocol OAICatalogsLocale;
@class OAICatalogsLocale;
@protocol OAICatalogsProductGroupFiltersRequest;
@class OAICatalogsProductGroupFiltersRequest;
@protocol OAICountry;
@class OAICountry;



@protocol OAICatalogsRetailProductGroupUpdateRequest
@end

@interface OAICatalogsRetailProductGroupUpdateRequest : OAIObject

/* Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. [optional]
 */
@property(nonatomic) NSString* catalogType;

@property(nonatomic) NSString* name;

@property(nonatomic) NSString* _description;

@property(nonatomic) OAICatalogsProductGroupFiltersRequest* filters;

@property(nonatomic) OAICountry* country;

@property(nonatomic) OAICatalogsLocale* locale;

@end
