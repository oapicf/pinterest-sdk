#import "OAIOrderLines.h"

@implementation OAIOrderLines

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"type": @"type", @"adAccountId": @"ad_account_id", @"purchaseOrderId": @"purchase_order_id", @"startTime": @"start_time", @"endTime": @"end_time", @"budget": @"budget", @"paidBudget": @"paid_budget", @"status": @"status", @"name": @"name", @"paidType": @"paid_type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"type", @"adAccountId", @"purchaseOrderId", @"startTime", @"endTime", @"budget", @"paidBudget", @"status", @"name", @"paidType"];
  return [optionalProperties containsObject:propertyName];
}

@end
