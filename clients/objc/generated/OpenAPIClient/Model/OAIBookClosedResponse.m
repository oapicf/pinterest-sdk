#import "OAIBookClosedResponse.h"

@implementation OAIBookClosedResponse

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"conversionMetricsReady": @"conversion_metrics_ready", @"nonConversionMetricsReady": @"non_conversion_metrics_ready" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"conversionMetricsReady", @"nonConversionMetricsReady"];
  return [optionalProperties containsObject:propertyName];
}

@end
