#import "OAIAdGroupAudienceSizingRequest.h"

@implementation OAIAdGroupAudienceSizingRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.autoTargetingEnabled = @(YES);
    self.placementGroup = @"ALL";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"autoTargetingEnabled": @"auto_targeting_enabled", @"placementGroup": @"placement_group", @"creativeTypes": @"creative_types", @"targetingSpec": @"targeting_spec", @"productGroupIds": @"product_group_ids", @"keywords": @"keywords" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"autoTargetingEnabled", @"placementGroup", @"creativeTypes", @"targetingSpec", @"productGroupIds", @"keywords"];
  return [optionalProperties containsObject:propertyName];
}

@end
