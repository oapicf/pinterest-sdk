#import "OAIAudienceDemographics.h"

@implementation OAIAudienceDemographics

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"ages": @"ages", @"genders": @"genders", @"devices": @"devices", @"metros": @"metros", @"countries": @"countries" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"ages", @"genders", @"devices", @"metros", @"countries"];
  return [optionalProperties containsObject:propertyName];
}

@end
