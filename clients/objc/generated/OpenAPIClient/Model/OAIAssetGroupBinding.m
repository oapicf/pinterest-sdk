#import "OAIAssetGroupBinding.h"

@implementation OAIAssetGroupBinding

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"assetGroupName": @"asset_group_name", @"assetGroupDescription": @"asset_group_description", @"assetGroupTypes": @"asset_group_types", @"adAccountsIds": @"ad_accounts_ids", @"profilesIds": @"profiles_ids", @"createdTime": @"created_time", @"updatedTime": @"updated_time", @"owner": @"owner", @"createdBy": @"created_by" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"assetGroupName", @"assetGroupDescription", @"assetGroupTypes", @"adAccountsIds", @"profilesIds", @"createdTime", @"updatedTime", @"owner", @"createdBy"];
  return [optionalProperties containsObject:propertyName];
}

@end
