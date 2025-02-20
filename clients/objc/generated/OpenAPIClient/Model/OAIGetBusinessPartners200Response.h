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


#import "OAIUserBusinessRoleBinding.h"
@protocol OAIUserBusinessRoleBinding;
@class OAIUserBusinessRoleBinding;



@protocol OAIGetBusinessPartners200Response
@end

@interface OAIGetBusinessPartners200Response : OAIObject

/* List of business partners. 
 */
@property(nonatomic) NSArray<OAIUserBusinessRoleBinding>* items;

@property(nonatomic) NSString* bookmark;

@end
