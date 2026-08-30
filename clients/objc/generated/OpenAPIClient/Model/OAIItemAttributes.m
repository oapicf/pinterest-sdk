#import "OAIItemAttributes.h"

@implementation OAIItemAttributes

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"adImage0Link": @"ad_image_0_link", @"adImage0Tag": @"ad_image_0_tag", @"adImage10Link": @"ad_image_10_link", @"adImage10Tag": @"ad_image_10_tag", @"adImage11Link": @"ad_image_11_link", @"adImage11Tag": @"ad_image_11_tag", @"adImage12Link": @"ad_image_12_link", @"adImage12Tag": @"ad_image_12_tag", @"adImage13Link": @"ad_image_13_link", @"adImage13Tag": @"ad_image_13_tag", @"adImage14Link": @"ad_image_14_link", @"adImage14Tag": @"ad_image_14_tag", @"adImage15Link": @"ad_image_15_link", @"adImage15Tag": @"ad_image_15_tag", @"adImage16Link": @"ad_image_16_link", @"adImage16Tag": @"ad_image_16_tag", @"adImage17Link": @"ad_image_17_link", @"adImage17Tag": @"ad_image_17_tag", @"adImage18Link": @"ad_image_18_link", @"adImage18Tag": @"ad_image_18_tag", @"adImage19Link": @"ad_image_19_link", @"adImage19Tag": @"ad_image_19_tag", @"adImage1Link": @"ad_image_1_link", @"adImage1Tag": @"ad_image_1_tag", @"adImage2Link": @"ad_image_2_link", @"adImage2Tag": @"ad_image_2_tag", @"adImage3Link": @"ad_image_3_link", @"adImage3Tag": @"ad_image_3_tag", @"adImage4Link": @"ad_image_4_link", @"adImage4Tag": @"ad_image_4_tag", @"adImage5Link": @"ad_image_5_link", @"adImage5Tag": @"ad_image_5_tag", @"adImage6Link": @"ad_image_6_link", @"adImage6Tag": @"ad_image_6_tag", @"adImage7Link": @"ad_image_7_link", @"adImage7Tag": @"ad_image_7_tag", @"adImage8Link": @"ad_image_8_link", @"adImage8Tag": @"ad_image_8_tag", @"adImage9Link": @"ad_image_9_link", @"adImage9Tag": @"ad_image_9_tag", @"adLink": @"ad_link", @"adVideo0Link": @"ad_video_0_link", @"adVideo0Tag": @"ad_video_0_tag", @"adVideo1Link": @"ad_video_1_link", @"adVideo1Tag": @"ad_video_1_tag", @"adVideo2Link": @"ad_video_2_link", @"adVideo2Tag": @"ad_video_2_tag", @"adult": @"adult", @"ageGroup": @"age_group", @"androidDeepLink": @"android_deep_link", @"availability": @"availability", @"averageReviewRating": @"average_review_rating", @"brand": @"brand", @"checkoutEnabled": @"checkout_enabled", @"color": @"color", @"condition": @"condition", @"customLabel0": @"custom_label_0", @"customLabel1": @"custom_label_1", @"customLabel2": @"custom_label_2", @"customLabel3": @"custom_label_3", @"customLabel4": @"custom_label_4", @"customNumber0": @"custom_number_0", @"customNumber1": @"custom_number_1", @"customNumber2": @"custom_number_2", @"customNumber3": @"custom_number_3", @"customNumber4": @"custom_number_4", @"_description": @"description", @"freeShippingLabel": @"free_shipping_label", @"freeShippingLimit": @"free_shipping_limit", @"gender": @"gender", @"googleProductCategory": @"google_product_category", @"gtin": @"gtin", @"_id": @"id", @"installmentPrice": @"installment_price", @"iosDeepLink": @"ios_deep_link", @"itemGroupId": @"item_group_id", @"lastUpdatedTime": @"last_updated_time", @"link": @"link", @"material": @"material", @"minAdPrice": @"min_ad_price", @"mobileLink": @"mobile_link", @"mpn": @"mpn", @"numberOfRatings": @"number_of_ratings", @"numberOfReviews": @"number_of_reviews", @"pattern": @"pattern", @"price": @"price", @"productType": @"product_type", @"promotionId": @"promotion_id", @"salePrice": @"sale_price", @"salePriceEffectiveDate": @"sale_price_effective_date", @"shipping": @"shipping", @"shippingHeight": @"shipping_height", @"shippingWeight": @"shipping_weight", @"shippingWidth": @"shipping_width", @"size": @"size", @"sizeSystem": @"size_system", @"sizeType": @"size_type", @"tax": @"tax", @"title": @"title", @"unitPricingBaseMeasure": @"unit_pricing_base_measure", @"unitPricingMeasure": @"unit_pricing_measure", @"variantNames": @"variant_names", @"variantValues": @"variant_values", @"additionalImageLink": @"additional_image_link", @"aiDisclosures": @"ai_disclosures", @"imageLink": @"image_link", @"videoLink": @"video_link" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"adImage0Link", @"adImage0Tag", @"adImage10Link", @"adImage10Tag", @"adImage11Link", @"adImage11Tag", @"adImage12Link", @"adImage12Tag", @"adImage13Link", @"adImage13Tag", @"adImage14Link", @"adImage14Tag", @"adImage15Link", @"adImage15Tag", @"adImage16Link", @"adImage16Tag", @"adImage17Link", @"adImage17Tag", @"adImage18Link", @"adImage18Tag", @"adImage19Link", @"adImage19Tag", @"adImage1Link", @"adImage1Tag", @"adImage2Link", @"adImage2Tag", @"adImage3Link", @"adImage3Tag", @"adImage4Link", @"adImage4Tag", @"adImage5Link", @"adImage5Tag", @"adImage6Link", @"adImage6Tag", @"adImage7Link", @"adImage7Tag", @"adImage8Link", @"adImage8Tag", @"adImage9Link", @"adImage9Tag", @"adLink", @"adVideo0Link", @"adVideo0Tag", @"adVideo1Link", @"adVideo1Tag", @"adVideo2Link", @"adVideo2Tag", @"adult", @"ageGroup", @"androidDeepLink", @"availability", @"averageReviewRating", @"brand", @"checkoutEnabled", @"color", @"condition", @"customLabel0", @"customLabel1", @"customLabel2", @"customLabel3", @"customLabel4", @"customNumber0", @"customNumber1", @"customNumber2", @"customNumber3", @"customNumber4", @"_description", @"freeShippingLabel", @"freeShippingLimit", @"gender", @"googleProductCategory", @"gtin", @"_id", @"installmentPrice", @"iosDeepLink", @"itemGroupId", @"lastUpdatedTime", @"link", @"material", @"minAdPrice", @"mobileLink", @"mpn", @"numberOfRatings", @"numberOfReviews", @"pattern", @"price", @"productType", @"promotionId", @"salePrice", @"salePriceEffectiveDate", @"shipping", @"shippingHeight", @"shippingWeight", @"shippingWidth", @"size", @"sizeSystem", @"sizeType", @"tax", @"title", @"unitPricingBaseMeasure", @"unitPricingMeasure", @"variantNames", @"variantValues", @"additionalImageLink", @"aiDisclosures", @"imageLink", @"videoLink"];
  return [optionalProperties containsObject:propertyName];
}

@end
