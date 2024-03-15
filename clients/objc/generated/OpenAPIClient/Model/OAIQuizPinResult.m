#import "OAIQuizPinResult.h"

@implementation OAIQuizPinResult

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"organicPinId": @"organic_pin_id", @"androidDeepLink": @"android_deep_link", @"iosDeepLink": @"ios_deep_link", @"destinationUrl": @"destination_url", @"resultId": @"result_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"organicPinId", @"androidDeepLink", @"iosDeepLink", @"destinationUrl", @"resultId"];
  return [optionalProperties containsObject:propertyName];
}

@end
