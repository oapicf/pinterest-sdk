#import "OAICatalogsHotelReportParametersReport.h"

@implementation OAICatalogsHotelReportParametersReport

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
    NSString * discriminatedClassName = [dict valueForKey:@"reportType"];
    if(discriminatedClassName == nil ){
         return [super initWithDictionary:dict error:err];
    }

    Class class = nil;
    if ([discriminatedClassName isEqualToString:@"DISTRIBUTION_ISSUES"]) {
        class = NSClassFromString(@"OAICatalogsReportDistributionIssueFilter");
    }
    else
    if ([discriminatedClassName isEqualToString:@"FEED_INGESTION_ISSUES"]) {
        class = NSClassFromString(@"OAICatalogsReportFeedIngestionFilter");
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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"reportType": @"report_type", @"feedId": @"feed_id", @"processingResultId": @"processing_result_id", @"catalogId": @"catalog_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"reportType", @"processingResultId", @"catalogId"];
  return [optionalProperties containsObject:propertyName];
}

@end
