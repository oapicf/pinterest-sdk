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
  class MediaUploadStatus
    REGISTERED = "registered"
  
    PROCESSING = "processing"
  
    SUCCEEDED = "succeeded"
  
    FAILED = "failed"
   
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
      when "registered"
        REGISTERED
      when "processing"
        PROCESSING
      when "succeeded"
        SUCCEEDED
      when "failed"
        FAILED
      else
        raise "Invalid ENUM value #{value} for class #MediaUploadStatus"
      end
    end
  end
end