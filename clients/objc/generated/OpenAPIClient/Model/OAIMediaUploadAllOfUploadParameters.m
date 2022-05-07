#import "OAIMediaUploadAllOfUploadParameters.h"

@implementation OAIMediaUploadAllOfUploadParameters

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"xAmzDate": @"x-amz-date", @"xAmzSignature": @"x-amz-signature", @"xAmzSecurityToken": @"x-amz-security-token", @"xAmzAlgorithm": @"x-amz-algorithm", @"key": @"key", @"policy": @"policy", @"xAmzCredential": @"x-amz-credential", @"contentType": @"Content-Type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"xAmzDate", @"xAmzSignature", @"xAmzSecurityToken", @"xAmzAlgorithm", @"key", @"policy", @"xAmzCredential", @"contentType"];
  return [optionalProperties containsObject:propertyName];
}

@end
