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
open OpenAPI.ConversionTagsApiHandler
open OpenAPI.ConversionTagsApiHandlerParams

module ConversionTagsApiHandlerTestsHelper =


  let mutable ConversionTagsCreateExamples = Map.empty
  let mutable ConversionTagsCreateBody = ""

  ConversionTagsCreateBody <- WebUtility.HtmlDecode "{
  &quot;aem_fnln_enabled&quot; : false,
  &quot;aem_external_id_enabled&quot; : false,
  &quot;aem_db_enabled&quot; : false,
  &quot;aem_enabled&quot; : false,
  &quot;name&quot; : &quot;ACME Checkout Test Tag&quot;,
  &quot;md_frequency&quot; : 0.6,
  &quot;aem_ph_enabled&quot; : false,
  &quot;aem_ge_enabled&quot; : false,
  &quot;aem_loc_enabled&quot; : false
}"
  ConversionTagsCreateExamples <- ConversionTagsCreateExamples.Add("application/json", ConversionTagsCreateBody)

  let getConversionTagsCreateExample mediaType =
    ConversionTagsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()

