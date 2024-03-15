#import "OAIAudienceRule.h"

@implementation OAIAudienceRule

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"country": @"country", @"customerListId": @"customer_list_id", @"engagementDomain": @"engagement_domain", @"engagementType": @"engagement_type", @"event": @"event", @"eventData": @"event_data", @"percentage": @"percentage", @"pinId": @"pin_id", @"prefill": @"prefill", @"retentionDays": @"retention_days", @"seedId": @"seed_id", @"url": @"url", @"visitorSourceId": @"visitor_source_id", @"eventSource": @"event_source", @"ingestionSource": @"ingestion_source", @"engagerType": @"engager_type", @"campaignId": @"campaign_id", @"adId": @"ad_id", @"objectiveType": @"objective_type", @"adAccountId": @"ad_account_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"country", @"customerListId", @"engagementDomain", @"engagementType", @"event", @"eventData", @"percentage", @"pinId", @"prefill", @"retentionDays", @"seedId", @"url", @"visitorSourceId", @"eventSource", @"ingestionSource", @"engagerType", @"campaignId", @"adId", @"objectiveType", @"adAccountId"];
  return [optionalProperties containsObject:propertyName];
}

@end
