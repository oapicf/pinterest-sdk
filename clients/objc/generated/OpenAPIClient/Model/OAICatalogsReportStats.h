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


#import "OAICatalogsReportDistributionStats.h"
#import "OAICatalogsReportFeedIngestionStats.h"
@protocol OAICatalogsReportDistributionStats;
@class OAICatalogsReportDistributionStats;
@protocol OAICatalogsReportFeedIngestionStats;
@class OAICatalogsReportFeedIngestionStats;



@protocol OAICatalogsReportStats
@end

@interface OAICatalogsReportStats : OAIObject


@property(nonatomic) NSString* reportType;
/* ID of the catalog entity. [optional]
 */
@property(nonatomic) NSString* catalogId;
/* The event code that a diagnostics aggregated number references [optional]
 */
@property(nonatomic) NSNumber* code;
/* A human-friendly label for the event code (e.g, 'SPAM') [optional]
 */
@property(nonatomic) NSString* codeLabel;
/* Title message describing the diagnostic issue [optional]
 */
@property(nonatomic) NSString* message;
/* Number of occurrences of the issue [optional]
 */
@property(nonatomic) NSNumber* occurrences;
/* An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue [optional]
 */
@property(nonatomic) NSString* severity;
/* Indicates if issue makes items ineligible for ads distribution [optional]
 */
@property(nonatomic) NSNumber* ineligibleForAds;
/* Indicates if issue makes items ineligible for organic distribution [optional]
 */
@property(nonatomic) NSNumber* ineligibleForOrganic;

@end
