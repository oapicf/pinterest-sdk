#import "OAIBidOptionsAppTypeMultipliers.h"

@implementation OAIBidOptionsAppTypeMultipliers

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"androidMobile": @"android_mobile", @"androidTablet": @"android_tablet", @"ipad": @"ipad", @"iphone": @"iphone", @"web": @"web", @"webMobile": @"web_mobile" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"androidMobile", @"androidTablet", @"ipad", @"iphone", @"web", @"webMobile"];
  return [optionalProperties containsObject:propertyName];
}

@end
