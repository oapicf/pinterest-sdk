#import "OAICatalogsItemsBatch.h"

@implementation OAICatalogsItemsBatch

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"items": @"items", @"batchId": @"batch_id", @"createdTime": @"created_time", @"completedTime": @"completed_time", @"status": @"status" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"items", @"batchId", @"createdTime", @"completedTime", @"status"];
  return [optionalProperties containsObject:propertyName];
}

@end
