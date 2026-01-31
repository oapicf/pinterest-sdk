#import "OAIBillingProfilesResponse.h"

@implementation OAIBillingProfilesResponse

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"advertiserId": @"advertiser_id", @"billingType": @"billing_type", @"cardType": @"card_type", @"_id": @"id", @"paymentMethodBrand": @"payment_method_brand", @"status": @"status" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"advertiserId", @"billingType", @"cardType", @"_id", @"paymentMethodBrand", @"status"];
  return [optionalProperties containsObject:propertyName];
}

@end
