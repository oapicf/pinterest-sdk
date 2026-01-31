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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"agencyLink": @"agency_link", @"billingContactEmail": @"billing_contact_email", @"billingContactFirstname": @"billing_contact_firstname", @"billingContactLastname": @"billing_contact_lastname", @"budgetAmount": @"budget_amount", @"endDate": @"end_date", @"mediaContactEmail": @"media_contact_email", @"mediaContactFirstname": @"media_contact_firstname", @"mediaContactLastname": @"media_contact_lastname", @"poNumber": @"po_number", @"startDate": @"start_date", @"userEmail": @"user_email", @"adsManagerOrderLineId": @"ads_manager_order_line_id", @"oracleLineId": @"oracle_line_id", @"salesforceOrderId": @"salesforce_order_id", @"salesforceOrderLineId": @"salesforce_order_line_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"agencyLink", @"billingContactEmail", @"billingContactFirstname", @"billingContactLastname", @"budgetAmount", @"endDate", @"mediaContactEmail", @"mediaContactFirstname", @"mediaContactLastname", @"poNumber", @"startDate", @"userEmail", @"adsManagerOrderLineId", @"oracleLineId", @"salesforceOrderId", @"salesforceOrderLineId"];
  return [optionalProperties containsObject:propertyName];
}

@end
