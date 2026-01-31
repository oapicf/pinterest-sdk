require 'json'


MyApp.add_route('GET', '/v5/ad_accounts/{ad_account_id}/conversion_eqs', {
  "resourcePath" => "/ConversionEqs",
  "summary" => "Get event quality score (EQS)",
  "nickname" => "conversion_eqs/list",
  "responseClass" => "Array<EventQualityScore>",
  "endpoint" => "/ad_accounts/{ad_account_id}/conversion_eqs",
  "notes" => "Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.",
  "parameters" => [
    {
      "name" => "lookback_period",
      "description" => "Lookback window (number of days).",
      "dataType" => "LookbackPeriodOptions",
      "allowableValues" => "[1d, 14d]",
      "paramType" => "query",
    },
    {
      "name" => "source_platform",
      "description" => "Source platform of event.",
      "dataType" => "SourcePlatformOptions",
      "allowableValues" => "[WEB, MOBILE, MOBILE_ANDROID, MOBILE_IOS, OFFLINE, PINTEREST_WEB, PINTEREST_ANDROID, PINTEREST_IOS, POINT_OF_SALE]",
      "paramType" => "query",
    },
    {
      "name" => "ingestion_source",
      "description" => "Ingestion source of event.",
      "dataType" => "IngestionSourceOptions",
      "allowableValues" => "[TAG, MMP, FILE_UPLOAD, CONVERSIONS_API, NATIVE]",
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

