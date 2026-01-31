#import "OAITrackingUrls.h"

@implementation OAITrackingUrls

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"audienceVerification": @"audience_verification", @"buyableButton": @"buyable_button", @"click": @"click", @"engagement": @"engagement", @"impression": @"impression" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"audienceVerification", @"buyableButton", @"click", @"engagement", @"impression"];
  return [optionalProperties containsObject:propertyName];
}

@end
