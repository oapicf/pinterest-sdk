#import "OAIConversionEventDeviceInfo.h"

@implementation OAIConversionEventDeviceInfo

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"batteryLevel": @"battery_level", @"brand": @"brand", @"carrier": @"carrier", @"cpuCores": @"cpu_cores", @"externalStorageFreeSpace": @"external_storage_free_space", @"externalStorageSize": @"external_storage_size", @"formFactor": @"form_factor", @"kernelVersion": @"kernel_version", @"languages": @"languages", @"locale": @"locale", @"model": @"model", @"networkType": @"network_type", @"osFamily": @"os_family", @"osName": @"os_name", @"osReleaseName": @"os_release_name", @"osVersion": @"os_version", @"screenDensity": @"screen_density", @"screenHeight": @"screen_height", @"screenWidth": @"screen_width", @"storageFreeSpace": @"storage_free_space", @"storageSize": @"storage_size", @"timezone": @"timezone", @"timezoneAbbr": @"timezone_abbr", @"type": @"type" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"batteryLevel", @"brand", @"carrier", @"cpuCores", @"externalStorageFreeSpace", @"externalStorageSize", @"formFactor", @"kernelVersion", @"languages", @"locale", @"model", @"networkType", @"osFamily", @"osName", @"osReleaseName", @"osVersion", @"screenDensity", @"screenHeight", @"screenWidth", @"storageFreeSpace", @"storageSize", @"timezone", @"timezoneAbbr", @"type"];
  return [optionalProperties containsObject:propertyName];
}

@end
