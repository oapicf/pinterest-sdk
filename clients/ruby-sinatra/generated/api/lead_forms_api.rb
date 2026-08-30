require 'json'


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}', {
  "resourcePath" => "/LeadForms",
  "summary" => "Get lead form by id",
  "nickname" => "lead_form/get",
  "responseClass" => "LeadForm",
  "endpoint" => "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}",
  "notes" => "**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).",
  "parameters" => [
    {
      "name" => "lead_form_id",
      "description" => "The ID of this lead form",
      "dataType" => "String",
      "paramType" => "path",
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


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test', {
  "resourcePath" => "/LeadForms",
  "summary" => "Create lead form test data",
  "nickname" => "lead_form_test/create",
  "responseClass" => "LeadFormTest",
  "endpoint" => "/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test",
  "notes" => "Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "lead_form_id",
      "description" => "Unique identifier of a lead form.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "LeadFormTestCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/lead_forms', {
  "resourcePath" => "/LeadForms",
  "summary" => "Create lead forms",
  "nickname" => "lead_forms/create",
  "responseClass" => "lead_forms_create_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/lead_forms",
  "notes" => "**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Array<LeadFormCreate>",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/lead_forms', {
  "resourcePath" => "/LeadForms",
  "summary" => "List lead forms",
  "nickname" => "lead_forms/list",
  "responseClass" => "lead_forms_list_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/lead_forms",
  "notes" => "**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).",
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
      "description" => "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "25",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.",
      "dataType" => "PinterestLibPaginationOrder",
      "allowableValues" => "[ASCENDING, DESCENDING]",
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


MyApp.add_route('PATCH', '/v5/ad_accounts/{ad_account_id}/lead_forms', {
  "resourcePath" => "/LeadForms",
  "summary" => "Update lead forms",
  "nickname" => "lead_forms/update",
  "responseClass" => "lead_forms_create_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/lead_forms",
  "notes" => "**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "Array<LeadFormBatchUpdate>",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

