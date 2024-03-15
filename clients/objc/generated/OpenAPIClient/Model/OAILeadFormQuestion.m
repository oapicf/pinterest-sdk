#import "OAILeadFormQuestion.h"

@implementation OAILeadFormQuestion

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"questionType": @"question_type", @"customQuestionFieldType": @"custom_question_field_type", @"customQuestionLabel": @"custom_question_label", @"customQuestionOptions": @"custom_question_options" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"questionType", @"customQuestionFieldType", @"customQuestionLabel", @"customQuestionOptions"];
  return [optionalProperties containsObject:propertyName];
}

@end
