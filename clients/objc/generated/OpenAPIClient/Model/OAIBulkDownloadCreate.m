#import "OAIBulkDownloadCreate.h"

@implementation OAIBulkDownloadCreate

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"campaignFilter": @"campaign_filter", @"entityIds": @"entity_ids", @"entityTypes": @"entity_types", @"outputFormat": @"output_format", @"updatedSince": @"updated_since" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"campaignFilter", @"entityIds", @"entityTypes", @"outputFormat", @"updatedSince"];
  return [optionalProperties containsObject:propertyName];
}

@end
