#import "OAIConversionEventsUserDataAnyOf.h"

@implementation OAIConversionEventsUserDataAnyOf

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"em": @"em", @"hashedMaids": @"hashed_maids", @"clientIpAddress": @"client_ip_address", @"clientUserAgent": @"client_user_agent" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"hashedMaids", @"clientIpAddress", @"clientUserAgent"];
  return [optionalProperties containsObject:propertyName];
}

@end
