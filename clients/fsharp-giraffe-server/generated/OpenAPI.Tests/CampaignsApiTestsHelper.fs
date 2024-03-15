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
open OpenAPI.CampaignsApiHandler
open OpenAPI.CampaignsApiHandlerParams

module CampaignsApiHandlerTestsHelper =

  ()

  ()


  let mutable CampaignsCreateExamples = Map.empty
  let mutable CampaignsCreateBody = ""

  CampaignsCreateBody <- WebUtility.HtmlDecode "{ }"
  CampaignsCreateExamples <- CampaignsCreateExamples.Add("application/json", CampaignsCreateBody)

  let getCampaignsCreateExample mediaType =
    CampaignsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()


  let mutable CampaignsUpdateExamples = Map.empty
  let mutable CampaignsUpdateBody = ""

  CampaignsUpdateBody <- WebUtility.HtmlDecode "{
  &quot;lifetime_spend_cap&quot; : 1432744744,
  &quot;end_time&quot; : 1644023526,
  &quot;is_flexible_daily_budgets&quot; : true,
  &quot;daily_spend_cap&quot; : 1432744744,
  &quot;objective_type&quot; : &quot;objective_type&quot;,
  &quot;summary_status&quot; : &quot;summary_status&quot;,
  &quot;is_campaign_budget_optimization&quot; : true,
  &quot;tracking_urls&quot; : {
    &quot;engagement&quot; : [ &quot;engagement&quot;, &quot;engagement&quot; ],
    &quot;audience_verification&quot; : [ &quot;audience_verification&quot;, &quot;audience_verification&quot; ],
    &quot;impression&quot; : [ &quot;impression&quot;, &quot;impression&quot; ],
    &quot;buyable_button&quot; : [ &quot;buyable_button&quot;, &quot;buyable_button&quot; ],
    &quot;click&quot; : [ &quot;click&quot;, &quot;click&quot; ]
  },
  &quot;ad_account_id&quot; : &quot;549755885175&quot;,
  &quot;is_automated_campaign&quot; : true,
  &quot;start_time&quot; : 1580865126,
  &quot;name&quot; : &quot;ACME Tools&quot;,
  &quot;order_line_id&quot; : &quot;549755885175&quot;,
  &quot;id&quot; : &quot;549755885175&quot;,
  &quot;status&quot; : &quot;status&quot;
}"
  CampaignsUpdateExamples <- CampaignsUpdateExamples.Add("application/json", CampaignsUpdateBody)

  let getCampaignsUpdateExample mediaType =
    CampaignsUpdateExamples.[mediaType]
      |> getConverter mediaType
