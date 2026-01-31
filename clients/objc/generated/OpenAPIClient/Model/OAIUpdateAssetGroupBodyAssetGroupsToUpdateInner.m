#import "OAIUpdateAssetGroupBodyAssetGroupsToUpdateInner.h"

@implementation OAIUpdateAssetGroupBodyAssetGroupsToUpdateInner

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"assetGroupId": @"asset_group_id", @"assetGroupTypes": @"asset_group_types", @"assetsToAdd": @"assets_to_add", @"assetsToRemove": @"assets_to_remove", @"_description": @"description", @"name": @"name" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"assetGroupTypes", @"assetsToAdd", @"assetsToRemove", @"_description", @"name"];
  return [optionalProperties containsObject:propertyName];
}

@end
