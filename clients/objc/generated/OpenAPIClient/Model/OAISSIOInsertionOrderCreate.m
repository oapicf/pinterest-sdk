#import "OAISSIOInsertionOrderCreate.h"

@implementation OAISSIOInsertionOrderCreate

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"acceptedTermsId": @"accepted_terms_id", @"acceptedTermsTime": @"accepted_terms_time", @"agencyLink": @"agency_link", @"billingContactEmail": @"billing_contact_email", @"billingContactFirstname": @"billing_contact_firstname", @"billingContactLastname": @"billing_contact_lastname", @"billtoBillingAddressId": @"billto_billing_address_id", @"billtoBusinessAddressId": @"billto_business_address_id", @"billtoCompanyId": @"billto_company_id", @"budgetAmount": @"budget_amount", @"currencyInfo": @"currency_info", @"endDate": @"end_date", @"estimatedMonthlySpend": @"estimated_monthly_spend", @"mediaContactEmail": @"media_contact_email", @"mediaContactFirstname": @"media_contact_firstname", @"mediaContactLastname": @"media_contact_lastname", @"orderLineType": @"order_line_type", @"orderName": @"order_name", @"pmpId": @"pmp_id", @"poNumber": @"po_number", @"startDate": @"start_date", @"userEmail": @"user_email" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"acceptedTermsTime", @"agencyLink", @"budgetAmount", @"endDate", @"estimatedMonthlySpend", @"userEmail"];
  return [optionalProperties containsObject:propertyName];
}

@end
