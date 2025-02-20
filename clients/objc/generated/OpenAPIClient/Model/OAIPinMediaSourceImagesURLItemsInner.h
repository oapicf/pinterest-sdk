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





@protocol OAIPinMediaSourceImagesURLItemsInner
@end

@interface OAIPinMediaSourceImagesURLItemsInner : OAIObject


@property(nonatomic) NSString* title;

@property(nonatomic) NSString* _description;
/* Destination link for the image. [optional]
 */
@property(nonatomic) NSString* link;
/* URL of image to upload. 
 */
@property(nonatomic) NSString* url;

@end
