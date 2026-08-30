#import "OAIUserWebsiteVerification.h"

@implementation OAIUserWebsiteVerification

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"dnsTxtRecord": @"dns_txt_record", @"fileContent": @"file_content", @"filename": @"filename", @"metatag": @"metatag", @"verificationCode": @"verification_code" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"dnsTxtRecord", @"fileContent", @"filename", @"metatag", @"verificationCode"];
  return [optionalProperties containsObject:propertyName];
}

@end
