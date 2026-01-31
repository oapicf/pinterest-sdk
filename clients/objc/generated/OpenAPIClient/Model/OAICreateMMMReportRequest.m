#import "OAICreateMMMReportRequest.h"

@implementation OAICreateMMMReportRequest

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"countries": @"countries", @"columns": @"columns", @"endDate": @"end_date", @"granularity": @"granularity", @"level": @"level", @"reportName": @"report_name", @"startDate": @"start_date", @"targetingTypes": @"targeting_types" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"countries", ];
  return [optionalProperties containsObject:propertyName];
}

@end
