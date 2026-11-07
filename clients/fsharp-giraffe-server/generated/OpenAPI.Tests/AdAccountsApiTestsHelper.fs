namespace OpenAPI.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open TestHelper
open OpenAPI.AdAccountsApiHandler
open OpenAPI.AdAccountsApiHandlerParams

module AdAccountsApiHandlerTestsHelper =

  ()

  ()


  let mutable AdAccountsCreateExamples = Map.empty
  let mutable AdAccountsCreateBody = ""

  AdAccountsCreateBody <- WebUtility.HtmlDecode "{
  &quot;country&quot; : &quot;AD&quot;,
  &quot;currency&quot; : &quot;UNK&quot;,
  &quot;name&quot; : &quot;name&quot;,
  &quot;owner_user_id&quot; : &quot;owner_user_id&quot;,
  &quot;time_zone&quot; : &quot;America/Los_Angeles&quot;
}"
  AdAccountsCreateExamples <- AdAccountsCreateExamples.Add("application/json", AdAccountsCreateBody)

  let getAdAccountsCreateExample mediaType =
    AdAccountsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()


  let mutable AnalyticsCreateConversionProductReportExamples = Map.empty
  let mutable AnalyticsCreateConversionProductReportBody = ""

  AnalyticsCreateConversionProductReportBody <- WebUtility.HtmlDecode "{
  &quot;ad_group_ids&quot; : [ &quot;12345678&quot; ],
  &quot;campaign_ids&quot; : [ &quot;12345678&quot; ],
  &quot;campaign_objective_types&quot; : [ &quot;AWARENESS&quot;, &quot;AWARENESS&quot;, &quot;AWARENESS&quot;, &quot;AWARENESS&quot;, &quot;AWARENESS&quot; ],
  &quot;click_window_days&quot; : &quot;&quot;,
  &quot;columns&quot; : [ &quot;AD_GROUP_ID&quot;, &quot;AD_GROUP_ID&quot; ],
  &quot;conversion_product_attribution_type&quot; : &quot;&quot;,
  &quot;conversion_product_breakdown&quot; : &quot;&quot;,
  &quot;conversion_report_time&quot; : &quot;&quot;,
  &quot;end_date&quot; : &quot;2024-04-23&quot;,
  &quot;granularity&quot; : &quot;&quot;,
  &quot;level&quot; : &quot;&quot;,
  &quot;product_sku_ids&quot; : [ &quot;WBC45678&quot;, &quot;WBC45679&quot; ],
  &quot;report_name&quot; : &quot;report_name&quot;,
  &quot;start_date&quot; : &quot;2024-04-17&quot;,
  &quot;view_window_days&quot; : &quot;&quot;
}"
  AnalyticsCreateConversionProductReportExamples <- AnalyticsCreateConversionProductReportExamples.Add("application/json", AnalyticsCreateConversionProductReportBody)

  let getAnalyticsCreateConversionProductReportExample mediaType =
    AnalyticsCreateConversionProductReportExamples.[mediaType]
      |> getConverter mediaType

  let mutable AnalyticsCreateMmmReportExamples = Map.empty
  let mutable AnalyticsCreateMmmReportBody = ""

  AnalyticsCreateMmmReportBody <- WebUtility.HtmlDecode "{
  &quot;advertiser_ids&quot; : [ &quot;advertiser_ids&quot;, &quot;advertiser_ids&quot; ],
  &quot;columns&quot; : [ &quot;SPEND_IN_DOLLAR&quot;, &quot;SPEND_IN_DOLLAR&quot; ],
  &quot;countries&quot; : [ &quot;US&quot;, &quot;US&quot; ],
  &quot;custom_column_ids&quot; : [ &quot;custom_column_ids&quot;, &quot;custom_column_ids&quot;, &quot;custom_column_ids&quot;, &quot;custom_column_ids&quot;, &quot;custom_column_ids&quot; ],
  &quot;end_date&quot; : &quot;2020-12-20&quot;,
  &quot;granularity&quot; : &quot;&quot;,
  &quot;level&quot; : &quot;&quot;,
  &quot;report_name&quot; : &quot;report_name&quot;,
  &quot;start_date&quot; : &quot;2020-12-20&quot;,
  &quot;targeting_types&quot; : [ &quot;GENDER&quot; ]
}"
  AnalyticsCreateMmmReportExamples <- AnalyticsCreateMmmReportExamples.Add("application/json", AnalyticsCreateMmmReportBody)

  let getAnalyticsCreateMmmReportExample mediaType =
    AnalyticsCreateMmmReportExamples.[mediaType]
      |> getConverter mediaType

  let mutable AnalyticsCreateReportExamples = Map.empty
  let mutable AnalyticsCreateReportBody = ""

  AnalyticsCreateReportBody <- WebUtility.HtmlDecode "{
  &quot;ad_group_ids&quot; : [ null, null, null, null, null ],
  &quot;ad_group_statuses&quot; : [ &quot;RUNNING&quot;, &quot;RUNNING&quot;, &quot;RUNNING&quot;, &quot;RUNNING&quot;, &quot;RUNNING&quot; ],
  &quot;ad_ids&quot; : [ null, null, null, null, null ],
  &quot;ad_statuses&quot; : [ &quot;APPROVED&quot;, &quot;APPROVED&quot;, &quot;APPROVED&quot;, &quot;APPROVED&quot;, &quot;APPROVED&quot; ],
  &quot;attribution_types&quot; : [ &quot;INDIVIDUAL&quot;, &quot;INDIVIDUAL&quot; ],
  &quot;campaign_brand_label&quot; : &quot;campaign_brand_label&quot;,
  &quot;campaign_custom_label&quot; : &quot;campaign_custom_label&quot;,
  &quot;campaign_ids&quot; : [ null, null, null, null, null ],
  &quot;campaign_objective_types&quot; : [ &quot;AWARENESS&quot;, &quot;AWARENESS&quot;, &quot;AWARENESS&quot;, &quot;AWARENESS&quot;, &quot;AWARENESS&quot; ],
  &quot;campaign_statuses&quot; : [ &quot;RUNNING&quot;, &quot;RUNNING&quot;, &quot;RUNNING&quot;, &quot;RUNNING&quot;, &quot;RUNNING&quot; ],
  &quot;click_window_days&quot; : &quot;&quot;,
  &quot;columns&quot; : [ &quot;SPEND_IN_MICRO_DOLLAR&quot;, &quot;SPEND_IN_MICRO_DOLLAR&quot; ],
  &quot;combine_targeting_types&quot; : false,
  &quot;conversion_report_time&quot; : &quot;&quot;,
  &quot;custom_conversion_event_metrics&quot; : [ {
    &quot;custom_event_metrics_type&quot; : &quot;ADE_COST_PER_ACTION&quot;,
    &quot;custom_event_name&quot; : &quot;custom_event_name&quot;
  }, {
    &quot;custom_event_metrics_type&quot; : &quot;ADE_COST_PER_ACTION&quot;,
    &quot;custom_event_name&quot; : &quot;custom_event_name&quot;
  } ],
  &quot;end_date&quot; : &quot;end_date&quot;,
  &quot;end_hour&quot; : 1,
  &quot;engagement_window_days&quot; : &quot;&quot;,
  &quot;granularity&quot; : &quot;&quot;,
  &quot;level&quot; : &quot;&quot;,
  &quot;metrics_filters&quot; : [ {
    &quot;field&quot; : &quot;SPEND_IN_DOLLAR&quot;,
    &quot;operator&quot; : &quot;LESS_THAN&quot;,
    &quot;values&quot; : [ 6.027456183070403, 6.027456183070403 ]
  }, {
    &quot;field&quot; : &quot;SPEND_IN_DOLLAR&quot;,
    &quot;operator&quot; : &quot;LESS_THAN&quot;,
    &quot;values&quot; : [ 6.027456183070403, 6.027456183070403 ]
  } ],
  &quot;primary_sort&quot; : &quot;&quot;,
  &quot;product_group_ids&quot; : [ null, null, null, null, null ],
  &quot;product_group_statuses&quot; : [ &quot;RUNNING&quot;, &quot;RUNNING&quot;, &quot;RUNNING&quot;, &quot;RUNNING&quot;, &quot;RUNNING&quot; ],
  &quot;product_item_ids&quot; : [ null, null, null, null, null ],
  &quot;report_format&quot; : &quot;&quot;,
  &quot;reporting_timezone&quot; : &quot;&quot;,
  &quot;start_date&quot; : &quot;start_date&quot;,
  &quot;start_hour&quot; : 3,
  &quot;targeting_types&quot; : [ &quot;KEYWORD&quot;, &quot;KEYWORD&quot;, &quot;KEYWORD&quot;, &quot;KEYWORD&quot;, &quot;KEYWORD&quot; ],
  &quot;view_window_days&quot; : &quot;&quot;
}"
  AnalyticsCreateReportExamples <- AnalyticsCreateReportExamples.Add("application/json", AnalyticsCreateReportBody)

  let getAnalyticsCreateReportExample mediaType =
    AnalyticsCreateReportExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()

  ()

  ()

