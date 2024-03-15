#import "OAISSIOOrderLine.h"

@implementation OAISSIOOrderLine

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"salesforceOrderLineId": @"salesforce_order_line_id", @"adsManagerOrderLineId": @"ads_manager_order_line_id", @"pinOrderId": @"pin_order_id", @"lastModifiedDateTime": @"last_modified_date_time", @"startDate": @"start_date", @"endDate": @"end_date", @"billToCompanyName": @"bill_to_company_name", @"billingContactFirstname": @"billing_contact_firstname", @"billingContactLastname": @"billing_contact_lastname", @"billingContactEmail": @"billing_contact_email", @"mediaContactEmail": @"media_contact_email", @"mediaContactFirstname": @"media_contact_firstname", @"mediaContactLastname": @"media_contact_lastname", @"currencyInfo": @"currency_info", @"agencyLink": @"agency_link", @"poNumber": @"po_number", @"orderName": @"order_name", @"pmpName": @"pmp_name", @"acceptedTermsId": @"accepted_terms_id", @"acceptedTermsTime": @"accepted_terms_time", @"budgetAmount": @"budget_amount", @"estimatedMonthlySpend": @"estimated_monthly_spend" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"salesforceOrderLineId", @"adsManagerOrderLineId", @"pinOrderId", @"lastModifiedDateTime", @"startDate", @"endDate", @"billToCompanyName", @"billingContactFirstname", @"billingContactLastname", @"billingContactEmail", @"mediaContactEmail", @"mediaContactFirstname", @"mediaContactLastname", @"currencyInfo", @"agencyLink", @"poNumber", @"orderName", @"pmpName", @"acceptedTermsId", @"acceptedTermsTime", @"budgetAmount", @"estimatedMonthlySpend"];
  return [optionalProperties containsObject:propertyName];
}

@end
