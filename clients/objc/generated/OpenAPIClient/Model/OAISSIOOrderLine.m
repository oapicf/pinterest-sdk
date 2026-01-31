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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"acceptedTermsId": @"accepted_terms_id", @"acceptedTermsTime": @"accepted_terms_time", @"adsManagerOrderLineId": @"ads_manager_order_line_id", @"agencyLink": @"agency_link", @"billToCompanyName": @"bill_to_company_name", @"billingContactEmail": @"billing_contact_email", @"billingContactFirstname": @"billing_contact_firstname", @"billingContactLastname": @"billing_contact_lastname", @"budgetAmount": @"budget_amount", @"currencyInfo": @"currency_info", @"endDate": @"end_date", @"estimatedMonthlySpend": @"estimated_monthly_spend", @"lastModifiedDateTime": @"last_modified_date_time", @"mediaContactEmail": @"media_contact_email", @"mediaContactFirstname": @"media_contact_firstname", @"mediaContactLastname": @"media_contact_lastname", @"orderName": @"order_name", @"pinOrderId": @"pin_order_id", @"pmpName": @"pmp_name", @"poNumber": @"po_number", @"salesforceOrderLineId": @"salesforce_order_line_id", @"startDate": @"start_date" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"acceptedTermsId", @"acceptedTermsTime", @"adsManagerOrderLineId", @"agencyLink", @"billToCompanyName", @"billingContactEmail", @"billingContactFirstname", @"billingContactLastname", @"budgetAmount", @"currencyInfo", @"endDate", @"estimatedMonthlySpend", @"lastModifiedDateTime", @"mediaContactEmail", @"mediaContactFirstname", @"mediaContactLastname", @"orderName", @"pinOrderId", @"pmpName", @"poNumber", @"salesforceOrderLineId", @"startDate"];
  return [optionalProperties containsObject:propertyName];
}

@end
