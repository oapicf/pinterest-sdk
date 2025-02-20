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





@protocol OAICatalogsRetailProductGroupProductCounts
@end

@interface OAICatalogsRetailProductGroupProductCounts : OAIObject


@property(nonatomic) NSString* catalogType;

@property(nonatomic) NSNumber* inStock;

@property(nonatomic) NSNumber* outOfStock;

@property(nonatomic) NSNumber* preorder;

@property(nonatomic) NSNumber* total;

@property(nonatomic) NSNumber* videos;

@end
