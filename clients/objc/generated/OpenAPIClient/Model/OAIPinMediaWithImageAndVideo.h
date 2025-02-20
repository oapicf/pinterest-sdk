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


#import "OAIPinMedia.h"
#import "OAIPinMediaMetadata.h"
@protocol OAIPinMedia;
@class OAIPinMedia;
@protocol OAIPinMediaMetadata;
@class OAIPinMediaMetadata;



@protocol OAIPinMediaWithImageAndVideo
@end

@interface OAIPinMediaWithImageAndVideo : OAIPinMedia


@property(nonatomic) NSArray<OAIPinMediaMetadata>* items;

@end
