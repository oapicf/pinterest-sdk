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
open OpenAPI.LeadAdsApiHandler
open OpenAPI.LeadAdsApiHandlerParams

module LeadAdsApiHandlerTestsHelper =

  ()

  ()

  ()


  let mutable AdAccountsSubscriptionsPostExamples = Map.empty
  let mutable AdAccountsSubscriptionsPostBody = ""

  AdAccountsSubscriptionsPostBody <- WebUtility.HtmlDecode "{
  &quot;webhook_url&quot; : &quot;webhook_url&quot;,
  &quot;partner_refresh_token&quot; : &quot;partner_refresh_token&quot;,
  &quot;lead_form_id&quot; : &quot;lead_form_id&quot;,
  &quot;partner_metadata&quot; : {
    &quot;subscriber_key&quot; : &quot;subscriber_key&quot;
  },
  &quot;partner_access_token&quot; : &quot;partner_access_token&quot;
}"
  AdAccountsSubscriptionsPostExamples <- AdAccountsSubscriptionsPostExamples.Add("application/json", AdAccountsSubscriptionsPostBody)

  let getAdAccountsSubscriptionsPostExample mediaType =
    AdAccountsSubscriptionsPostExamples.[mediaType]
      |> getConverter mediaType
