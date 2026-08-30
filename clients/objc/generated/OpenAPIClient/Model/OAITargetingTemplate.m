#import "OAITargetingTemplate.h"

@implementation OAITargetingTemplate

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.autoTargetingEnabled = @(YES);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"autoTargetingEnabled": @"auto_targeting_enabled", @"createdTime": @"created_time", @"_id": @"id", @"keywords": @"keywords", @"name": @"name", @"placementGroup": @"placement_group", @"sizing": @"sizing", @"status": @"status", @"targetingAttributes": @"targeting_attributes", @"trackingUrls": @"tracking_urls", @"updatedTime": @"updated_time", @"valid": @"valid" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adAccountId", @"autoTargetingEnabled", @"createdTime", @"_id", @"keywords", @"placementGroup", @"sizing", @"status", @"trackingUrls", @"updatedTime", @"valid"];
  return [optionalProperties containsObject:propertyName];
}

@end
