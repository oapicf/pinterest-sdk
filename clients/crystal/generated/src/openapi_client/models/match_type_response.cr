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
  class MatchTypeResponse
    BROAD = "BROAD"
  
    PHRASE = "PHRASE"
  
    EXACT = "EXACT"
  
    EXACT_NEGATIVE = "EXACT_NEGATIVE"
  
    PHRASE_NEGATIVE = "PHRASE_NEGATIVE"
   
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
      when "BROAD"
        BROAD
      when "PHRASE"
        PHRASE
      when "EXACT"
        EXACT
      when "EXACT_NEGATIVE"
        EXACT_NEGATIVE
      when "PHRASE_NEGATIVE"
        PHRASE_NEGATIVE
      else
        raise "Invalid ENUM value #{value} for class #MatchTypeResponse"
      end
    end
  end
end
