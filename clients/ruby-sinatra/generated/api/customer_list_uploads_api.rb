require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads', {
  "resourcePath" => "/CustomerListUploads",
  "summary" => "Create customer list upload",
  "nickname" => "customer_list_uploads/create",
  "responseClass" => "CustomerListUploadCreateResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads",
  "notes" => "Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "customer_list_id",
      "description" => "Customer list ID.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
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
  "responseClass" => "CustomerListUpload",
  "endpoint" => "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}",
  "notes" => "Get the metadata for a given upload by its ID.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "customer_list_id",
      "description" => "Customer list ID.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "customer_list_upload_id",
      "description" => "Customer List Upload ID.",
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
  "responseClass" => "CustomerListUpload",
  "endpoint" => "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run",
  "notes" => "Begin processing a customer list upload.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "customer_list_id",
      "description" => "Customer list ID.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "customer_list_upload_id",
      "description" => "Customer List Upload ID.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

