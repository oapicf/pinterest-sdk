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


#import "OAIAdvancedAuctionBidOptions.h"
#import "OAICountry.h"
#import "OAILanguage.h"
#import "OAIUpdateMaskBidOptionField.h"
@protocol OAIAdvancedAuctionBidOptions;
@class OAIAdvancedAuctionBidOptions;
@protocol OAICountry;
@class OAICountry;
@protocol OAILanguage;
@class OAILanguage;
@protocol OAIUpdateMaskBidOptionField;
@class OAIUpdateMaskBidOptionField;



@protocol OAIAdvancedAuctionItemsSubmitUpsertRecord
@end

@interface OAIAdvancedAuctionItemsSubmitUpsertRecord : OAIObject

/* The catalog retail item id in the merchant namespace 
 */
@property(nonatomic) NSString* itemId;

@property(nonatomic) OAICountry* country;

@property(nonatomic) OAILanguage* language;

@property(nonatomic) OAIAdvancedAuctionBidOptions* bidOptions;
/* The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`. 
 */
@property(nonatomic) NSArray<OAIUpdateMaskBidOptionField>* updateMask;

@end
