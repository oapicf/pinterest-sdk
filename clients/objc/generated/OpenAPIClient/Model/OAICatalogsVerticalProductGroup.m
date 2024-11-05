#import "OAICatalogsVerticalProductGroup.h"

@implementation OAICatalogsVerticalProductGroup

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
    NSString * discriminatedClassName = [dict valueForKey:@"catalogType"];
    if(discriminatedClassName == nil ){
         return [super initWithDictionary:dict error:err];
    }

    Class class = nil;
    if ([discriminatedClassName isEqualToString:@"CREATIVE_ASSETS"]) {
        class = NSClassFromString(@"OAICatalogsCreativeAssetsProductGroup");
    }
    else
    if ([discriminatedClassName isEqualToString:@"HOTEL"]) {
        class = NSClassFromString(@"OAICatalogsHotelProductGroup");
    }
    else
    if ([discriminatedClassName isEqualToString:@"RETAIL"]) {
        class = NSClassFromString(@"OAICatalogsRetailProductGroup");
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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"catalogType": @"catalog_type", @"_id": @"id", @"name": @"name", @"_description": @"description", @"filters": @"filters", @"isFeatured": @"is_featured", @"type": @"type", @"status": @"status", @"createdAt": @"created_at", @"updatedAt": @"updated_at", @"catalogId": @"catalog_id", @"feedId": @"feed_id", @"country": @"country", @"locale": @"locale" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"_description", @"isFeatured", @"type", @"status", @"createdAt", @"updatedAt", @"country", @"locale"];
  return [optionalProperties containsObject:propertyName];
}

@end
