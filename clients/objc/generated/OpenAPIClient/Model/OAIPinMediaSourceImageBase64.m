#import "OAIPinMediaSourceImageBase64.h"

@implementation OAIPinMediaSourceImageBase64

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.isStandard = @(YES);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"sourceType": @"source_type", @"contentType": @"content_type", @"data": @"data", @"isStandard": @"is_standard" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"isStandard"];
  return [optionalProperties containsObject:propertyName];
}

@end
