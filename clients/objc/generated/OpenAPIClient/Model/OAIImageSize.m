#import "OAIImageSize.h"

@implementation OAIImageSize

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_1200x": @"1200x", @"_150x150": @"150x150", @"_400x300": @"400x300", @"_600x": @"600x" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_1200x", @"_150x150", @"_400x300", @"_600x"];
  return [optionalProperties containsObject:propertyName];
}

@end
