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
  &quot;country&quot; : &quot;US&quot;,
  &quot;owner_user_id&quot; : &quot;383791336903426391&quot;,
  &quot;name&quot; : &quot;ACME Tools&quot;
}"
  AdAccountsCreateExamples <- AdAccountsCreateExamples.Add("application/json", AdAccountsCreateBody)

  let getAdAccountsCreateExample mediaType =
    AdAccountsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()


  let mutable AnalyticsCreateMmmReportExamples = Map.empty
  let mutable AnalyticsCreateMmmReportBody = ""

  AnalyticsCreateMmmReportBody <- WebUtility.HtmlDecode "{
  &quot;end_date&quot; : &quot;2020-12-20&quot;,
  &quot;level&quot; : &quot;CAMPAIGN_TARGETING&quot;,
  &quot;granularity&quot; : &quot;DAY&quot;,
  &quot;columns&quot; : [ &quot;SPEND_IN_DOLLAR&quot;, &quot;SPEND_IN_DOLLAR&quot; ],
  &quot;report_name&quot; : &quot;report_name&quot;,
  &quot;targeting_types&quot; : [ &quot;GENDER&quot; ],
  &quot;start_date&quot; : &quot;2020-12-20&quot;
}"
  AnalyticsCreateMmmReportExamples <- AnalyticsCreateMmmReportExamples.Add("application/json", AnalyticsCreateMmmReportBody)

  let getAnalyticsCreateMmmReportExample mediaType =
    AnalyticsCreateMmmReportExamples.[mediaType]
      |> getConverter mediaType

  let mutable AnalyticsCreateReportExamples = Map.empty
  let mutable AnalyticsCreateReportBody = ""

  AnalyticsCreateReportBody <- WebUtility.HtmlDecode "{
  &quot;end_date&quot; : &quot;2020-12-20&quot;,
  &quot;view_window_days&quot; : 1,
  &quot;report_format&quot; : &quot;JSON&quot;,
  &quot;metrics_filters&quot; : [ {
    &quot;field&quot; : &quot;SPEND_IN_DOLLAR&quot;,
    &quot;values&quot; : [ 5.962133916683182, 5.962133916683182 ],
    &quot;operator&quot; : &quot;LESS_THAN&quot;
  }, {
    &quot;field&quot; : &quot;SPEND_IN_DOLLAR&quot;,
    &quot;values&quot; : [ 5.962133916683182, 5.962133916683182 ],
    &quot;operator&quot; : &quot;LESS_THAN&quot;
  } ],
  &quot;columns&quot; : [ &quot;SPEND_IN_MICRO_DOLLAR&quot;, &quot;SPEND_IN_MICRO_DOLLAR&quot; ],
  &quot;campaign_ids&quot; : [ &quot;12345678&quot; ],
  &quot;click_window_days&quot; : 0,
  &quot;conversion_report_time&quot; : &quot;TIME_OF_AD_ACTION&quot;,
  &quot;product_group_ids&quot; : [ &quot;12345678&quot; ],
  &quot;campaign_objective_types&quot; : [ &quot;AWARENESS&quot;, &quot;VIDEO_VIEW&quot; ],
  &quot;product_group_statuses&quot; : [ &quot;RUNNING&quot;, &quot;PAUSED&quot; ],
  &quot;campaign_statuses&quot; : [ &quot;RUNNING&quot;, &quot;PAUSED&quot; ],
  &quot;start_hour&quot; : 12,
  &quot;ad_group_ids&quot; : [ &quot;12345678&quot; ],
  &quot;end_hour&quot; : 5,
  &quot;targeting_types&quot; : [ &quot;APPTYPE&quot;, &quot;APPTYPE&quot;, &quot;APPTYPE&quot;, &quot;APPTYPE&quot;, &quot;APPTYPE&quot; ],
  &quot;start_date&quot; : &quot;2020-12-20&quot;,
  &quot;level&quot; : &quot;CAMPAIGN&quot;,
  &quot;ad_ids&quot; : [ &quot;12345678&quot; ],
  &quot;ad_statuses&quot; : [ &quot;APPROVED&quot;, &quot;PAUSED&quot; ],
  &quot;primary_sort&quot; : &quot;BY_ID&quot;,
  &quot;attribution_types&quot; : [ &quot;INDIVIDUAL&quot;, &quot;INDIVIDUAL&quot; ],
  &quot;granularity&quot; : &quot;granularity&quot;,
  &quot;ad_group_statuses&quot; : [ &quot;RUNNING&quot;, &quot;PAUSED&quot; ],
  &quot;engagement_window_days&quot; : 6,
  &quot;product_item_ids&quot; : [ &quot;12345678&quot; ]
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

