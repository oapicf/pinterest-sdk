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


#import "OAICatalogsItemValidationErrors.h"
#import "OAICatalogsItemValidationWarnings.h"
@protocol OAICatalogsItemValidationErrors;
@class OAICatalogsItemValidationErrors;
@protocol OAICatalogsItemValidationWarnings;
@class OAICatalogsItemValidationWarnings;



@protocol OAICatalogsItemValidationIssues
@end

@interface OAICatalogsItemValidationIssues : OAIObject

/* Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation. 
 */
@property(nonatomic) NSNumber* itemNumber;
/* The merchant-created unique ID that represents the product. 
 */
@property(nonatomic) NSString* itemId;

@property(nonatomic) OAICatalogsItemValidationErrors* errors;

@property(nonatomic) OAICatalogsItemValidationWarnings* warnings;

@end