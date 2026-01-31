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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"agencyLink": @"agency_link", @"billingContactEmail": @"billing_contact_email", @"billingContactFirstname": @"billing_contact_firstname", @"billingContactLastname": @"billing_contact_lastname", @"budgetAmount": @"budget_amount", @"endDate": @"end_date", @"mediaContactEmail": @"media_contact_email", @"mediaContactFirstname": @"media_contact_firstname", @"mediaContactLastname": @"media_contact_lastname", @"poNumber": @"po_number", @"startDate": @"start_date", @"userEmail": @"user_email", @"acceptedTermsId": @"accepted_terms_id", @"acceptedTermsTime": @"accepted_terms_time", @"billtoBillingAddressId": @"billto_billing_address_id", @"billtoBusinessAddressId": @"billto_business_address_id", @"billtoCompanyId": @"billto_company_id", @"currencyInfo": @"currency_info", @"estimatedMonthlySpend": @"estimated_monthly_spend", @"orderLineType": @"order_line_type", @"orderName": @"order_name", @"pmpId": @"pmp_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"agencyLink", @"budgetAmount", @"endDate", @"userEmail", @"acceptedTermsTime", @"estimatedMonthlySpend", ];
  return [optionalProperties containsObject:propertyName];
}

@end
