#import "OAITargetingTemplateCommon.h"

@implementation OAITargetingTemplateCommon

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"name": @"name", @"autoTargetingEnabled": @"auto_targeting_enabled", @"targetingAttributes": @"targeting_attributes", @"placementGroup": @"placement_group", @"keywords": @"keywords", @"trackingUrls": @"tracking_urls" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"autoTargetingEnabled", @"targetingAttributes", @"placementGroup", @"keywords", @"trackingUrls"];
  return [optionalProperties containsObject:propertyName];
}

@end
