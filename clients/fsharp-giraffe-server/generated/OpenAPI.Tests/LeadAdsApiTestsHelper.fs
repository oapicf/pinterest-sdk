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
  &quot;webhook_url&quot; : &quot;https://webhook.example.com/xyz&quot;,
  &quot;lead_form_id&quot; : &quot;383791336903426390&quot;
}"
  AdAccountsSubscriptionsPostExamples <- AdAccountsSubscriptionsPostExamples.Add("application/json", AdAccountsSubscriptionsPostBody)

  let getAdAccountsSubscriptionsPostExample mediaType =
    AdAccountsSubscriptionsPostExamples.[mediaType]
      |> getConverter mediaType
