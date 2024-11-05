#import "OAITargetingSpec.h"

@implementation OAITargetingSpec

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"aGEBUCKET": @"AGE_BUCKET", @"aPPTYPE": @"APPTYPE", @"aUDIENCEEXCLUDE": @"AUDIENCE_EXCLUDE", @"aUDIENCEINCLUDE": @"AUDIENCE_INCLUDE", @"gENDER": @"GENDER", @"gEO": @"GEO", @"iNTEREST": @"INTEREST", @"lOCALE": @"LOCALE", @"lOCATION": @"LOCATION", @"sHOPPINGRETARGETING": @"SHOPPING_RETARGETING", @"tARGETINGSTRATEGY": @"TARGETING_STRATEGY" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"aGEBUCKET", @"aPPTYPE", @"aUDIENCEEXCLUDE", @"aUDIENCEINCLUDE", @"gENDER", @"gEO", @"iNTEREST", @"lOCALE", @"lOCATION", @"sHOPPINGRETARGETING", @"tARGETINGSTRATEGY"];
  return [optionalProperties containsObject:propertyName];
}

@end
