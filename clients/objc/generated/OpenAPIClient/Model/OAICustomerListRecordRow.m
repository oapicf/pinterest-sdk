#import "OAICustomerListRecordRow.h"

@implementation OAICustomerListRecordRow

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"email": @"email", @"externalId": @"external_id", @"hashedPhoneNumber": @"hashed_phone_number", @"hashedPinnerId": @"hashed_pinner_id", @"ipAddress": @"ip_address", @"liverampEnvelope": @"liveramp_envelope", @"maid": @"maid", @"userAgent": @"user_agent" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"email", @"externalId", @"hashedPhoneNumber", @"hashedPinnerId", @"ipAddress", @"liverampEnvelope", @"maid", @"userAgent"];
  return [optionalProperties containsObject:propertyName];
}

@end
