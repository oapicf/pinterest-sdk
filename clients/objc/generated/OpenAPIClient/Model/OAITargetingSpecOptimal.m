#import "OAITargetingSpecOptimal.h"

@implementation OAITargetingSpecOptimal

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"aGEBUCKET": @"AGE_BUCKET", @"aPPTYPE": @"APPTYPE", @"aUDIENCEEXCLUDE": @"AUDIENCE_EXCLUDE", @"aUDIENCEINCLUDE": @"AUDIENCE_INCLUDE", @"gENDER": @"GENDER", @"gEO": @"GEO", @"gEOEXCLUDE": @"GEO_EXCLUDE", @"iNTEREST": @"INTEREST", @"lOCALE": @"LOCALE", @"lOCATION": @"LOCATION", @"lOCATIONEXCLUDE": @"LOCATION_EXCLUDE", @"mAXIMUMAGE": @"MAXIMUM_AGE", @"mINIMUMAGE": @"MINIMUM_AGE", @"sHOPPINGRETARGETING": @"SHOPPING_RETARGETING", @"tARGETINGSTRATEGY": @"TARGETING_STRATEGY" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"aGEBUCKET", @"aPPTYPE", @"aUDIENCEEXCLUDE", @"aUDIENCEINCLUDE", @"gENDER", @"gEO", @"gEOEXCLUDE", @"iNTEREST", @"lOCALE", @"lOCATION", @"lOCATIONEXCLUDE", @"mAXIMUMAGE", @"mINIMUMAGE", @"sHOPPINGRETARGETING", @"tARGETINGSTRATEGY"];
  return [optionalProperties containsObject:propertyName];
}

@end
