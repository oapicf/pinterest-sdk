#import "OAIOrderLine.h"

@implementation OAIOrderLine

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"budget": @"budget", @"campaignIds": @"campaign_ids", @"endTime": @"end_time", @"_id": @"id", @"name": @"name", @"paidBudget": @"paid_budget", @"paidType": @"paid_type", @"purchaseOrderId": @"purchase_order_id", @"startTime": @"start_time", @"status": @"status", @"type": @"type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"budget", @"endTime", @"name", @"paidBudget", @"paidType", @"purchaseOrderId", @"startTime", ];
  return [optionalProperties containsObject:propertyName];
}

@end
