=begin
Pinterest REST API

Pinterest's REST API

The version of the OpenAPI document: 5.14.0
Contact: blah+oapicf@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class ItemAttributes < ApplicationRecord

  serialize :variant_names, Array
  serialize :variant_values, Array
  serialize :additional_image_link, Array
  serialize :image_link, Array
end
