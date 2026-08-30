#import "OAICatalogsCreativeAssetsAttributes.h"

@implementation OAICatalogsCreativeAssetsAttributes

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"androidDeepLink": @"android_deep_link", @"customLabel0": @"custom_label_0", @"customLabel1": @"custom_label_1", @"customLabel2": @"custom_label_2", @"customLabel3": @"custom_label_3", @"customLabel4": @"custom_label_4", @"_description": @"description", @"googleProductCategory": @"google_product_category", @"iosDeepLink": @"ios_deep_link", @"link": @"link", @"title": @"title", @"visibility": @"visibility", @"aiDisclosures": @"ai_disclosures", @"imageLink": @"image_link", @"videoLink": @"video_link" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"androidDeepLink", @"customLabel0", @"customLabel1", @"customLabel2", @"customLabel3", @"customLabel4", @"_description", @"googleProductCategory", @"iosDeepLink", @"link", @"title", @"visibility", @"aiDisclosures", @"imageLink", @"videoLink"];
  return [optionalProperties containsObject:propertyName];
}

@end
