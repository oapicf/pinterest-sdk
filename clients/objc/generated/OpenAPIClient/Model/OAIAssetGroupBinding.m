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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountsIds": @"ad_accounts_ids", @"assetGroupDescription": @"asset_group_description", @"assetGroupName": @"asset_group_name", @"assetGroupTypes": @"asset_group_types", @"catalogsIds": @"catalogs_ids", @"createdBy": @"created_by", @"createdTime": @"created_time", @"_id": @"id", @"owner": @"owner", @"profilesIds": @"profiles_ids", @"updatedTime": @"updated_time" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adAccountsIds", @"assetGroupDescription", @"assetGroupName", @"assetGroupTypes", @"catalogsIds", @"createdBy", @"createdTime", @"_id", @"owner", @"profilesIds", @"updatedTime"];
  return [optionalProperties containsObject:propertyName];
}

@end
