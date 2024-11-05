require 'json'


MyApp.add_route('GET', '/v5/integrations/{id}', {
  "resourcePath" => "/Integrations",
  "summary" => "Get integration metadata",
  "nickname" => "integrations/get_by_id",
  "responseClass" => "IntegrationRecord",
  "endpoint" => "/integrations/{id}",
  "notes" => "Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.",
  "parameters" => [
    {
      "name" => "id",
      "description" => "Integration ID.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/integrations', {
  "resourcePath" => "/Integrations",
  "summary" => "Get integration metadata list",
  "nickname" => "integrations/get_list",
  "responseClass" => "integrations_get_list_200_response",
  "endpoint" => "/integrations",
  "notes" => "Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.",
  "parameters" => [
    {
      "name" => "bookmark",
      "description" => "Cursor used to fetch the next page of items",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "page_size",
      "description" => "Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v5/integrations/commerce/{external_business_id}', {
  "resourcePath" => "/Integrations",
  "summary" => "Delete commerce integration",
  "nickname" => "integrations_commerce/del",
  "responseClass" => "void",
  "endpoint" => "/integrations/commerce/{external_business_id}",
  "notes" => "Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.",
  "parameters" => [
    {
      "name" => "external_business_id",
      "description" => "External business ID for the integration.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/integrations/commerce/{external_business_id}', {
  "resourcePath" => "/Integrations",
  "summary" => "Get commerce integration",
  "nickname" => "integrations_commerce/get",
  "responseClass" => "IntegrationMetadata",
  "endpoint" => "/integrations/commerce/{external_business_id}",
  "notes" => "Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.",
  "parameters" => [
    {
      "name" => "external_business_id",
      "description" => "External business ID for the integration.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/integrations/commerce/{external_business_id}', {
  "resourcePath" => "/Integrations",
  "summary" => "Update commerce integration",
  "nickname" => "integrations_commerce/patch",
  "responseClass" => "IntegrationMetadata",
  "endpoint" => "/integrations/commerce/{external_business_id}",
  "notes" => "Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.",
  "parameters" => [
    {
      "name" => "external_business_id",
      "description" => "External business ID for the integration.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Parameters to get create/update the Integration Metadata",
      "dataType" => "IntegrationRequestPatch",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v5/integrations/commerce', {
  "resourcePath" => "/Integrations",
  "summary" => "Create commerce integration",
  "nickname" => "integrations_commerce/post",
  "responseClass" => "IntegrationMetadata",
  "endpoint" => "/integrations/commerce",
  "notes" => "Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.",
  "parameters" => [
    {
      "name" => "body",
      "description" => "Parameters to get create/update the Integration Metadata",
      "dataType" => "IntegrationRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v5/integrations/logs', {
  "resourcePath" => "/Integrations",
  "summary" => "Receives batched logs from integration applications.",
  "nickname" => "integrations_logs/post",
  "responseClass" => "IntegrationLogsSuccessResponse",
  "endpoint" => "/integrations/logs",
  "notes" => "This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.",
  "parameters" => [
    {
      "name" => "body",
      "description" => "Ingest log information from external integration application.",
      "dataType" => "IntegrationLogsRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

