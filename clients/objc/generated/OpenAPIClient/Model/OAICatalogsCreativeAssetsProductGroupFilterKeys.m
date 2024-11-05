#import "OAICatalogsCreativeAssetsProductGroupFilterKeys.h"

@implementation OAICatalogsCreativeAssetsProductGroupFilterKeys

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cREATIVEASSETSID": @"CREATIVE_ASSETS_ID", @"cUSTOMLABEL0": @"CUSTOM_LABEL_0", @"cUSTOMLABEL1": @"CUSTOM_LABEL_1", @"cUSTOMLABEL2": @"CUSTOM_LABEL_2", @"cUSTOMLABEL3": @"CUSTOM_LABEL_3", @"cUSTOMLABEL4": @"CUSTOM_LABEL_4", @"gOOGLEPRODUCTCATEGORY6": @"GOOGLE_PRODUCT_CATEGORY_6", @"gOOGLEPRODUCTCATEGORY5": @"GOOGLE_PRODUCT_CATEGORY_5", @"gOOGLEPRODUCTCATEGORY4": @"GOOGLE_PRODUCT_CATEGORY_4", @"gOOGLEPRODUCTCATEGORY3": @"GOOGLE_PRODUCT_CATEGORY_3", @"gOOGLEPRODUCTCATEGORY2": @"GOOGLE_PRODUCT_CATEGORY_2", @"gOOGLEPRODUCTCATEGORY1": @"GOOGLE_PRODUCT_CATEGORY_1", @"gOOGLEPRODUCTCATEGORY0": @"GOOGLE_PRODUCT_CATEGORY_0", @"mEDIATYPE": @"MEDIA_TYPE" }];
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
