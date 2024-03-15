#import "OAIPinMediaSource.h"

@implementation OAIPinMediaSource

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.isStandard = @(YES);
    self.isAffiliateLink = @(NO);
    
  }
  return self;
}

/**
 * Maps "discriminator" value to the sub-class name, so that inheritance is supported.
 */
- (id)initWithDictionary:(NSDictionary *)dict error:(NSError *__autoreleasing *)err {
    NSString * discriminatedClassName = [dict valueForKey:@"sourceType"];
    if(discriminatedClassName == nil ){
         return [super initWithDictionary:dict error:err];
    }

    Class class = nil;
    if ([discriminatedClassName isEqualToString:@"image_base64"]) {
        class = NSClassFromString(@"OAIPinMediaSourceImageBase64");
    }
    else
    if ([discriminatedClassName isEqualToString:@"image_url"]) {
        class = NSClassFromString(@"OAIPinMediaSourceImageURL");
    }
    else
    if ([discriminatedClassName isEqualToString:@"multiple_image_base64"]) {
        class = NSClassFromString(@"OAIPinMediaSourceImagesBase64");
    }
    else
    if ([discriminatedClassName isEqualToString:@"multiple_image_urls"]) {
        class = NSClassFromString(@"OAIPinMediaSourceImagesURL");
    }
    else
    if ([discriminatedClassName isEqualToString:@"pin_url"]) {
        class = NSClassFromString(@"OAIPinMediaSourcePinURL");
    }
    else
    if ([discriminatedClassName isEqualToString:@"video_id"]) {
        class = NSClassFromString(@"OAIPinMediaSourceVideoID");
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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"sourceType": @"source_type", @"contentType": @"content_type", @"data": @"data", @"isStandard": @"is_standard", @"url": @"url", @"coverImageUrl": @"cover_image_url", @"coverImageContentType": @"cover_image_content_type", @"coverImageData": @"cover_image_data", @"mediaId": @"media_id", @"items": @"items", @"index": @"index", @"isAffiliateLink": @"is_affiliate_link" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"isStandard", @"coverImageUrl", @"coverImageContentType", @"coverImageData", @"index", @"isAffiliateLink"];
  return [optionalProperties containsObject:propertyName];
}

@end
