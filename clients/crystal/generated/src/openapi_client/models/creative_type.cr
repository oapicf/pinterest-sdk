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
  class CreativeType
    REGULAR = "REGULAR"
  
    VIDEO = "VIDEO"
  
    SHOPPING = "SHOPPING"
  
    CAROUSEL = "CAROUSEL"
  
    MAX_VIDEO = "MAX_VIDEO"
  
    SHOP_THE_PIN = "SHOP_THE_PIN"
  
    COLLECTION = "COLLECTION"
  
    IDEA = "IDEA"
  
    SHOWCASE = "SHOWCASE"
  
    QUIZ = "QUIZ"
   
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
      when "REGULAR"
        REGULAR
      when "VIDEO"
        VIDEO
      when "SHOPPING"
        SHOPPING
      when "CAROUSEL"
        CAROUSEL
      when "MAX_VIDEO"
        MAX_VIDEO
      when "SHOP_THE_PIN"
        SHOP_THE_PIN
      when "COLLECTION"
        COLLECTION
      when "IDEA"
        IDEA
      when "SHOWCASE"
        SHOWCASE
      when "QUIZ"
        QUIZ
      else
        raise "Invalid ENUM value #{value} for class #CreativeType"
      end
    end
  end
end