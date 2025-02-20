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


#import "OAIAdCountry.h"
@protocol OAIAdCountry;
@class OAIAdCountry;



@protocol OAIAdAccountsCountryResponseData
@end

@interface OAIAdAccountsCountryResponseData : OAIObject


@property(nonatomic) OAIAdCountry* code;
/* Country currency. [optional]
 */
@property(nonatomic) NSString* currency;
/* Country index [optional]
 */
@property(nonatomic) NSNumber* index;
/* Country name [optional]
 */
@property(nonatomic) NSString* name;

@end
