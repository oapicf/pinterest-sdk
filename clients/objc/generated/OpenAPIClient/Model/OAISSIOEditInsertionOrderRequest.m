#import "OAISSIOEditInsertionOrderRequest.h"

@implementation OAISSIOEditInsertionOrderRequest

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"startDate": @"start_date", @"endDate": @"end_date", @"poNumber": @"po_number", @"budgetAmount": @"budget_amount", @"billingContactFirstname": @"billing_contact_firstname", @"billingContactLastname": @"billing_contact_lastname", @"billingContactEmail": @"billing_contact_email", @"mediaContactFirstname": @"media_contact_firstname", @"mediaContactLastname": @"media_contact_lastname", @"mediaContactEmail": @"media_contact_email", @"agencyLink": @"agency_link", @"userEmail": @"user_email", @"oracleLineId": @"oracle_line_id", @"salesforceOrderId": @"salesforce_order_id", @"salesforceOrderLineId": @"salesforce_order_line_id", @"adsManagerOrderLineId": @"ads_manager_order_line_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"startDate", @"endDate", @"poNumber", @"budgetAmount", @"billingContactFirstname", @"billingContactLastname", @"billingContactEmail", @"mediaContactFirstname", @"mediaContactLastname", @"mediaContactEmail", @"agencyLink", @"userEmail", @"oracleLineId", @"salesforceOrderId", @"salesforceOrderLineId", @"adsManagerOrderLineId"];
  return [optionalProperties containsObject:propertyName];
}

@end
