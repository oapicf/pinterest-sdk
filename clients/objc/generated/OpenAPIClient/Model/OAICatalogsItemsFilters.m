#import "OAICatalogsItemsFilters.h"

@implementation OAICatalogsItemsFilters

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
        class = NSClassFromString(@"OAICatalogsCreativeAssetsItemsFilter");
    }
    else
    if ([discriminatedClassName isEqualToString:@"HOTEL"]) {
        class = NSClassFromString(@"OAICatalogsHotelItemsFilter");
    }
    else
    if ([discriminatedClassName isEqualToString:@"RETAIL"]) {
        class = NSClassFromString(@"OAICatalogsRetailItemsFilter");
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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"catalogType": @"catalog_type", @"itemIds": @"item_ids", @"catalogId": @"catalog_id", @"hotelIds": @"hotel_ids", @"creativeAssetsIds": @"creative_assets_ids" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"catalogId", ];
  return [optionalProperties containsObject:propertyName];
}

@end
