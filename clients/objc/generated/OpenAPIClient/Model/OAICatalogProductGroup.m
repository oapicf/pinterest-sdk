#import "OAICatalogProductGroup.h"

@implementation OAICatalogProductGroup

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"merchantId": @"merchant_id", @"name": @"name", @"filters": @"filters", @"filterV2": @"filter_v2", @"type": @"type", @"status": @"status", @"feedProfileId": @"feed_profile_id", @"createdAt": @"created_at", @"lastUpdate": @"last_update", @"productCount": @"product_count", @"featuredPosition": @"featured_position" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"merchantId", @"name", @"filters", @"filterV2", @"type", @"status", @"feedProfileId", @"createdAt", @"lastUpdate", @"productCount", @"featuredPosition"];
  return [optionalProperties containsObject:propertyName];
}

@end
