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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"cardType": @"card_type", @"status": @"status", @"advertiserId": @"advertiser_id", @"paymentMethodBrand": @"payment_method_brand" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"cardType", @"status", @"advertiserId", @"paymentMethodBrand"];
  return [optionalProperties containsObject:propertyName];
}

@end
