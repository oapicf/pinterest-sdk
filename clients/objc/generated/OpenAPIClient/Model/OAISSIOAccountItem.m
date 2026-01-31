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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"addresses": @"addresses", @"_id": @"id", @"ioTerms": @"io_terms", @"ioTermsId": @"io_terms_id", @"ioType": @"io_type", @"rowTerms": @"row_terms", @"rowTermsId": @"row_terms_id", @"usTerms": @"us_terms", @"usTermsId": @"us_terms_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"addresses", @"_id", @"ioTerms", @"ioTermsId", @"ioType", @"rowTerms", @"rowTermsId", @"usTerms", @"usTermsId"];
  return [optionalProperties containsObject:propertyName];
}

@end
