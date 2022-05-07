#import "OAIAdsAnalyticsCreateAsyncRequestAllOf1.h"

@implementation OAIAdsAnalyticsCreateAsyncRequestAllOf1

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.reportFormat = @"JSON";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"columns": @"columns", @"level": @"level", @"reportFormat": @"report_format" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"reportFormat"];
  return [optionalProperties containsObject:propertyName];
}

@end
