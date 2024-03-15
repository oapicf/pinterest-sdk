#import "OAICatalogsHotelAttributes.h"

@implementation OAICatalogsHotelAttributes

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"name": @"name", @"link": @"link", @"_description": @"description", @"brand": @"brand", @"latitude": @"latitude", @"longitude": @"longitude", @"neighborhood": @"neighborhood", @"address": @"address", @"customLabel0": @"custom_label_0", @"customLabel1": @"custom_label_1", @"customLabel2": @"custom_label_2", @"customLabel3": @"custom_label_3", @"customLabel4": @"custom_label_4", @"category": @"category", @"basePrice": @"base_price", @"salePrice": @"sale_price", @"guestRatings": @"guest_ratings", @"mainImage": @"main_image", @"additionalImageLink": @"additional_image_link" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"link", @"_description", @"brand", @"latitude", @"longitude", @"neighborhood", @"address", @"customLabel0", @"customLabel1", @"customLabel2", @"customLabel3", @"customLabel4", @"category", @"basePrice", @"salePrice", @"guestRatings", @"mainImage", @"additionalImageLink"];
  return [optionalProperties containsObject:propertyName];
}

@end
