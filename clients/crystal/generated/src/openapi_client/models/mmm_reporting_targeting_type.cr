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
  class MMMReportingTargetingType
    APPTYPE = "APPTYPE"
  
    COUNTRY = "COUNTRY"
  
    CREATIVE_TYPE = "CREATIVE_TYPE"
  
    GENDER = "GENDER"
  
    LOCATION = "LOCATION"
   
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
      when "APPTYPE"
        APPTYPE
      when "COUNTRY"
        COUNTRY
      when "CREATIVE_TYPE"
        CREATIVE_TYPE
      when "GENDER"
        GENDER
      when "LOCATION"
        LOCATION
      else
        raise "Invalid ENUM value #{value} for class #MMMReportingTargetingType"
      end
    end
  end
end
