#import "OAIConversionTagConfigs.h"

@implementation OAIConversionTagConfigs

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.aemDbEnabled = @(NO);
    self.aemEnabled = @(NO);
    self.aemExternalIdEnabled = @(NO);
    self.aemFnlnEnabled = @(NO);
    self.aemGeEnabled = @(NO);
    self.aemLocEnabled = @(NO);
    self.aemPhEnabled = @(NO);
    self.mdFrequency = @1;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"aemDbEnabled": @"aem_db_enabled", @"aemEnabled": @"aem_enabled", @"aemExternalIdEnabled": @"aem_external_id_enabled", @"aemFnlnEnabled": @"aem_fnln_enabled", @"aemGeEnabled": @"aem_ge_enabled", @"aemLocEnabled": @"aem_loc_enabled", @"aemPhEnabled": @"aem_ph_enabled", @"mdFrequency": @"md_frequency", @"noCodeCapiDomains": @"no_code_capi_domains" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"aemDbEnabled", @"aemEnabled", @"aemExternalIdEnabled", @"aemFnlnEnabled", @"aemGeEnabled", @"aemLocEnabled", @"aemPhEnabled", @"mdFrequency", @"noCodeCapiDomains"];
  return [optionalProperties containsObject:propertyName];
}

@end
