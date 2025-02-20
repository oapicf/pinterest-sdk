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





@protocol OAIDeletePartnerAssetAccessBodyAccessesInner
@end

@interface OAIDeletePartnerAssetAccessBodyAccessesInner : OAIObject

/* Unique identifier of a business partner to update asset access to. 
 */
@property(nonatomic) NSString* partnerId;
/* Unique identifier of the business asset. 
 */
@property(nonatomic) NSString* assetId;
/* If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset. [optional]
 */
@property(nonatomic) NSString* partnerType;

@end
