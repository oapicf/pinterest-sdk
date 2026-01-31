#import "OAITargetingTemplateResponseData.h"

@implementation OAITargetingTemplateResponseData

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.autoTargetingEnabled = @(YES);
    self.status = @"ACTIVE";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"autoTargetingEnabled": @"auto_targeting_enabled", @"keywords": @"keywords", @"name": @"name", @"placementGroup": @"placement_group", @"targetingAttributes": @"targeting_attributes", @"trackingUrls": @"tracking_urls", @"adAccountId": @"ad_account_id", @"createdTime": @"created_time", @"_id": @"id", @"sizing": @"sizing", @"status": @"status", @"updatedTime": @"updated_time" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"autoTargetingEnabled", @"keywords", @"name", @"placementGroup", @"targetingAttributes", @"trackingUrls", @"adAccountId", @"createdTime", @"_id", @"sizing", @"status", @"updatedTime"];
  return [optionalProperties containsObject:propertyName];
}

@end
