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
  class Granularity
    TOTAL = "TOTAL"
  
    DAY = "DAY"
  
    HOUR = "HOUR"
  
    WEEK = "WEEK"
  
    MONTH = "MONTH"
   
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
      when "TOTAL"
        TOTAL
      when "DAY"
        DAY
      when "HOUR"
        HOUR
      when "WEEK"
        WEEK
      when "MONTH"
        MONTH
      else
        raise "Invalid ENUM value #{value} for class #Granularity"
      end
    end
  end
end
