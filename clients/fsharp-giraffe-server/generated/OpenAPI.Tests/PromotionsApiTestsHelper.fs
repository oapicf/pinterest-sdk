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
open OpenAPI.PromotionsApiHandler
open OpenAPI.PromotionsApiHandlerParams

module PromotionsApiHandlerTestsHelper =


  let mutable PromotionsCreateExamples = Map.empty
  let mutable PromotionsCreateBody = ""

  PromotionsCreateBody <- WebUtility.HtmlDecode "{
  &quot;discount_status&quot; : &quot;OTHER&quot;,
  &quot;end_time&quot; : 0,
  &quot;external_id&quot; : &quot;external_id&quot;,
  &quot;platform_type&quot; : &quot;platform_type&quot;,
  &quot;promotion_code&quot; : &quot;promotion_code&quot;,
  &quot;promotion_custom_id&quot; : &quot;promotion_custom_id&quot;,
  &quot;promotion_title&quot; : &quot;promotion_title&quot;,
  &quot;promotion_type&quot; : &quot;VARIABLE&quot;,
  &quot;start_time&quot; : 6,
  &quot;template_values&quot; : [ {
    &quot;amount&quot; : 100,
    &quot;currency_code&quot; : &quot;UNK&quot;,
    &quot;custom_text&quot; : &quot;My promotion&quot;,
    &quot;percent&quot; : 10
  }, {
    &quot;amount&quot; : 100,
    &quot;currency_code&quot; : &quot;UNK&quot;,
    &quot;custom_text&quot; : &quot;My promotion&quot;,
    &quot;percent&quot; : 10
  } ]
}"
  PromotionsCreateExamples <- PromotionsCreateExamples.Add("application/json", PromotionsCreateBody)

  let getPromotionsCreateExample mediaType =
    PromotionsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()


  let mutable PromotionsUpdateExamples = Map.empty
  let mutable PromotionsUpdateBody = ""

  PromotionsUpdateBody <- WebUtility.HtmlDecode "{
  &quot;discount_status&quot; : &quot;OTHER&quot;,
  &quot;end_time&quot; : 0,
  &quot;external_id&quot; : &quot;external_id&quot;,
  &quot;id&quot; : &quot;id&quot;,
  &quot;platform_type&quot; : &quot;platform_type&quot;,
  &quot;promotion_code&quot; : &quot;promotion_code&quot;,
  &quot;promotion_custom_id&quot; : &quot;promotion_custom_id&quot;,
  &quot;promotion_title&quot; : &quot;promotion_title&quot;,
  &quot;promotion_type&quot; : &quot;VARIABLE&quot;,
  &quot;start_time&quot; : 6,
  &quot;template_values&quot; : [ {
    &quot;amount&quot; : 100,
    &quot;currency_code&quot; : &quot;UNK&quot;,
    &quot;custom_text&quot; : &quot;My promotion&quot;,
    &quot;percent&quot; : 10
  }, {
    &quot;amount&quot; : 100,
    &quot;currency_code&quot; : &quot;UNK&quot;,
    &quot;custom_text&quot; : &quot;My promotion&quot;,
    &quot;percent&quot; : 10
  } ]
}"
  PromotionsUpdateExamples <- PromotionsUpdateExamples.Add("application/json", PromotionsUpdateBody)

  let getPromotionsUpdateExample mediaType =
    PromotionsUpdateExamples.[mediaType]
      |> getConverter mediaType
