#import "OAIBoardCreate.h"

@implementation OAIBoardCreate

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.isAdsOnly = @(NO);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_description": @"description", @"isAdsOnly": @"is_ads_only", @"name": @"name", @"privacy": @"privacy" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_description", @"isAdsOnly", @"privacy"];
  return [optionalProperties containsObject:propertyName];
}

@end
