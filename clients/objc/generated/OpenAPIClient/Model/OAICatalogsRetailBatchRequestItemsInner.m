#import "OAICatalogsRetailBatchRequestItemsInner.h"

@implementation OAICatalogsRetailBatchRequestItemsInner

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
        class = NSClassFromString(@"OAICatalogsCreateRetailItem");
    }
    else
    if ([discriminatedClassName isEqualToString:@"DELETE"]) {
        class = NSClassFromString(@"OAICatalogsDeleteRetailItem");
    }
    else
    if ([discriminatedClassName isEqualToString:@"UPDATE"]) {
        class = NSClassFromString(@"OAICatalogsUpdateRetailItem");
    }
    else
    if ([discriminatedClassName isEqualToString:@"UPSERT"]) {
        class = NSClassFromString(@"OAICatalogsUpsertRetailItem");
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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"itemId": @"item_id", @"operation": @"operation", @"attributes": @"attributes", @"updateMask": @"update_mask" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"updateMask"];
  return [optionalProperties containsObject:propertyName];
}

@end
