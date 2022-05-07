#import "OAIAdResponseAllOf1.h"

@implementation OAIAdResponseAllOf1

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adAccountId": @"ad_account_id", @"campaignId": @"campaign_id", @"collectionItemsDestinationUrlTemplate": @"collection_items_destination_url_template", @"createdTime": @"created_time", @"_id": @"id", @"rejectedReasons": @"rejected_reasons", @"rejectionLabels": @"rejection_labels", @"reviewStatus": @"review_status", @"type": @"type", @"updatedTime": @"updated_time", @"summaryStatus": @"summary_status" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adAccountId", @"campaignId", @"collectionItemsDestinationUrlTemplate", @"createdTime", @"_id", @"rejectedReasons", @"rejectionLabels", @"reviewStatus", @"type", @"updatedTime", @"summaryStatus"];
  return [optionalProperties containsObject:propertyName];
}

@end
