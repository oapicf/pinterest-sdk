require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/leads_export', {
  "resourcePath" => "/LeadsExport",
  "summary" => "Create a request to export leads collected from a lead ad",
  "nickname" => "leads_export/create",
  "responseClass" => "LeadsExports",
  "endpoint" => "/ad_accounts/{ad_account_id}/leads_export",
  "notes" => "**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a `leads_export_id` token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).",
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
      "dataType" => "LeadsExportsCreate",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}', {
  "resourcePath" => "/LeadsExport",
  "summary" => "Get the lead export from the lead export create call",
  "nickname" => "leads_export/get",
  "responseClass" => "LeadsExportResponseData",
  "endpoint" => "/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}",
  "notes" => "**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).",
  "parameters" => [
    {
      "name" => "ad_account_id",
      "description" => "Unique identifier of an ad account.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "leads_export_id",
      "description" => "lead_export_id token returned from the create a lead export endpoint",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

