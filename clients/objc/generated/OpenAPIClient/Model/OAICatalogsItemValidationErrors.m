#import "OAICatalogsItemValidationErrors.h"

@implementation OAICatalogsItemValidationErrors

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"aDULTINVALID": @"ADULT_INVALID", @"aDWORDSFORMATINVALID": @"ADWORDS_FORMAT_INVALID", @"aVAILABILITYINVALID": @"AVAILABILITY_INVALID", @"bLOCKLISTEDIMAGESIGNATURE": @"BLOCKLISTED_IMAGE_SIGNATURE", @"dESCRIPTIONMISSING": @"DESCRIPTION_MISSING", @"dUPLICATEPRODUCTS": @"DUPLICATE_PRODUCTS", @"iMAGELINKINVALID": @"IMAGE_LINK_INVALID", @"iMAGELINKLENGTHTOOLONG": @"IMAGE_LINK_LENGTH_TOO_LONG", @"iMAGELINKMISSING": @"IMAGE_LINK_MISSING", @"iNVALIDDOMAIN": @"INVALID_DOMAIN", @"iTEMIDMISSING": @"ITEMID_MISSING", @"iTEMMAINIMAGEDOWNLOADFAILURE": @"ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE", @"lINKFORMATINVALID": @"LINK_FORMAT_INVALID", @"lINKLENGTHTOOLONG": @"LINK_LENGTH_TOO_LONG", @"lISTPRICEINVALID": @"LIST_PRICE_INVALID", @"mAXITEMSPERITEMGROUPEXCEEDED": @"MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", @"pARSELINEERROR": @"PARSE_LINE_ERROR", @"pINJOINCONTENTUNSAFE": @"PINJOIN_CONTENT_UNSAFE", @"pRICECANNOTBEDETERMINED": @"PRICE_CANNOT_BE_DETERMINED", @"pRICEMISSING": @"PRICE_MISSING", @"pRODUCTLINKMISSING": @"PRODUCT_LINK_MISSING", @"pRODUCTPRICEINVALID": @"PRODUCT_PRICE_INVALID", @"tITLEMISSING": @"TITLE_MISSING" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"aDULTINVALID", @"aDWORDSFORMATINVALID", @"aVAILABILITYINVALID", @"bLOCKLISTEDIMAGESIGNATURE", @"dESCRIPTIONMISSING", @"dUPLICATEPRODUCTS", @"iMAGELINKINVALID", @"iMAGELINKLENGTHTOOLONG", @"iMAGELINKMISSING", @"iNVALIDDOMAIN", @"iTEMIDMISSING", @"iTEMMAINIMAGEDOWNLOADFAILURE", @"lINKFORMATINVALID", @"lINKLENGTHTOOLONG", @"lISTPRICEINVALID", @"mAXITEMSPERITEMGROUPEXCEEDED", @"pARSELINEERROR", @"pINJOINCONTENTUNSAFE", @"pRICECANNOTBEDETERMINED", @"pRICEMISSING", @"pRODUCTLINKMISSING", @"pRODUCTPRICEINVALID", @"tITLEMISSING"];
  return [optionalProperties containsObject:propertyName];
}

@end
