#import "OAICatalogsFeed.h"

@implementation OAICatalogsFeed

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
        class = NSClassFromString(@"OAICatalogsCreativeAssetsFeed");
    }
    else
    if ([discriminatedClassName isEqualToString:@"HOTEL"]) {
        class = NSClassFromString(@"OAICatalogsHotelFeed");
    }
    else
    if ([discriminatedClassName isEqualToString:@"RETAIL"]) {
        class = NSClassFromString(@"OAICatalogsRetailFeed");
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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"createdAt": @"created_at", @"_id": @"id", @"updatedAt": @"updated_at", @"name": @"name", @"format": @"format", @"catalogType": @"catalog_type", @"credentials": @"credentials", @"location": @"location", @"preferredProcessingSchedule": @"preferred_processing_schedule", @"status": @"status", @"defaultCurrency": @"default_currency", @"defaultLocale": @"default_locale", @"defaultCountry": @"default_country", @"defaultAvailability": @"default_availability", @"catalogId": @"catalog_id" }];
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
