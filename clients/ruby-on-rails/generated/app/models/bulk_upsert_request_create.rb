=begin
Pinterest REST API

Pinterest's REST API

The version of the OpenAPI document: 5.14.0
Contact: blah+oapicf@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class BulkUpsertRequestCreate < ApplicationRecord

  serialize :campaigns, Array
  serialize :ad_groups, Array
  serialize :ads, Array
  serialize :product_groups, Array
  serialize :keywords, Array
end
