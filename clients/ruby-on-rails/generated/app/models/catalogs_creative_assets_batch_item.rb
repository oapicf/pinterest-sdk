=begin
Pinterest REST API

Pinterest's REST API

The version of the OpenAPI document: 5.14.0
Contact: blah+oapicf@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class CatalogsCreativeAssetsBatchItem < ApplicationRecord
  validates_presence_of :creative_assets_id
  validates_presence_of :operation
  validates_presence_of :attributes

end
