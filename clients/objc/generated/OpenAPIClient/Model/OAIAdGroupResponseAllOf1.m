#import "OAIAdGroupResponseAllOf1.h"

@implementation OAIAdGroupResponseAllOf1

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"campaignId": @"campaign_id", @"billableEvent": @"billable_event", @"_id": @"id", @"type": @"type", @"adAccountId": @"ad_account_id", @"createdTime": @"created_time", @"updatedTime": @"updated_time" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"campaignId", @"billableEvent", @"_id", @"type", @"adAccountId", @"createdTime", @"updatedTime"];
  return [optionalProperties containsObject:propertyName];
}

@end
