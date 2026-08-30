#import "OAIPinMediaMetadata.h"

@implementation OAIPinMediaMetadata

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
    NSString * discriminatedClassName = [dict valueForKey:@"itemType"];
    if(discriminatedClassName == nil ){
         return [super initWithDictionary:dict error:err];
    }

    Class class = nil;
    if ([discriminatedClassName isEqualToString:@"image"]) {
        class = NSClassFromString(@"OAIImageMetadata");
    }
    else
    if ([discriminatedClassName isEqualToString:@"video"]) {
        class = NSClassFromString(@"OAIVideoMetadataWithItemType");
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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_description": @"description", @"images": @"images", @"itemType": @"item_type", @"link": @"link", @"title": @"title", @"coverImageUrl": @"cover_image_url", @"duration": @"duration", @"height": @"height", @"videoUrl": @"video_url", @"videoUrlHls": @"video_url_hls", @"width": @"width" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_description", @"images", @"link", @"title", @"coverImageUrl", @"duration", @"height", @"videoUrl", @"videoUrlHls", @"width"];
  return [optionalProperties containsObject:propertyName];
}

@end
