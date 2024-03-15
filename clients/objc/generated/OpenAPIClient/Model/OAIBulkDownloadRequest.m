#import "OAIBulkDownloadRequest.h"

@implementation OAIBulkDownloadRequest

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.outputFormat = @"JSON";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"entityTypes": @"entity_types", @"entityIds": @"entity_ids", @"updatedSince": @"updated_since", @"campaignFilter": @"campaign_filter", @"outputFormat": @"output_format" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"entityTypes", @"entityIds", @"updatedSince", @"campaignFilter", @"outputFormat"];
  return [optionalProperties containsObject:propertyName];
}

@end
