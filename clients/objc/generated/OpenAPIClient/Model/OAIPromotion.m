#import "OAIPromotion.h"

@implementation OAIPromotion

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"discountStatus": @"discount_status", @"endTime": @"end_time", @"externalId": @"external_id", @"_id": @"id", @"platformType": @"platform_type", @"promotionCode": @"promotion_code", @"promotionCustomId": @"promotion_custom_id", @"promotionTitle": @"promotion_title", @"promotionType": @"promotion_type", @"startTime": @"start_time", @"status": @"status", @"templateValues": @"template_values" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"discountStatus", @"endTime", @"externalId", @"platformType", @"promotionCode", @"promotionCustomId", @"startTime", @"status", @"templateValues"];
  return [optionalProperties containsObject:propertyName];
}

@end
