require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/labels/{label_id}/apply', {
  "resourcePath" => "/Labels",
  "summary" => "Apply label to entity",
  "nickname" => "labels/apply",
  "responseClass" => "LabeledEntities",
  "endpoint" => "/ad_accounts/{ad_account_id}/labels/{label_id}/apply",
  "notes" => "  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "label_id",
      "description" => "Label ID.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "LabeledEntitiesCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/labels', {
  "resourcePath" => "/Labels",
  "summary" => "Create labels",
  "nickname" => "labels/create",
  "responseClass" => "LabelsResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/labels",
  "notes" => "[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.",
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
      "dataType" => "LabelCreateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/labels', {
  "resourcePath" => "/Labels",
  "summary" => "List labels",
  "nickname" => "labels/list",
  "responseClass" => "labels_list_200_response",
  "endpoint" => "/ad_accounts/{ad_account_id}/labels",
  "notes" => "[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.",
  "parameters" => [
    {
      "name" => "campaign_ids",
      "description" => "List of Campaign Ids to use to filter the results.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "label_ids",
      "description" => "List of Label Ids to use to filter the results.",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "entity_statuses",
      "description" => "Label entity status",
      "dataType" => "Array<QueryLabelEntityStatusesItems>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "label_types",
      "description" => "Label type.",
      "dataType" => "Array<QueryLabelTypesItems>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
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


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/labels/{label_id}/remove', {
  "resourcePath" => "/Labels",
  "summary" => "Remove label from entities",
  "nickname" => "labels/remove",
  "responseClass" => "LabeledEntities",
  "endpoint" => "/ad_accounts/{ad_account_id}/labels/{label_id}/remove",
  "notes" => "  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "label_id",
      "description" => "Label ID.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "LabeledEntitiesCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/v5/ad_accounts/{ad_account_id}/labels', {
  "resourcePath" => "/Labels",
  "summary" => "Update labels",
  "nickname" => "labels/update",
  "responseClass" => "LabelsResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/labels",
  "notes" => "[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.",
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
      "dataType" => "LabelUpdateRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

