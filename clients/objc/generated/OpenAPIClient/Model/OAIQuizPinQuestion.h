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


#import "OAIQuizPinOption.h"
@protocol OAIQuizPinOption;
@class OAIQuizPinOption;



@protocol OAIQuizPinQuestion
@end

@interface OAIQuizPinQuestion : OAIObject


@property(nonatomic) NSNumber* questionId;

@property(nonatomic) NSString* questionText;

@property(nonatomic) NSArray<OAIQuizPinOption>* options;

@end