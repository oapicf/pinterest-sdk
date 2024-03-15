#import "OAISSIOCreateInsertionOrderRequest.h"

@implementation OAISSIOCreateInsertionOrderRequest

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"startDate": @"start_date", @"endDate": @"end_date", @"poNumber": @"po_number", @"budgetAmount": @"budget_amount", @"billingContactFirstname": @"billing_contact_firstname", @"billingContactLastname": @"billing_contact_lastname", @"billingContactEmail": @"billing_contact_email", @"mediaContactFirstname": @"media_contact_firstname", @"mediaContactLastname": @"media_contact_lastname", @"mediaContactEmail": @"media_contact_email", @"agencyLink": @"agency_link", @"userEmail": @"user_email", @"acceptedTermsTime": @"accepted_terms_time", @"pmpId": @"pmp_id", @"orderName": @"order_name", @"orderLineType": @"order_line_type", @"acceptedTermsId": @"accepted_terms_id", @"billtoCompanyId": @"billto_company_id", @"billtoBusinessAddressId": @"billto_business_address_id", @"billtoBillingAddressId": @"billto_billing_address_id", @"estimatedMonthlySpend": @"estimated_monthly_spend", @"currencyInfo": @"currency_info" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"endDate", @"budgetAmount", @"agencyLink", @"userEmail", @"acceptedTermsTime", @"estimatedMonthlySpend", ];
  return [optionalProperties containsObject:propertyName];
}

@end
