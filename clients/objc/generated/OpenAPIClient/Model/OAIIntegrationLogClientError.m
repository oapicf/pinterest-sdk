#import "OAIIntegrationLogClientError.h"

@implementation OAIIntegrationLogClientError

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cause": @"cause", @"columnNumber": @"column_number", @"fileName": @"file_name", @"lineNumber": @"line_number", @"message": @"message", @"messageDetail": @"message_detail", @"name": @"name", @"number": @"number", @"stackTrace": @"stack_trace" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cause", @"columnNumber", @"fileName", @"lineNumber", @"message", @"messageDetail", @"name", @"number", @"stackTrace"];
  return [optionalProperties containsObject:propertyName];
}

@end
