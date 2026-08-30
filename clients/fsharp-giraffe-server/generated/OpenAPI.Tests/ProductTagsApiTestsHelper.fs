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
open OpenAPI.ProductTagsApiHandler
open OpenAPI.ProductTagsApiHandlerParams

module ProductTagsApiHandlerTestsHelper =


  let mutable ProductTagsBulkAddExamples = Map.empty
  let mutable ProductTagsBulkAddBody = ""

  ProductTagsBulkAddBody <- WebUtility.HtmlDecode "{
  &quot;product_tags&quot; : [ {
    &quot;pin_id&quot; : &quot;pin_id&quot;
  }, {
    &quot;pin_id&quot; : &quot;pin_id&quot;
  }, {
    &quot;pin_id&quot; : &quot;pin_id&quot;
  }, {
    &quot;pin_id&quot; : &quot;pin_id&quot;
  }, {
    &quot;pin_id&quot; : &quot;pin_id&quot;
  } ]
}"
  ProductTagsBulkAddExamples <- ProductTagsBulkAddExamples.Add("application/json", ProductTagsBulkAddBody)

  let getProductTagsBulkAddExample mediaType =
    ProductTagsBulkAddExamples.[mediaType]
      |> getConverter mediaType

  let mutable ProductTagsBulkDeleteExamples = Map.empty
  let mutable ProductTagsBulkDeleteBody = ""

  ProductTagsBulkDeleteBody <- WebUtility.HtmlDecode "{
  &quot;product_tags&quot; : [ {
    &quot;pin_id&quot; : &quot;pin_id&quot;
  }, {
    &quot;pin_id&quot; : &quot;pin_id&quot;
  }, {
    &quot;pin_id&quot; : &quot;pin_id&quot;
  }, {
    &quot;pin_id&quot; : &quot;pin_id&quot;
  }, {
    &quot;pin_id&quot; : &quot;pin_id&quot;
  } ]
}"
  ProductTagsBulkDeleteExamples <- ProductTagsBulkDeleteExamples.Add("application/json", ProductTagsBulkDeleteBody)

  let getProductTagsBulkDeleteExample mediaType =
    ProductTagsBulkDeleteExamples.[mediaType]
      |> getConverter mediaType
  ()

