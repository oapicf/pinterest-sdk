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





@protocol OAICustomerList
@end

@interface OAICustomerList : OAIObject

/* Associated ad account ID. [optional]
 */
@property(nonatomic) NSString* adAccountId;
/* Creation time. Unix timestamp in seconds. [optional]
 */
@property(nonatomic) NSNumber* createdTime;
/* Customer list ID. [optional]
 */
@property(nonatomic) NSString* _id;
/* Customer list name. [optional]
 */
@property(nonatomic) NSString* name;
/* Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists. [optional]
 */
@property(nonatomic) NSNumber* numBatches;
/* Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list. [optional]
 */
@property(nonatomic) NSNumber* numRemovedUserRecords;
/* Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list. [optional]
 */
@property(nonatomic) NSNumber* numUploadedUserRecords;
/* Customer list status. TOO_SMALL - the list has less than 100 Pinterest users. [optional]
 */
@property(nonatomic) NSString* status;
/* Always \"customerlist\". [optional]
 */
@property(nonatomic) NSString* type;
/* Last update time. Unix timestamp in seconds. [optional]
 */
@property(nonatomic) NSNumber* updatedTime;
/* Customer list errors [optional]
 */
@property(nonatomic) NSObject* exceptions;

@end
