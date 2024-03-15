#import "OAICatalogsHotelProductGroupFilterKeys.h"

@implementation OAICatalogsHotelProductGroupFilterKeys

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"pRICE": @"PRICE", @"hOTELID": @"HOTEL_ID", @"bRAND": @"BRAND", @"cUSTOMLABEL0": @"CUSTOM_LABEL_0", @"cUSTOMLABEL1": @"CUSTOM_LABEL_1", @"cUSTOMLABEL2": @"CUSTOM_LABEL_2", @"cUSTOMLABEL3": @"CUSTOM_LABEL_3", @"cUSTOMLABEL4": @"CUSTOM_LABEL_4", @"cOUNTRY": @"COUNTRY" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[];
  return [optionalProperties containsObject:propertyName];
}

@end
