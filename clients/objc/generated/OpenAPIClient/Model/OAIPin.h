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


#import "OAIBoardOwner.h"
#import "OAICreativeType.h"
#import "OAIPinMedia.h"
#import "OAIPinMediaSource.h"
@protocol OAIBoardOwner;
@class OAIBoardOwner;
@protocol OAICreativeType;
@class OAICreativeType;
@protocol OAIPinMedia;
@class OAIPinMedia;
@protocol OAIPinMediaSource;
@class OAIPinMediaSource;



@protocol OAIPin
@end

@interface OAIPin : OAIObject


@property(nonatomic) NSString* _id;

@property(nonatomic) NSDate* createdAt;

@property(nonatomic) NSString* link;

@property(nonatomic) NSString* title;

@property(nonatomic) NSString* _description;
/* Dominant pin color. Hex number, e.g. \\\"#6E7874\\\". [optional]
 */
@property(nonatomic) NSString* dominantColor;

@property(nonatomic) NSString* altText;

@property(nonatomic) OAICreativeType* creativeType;
/* The board to which this Pin belongs. [optional]
 */
@property(nonatomic) NSString* boardId;
/* The board section to which this Pin belongs. [optional]
 */
@property(nonatomic) NSString* boardSectionId;

@property(nonatomic) OAIBoardOwner* boardOwner;
/* Whether the \"operation user_account\" is the Pin owner. [optional]
 */
@property(nonatomic) NSNumber* isOwner;

@property(nonatomic) OAIPinMedia* media;

@property(nonatomic) OAIPinMediaSource* mediaSource;
/* The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>. [optional]
 */
@property(nonatomic) NSString* parentPinId;
/* Whether the Pin is standard or not. See documentation on <a href=\"/docs/api-features/content-overview/\">Changes to Pin creation</a> for more information. [optional]
 */
@property(nonatomic) NSNumber* isStandard;
/* Whether the Pin has been promoted or not. [optional]
 */
@property(nonatomic) NSNumber* hasBeenPromoted;
/* Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. [optional]
 */
@property(nonatomic) NSString* note;
/* Pin metrics with associated time intervals if any. [optional]
 */
@property(nonatomic) NSObject* pinMetrics;

@end
