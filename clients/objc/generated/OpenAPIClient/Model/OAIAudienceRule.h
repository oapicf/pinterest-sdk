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


#import "OAIObjectiveType.h"
#import "OAIPinterestTagEventData.h"
@protocol OAIObjectiveType;
@class OAIObjectiveType;
@protocol OAIPinterestTagEventData;
@class OAIPinterestTagEventData;



@protocol OAIAudienceRule
@end

@interface OAIAudienceRule : OAIObject

/* Valid countries include: \"US\", \"CA\", and \"GB\". [optional]
 */
@property(nonatomic) NSString* country;
/* Customer list ID. For CUSTOMER_LIST `audience_type`. [optional]
 */
@property(nonatomic) NSString* customerListId;
/* The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`. [optional]
 */
@property(nonatomic) NSArray<NSString*>* engagementDomain;
/* Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.  [optional]
 */
@property(nonatomic) NSString* engagementType;
/* A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event. [optional]
 */
@property(nonatomic) NSString* event;

@property(nonatomic) OAIPinterestTagEventData* eventData;
/* Percentage should be 1-10. The targeted audience should be this % size across Pinterest. [optional]
 */
@property(nonatomic) NSNumber* percentage;
/* IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"] [optional]
 */
@property(nonatomic) NSArray<NSString*>* pinId;
/* Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`. [optional]
 */
@property(nonatomic) NSNumber* prefill;
/* Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified. [optional]
 */
@property(nonatomic) NSNumber* retentionDays;
/* Audience ID(s). For ACTALIKE `audience_type`.  [optional]
 */
@property(nonatomic) NSArray<NSString*>* seedId;
/* Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"} [optional]
 */
@property(nonatomic) NSArray<NSString*>* url;
/* The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`. [optional]
 */
@property(nonatomic) NSString* visitorSourceId;
/* Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline [optional]
 */
@property(nonatomic) NSObject* eventSource;
/* Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api [optional]
 */
@property(nonatomic) NSObject* ingestionSource;
/* Optional for ENGAGEMENT. Engager type value should be 1-2. [optional]
 */
@property(nonatomic) NSNumber* engagerType;
/* Campaign ID for engagement audience filter. [optional]
 */
@property(nonatomic) NSArray<NSString*>* campaignId;
/* Ad ID for engagement audience filter. [optional]
 */
@property(nonatomic) NSArray<NSString*>* adId;
/* Objective for engagement audience filter. [optional]
 */
@property(nonatomic) NSArray<OAIObjectiveType>* objectiveType;
/* Ad account ID. [optional]
 */
@property(nonatomic) NSString* adAccountId;

@end