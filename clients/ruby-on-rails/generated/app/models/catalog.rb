=begin
Pinterest REST API

Pinterest's REST API

The version of the OpenAPI document: 5.14.0
Contact: blah+oapicf@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class Catalog < ApplicationRecord
  validates_presence_of :created_at
  validates_presence_of :id
  validates_presence_of :updated_at
  validates_presence_of :name
  validates_presence_of :catalog_type

end
