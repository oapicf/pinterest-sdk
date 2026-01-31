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
open OpenAPI.CatalogsApiHandler
open OpenAPI.CatalogsApiHandlerParams

module CatalogsApiHandlerTestsHelper =

  ()


  let mutable CatalogsCreateExamples = Map.empty
  let mutable CatalogsCreateBody = ""

  CatalogsCreateBody <- WebUtility.HtmlDecode "{
  &quot;catalog_type&quot; : &quot;RETAIL&quot;,
  &quot;name&quot; : &quot;name&quot;
}"
  CatalogsCreateExamples <- CatalogsCreateExamples.Add("application/json", CatalogsCreateBody)

  let getCatalogsCreateExample mediaType =
    CatalogsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

