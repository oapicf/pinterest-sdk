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


#import "OAICurrency.h"
@protocol OAICurrency;
@class OAICurrency;



@protocol OAISSIOCreateInsertionOrderRequest
@end

@interface OAISSIOCreateInsertionOrderRequest : OAIObject

/* Starting date of time period. Format: YYYY-MM-DD 
 */
@property(nonatomic) NSString* startDate;
/* End date of time period. Format: YYYY-MM-DD [optional]
 */
@property(nonatomic) NSString* endDate;
/* The po number 
 */
@property(nonatomic) NSString* poNumber;
/* If Budget order line, the budget amount. [optional]
 */
@property(nonatomic) NSNumber* budgetAmount;
/* The billing contact first name 
 */
@property(nonatomic) NSString* billingContactFirstname;
/* The billing contact last name 
 */
@property(nonatomic) NSString* billingContactLastname;
/* The billing contact email 
 */
@property(nonatomic) NSString* billingContactEmail;
/* The media contact first name 
 */
@property(nonatomic) NSString* mediaContactFirstname;
/* The media contact last name 
 */
@property(nonatomic) NSString* mediaContactLastname;
/* The media contact email 
 */
@property(nonatomic) NSString* mediaContactEmail;
/* URL link for agency [optional]
 */
@property(nonatomic) NSString* agencyLink;
/* The email of user submitting the insertion order [optional]
 */
@property(nonatomic) NSString* userEmail;
/* The UTC timestamp (to the nearest sec) of when terms were accepted [optional]
 */
@property(nonatomic) NSNumber* acceptedTermsTime;
/* The pmp id 
 */
@property(nonatomic) NSString* pmpId;
/* The order name 
 */
@property(nonatomic) NSString* orderName;
/* Type can be Budget or Perpetual 
 */
@property(nonatomic) NSString* orderLineType;
/* The SFDC id for the terms 
 */
@property(nonatomic) NSString* acceptedTermsId;
/* The bill-to company id 
 */
@property(nonatomic) NSString* billtoCompanyId;
/* The bill-to business address id 
 */
@property(nonatomic) NSString* billtoBusinessAddressId;
/* The bill-to billing address id 
 */
@property(nonatomic) NSString* billtoBillingAddressId;
/* If Ongoing (perpetual) order line, the estimated monthly spend [optional]
 */
@property(nonatomic) NSNumber* estimatedMonthlySpend;

@property(nonatomic) OAICurrency* currencyInfo;

@end
