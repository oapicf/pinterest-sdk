#import "OAIAppsflyerAudienceSyncCreate.h"

@implementation OAIAppsflyerAudienceSyncCreate

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"containerId": @"container_id", @"urlAdidSha256": @"url_adid_sha256", @"urlEmailSha256": @"url_email_sha256" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"urlAdidSha256", @"urlEmailSha256"];
  return [optionalProperties containsObject:propertyName];
}

@end
