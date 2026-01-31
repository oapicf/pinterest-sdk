#import "OAICatalogsRetailFilterValuesMap.h"

@implementation OAICatalogsRetailFilterValuesMap

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adImageTags": @"ad_image_tags", @"adVideoTags": @"ad_video_tags", @"availability": @"availability", @"brand": @"brand", @"condition": @"condition", @"customLabel0": @"custom_label_0", @"customLabel1": @"custom_label_1", @"customLabel2": @"custom_label_2", @"customLabel3": @"custom_label_3", @"customLabel4": @"custom_label_4", @"gender": @"gender", @"googleProductCategory0": @"google_product_category_0", @"googleProductCategory1": @"google_product_category_1", @"googleProductCategory2": @"google_product_category_2", @"googleProductCategory3": @"google_product_category_3", @"googleProductCategory4": @"google_product_category_4", @"googleProductCategory5": @"google_product_category_5", @"googleProductCategory6": @"google_product_category_6", @"mediaType": @"media_type", @"productType0": @"product_type_0", @"productType1": @"product_type_1", @"productType2": @"product_type_2", @"productType3": @"product_type_3", @"productType4": @"product_type_4" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adImageTags", @"adVideoTags", @"availability", @"brand", @"condition", @"customLabel0", @"customLabel1", @"customLabel2", @"customLabel3", @"customLabel4", @"gender", @"googleProductCategory0", @"googleProductCategory1", @"googleProductCategory2", @"googleProductCategory3", @"googleProductCategory4", @"googleProductCategory5", @"googleProductCategory6", @"mediaType", @"productType0", @"productType1", @"productType2", @"productType3", @"productType4"];
  return [optionalProperties containsObject:propertyName];
}

@end
