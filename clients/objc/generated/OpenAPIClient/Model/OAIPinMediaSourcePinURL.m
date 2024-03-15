#import "OAIPinMediaSourcePinURL.h"

@implementation OAIPinMediaSourcePinURL

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.isAffiliateLink = @(NO);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"sourceType": @"source_type", @"isAffiliateLink": @"is_affiliate_link" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"isAffiliateLink"];
  return [optionalProperties containsObject:propertyName];
}

@end
