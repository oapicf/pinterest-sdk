=begin
Pinterest REST API

Pinterest's REST API

The version of the OpenAPI document: 5.14.0
Contact: blah+oapicf@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class DeletePartnersRequest < ApplicationRecord
  validates_presence_of :partner_ids

  serialize :partner_ids, Array
end
