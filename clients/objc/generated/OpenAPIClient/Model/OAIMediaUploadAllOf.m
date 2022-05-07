#import "OAIMediaUploadAllOf.h"

@implementation OAIMediaUploadAllOf

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"mediaId": @"media_id", @"mediaType": @"media_type", @"uploadUrl": @"upload_url", @"uploadParameters": @"upload_parameters" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"mediaId", @"mediaType", @"uploadUrl", @"uploadParameters"];
  return [optionalProperties containsObject:propertyName];
}

@end
