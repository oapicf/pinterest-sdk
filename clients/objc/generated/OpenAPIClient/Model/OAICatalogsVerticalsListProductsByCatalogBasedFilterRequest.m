#import "OAICatalogsVerticalsListProductsByCatalogBasedFilterRequest.h"

@implementation OAICatalogsVerticalsListProductsByCatalogBasedFilterRequest

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
        class = NSClassFromString(@"OAICatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest");
    }
    else
    if ([discriminatedClassName isEqualToString:@"HOTEL"]) {
        class = NSClassFromString(@"OAICatalogsHotelListProductsByCatalogBasedFilterRequest");
    }
    else
    if ([discriminatedClassName isEqualToString:@"RETAIL"]) {
        class = NSClassFromString(@"OAICatalogsRetailListProductsByCatalogBasedFilterRequest");
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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"catalogType": @"catalog_type", @"catalogId": @"catalog_id", @"filters": @"filters", @"country": @"country", @"locale": @"locale" }];
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
