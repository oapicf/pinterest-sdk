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
open OpenAPI.CatalogReportsApiHandler
open OpenAPI.CatalogReportsApiHandlerParams

module CatalogReportsApiHandlerTestsHelper =


  let mutable ReportsCreateExamples = Map.empty
  let mutable ReportsCreateBody = ""

  ReportsCreateBody <- WebUtility.HtmlDecode "{
  &quot;catalog_type&quot; : &quot;RETAIL&quot;
}"
  ReportsCreateExamples <- ReportsCreateExamples.Add("application/json", ReportsCreateBody)

  let getReportsCreateExample mediaType =
    ReportsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

