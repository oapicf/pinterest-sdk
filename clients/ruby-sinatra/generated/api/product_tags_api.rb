require 'json'


MyApp.add_route('POST', '/v5/pins/{pin_id}/product_tags', {
  "resourcePath" => "/ProductTags",
  "summary" => "Add product tags to pin",
  "nickname" => "product_tags/bulk_add",
  "responseClass" => "ProductTagsResponse",
  "endpoint" => "/pins/{pin_id}/product_tags",
  "notes" => "Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.",
  "parameters" => [
    {
      "name" => "pin_id",
      "description" => "Unique identifier of the hero pin that will receive product tags.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "ProductTagsBulkAddRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v5/pins/{pin_id}/product_tags/bulk-delete', {
  "resourcePath" => "/ProductTags",
  "summary" => "Delete product tags from pin",
  "nickname" => "product_tags/bulk_delete",
  "responseClass" => "void",
  "endpoint" => "/pins/{pin_id}/product_tags/bulk-delete",
  "notes" => "Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.",
  "parameters" => [
    {
      "name" => "pin_id",
      "description" => "Unique identifier of the hero pin that will receive product tags.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "ProductTagsBulkDeleteRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/pins/{pin_id}/product_tags', {
  "resourcePath" => "/ProductTags",
  "summary" => "Get product tags for pin",
  "nickname" => "product_tags/list",
  "responseClass" => "ProductTagsResponse",
  "endpoint" => "/pins/{pin_id}/product_tags",
  "notes" => "Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.",
  "parameters" => [
    {
      "name" => "pin_id",
      "description" => "Unique identifier of the hero pin that will receive product tags.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

