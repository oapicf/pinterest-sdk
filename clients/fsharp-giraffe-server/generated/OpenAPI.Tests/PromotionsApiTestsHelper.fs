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
  &quot;promotion_type&quot; : &quot;VARIABLE&quot;,
  &quot;start_time&quot; : 1677003860,
  &quot;promotion_custom_id&quot; : &quot;freeshipping_2025&quot;,
  &quot;discount_status&quot; : &quot;ACTIVE&quot;,
  &quot;platform_type&quot; : &quot;DEFAULT&quot;,
  &quot;promotion_title&quot; : &quot;Black Friday 10% off&quot;,
  &quot;promotion_code&quot; : &quot;blackfriday10&quot;,
  &quot;end_time&quot; : 1678003860,
  &quot;external_id&quot; : &quot;abc&quot;,
  &quot;template_values&quot; : [ {
    &quot;amount&quot; : 100,
    &quot;custom_text&quot; : &quot;My promotion&quot;,
    &quot;percent&quot; : 10,
    &quot;currency_code&quot; : &quot;UNK&quot;
  }, {
    &quot;amount&quot; : 100,
    &quot;custom_text&quot; : &quot;My promotion&quot;,
    &quot;percent&quot; : 10,
    &quot;currency_code&quot; : &quot;UNK&quot;
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
  &quot;promotion_type&quot; : &quot;VARIABLE&quot;,
  &quot;start_time&quot; : 1677003860,
  &quot;promotion_custom_id&quot; : &quot;freeshipping_2025&quot;,
  &quot;discount_status&quot; : &quot;ACTIVE&quot;,
  &quot;platform_type&quot; : &quot;DEFAULT&quot;,
  &quot;promotion_title&quot; : &quot;Black Friday 10% off&quot;,
  &quot;promotion_code&quot; : &quot;blackfriday10&quot;,
  &quot;end_time&quot; : 1678003860,
  &quot;external_id&quot; : &quot;abc&quot;,
  &quot;template_values&quot; : [ {
    &quot;amount&quot; : 100,
    &quot;custom_text&quot; : &quot;My promotion&quot;,
    &quot;percent&quot; : 10,
    &quot;currency_code&quot; : &quot;UNK&quot;
  }, {
    &quot;amount&quot; : 100,
    &quot;custom_text&quot; : &quot;My promotion&quot;,
    &quot;percent&quot; : 10,
    &quot;currency_code&quot; : &quot;UNK&quot;
  } ],
  &quot;id&quot; : &quot;7834020347906&quot;,
  &quot;status&quot; : &quot;ACTIVE&quot;
}"
  PromotionsUpdateExamples <- PromotionsUpdateExamples.Add("application/json", PromotionsUpdateBody)

  let getPromotionsUpdateExample mediaType =
    PromotionsUpdateExamples.[mediaType]
      |> getConverter mediaType
