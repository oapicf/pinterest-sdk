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
  class MMMReportingColumn
    SPEND_IN_DOLLAR = "SPEND_IN_DOLLAR"
  
    SPEND_IN_MICRO_DOLLAR = "SPEND_IN_MICRO_DOLLAR"
  
    ECPC_IN_DOLLAR = "ECPC_IN_DOLLAR"
  
    ECTR = "ECTR"
  
    CAMPAIGN_NAME = "CAMPAIGN_NAME"
  
    TOTAL_ENGAGEMENT = "TOTAL_ENGAGEMENT"
  
    EENGAGEMENT_RATE = "EENGAGEMENT_RATE"
  
    ECPM_IN_DOLLAR = "ECPM_IN_DOLLAR"
  
    CAMPAIGN_ID = "CAMPAIGN_ID"
  
    ADVERTISER_ID = "ADVERTISER_ID"
  
    AD_GROUP_ID = "AD_GROUP_ID"
  
    AD_GROUP_NAME = "AD_GROUP_NAME"
  
    CLICKTHROUGH_1 = "CLICKTHROUGH_1"
  
    IMPRESSION_1 = "IMPRESSION_1"
  
    CLICKTHROUGH_2 = "CLICKTHROUGH_2"
  
    IMPRESSION_2 = "IMPRESSION_2"
  
    TOTAL_CLICKTHROUGH = "TOTAL_CLICKTHROUGH"
  
    TOTAL_IMPRESSION = "TOTAL_IMPRESSION"
  
    ADVERTISER_NAME = "ADVERTISER_NAME"
  
    SPEND_ORDER_LINE_PAID_TYPE = "SPEND_ORDER_LINE_PAID_TYPE"
   
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
      when "SPEND_IN_DOLLAR"
        SPEND_IN_DOLLAR
      when "SPEND_IN_MICRO_DOLLAR"
        SPEND_IN_MICRO_DOLLAR
      when "ECPC_IN_DOLLAR"
        ECPC_IN_DOLLAR
      when "ECTR"
        ECTR
      when "CAMPAIGN_NAME"
        CAMPAIGN_NAME
      when "TOTAL_ENGAGEMENT"
        TOTAL_ENGAGEMENT
      when "EENGAGEMENT_RATE"
        EENGAGEMENT_RATE
      when "ECPM_IN_DOLLAR"
        ECPM_IN_DOLLAR
      when "CAMPAIGN_ID"
        CAMPAIGN_ID
      when "ADVERTISER_ID"
        ADVERTISER_ID
      when "AD_GROUP_ID"
        AD_GROUP_ID
      when "AD_GROUP_NAME"
        AD_GROUP_NAME
      when "CLICKTHROUGH_1"
        CLICKTHROUGH_1
      when "IMPRESSION_1"
        IMPRESSION_1
      when "CLICKTHROUGH_2"
        CLICKTHROUGH_2
      when "IMPRESSION_2"
        IMPRESSION_2
      when "TOTAL_CLICKTHROUGH"
        TOTAL_CLICKTHROUGH
      when "TOTAL_IMPRESSION"
        TOTAL_IMPRESSION
      when "ADVERTISER_NAME"
        ADVERTISER_NAME
      when "SPEND_ORDER_LINE_PAID_TYPE"
        SPEND_ORDER_LINE_PAID_TYPE
      else
        raise "Invalid ENUM value #{value} for class #MMMReportingColumn"
      end
    end
  end
end