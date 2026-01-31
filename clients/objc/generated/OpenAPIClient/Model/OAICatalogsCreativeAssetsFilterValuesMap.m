#import "OAICatalogsCreativeAssetsFilterValuesMap.h"

@implementation OAICatalogsCreativeAssetsFilterValuesMap

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"customLabel0": @"custom_label_0", @"customLabel1": @"custom_label_1", @"customLabel2": @"custom_label_2", @"customLabel3": @"custom_label_3", @"customLabel4": @"custom_label_4", @"googleProductCategory0": @"google_product_category_0", @"googleProductCategory1": @"google_product_category_1", @"googleProductCategory2": @"google_product_category_2", @"googleProductCategory3": @"google_product_category_3", @"googleProductCategory4": @"google_product_category_4", @"googleProductCategory5": @"google_product_category_5", @"googleProductCategory6": @"google_product_category_6", @"mediaType": @"media_type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"customLabel0", @"customLabel1", @"customLabel2", @"customLabel3", @"customLabel4", @"googleProductCategory0", @"googleProductCategory1", @"googleProductCategory2", @"googleProductCategory3", @"googleProductCategory4", @"googleProductCategory5", @"googleProductCategory6", @"mediaType"];
  return [optionalProperties containsObject:propertyName];
}

@end
