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


#import "OAIBoard.h"
#import "OAIEntityStatus.h"
@protocol OAIBoard;
@class OAIBoard;
@protocol OAIEntityStatus;
@class OAIEntityStatus;



@protocol OAICatalogProductGroup
@end

@interface OAICatalogProductGroup : OAIObject

/* ID of the catalog product group. [optional]
 */
@property(nonatomic) NSString* _id;
/* Merchant ID pertaining to the owner of the catalog product group. [optional]
 */
@property(nonatomic) NSString* merchantId;
/* Name of catalog product group [optional]
 */
@property(nonatomic) NSString* name;
/* Object holding a list of filters [optional]
 */
@property(nonatomic) NSObject* filters;
/* Object holding a list of filters [optional]
 */
@property(nonatomic) NSObject* filterV2;

@property(nonatomic) OAIBoard* type;

@property(nonatomic) OAIEntityStatus* status;
/* id of the feed profile belonging to this catalog product group [optional]
 */
@property(nonatomic) NSString* feedProfileId;
/* Unix timestamp in seconds of when catalog product group was created. [optional]
 */
@property(nonatomic) NSNumber* createdAt;
/* Unix timestamp in seconds of last time catalog product group was updated. [optional]
 */
@property(nonatomic) NSNumber* lastUpdate;
/* Amount of products in the catalog product group [optional]
 */
@property(nonatomic) NSNumber* productCount;
/* index of the featured position of the catalog product group [optional]
 */
@property(nonatomic) NSNumber* featuredPosition;

@end