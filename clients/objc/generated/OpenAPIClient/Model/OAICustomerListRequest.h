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


#import "OAIUserListType.h"
@protocol OAIUserListType;
@class OAIUserListType;



@protocol OAICustomerListRequest
@end

@interface OAICustomerListRequest : OAIObject

/* Customer list name. 
 */
@property(nonatomic) NSString* name;
/* Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. 
 */
@property(nonatomic) NSString* records;

@property(nonatomic) OAIUserListType* listType;
/* Customer list errors. [optional]
 */
@property(nonatomic) NSObject* exceptions;

@end
