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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"adId": @"ad_id", @"campaignId": @"campaign_id", @"country": @"country", @"customerListId": @"customer_list_id", @"engagementDomain": @"engagement_domain", @"engagementType": @"engagement_type", @"engagerType": @"engager_type", @"event": @"event", @"eventData": @"event_data", @"eventSource": @"event_source", @"ingestionSource": @"ingestion_source", @"objectiveType": @"objective_type", @"percentage": @"percentage", @"pinId": @"pin_id", @"prefill": @"prefill", @"retentionDays": @"retention_days", @"seedId": @"seed_id", @"url": @"url", @"visitorSourceId": @"visitor_source_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adAccountId", @"adId", @"campaignId", @"country", @"customerListId", @"engagementDomain", @"engagementType", @"engagerType", @"event", @"eventData", @"eventSource", @"ingestionSource", @"objectiveType", @"percentage", @"pinId", @"prefill", @"retentionDays", @"seedId", @"url", @"visitorSourceId"];
  return [optionalProperties containsObject:propertyName];
}

@end
