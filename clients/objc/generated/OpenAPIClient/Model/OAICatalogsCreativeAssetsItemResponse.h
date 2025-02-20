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


#import "OAICatalogsCreativeAssetsAttributes.h"
#import "OAICatalogsType.h"
#import "OAIPin.h"
@protocol OAICatalogsCreativeAssetsAttributes;
@class OAICatalogsCreativeAssetsAttributes;
@protocol OAICatalogsType;
@class OAICatalogsType;
@protocol OAIPin;
@class OAIPin;



@protocol OAICatalogsCreativeAssetsItemResponse
@end

@interface OAICatalogsCreativeAssetsItemResponse : OAIObject


@property(nonatomic) OAICatalogsType* catalogType;
/* The catalog creative assets id in the merchant namespace [optional]
 */
@property(nonatomic) NSString* creativeAssetsId;
/* The pins mapped to the item [optional]
 */
@property(nonatomic) NSArray<OAIPin>* pins;

@property(nonatomic) OAICatalogsCreativeAssetsAttributes* attributes;

@end
