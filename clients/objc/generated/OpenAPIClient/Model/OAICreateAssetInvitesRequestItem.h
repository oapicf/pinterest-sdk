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


#import "OAIInviteType.h"
#import "OAIPermissions.h"
@protocol OAIInviteType;
@class OAIInviteType;
@protocol OAIPermissions;
@class OAIPermissions;



@protocol OAICreateAssetInvitesRequestItem
@end

@interface OAICreateAssetInvitesRequestItem : OAIObject

/* Unique identifier of an invite. 
 */
@property(nonatomic) NSString* inviteId;

@property(nonatomic) OAIInviteType* inviteType;
/* An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  
 */
@property(nonatomic) NSDictionary<NSString*, NSArray<OAIPermissions>*>* assetIdToPermissions;

@end
