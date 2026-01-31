#import "OAIBillingInvoiceResponse.h"

@implementation OAIBillingInvoiceResponse

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"adAccountName": @"ad_account_name", @"amountBilledMicroCurrency": @"amount_billed_micro_currency", @"amountDiscountMicroCurrency": @"amount_discount_micro_currency", @"amountNetMicroCurrency": @"amount_net_micro_currency", @"amountTaxMicroCurrency": @"amount_tax_micro_currency", @"billToCountry": @"bill_to_country", @"billingPeriodEndDate": @"billing_period_end_date", @"billingPeriodStartDate": @"billing_period_start_date", @"currency": @"currency", @"documentType": @"document_type", @"_id": @"id", @"invoiceDueDate": @"invoice_due_date", @"paymentTerms": @"payment_terms", @"status": @"status" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adAccountId", @"adAccountName", @"amountBilledMicroCurrency", @"amountDiscountMicroCurrency", @"amountNetMicroCurrency", @"amountTaxMicroCurrency", @"billToCountry", @"billingPeriodEndDate", @"billingPeriodStartDate", @"currency", @"documentType", @"_id", @"invoiceDueDate", @"paymentTerms", @"status"];
  return [optionalProperties containsObject:propertyName];
}

@end
