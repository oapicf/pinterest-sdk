#import "OAIConversionTagCreate.h"

@implementation OAIConversionTagCreate

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.aemEnabled = @(NO);
    self.mdFrequency = @1;
    self.aemFnlnEnabled = @(NO);
    self.aemPhEnabled = @(NO);
    self.aemGeEnabled = @(NO);
    self.aemDbEnabled = @(NO);
    self.aemLocEnabled = @(NO);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"name": @"name", @"aemEnabled": @"aem_enabled", @"mdFrequency": @"md_frequency", @"aemFnlnEnabled": @"aem_fnln_enabled", @"aemPhEnabled": @"aem_ph_enabled", @"aemGeEnabled": @"aem_ge_enabled", @"aemDbEnabled": @"aem_db_enabled", @"aemLocEnabled": @"aem_loc_enabled" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"aemEnabled", @"mdFrequency", @"aemFnlnEnabled", @"aemPhEnabled", @"aemGeEnabled", @"aemDbEnabled", @"aemLocEnabled"];
  return [optionalProperties containsObject:propertyName];
}

@end
