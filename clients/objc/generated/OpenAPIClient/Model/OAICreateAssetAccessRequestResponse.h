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


#import "OAICreateAssetAccessRequestErrorMessageInner.h"
@protocol OAICreateAssetAccessRequestErrorMessageInner;
@class OAICreateAssetAccessRequestErrorMessageInner;



@protocol OAICreateAssetAccessRequestResponse
@end

@interface OAICreateAssetAccessRequestResponse : OAIObject

/* A list of errors associated with the asset access requests. Will be returned if there is an error. [optional]
 */
@property(nonatomic) NSArray<OAICreateAssetAccessRequestErrorMessageInner>* exceptions;

@property(nonatomic) NSDictionary<NSString*, NSString*>* invites;

@end
