#import "OAILinkedBusiness.h"

@implementation OAILinkedBusiness

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"imageLargeUrl": @"image_large_url", @"imageMediumUrl": @"image_medium_url", @"imageSmallUrl": @"image_small_url", @"imageXlargeUrl": @"image_xlarge_url", @"username": @"username" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"imageLargeUrl", @"imageMediumUrl", @"imageSmallUrl", @"imageXlargeUrl", @"username"];
  return [optionalProperties containsObject:propertyName];
}

@end
