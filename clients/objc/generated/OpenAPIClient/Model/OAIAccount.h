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





@protocol OAIAccount
@end

@interface OAIAccount : OAIObject

/* Type of account [optional]
 */
@property(nonatomic) NSString* accountType;
/* User account ID. [optional]
 */
@property(nonatomic) NSString* _id;

@property(nonatomic) NSString* profileImage;

@property(nonatomic) NSString* websiteUrl;

@property(nonatomic) NSString* username;
/* Profile about description. [optional]
 */
@property(nonatomic) NSString* about;

@property(nonatomic) NSString* businessName;
/* User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. [optional]
 */
@property(nonatomic) NSNumber* boardCount;
/* User account pin count. This includes both created and saved pins. [optional]
 */
@property(nonatomic) NSNumber* pinCount;
/* User account follower count. [optional]
 */
@property(nonatomic) NSNumber* followerCount;
/* User account following count. [optional]
 */
@property(nonatomic) NSNumber* followingCount;
/* User account monthly views. [optional]
 */
@property(nonatomic) NSNumber* monthlyViews;

@end
