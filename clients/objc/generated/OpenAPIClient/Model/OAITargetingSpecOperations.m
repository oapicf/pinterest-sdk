#import "OAITargetingSpecOperations.h"

@implementation OAITargetingSpecOperations

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}

/**
 * Maps "discriminator" value to the sub-class name, so that inheritance is supported.
 */
- (id)initWithDictionary:(NSDictionary *)dict error:(NSError *__autoreleasing *)err {
    NSString * discriminatedClassName = [dict valueForKey:@"field"];
    if(discriminatedClassName == nil ){
         return [super initWithDictionary:dict error:err];
    }

    Class class = nil;
    if ([discriminatedClassName isEqualToString:@"AGE_BUCKET"]) {
        class = NSClassFromString(@"OAITargetingSpecOperationAgeBucket");
    }
    else
    if ([discriminatedClassName isEqualToString:@"APPTYPE"]) {
        class = NSClassFromString(@"OAITargetingSpecOperationAppType");
    }
    else
    if ([discriminatedClassName isEqualToString:@"AUDIENCE_EXCLUDE"]) {
        class = NSClassFromString(@"OAITargetingSpecOperationAudienceExclude");
    }
    else
    if ([discriminatedClassName isEqualToString:@"AUDIENCE_INCLUDE"]) {
        class = NSClassFromString(@"OAITargetingSpecOperationAudienceInclude");
    }
    else
    if ([discriminatedClassName isEqualToString:@"GENDER"]) {
        class = NSClassFromString(@"OAITargetingSpecOperationGender");
    }
    else
    if ([discriminatedClassName isEqualToString:@"GEO"]) {
        class = NSClassFromString(@"OAITargetingSpecOperationGeo");
    }
    else
    if ([discriminatedClassName isEqualToString:@"GEO_EXCLUDE"]) {
        class = NSClassFromString(@"OAITargetingSpecOperationGeoExclude");
    }
    else
    if ([discriminatedClassName isEqualToString:@"INTEREST"]) {
        class = NSClassFromString(@"OAITargetingSpecOperationInterest");
    }
    else
    if ([discriminatedClassName isEqualToString:@"LOCALE"]) {
        class = NSClassFromString(@"OAITargetingSpecOperationLocale");
    }
    else
    if ([discriminatedClassName isEqualToString:@"LOCATION"]) {
        class = NSClassFromString(@"OAITargetingSpecOperationLocation");
    }
    else
    if ([discriminatedClassName isEqualToString:@"LOCATION_EXCLUDE"]) {
        class = NSClassFromString(@"OAITargetingSpecOperationLocationExclude");
    }
    else
    if ([discriminatedClassName isEqualToString:@"MAXIMUM_AGE"]) {
        class = NSClassFromString(@"OAITargetingSpecOperationMaximumAge");
    }
    else
    if ([discriminatedClassName isEqualToString:@"MINIMUM_AGE"]) {
        class = NSClassFromString(@"OAITargetingSpecOperationMinimumAge");
    }
    else
    if ([discriminatedClassName isEqualToString:@"SHOPPING_RETARGETING"]) {
        class = NSClassFromString(@"OAITargetingSpecOperationShoppingRetargeting");
    }
    else
    {
        class = NSClassFromString([@"OAI" stringByAppendingString:discriminatedClassName]);
        if(!class) {
            class = NSClassFromString([@"OAI" stringByAppendingString:[discriminatedClassName capitalizedString]]);
        }
    }
    if([self class ] == class) {
        return [super initWithDictionary:dict error:err];
    }
    return [[class alloc] initWithDictionary:dict error: err];
}

/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"field": @"field", @"operation": @"operation", @"values": @"values", @"value": @"value" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[];
  return [optionalProperties containsObject:propertyName];
}

@end
