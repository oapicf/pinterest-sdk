=begin
Pinterest REST API

Pinterest's REST API

The version of the OpenAPI document: 5.14.0
Contact: blah+oapicf@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class CatalogsHotelFeed < ApplicationRecord
  validates_presence_of :created_at
  validates_presence_of :id
  validates_presence_of :updated_at
  validates_presence_of :name
  validates_presence_of :format
  validates_presence_of :catalog_type
  validates_presence_of :credentials
  validates_presence_of :location
  validates_presence_of :preferred_processing_schedule
  validates_presence_of :status
  validates_presence_of :default_currency
  validates_presence_of :default_locale
  validates_presence_of :catalog_id

end
