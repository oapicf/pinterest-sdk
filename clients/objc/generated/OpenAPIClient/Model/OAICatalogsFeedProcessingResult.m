#import "OAICatalogsFeedProcessingResult.h"

@implementation OAICatalogsFeedProcessingResult

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"createdAt": @"created_at", @"_id": @"id", @"ingestionDetails": @"ingestion_details", @"productCounts": @"product_counts", @"status": @"status", @"updatedAt": @"updated_at", @"validationDetails": @"validation_details", @"videoCounts": @"video_counts" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"videoCounts"];
  return [optionalProperties containsObject:propertyName];
}

@end
