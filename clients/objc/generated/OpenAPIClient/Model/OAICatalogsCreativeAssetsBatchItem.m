#import "OAICatalogsCreativeAssetsBatchItem.h"

@implementation OAICatalogsCreativeAssetsBatchItem

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
    NSString * discriminatedClassName = [dict valueForKey:@"operation"];
    if(discriminatedClassName == nil ){
         return [super initWithDictionary:dict error:err];
    }

    Class class = nil;
    if ([discriminatedClassName isEqualToString:@"CREATE"]) {
        class = NSClassFromString(@"OAICatalogsCreateCreativeAssetsItem");
    }
    else
    if ([discriminatedClassName isEqualToString:@"DELETE"]) {
        class = NSClassFromString(@"OAICatalogsDeleteCreativeAssetsItem");
    }
    else
    if ([discriminatedClassName isEqualToString:@"UPDATE"]) {
        class = NSClassFromString(@"OAICatalogsUpdateCreativeAssetsItem");
    }
    else
    if ([discriminatedClassName isEqualToString:@"UPSERT"]) {
        class = NSClassFromString(@"OAICatalogsUpsertCreativeAssetsItem");
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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"creativeAssetsId": @"creative_assets_id", @"operation": @"operation", @"attributes": @"attributes" }];
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
