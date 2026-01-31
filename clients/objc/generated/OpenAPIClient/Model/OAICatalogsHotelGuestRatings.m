#import "OAICatalogsHotelGuestRatings.h"

@implementation OAICatalogsHotelGuestRatings

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"maxScore": @"max_score", @"numberOfReviewers": @"number_of_reviewers", @"ratingSystem": @"rating_system", @"score": @"score" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"maxScore", @"numberOfReviewers", @"ratingSystem", @"score"];
  return [optionalProperties containsObject:propertyName];
}

@end
