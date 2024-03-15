#import "OAICustomerList.h"

@implementation OAICustomerList

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"createdTime": @"created_time", @"_id": @"id", @"name": @"name", @"numBatches": @"num_batches", @"numRemovedUserRecords": @"num_removed_user_records", @"numUploadedUserRecords": @"num_uploaded_user_records", @"status": @"status", @"type": @"type", @"updatedTime": @"updated_time", @"exceptions": @"exceptions" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adAccountId", @"createdTime", @"_id", @"name", @"numBatches", @"numRemovedUserRecords", @"numUploadedUserRecords", @"status", @"type", @"updatedTime", @"exceptions"];
  return [optionalProperties containsObject:propertyName];
}

@end
