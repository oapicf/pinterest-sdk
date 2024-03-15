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
  &quot;attribution_types&quot; : [ &quot;INDIVIDUAL&quot;, &quot;INDIVIDUAL&quot; ],
  &quot;view_window_days&quot; : 1,
  &quot;level&quot; : &quot;CAMPAIGN&quot;,
  &quot;report_format&quot; : &quot;JSON&quot;,
  &quot;granularity&quot; : &quot;granularity&quot;,
  &quot;columns&quot; : [ &quot;SPEND_IN_MICRO_DOLLAR&quot;, &quot;SPEND_IN_MICRO_DOLLAR&quot; ],
  &quot;click_window_days&quot; : 0,
  &quot;conversion_report_time&quot; : &quot;TIME_OF_AD_ACTION&quot;,
  &quot;engagement_window_days&quot; : 6,
  &quot;start_date&quot; : &quot;2020-12-20&quot;
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

