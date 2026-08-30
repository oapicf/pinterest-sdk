#import "OAIScheduleBidOptions.h"

@implementation OAIScheduleBidOptions

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"ageBucketMultipliers": @"age_bucket_multipliers", @"appTypeMultipliers": @"app_type_multipliers", @"audienceMultipliers": @"audience_multipliers", @"genderMultipliers": @"gender_multipliers", @"placementMultipliers": @"placement_multipliers" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"ageBucketMultipliers", @"appTypeMultipliers", @"audienceMultipliers", @"genderMultipliers", @"placementMultipliers"];
  return [optionalProperties containsObject:propertyName];
}

@end
