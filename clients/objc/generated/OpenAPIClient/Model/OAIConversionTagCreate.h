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





@protocol OAIConversionTagCreate
@end

@interface OAIConversionTagCreate : OAIObject

/* Conversion tag name. 
 */
@property(nonatomic) NSString* name;
/* Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. [optional]
 */
@property(nonatomic) NSNumber* aemEnabled;
/* Metadata ingestion frequency. [optional]
 */
@property(nonatomic) NSNumber* mdFrequency;
/* Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. [optional]
 */
@property(nonatomic) NSNumber* aemFnlnEnabled;
/* Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. [optional]
 */
@property(nonatomic) NSNumber* aemPhEnabled;
/* Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. [optional]
 */
@property(nonatomic) NSNumber* aemGeEnabled;
/* Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. [optional]
 */
@property(nonatomic) NSNumber* aemDbEnabled;
/* Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information. [optional]
 */
@property(nonatomic) NSNumber* aemLocEnabled;

@end
