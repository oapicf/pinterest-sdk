#import "OAIAdvancedAuctionItemsSubmitUpsertRecord.h"

@implementation OAIAdvancedAuctionItemsSubmitUpsertRecord

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"bidOptions": @"bid_options", @"country": @"country", @"errors": @"errors", @"itemId": @"item_id", @"language": @"language", @"operation": @"operation", @"updateMask": @"update_mask" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"errors", ];
  return [optionalProperties containsObject:propertyName];
}

@end
