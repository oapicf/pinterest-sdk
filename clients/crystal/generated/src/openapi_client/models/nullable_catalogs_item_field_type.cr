# #Pinterest REST API
#
##Pinterest's REST API
#
#The version of the OpenAPI document: 5.12.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.4.0
#

require "big"
require "json"
require "time"

module OpenAPIClient
  class NullableCatalogsItemFieldType
    ITEM_ID = "ITEM_ID"
  
    ITEM_GROUP_ID = "ITEM_GROUP_ID"
  
    TITLE = "TITLE"
  
    DESCRIPTION = "DESCRIPTION"
  
    ITEM_LINK = "ITEM_LINK"
  
    ORGANIC_LINK = "ORGANIC_LINK"
  
    IMAGE_LINK = "IMAGE_LINK"
  
    ADWORDS_REDIRECT_LINK = "ADWORDS_REDIRECT_LINK"
  
    AD_LINK = "AD_LINK"
  
    SIZE = "SIZE"
  
    GOOGLE_PRODUCT_CATEGORY = "GOOGLE_PRODUCT_CATEGORY"
  
    PRODUCT_CATEGORY = "PRODUCT_CATEGORY"
  
    CONDITION = "CONDITION"
  
    AVAILABILITY = "AVAILABILITY"
  
    GENDER = "GENDER"
  
    AGE_GROUP = "AGE_GROUP"
  
    SIZE_TYPE = "SIZE_TYPE"
  
    SIZE_SYSTEM = "SIZE_SYSTEM"
  
    ADULT = "ADULT"
  
    SHIPPING = "SHIPPING"
  
    SHIPPING_WEIGHT = "SHIPPING_WEIGHT"
  
    TAX = "TAX"
  
    MULTIPACK = "MULTIPACK"
  
    ADDITIONAL_IMAGE_LINK = "ADDITIONAL_IMAGE_LINK"
  
    PRICE = "PRICE"
  
    SALE_PRICE = "SALE_PRICE"
  
    IS_BUNDLE = "IS_BUNDLE"
  
    EXPIRATION_DATE = "EXPIRATION_DATE"
  
    SALE_PRICE_EFFECTIVE_DATE = "SALE_PRICE_EFFECTIVE_DATE"
  
    AVAILABILITY_DATE = "AVAILABILITY_DATE"
  
    WEIGHT_UNIT = "WEIGHT_UNIT"
  
    PRODUCT_TYPE = "PRODUCT_TYPE"
  
    CUSTOM_LABEL_0 = "CUSTOM_LABEL_0"
  
    CUSTOM_LABEL_1 = "CUSTOM_LABEL_1"
  
    CUSTOM_LABEL_2 = "CUSTOM_LABEL_2"
  
    CUSTOM_LABEL_3 = "CUSTOM_LABEL_3"
  
    CUSTOM_LABEL_4 = "CUSTOM_LABEL_4"
  
    MATERIAL = "MATERIAL"
  
    PATTERN = "PATTERN"
  
    COLOR = "COLOR"
  
    BRAND = "BRAND"
  
    GTIN = "GTIN"
  
    MPN = "MPN"
  
    IOS_DEEP_LINK = "IOS_DEEP_LINK"
  
    ANDROID_DEEP_LINK = "ANDROID_DEEP_LINK"
  
    FREE_SHIPPING_LABEL = "FREE_SHIPPING_LABEL"
  
    FREE_SHIPPING_LIMIT = "FREE_SHIPPING_LIMIT"
  
    AVG_REVIEW_RATING = "AVG_REVIEW_RATING"
  
    NUM_RATINGS = "NUM_RATINGS"
  
    NUM_REVIEWS = "NUM_REVIEWS"
  
    ALT_TEXT = "ALT_TEXT"
  
    VARIANT_NAMES = "VARIANT_NAMES"
  
    VARIANT_VALUES = "VARIANT_VALUES"
  
    MIN_AD_PRICE = "MIN_AD_PRICE"
  
    SHIPPING_WIDTH = "SHIPPING_WIDTH"
  
    SHIPPING_HEIGHT = "SHIPPING_HEIGHT"
  
    NULL = "null"
   
    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def self.build_from_hash(value)
      new.build_from_hash(value)
    end

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def build_from_hash(value)
      case value
      when "ITEM_ID"
        ITEM_ID
      when "ITEM_GROUP_ID"
        ITEM_GROUP_ID
      when "TITLE"
        TITLE
      when "DESCRIPTION"
        DESCRIPTION
      when "ITEM_LINK"
        ITEM_LINK
      when "ORGANIC_LINK"
        ORGANIC_LINK
      when "IMAGE_LINK"
        IMAGE_LINK
      when "ADWORDS_REDIRECT_LINK"
        ADWORDS_REDIRECT_LINK
      when "AD_LINK"
        AD_LINK
      when "SIZE"
        SIZE
      when "GOOGLE_PRODUCT_CATEGORY"
        GOOGLE_PRODUCT_CATEGORY
      when "PRODUCT_CATEGORY"
        PRODUCT_CATEGORY
      when "CONDITION"
        CONDITION
      when "AVAILABILITY"
        AVAILABILITY
      when "GENDER"
        GENDER
      when "AGE_GROUP"
        AGE_GROUP
      when "SIZE_TYPE"
        SIZE_TYPE
      when "SIZE_SYSTEM"
        SIZE_SYSTEM
      when "ADULT"
        ADULT
      when "SHIPPING"
        SHIPPING
      when "SHIPPING_WEIGHT"
        SHIPPING_WEIGHT
      when "TAX"
        TAX
      when "MULTIPACK"
        MULTIPACK
      when "ADDITIONAL_IMAGE_LINK"
        ADDITIONAL_IMAGE_LINK
      when "PRICE"
        PRICE
      when "SALE_PRICE"
        SALE_PRICE
      when "IS_BUNDLE"
        IS_BUNDLE
      when "EXPIRATION_DATE"
        EXPIRATION_DATE
      when "SALE_PRICE_EFFECTIVE_DATE"
        SALE_PRICE_EFFECTIVE_DATE
      when "AVAILABILITY_DATE"
        AVAILABILITY_DATE
      when "WEIGHT_UNIT"
        WEIGHT_UNIT
      when "PRODUCT_TYPE"
        PRODUCT_TYPE
      when "CUSTOM_LABEL_0"
        CUSTOM_LABEL_0
      when "CUSTOM_LABEL_1"
        CUSTOM_LABEL_1
      when "CUSTOM_LABEL_2"
        CUSTOM_LABEL_2
      when "CUSTOM_LABEL_3"
        CUSTOM_LABEL_3
      when "CUSTOM_LABEL_4"
        CUSTOM_LABEL_4
      when "MATERIAL"
        MATERIAL
      when "PATTERN"
        PATTERN
      when "COLOR"
        COLOR
      when "BRAND"
        BRAND
      when "GTIN"
        GTIN
      when "MPN"
        MPN
      when "IOS_DEEP_LINK"
        IOS_DEEP_LINK
      when "ANDROID_DEEP_LINK"
        ANDROID_DEEP_LINK
      when "FREE_SHIPPING_LABEL"
        FREE_SHIPPING_LABEL
      when "FREE_SHIPPING_LIMIT"
        FREE_SHIPPING_LIMIT
      when "AVG_REVIEW_RATING"
        AVG_REVIEW_RATING
      when "NUM_RATINGS"
        NUM_RATINGS
      when "NUM_REVIEWS"
        NUM_REVIEWS
      when "ALT_TEXT"
        ALT_TEXT
      when "VARIANT_NAMES"
        VARIANT_NAMES
      when "VARIANT_VALUES"
        VARIANT_VALUES
      when "MIN_AD_PRICE"
        MIN_AD_PRICE
      when "SHIPPING_WIDTH"
        SHIPPING_WIDTH
      when "SHIPPING_HEIGHT"
        SHIPPING_HEIGHT
      when "null"
        NULL
      else
        raise "Invalid ENUM value #{value} for class #NullableCatalogsItemFieldType"
      end
    end
  end
end