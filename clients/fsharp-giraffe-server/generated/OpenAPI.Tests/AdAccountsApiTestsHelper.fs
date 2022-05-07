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
open OpenAPI.AdAccountsApiHandler
open OpenAPI.AdAccountsApiHandlerParams

module AdAccountsApiHandlerTestsHelper =

  ()

  ()

  ()

  ()

  ()

  ()


  let mutable AnalyticsCreateReportExamples = Map.empty
  let mutable AnalyticsCreateReportBody = ""

  AnalyticsCreateReportBody <- WebUtility.HtmlDecode "null"
  AnalyticsCreateReportExamples <- AnalyticsCreateReportExamples.Add("application/json", AnalyticsCreateReportBody)

  let getAnalyticsCreateReportExample mediaType =
    AnalyticsCreateReportExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()

