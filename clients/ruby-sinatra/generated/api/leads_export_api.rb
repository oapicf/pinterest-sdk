require 'json'


MyApp.add_route('POST', '/v5/ad_accounts/{ad_account_id}/leads_export', {
  "resourcePath" => "/LeadsExport",
  "summary" => "Create a request to export leads collected from a lead ad",
  "nickname" => "leads_export/create",
  "responseClass" => "LeadsExportCreateResponse",
  "endpoint" => "/ad_accounts/{ad_account_id}/leads_export",
  "notes" => "<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.",
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
      "dataType" => "LeadsExportCreateRequest",
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
  "notes" => "<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.",
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

