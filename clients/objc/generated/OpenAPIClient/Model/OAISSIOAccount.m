#import "OAISSIOAccount.h"

@implementation OAISSIOAccount

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"billtoInfos": @"billto_infos", @"canEdit": @"can_edit", @"currency": @"currency", @"eligible": @"eligible", @"error": @"error", @"pmpNames": @"pmp_names" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"billtoInfos", @"canEdit", @"currency", @"eligible", @"error", @"pmpNames"];
  return [optionalProperties containsObject:propertyName];
}

@end
