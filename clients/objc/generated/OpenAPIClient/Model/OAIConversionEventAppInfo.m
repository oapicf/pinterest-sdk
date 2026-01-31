#import "OAIConversionEventAppInfo.h"

@implementation OAIConversionEventAppInfo

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"appId": @"app_id", @"appName": @"app_name", @"appPackageName": @"app_package_name", @"appStore": @"app_store", @"appVersion": @"app_version", @"installTime": @"install_time", @"userAgent": @"user_agent", @"windowHeight": @"window_height", @"windowWidth": @"window_width" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"appId", @"appName", @"appPackageName", @"appStore", @"appVersion", @"installTime", @"userAgent", @"windowHeight", @"windowWidth"];
  return [optionalProperties containsObject:propertyName];
}

@end
