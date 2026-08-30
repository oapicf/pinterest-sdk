#import "OAITrendingProductCategory.h"

@implementation OAITrendingProductCategory

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"engagementType": @"engagement_type", @"pctChangeMom": @"pct_change_mom", @"percentRelativeVolume": @"percent_relative_volume", @"pinterestProductCategoryId": @"pinterest_product_category_id", @"productCategory": @"product_category", @"verticals": @"verticals" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"verticals"];
  return [optionalProperties containsObject:propertyName];
}

@end
