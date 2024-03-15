#import "OAISSIOAccountItem.h"

@implementation OAISSIOAccountItem

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"ioTermsId": @"io_terms_id", @"ioTerms": @"io_terms", @"usTermsId": @"us_terms_id", @"usTerms": @"us_terms", @"rowTermsId": @"row_terms_id", @"rowTerms": @"row_terms", @"ioType": @"io_type", @"addresses": @"addresses" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"ioTermsId", @"ioTerms", @"usTermsId", @"usTerms", @"rowTermsId", @"rowTerms", @"ioType", @"addresses"];
  return [optionalProperties containsObject:propertyName];
}

@end
