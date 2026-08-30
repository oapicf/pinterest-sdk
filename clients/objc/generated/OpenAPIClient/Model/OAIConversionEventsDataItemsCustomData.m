#import "OAIConversionEventsDataItemsCustomData.h"

@implementation OAIConversionEventsDataItemsCustomData

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"contentBrand": @"content_brand", @"contentCategory": @"content_category", @"contentIds": @"content_ids", @"contentName": @"content_name", @"contents": @"contents", @"currency": @"currency", @"externalMeasurementId": @"external_measurement_id", @"externalMeasurementVendorId": @"external_measurement_vendor_id", @"np": @"np", @"numItems": @"num_items", @"optOutType": @"opt_out_type", @"orderId": @"order_id", @"predictedLtv": @"predicted_ltv", @"searchString": @"search_string", @"value": @"value" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"contentBrand", @"contentCategory", @"contentIds", @"contentName", @"contents", @"currency", @"externalMeasurementId", @"externalMeasurementVendorId", @"np", @"numItems", @"optOutType", @"orderId", @"predictedLtv", @"searchString", @"value"];
  return [optionalProperties containsObject:propertyName];
}

@end
