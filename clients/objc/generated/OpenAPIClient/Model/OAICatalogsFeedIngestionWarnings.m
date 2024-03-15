#import "OAICatalogsFeedIngestionWarnings.h"

@implementation OAICatalogsFeedIngestionWarnings

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"aDDITIONALIMAGELEVELINTERNALERROR": @"ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR", @"aDDITIONALIMAGEFILENOTACCESSIBLE": @"ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE", @"aDDITIONALIMAGEMALFORMEDURL": @"ADDITIONAL_IMAGE_MALFORMED_URL", @"aDDITIONALIMAGEFILENOTFOUND": @"ADDITIONAL_IMAGE_FILE_NOT_FOUND", @"aDDITIONALIMAGEINVALIDFILE": @"ADDITIONAL_IMAGE_INVALID_FILE", @"hOTELPRICEHEADERISPRESENT": @"HOTEL_PRICE_HEADER_IS_PRESENT" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"aDDITIONALIMAGELEVELINTERNALERROR", @"aDDITIONALIMAGEFILENOTACCESSIBLE", @"aDDITIONALIMAGEMALFORMEDURL", @"aDDITIONALIMAGEFILENOTFOUND", @"aDDITIONALIMAGEINVALIDFILE", @"hOTELPRICEHEADERISPRESENT"];
  return [optionalProperties containsObject:propertyName];
}

@end
