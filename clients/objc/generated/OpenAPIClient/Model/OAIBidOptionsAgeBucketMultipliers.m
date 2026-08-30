#import "OAIBidOptionsAgeBucketMultipliers.h"

@implementation OAIBidOptionsAgeBucketMultipliers

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_1824": @"18-24", @"_2534": @"25-34", @"_3544": @"35-44", @"_4549": @"45-49", @"_5054": @"50-54", @"_5564": @"55-64", @"_65": @"65+" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_1824", @"_2534", @"_3544", @"_4549", @"_5054", @"_5564", @"_65"];
  return [optionalProperties containsObject:propertyName];
}

@end
