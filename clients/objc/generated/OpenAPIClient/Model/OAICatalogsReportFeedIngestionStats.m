#import "OAICatalogsReportFeedIngestionStats.h"

@implementation OAICatalogsReportFeedIngestionStats

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"reportType": @"report_type", @"catalogId": @"catalog_id", @"code": @"code", @"codeLabel": @"code_label", @"message": @"message", @"occurrences": @"occurrences", @"severity": @"severity" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"reportType", @"catalogId", @"code", @"codeLabel", @"message", @"occurrences", @"severity"];
  return [optionalProperties containsObject:propertyName];
}

@end
