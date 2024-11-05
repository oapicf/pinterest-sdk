#import "OAIQuizPinData.h"

@implementation OAIQuizPinData

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"questions": @"questions", @"results": @"results", @"tieBreakerType": @"tie_breaker_type", @"tieBreakerCustomResult": @"tie_breaker_custom_result" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"questions", @"results", @"tieBreakerType", @"tieBreakerCustomResult"];
  return [optionalProperties containsObject:propertyName];
}

@end
