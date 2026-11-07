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
open OpenAPI.CatalogFeedsApiHandler
open OpenAPI.CatalogFeedsApiHandlerParams

module CatalogFeedsApiHandlerTestsHelper =

  ()


  let mutable FeedsCreateExamples = Map.empty
  let mutable FeedsCreateBody = ""

  FeedsCreateBody <- WebUtility.HtmlDecode "{
  &quot;catalog_id&quot; : &quot;catalog_id&quot;,
  &quot;catalog_type&quot; : &quot;RETAIL&quot;,
  &quot;credentials&quot; : {
    &quot;password&quot; : &quot;password&quot;,
    &quot;username&quot; : &quot;username&quot;
  },
  &quot;default_availability&quot; : &quot;IN_STOCK&quot;,
  &quot;default_country&quot; : &quot;AD&quot;,
  &quot;default_currency&quot; : &quot;AED&quot;,
  &quot;default_locale&quot; : &quot;af-ZA&quot;,
  &quot;format&quot; : &quot;TSV&quot;,
  &quot;location&quot; : &quot;location&quot;,
  &quot;name&quot; : &quot;name&quot;,
  &quot;preferred_processing_schedule&quot; : {
    &quot;time&quot; : &quot;time&quot;,
    &quot;timezone&quot; : &quot;&quot;
  },
  &quot;status&quot; : &quot;&quot;
}"
  FeedsCreateExamples <- FeedsCreateExamples.Add("application/json", FeedsCreateBody)

  let getFeedsCreateExample mediaType =
    FeedsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()


  let mutable FeedsUpdateExamples = Map.empty
  let mutable FeedsUpdateBody = ""

  FeedsUpdateBody <- WebUtility.HtmlDecode "{
  &quot;catalog_type&quot; : &quot;RETAIL&quot;,
  &quot;credentials&quot; : {
    &quot;password&quot; : &quot;password&quot;,
    &quot;username&quot; : &quot;username&quot;
  },
  &quot;default_availability&quot; : &quot;IN_STOCK&quot;,
  &quot;default_currency&quot; : &quot;AED&quot;,
  &quot;format&quot; : &quot;TSV&quot;,
  &quot;location&quot; : &quot;location&quot;,
  &quot;name&quot; : &quot;name&quot;,
  &quot;preferred_processing_schedule&quot; : {
    &quot;time&quot; : &quot;time&quot;,
    &quot;timezone&quot; : &quot;&quot;
  },
  &quot;status&quot; : &quot;ACTIVE&quot;
}"
  FeedsUpdateExamples <- FeedsUpdateExamples.Add("application/json", FeedsUpdateBody)

  let getFeedsUpdateExample mediaType =
    FeedsUpdateExamples.[mediaType]
      |> getConverter mediaType
  ()

