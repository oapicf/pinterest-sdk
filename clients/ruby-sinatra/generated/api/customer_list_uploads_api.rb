require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads', {
  "resourcePath" => "/CustomerListUploads",
  "summary" => "Create customer list upload",
  "nickname" => "customer_list_uploads/create",
  "responseClass" => "CustomerListUploadCreateResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads",
  "notes" => "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "customer_list_id",
      "description" => "Unique identifier of a customer list",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "Parameters to create a customer list upload request",
      "dataType" => "CustomerListUploadCreateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}', {
  "resourcePath" => "/CustomerListUploads",
  "summary" => "Get customer list upload",
  "nickname" => "customer_list_uploads/get",
  "responseClass" => "CustomerListUploadResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}",
  "notes" => "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "customer_list_id",
      "description" => "Unique identifier of a customer list",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "customer_list_upload_id",
      "description" => "Unique identifier of a customer list upload",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run', {
  "resourcePath" => "/CustomerListUploads",
  "summary" => "Run customer list upload",
  "nickname" => "customer_list_uploads/run",
  "responseClass" => "CustomerListUploadResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run",
  "notes" => "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "customer_list_id",
      "description" => "Unique identifier of a customer list",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "customer_list_upload_id",
      "description" => "Unique identifier of a customer list upload",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

