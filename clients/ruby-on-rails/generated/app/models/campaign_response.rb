=begin
Pinterest REST API

Pinterest's REST API

The version of the OpenAPI document: 5.3.0
Contact: pinterest-api@pinterest.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class CampaignResponse < ApplicationRecord
  validates_presence_of :id
  validates_presence_of :ad_account_id

  serialize :tracking_urls, Hash
end