#import "OAICatalogsReportDistributionStats.h"

@implementation OAICatalogsReportDistributionStats

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"catalogId": @"catalog_id", @"code": @"code", @"codeLabel": @"code_label", @"ineligibleForAds": @"ineligible_for_ads", @"ineligibleForOrganic": @"ineligible_for_organic", @"message": @"message", @"occurrences": @"occurrences", @"reportType": @"report_type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"catalogId", @"code", @"codeLabel", @"ineligibleForAds", @"ineligibleForOrganic", @"message", @"occurrences", @"reportType"];
  return [optionalProperties containsObject:propertyName];
}

@end
