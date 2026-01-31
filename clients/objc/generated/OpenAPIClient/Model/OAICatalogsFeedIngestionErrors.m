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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"aCCOUNTFLAGGED": @"ACCOUNT_FLAGGED", @"fETCHGOOGLESHEETNOTSHARED": @"FETCH_GOOGLE_SHEET_NOT_SHARED", @"iMAGEFILENOTACCESSIBLE": @"IMAGE_FILE_NOT_ACCESSIBLE", @"iMAGEFILENOTFOUND": @"IMAGE_FILE_NOT_FOUND", @"iMAGEINVALIDFILE": @"IMAGE_INVALID_FILE", @"iMAGELEVELINTERNALERROR": @"IMAGE_LEVEL_INTERNAL_ERROR", @"iMAGEMALFORMEDURL": @"IMAGE_MALFORMED_URL", @"lARGEPRODUCTCOUNTDECREASE": @"LARGE_PRODUCT_COUNT_DECREASE", @"lINELEVELINTERNALERROR": @"LINE_LEVEL_INTERNAL_ERROR" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"aCCOUNTFLAGGED", @"fETCHGOOGLESHEETNOTSHARED", @"iMAGEFILENOTACCESSIBLE", @"iMAGEFILENOTFOUND", @"iMAGEINVALIDFILE", @"iMAGELEVELINTERNALERROR", @"iMAGEMALFORMEDURL", @"lARGEPRODUCTCOUNTDECREASE", @"lINELEVELINTERNALERROR"];
  return [optionalProperties containsObject:propertyName];
}

@end
