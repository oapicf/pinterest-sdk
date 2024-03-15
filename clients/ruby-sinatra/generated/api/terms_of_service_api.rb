require 'json'


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/terms_of_service', {
  "resourcePath" => "/TermsOfService",
  "summary" => "Get terms of service",
  "nickname" => "terms_of_service/get",
  "responseClass" => "TermsOfService",
  "endpoint" => "/ad_accounts/{ad_account_id}/terms_of_service",
  "notes" => "Get the text of the terms of service and see whether the advertiser has accepted the terms of service.",
  "parameters" => [
    {
      "name" => "include_html",
      "description" => "Return HTML in TOS text.",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "tos_type",
      "description" => "Request type.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

