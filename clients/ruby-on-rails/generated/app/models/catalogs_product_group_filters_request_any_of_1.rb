=begin
Pinterest REST API

Pinterest's REST API

The version of the OpenAPI document: 5.14.0
Contact: blah+oapicf@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class CatalogsProductGroupFiltersRequestAnyOf1 < ApplicationRecord
  validates_presence_of :all_of

  serialize :all_of, Array
end
