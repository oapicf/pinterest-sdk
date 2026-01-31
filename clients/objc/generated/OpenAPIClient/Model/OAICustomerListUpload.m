#import "OAICustomerListUpload.h"

@implementation OAICustomerListUpload

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"creationTime": @"creation_time", @"customerListId": @"customer_list_id", @"errorCounts": @"error_counts", @"_id": @"id", @"operation": @"operation", @"recordCounts": @"record_counts", @"state": @"state", @"updatedTime": @"updated_time" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"errorCounts", @"recordCounts", ];
  return [optionalProperties containsObject:propertyName];
}

@end
