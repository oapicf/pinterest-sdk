=begin
Pinterest REST API

Pinterest's REST API

The version of the OpenAPI document: 5.14.0
Contact: blah+oapicf@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class AdCommon < ApplicationRecord

  serialize :carousel_android_deep_links, Array
  serialize :carousel_destination_urls, Array
  serialize :carousel_ios_deep_links, Array
end
