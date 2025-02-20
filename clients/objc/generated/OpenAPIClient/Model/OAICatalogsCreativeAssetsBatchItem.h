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


#import "OAICatalogsCreateCreativeAssetsItem.h"
#import "OAICatalogsDeleteCreativeAssetsItem.h"
#import "OAICatalogsUpdatableCreativeAssetsAttributes.h"
#import "OAICatalogsUpdateCreativeAssetsItem.h"
#import "OAICatalogsUpsertCreativeAssetsItem.h"
@protocol OAICatalogsCreateCreativeAssetsItem;
@class OAICatalogsCreateCreativeAssetsItem;
@protocol OAICatalogsDeleteCreativeAssetsItem;
@class OAICatalogsDeleteCreativeAssetsItem;
@protocol OAICatalogsUpdatableCreativeAssetsAttributes;
@class OAICatalogsUpdatableCreativeAssetsAttributes;
@protocol OAICatalogsUpdateCreativeAssetsItem;
@class OAICatalogsUpdateCreativeAssetsItem;
@protocol OAICatalogsUpsertCreativeAssetsItem;
@class OAICatalogsUpsertCreativeAssetsItem;



@protocol OAICatalogsCreativeAssetsBatchItem
@end

@interface OAICatalogsCreativeAssetsBatchItem : OAIObject

/* The catalog creative assets id in the merchant namespace 
 */
@property(nonatomic) NSString* creativeAssetsId;

@property(nonatomic) NSString* operation;

@property(nonatomic) OAICatalogsUpdatableCreativeAssetsAttributes* attributes;

@end
