#import "OAIMediaUploadParameters.h"

@implementation OAIMediaUploadParameters

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"contentType": @"Content-Type", @"key": @"key", @"policy": @"policy", @"xAmzAlgorithm": @"x-amz-algorithm", @"xAmzCredential": @"x-amz-credential", @"xAmzDate": @"x-amz-date", @"xAmzSecurityToken": @"x-amz-security-token", @"xAmzSignature": @"x-amz-signature" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"contentType", @"key", @"policy", @"xAmzAlgorithm", @"xAmzCredential", @"xAmzDate", @"xAmzSecurityToken", @"xAmzSignature"];
  return [optionalProperties containsObject:propertyName];
}

@end
