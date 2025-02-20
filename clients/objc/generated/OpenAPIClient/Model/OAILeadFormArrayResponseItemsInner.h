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


#import "OAIException.h"
#import "OAILeadFormResponse.h"
@protocol OAIException;
@class OAIException;
@protocol OAILeadFormResponse;
@class OAILeadFormResponse;



@protocol OAILeadFormArrayResponseItemsInner
@end

@interface OAILeadFormArrayResponseItemsInner : OAIObject


@property(nonatomic) OAILeadFormResponse* data;

@property(nonatomic) NSArray<OAIException>* exceptions;

@end
