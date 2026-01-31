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
open OpenAPI.CatalogItemsApiHandler
open OpenAPI.CatalogItemsApiHandlerParams

module CatalogItemsApiHandlerTestsHelper =

  ()


  let mutable ItemsBatchPostExamples = Map.empty
  let mutable ItemsBatchPostBody = ""

  ItemsBatchPostBody <- WebUtility.HtmlDecode ""
  ItemsBatchPostExamples <- ItemsBatchPostExamples.Add("", ItemsBatchPostBody)

  let getItemsBatchPostExample mediaType =
    ItemsBatchPostExamples.[mediaType]
      |> getConverter mediaType

  let mutable ItemsPostExamples = Map.empty
  let mutable ItemsPostBody = ""

  ItemsPostBody <- WebUtility.HtmlDecode "{
  &quot;country&quot; : &quot;AD&quot;,
  &quot;language&quot; : &quot;af-ZA&quot;,
  &quot;filters&quot; : {
    &quot;catalog_type&quot; : &quot;RETAIL&quot;
  }
}"
  ItemsPostExamples <- ItemsPostExamples.Add("application/json", ItemsPostBody)

  let getItemsPostExample mediaType =
    ItemsPostExamples.[mediaType]
      |> getConverter mediaType
