#import "OAIAdCommonTrackingUrls.h"

@implementation OAIAdCommonTrackingUrls

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"impression": @"impression", @"click": @"click", @"engagement": @"engagement", @"buyableButton": @"buyable_button", @"audienceVerification": @"audience_verification" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"impression", @"click", @"engagement", @"buyableButton", @"audienceVerification"];
  return [optionalProperties containsObject:propertyName];
}

@end
