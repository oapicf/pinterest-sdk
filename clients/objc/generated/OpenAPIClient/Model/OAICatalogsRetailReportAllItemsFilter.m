#import "OAICatalogsRetailReportAllItemsFilter.h"

@implementation OAICatalogsRetailReportAllItemsFilter

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"catalogId": @"catalog_id", @"productGroupId": @"product_group_id", @"reportType": @"report_type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"catalogId", @"productGroupId", ];
  return [optionalProperties containsObject:propertyName];
}

@end
