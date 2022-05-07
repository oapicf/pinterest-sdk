#import "OAIItemProcessingRecord.h"

@implementation OAIItemProcessingRecord

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"itemId": @"item_id", @"errors": @"errors", @"warnings": @"warnings", @"status": @"status" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"itemId", @"errors", @"warnings", @"status"];
  return [optionalProperties containsObject:propertyName];
}

@end
