# #Pinterest REST API
#
##Pinterest's REST API
#
#The version of the OpenAPI document: 5.14.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.9.0
#

require "../spec_helper"
require "json"
require "time"

# Unit tests for OpenAPIClient::AdsCreditDiscountsResponse
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OpenAPIClient::AdsCreditDiscountsResponse do

  describe "test an instance of AdsCreditDiscountsResponse" do
    it "should create an instance of AdsCreditDiscountsResponse" do
      #instance = OpenAPIClient::AdsCreditDiscountsResponse.new
      #expect(instance).to be_instance_of(OpenAPIClient::AdsCreditDiscountsResponse)
    end
  end
  describe "test attribute 'active'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  describe "test attribute 'advertiser_id'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  describe "test attribute 'discount_type'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
      # validator = Petstore::EnumTest::EnumAttributeValidator.new("String", ["COUPON", "CREDIT", "COUPON_APPLIED", "CREDIT_APPLIED", "MARKETING_OFFER_CREDIT", "MARKETING_OFFER_CREDIT_APPLIED", "GOODWILL_CREDIT", "GOODWILL_CREDIT_APPLIED", "INTERNAL_CREDIT", "INTERNAL_CREDIT_APPLIED", "PREPAID_CREDIT", "PREPAID_CREDIT_APPLIED", "SALES_INCENTIVE_CREDIT", "SALES_INCENTIVE_CREDIT_APPLIED", "CREDIT_EXPIRED", "FUTURE_CREDIT", "REFERRAL_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT", "INVOICE_SALES_INCENTIVE_CREDIT_APPLIED", "PREPAID_CREDIT_REFUND"])
      # validator.allowable_values.each do |value|
      #   expect { instance.discount_type = value }.not_to raise_error
      # end
    end
  end

  describe "test attribute 'discount_in_micro_currency'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  describe "test attribute 'discount_currency'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  describe "test attribute 'title'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  describe "test attribute 'remaining_discount_in_micro_currency'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end
