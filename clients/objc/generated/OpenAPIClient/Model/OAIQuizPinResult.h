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





@protocol OAIQuizPinResult
@end

@interface OAIQuizPinResult : OAIObject


@property(nonatomic) NSString* organicPinId;

@property(nonatomic) NSString* androidDeepLink;

@property(nonatomic) NSString* iosDeepLink;

@property(nonatomic) NSString* destinationUrl;

@property(nonatomic) NSNumber* resultId;

@end
