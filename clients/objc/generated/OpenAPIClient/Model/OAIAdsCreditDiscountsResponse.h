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





@protocol OAIAdsCreditDiscountsResponse
@end

@interface OAIAdsCreditDiscountsResponse : OAIObject

/* True if the offer code is currently active. [optional]
 */
@property(nonatomic) NSNumber* active;
/* Advertiser ID the offer was applied to. [optional]
 */
@property(nonatomic) NSString* advertiserId;
/* The type of discount of this credit [optional]
 */
@property(nonatomic) NSString* discountType;
/* The discount applied in the offer’s currency value. [optional]
 */
@property(nonatomic) NSNumber* discountInMicroCurrency;
/* Currency value for the discount. [optional]
 */
@property(nonatomic) NSString* discountCurrency;
/* Human readable title of the offer code. [optional]
 */
@property(nonatomic) NSString* title;
/* The credits left to spend. [optional]
 */
@property(nonatomic) NSNumber* remainingDiscountInMicroCurrency;

@end