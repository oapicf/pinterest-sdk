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
  class GetAudiencesOrderBy
    NONE = "NONE"
  
    ID = "ID"
  
    SIZE = "SIZE"
  
    CREATION_DATE = "CREATION_DATE"
  
    UPDATED_TIME = "UPDATED_TIME"
  
    NAME = "NAME"
  
    STATUS = "STATUS"
  
    TYPE = "TYPE"
   
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
      when "NONE"
        NONE
      when "ID"
        ID
      when "SIZE"
        SIZE
      when "CREATION_DATE"
        CREATION_DATE
      when "UPDATED_TIME"
        UPDATED_TIME
      when "NAME"
        NAME
      when "STATUS"
        STATUS
      when "TYPE"
        TYPE
      else
        raise "Invalid ENUM value #{value} for class #GetAudiencesOrderBy"
      end
    end
  end
end
