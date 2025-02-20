# #Pinterest REST API
#
##Pinterest's REST API
#
#The version of the OpenAPI document: 5.14.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.9.0
#

require "big"
require "json"
require "time"

module OpenAPIClient
  class UpdateMaskFieldType
    AD_LINK = "ad_link"
  
    ADULT = "adult"
  
    AGE_GROUP = "age_group"
  
    AVAILABILITY = "availability"
  
    AVERAGE_REVIEW_RATING = "average_review_rating"
  
    BRAND = "brand"
  
    CHECKOUT_ENABLED = "checkout_enabled"
  
    COLOR = "color"
  
    CONDITION = "condition"
  
    CUSTOM_LABEL_0 = "custom_label_0"
  
    CUSTOM_LABEL_1 = "custom_label_1"
  
    CUSTOM_LABEL_2 = "custom_label_2"
  
    CUSTOM_LABEL_3 = "custom_label_3"
  
    CUSTOM_LABEL_4 = "custom_label_4"
  
    DESCRIPTION = "description"
  
    FREE_SHIPPING_LABEL = "free_shipping_label"
  
    FREE_SHIPPING_LIMIT = "free_shipping_limit"
  
    GENDER = "gender"
  
    GOOGLE_PRODUCT_CATEGORY = "google_product_category"
  
    GTIN = "gtin"
  
    ITEM_GROUP_ID = "item_group_id"
  
    LAST_UPDATED_TIME = "last_updated_time"
  
    LINK = "link"
  
    MATERIAL = "material"
  
    MIN_AD_PRICE = "min_ad_price"
  
    MPN = "mpn"
  
    NUMBER_OF_RATINGS = "number_of_ratings"
  
    NUMBER_OF_REVIEWS = "number_of_reviews"
  
    PATTERN = "pattern"
  
    PRICE = "price"
  
    PRODUCT_TYPE = "product_type"
  
    SALE_PRICE = "sale_price"
  
    SHIPPING = "shipping"
  
    SHIPPING_HEIGHT = "shipping_height"
  
    SHIPPING_WEIGHT = "shipping_weight"
  
    SHIPPING_WIDTH = "shipping_width"
  
    SIZE = "size"
  
    SIZE_SYSTEM = "size_system"
  
    SIZE_TYPE = "size_type"
  
    TAX = "tax"
  
    TITLE = "title"
  
    VARIANT_NAMES = "variant_names"
  
    VARIANT_VALUES = "variant_values"
   
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
      when "ad_link"
        AD_LINK
      when "adult"
        ADULT
      when "age_group"
        AGE_GROUP
      when "availability"
        AVAILABILITY
      when "average_review_rating"
        AVERAGE_REVIEW_RATING
      when "brand"
        BRAND
      when "checkout_enabled"
        CHECKOUT_ENABLED
      when "color"
        COLOR
      when "condition"
        CONDITION
      when "custom_label_0"
        CUSTOM_LABEL_0
      when "custom_label_1"
        CUSTOM_LABEL_1
      when "custom_label_2"
        CUSTOM_LABEL_2
      when "custom_label_3"
        CUSTOM_LABEL_3
      when "custom_label_4"
        CUSTOM_LABEL_4
      when "description"
        DESCRIPTION
      when "free_shipping_label"
        FREE_SHIPPING_LABEL
      when "free_shipping_limit"
        FREE_SHIPPING_LIMIT
      when "gender"
        GENDER
      when "google_product_category"
        GOOGLE_PRODUCT_CATEGORY
      when "gtin"
        GTIN
      when "item_group_id"
        ITEM_GROUP_ID
      when "last_updated_time"
        LAST_UPDATED_TIME
      when "link"
        LINK
      when "material"
        MATERIAL
      when "min_ad_price"
        MIN_AD_PRICE
      when "mpn"
        MPN
      when "number_of_ratings"
        NUMBER_OF_RATINGS
      when "number_of_reviews"
        NUMBER_OF_REVIEWS
      when "pattern"
        PATTERN
      when "price"
        PRICE
      when "product_type"
        PRODUCT_TYPE
      when "sale_price"
        SALE_PRICE
      when "shipping"
        SHIPPING
      when "shipping_height"
        SHIPPING_HEIGHT
      when "shipping_weight"
        SHIPPING_WEIGHT
      when "shipping_width"
        SHIPPING_WIDTH
      when "size"
        SIZE
      when "size_system"
        SIZE_SYSTEM
      when "size_type"
        SIZE_TYPE
      when "tax"
        TAX
      when "title"
        TITLE
      when "variant_names"
        VARIANT_NAMES
      when "variant_values"
        VARIANT_VALUES
      else
        raise "Invalid ENUM value #{value} for class #UpdateMaskFieldType"
      end
    end
  end
end
