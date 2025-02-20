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





@protocol OAIBusinessMembersAssetAccessDeleteRequestAccessesInner
@end

@interface OAIBusinessMembersAssetAccessDeleteRequestAccessesInner : OAIObject

/* Id of the asset on which to remove member permissions. 
 */
@property(nonatomic) NSString* assetId;
/* Unique identifier of the member on which to perform the asset permission removal 
 */
@property(nonatomic) NSString* memberId;

@end
