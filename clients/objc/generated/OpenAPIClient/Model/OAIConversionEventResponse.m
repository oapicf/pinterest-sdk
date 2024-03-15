#import "OAIConversionEventResponse.h"

@implementation OAIConversionEventResponse

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"conversionEvent": @"conversion_event", @"conversionTagId": @"conversion_tag_id", @"adAccountId": @"ad_account_id", @"createdTime": @"created_time" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"conversionEvent", @"conversionTagId", @"adAccountId", @"createdTime"];
  return [optionalProperties containsObject:propertyName];
}

@end
