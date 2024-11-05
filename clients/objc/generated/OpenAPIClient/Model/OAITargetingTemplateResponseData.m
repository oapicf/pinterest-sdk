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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"name": @"name", @"autoTargetingEnabled": @"auto_targeting_enabled", @"targetingAttributes": @"targeting_attributes", @"placementGroup": @"placement_group", @"keywords": @"keywords", @"trackingUrls": @"tracking_urls", @"_id": @"id", @"createdTime": @"created_time", @"updatedTime": @"updated_time", @"adAccountId": @"ad_account_id", @"status": @"status", @"sizing": @"sizing" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"autoTargetingEnabled", @"targetingAttributes", @"placementGroup", @"keywords", @"trackingUrls", @"_id", @"createdTime", @"updatedTime", @"adAccountId", @"status", @"sizing"];
  return [optionalProperties containsObject:propertyName];
}

@end
