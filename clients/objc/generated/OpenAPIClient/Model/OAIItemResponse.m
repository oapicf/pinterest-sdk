#import "OAIItemResponse.h"

@implementation OAIItemResponse

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
    NSString * discriminatedClassName = [dict valueForKey:@"itemResponseKind"];
    if(discriminatedClassName == nil ){
         return [super initWithDictionary:dict error:err];
    }

    Class class = nil;
    if ([discriminatedClassName isEqualToString:@"creative_assets_item"]) {
        class = NSClassFromString(@"OAICatalogsCreativeAssetsItemResponse");
    }
    else
    if ([discriminatedClassName isEqualToString:@"creative_assets_item_error"]) {
        class = NSClassFromString(@"OAICatalogsCreativeAssetsItemErrorResponse");
    }
    else
    if ([discriminatedClassName isEqualToString:@"hotel_item"]) {
        class = NSClassFromString(@"OAICatalogsHotelItemResponse");
    }
    else
    if ([discriminatedClassName isEqualToString:@"hotel_item_error"]) {
        class = NSClassFromString(@"OAICatalogsHotelItemErrorResponse");
    }
    else
    if ([discriminatedClassName isEqualToString:@"retail_item"]) {
        class = NSClassFromString(@"OAICatalogsRetailItemResponse");
    }
    else
    if ([discriminatedClassName isEqualToString:@"retail_item_error"]) {
        class = NSClassFromString(@"OAICatalogsRetailItemErrorResponse");
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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"attributes": @"attributes", @"catalogType": @"catalog_type", @"itemId": @"item_id", @"itemResponseKind": @"item_response_kind", @"pins": @"pins", @"hotelId": @"hotel_id", @"creativeAssetsId": @"creative_assets_id", @"errors": @"errors" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"attributes", @"itemId", @"pins", @"hotelId", @"creativeAssetsId", ];
  return [optionalProperties containsObject:propertyName];
}

@end
