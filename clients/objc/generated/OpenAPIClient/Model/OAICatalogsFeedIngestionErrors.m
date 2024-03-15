#import "OAICatalogsFeedIngestionErrors.h"

@implementation OAICatalogsFeedIngestionErrors

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"lINELEVELINTERNALERROR": @"LINE_LEVEL_INTERNAL_ERROR", @"lARGEPRODUCTCOUNTDECREASE": @"LARGE_PRODUCT_COUNT_DECREASE", @"aCCOUNTFLAGGED": @"ACCOUNT_FLAGGED", @"iMAGELEVELINTERNALERROR": @"IMAGE_LEVEL_INTERNAL_ERROR", @"iMAGEFILENOTACCESSIBLE": @"IMAGE_FILE_NOT_ACCESSIBLE", @"iMAGEMALFORMEDURL": @"IMAGE_MALFORMED_URL", @"iMAGEFILENOTFOUND": @"IMAGE_FILE_NOT_FOUND", @"iMAGEINVALIDFILE": @"IMAGE_INVALID_FILE" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"lINELEVELINTERNALERROR", @"lARGEPRODUCTCOUNTDECREASE", @"aCCOUNTFLAGGED", @"iMAGELEVELINTERNALERROR", @"iMAGEFILENOTACCESSIBLE", @"iMAGEMALFORMEDURL", @"iMAGEFILENOTFOUND", @"iMAGEINVALIDFILE"];
  return [optionalProperties containsObject:propertyName];
}

@end
