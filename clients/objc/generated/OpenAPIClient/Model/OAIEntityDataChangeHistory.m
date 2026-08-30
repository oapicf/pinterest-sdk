#import "OAIEntityDataChangeHistory.h"

@implementation OAIEntityDataChangeHistory

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"changedFieldId": @"changed_field_id", @"changedFieldName": @"changed_field_name", @"dataType": @"data_type", @"varNewDataValue": @"new_data_value", @"oldDataValue": @"old_data_value" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"changedFieldId", @"changedFieldName", @"dataType", @"varNewDataValue", @"oldDataValue"];
  return [optionalProperties containsObject:propertyName];
}

@end
