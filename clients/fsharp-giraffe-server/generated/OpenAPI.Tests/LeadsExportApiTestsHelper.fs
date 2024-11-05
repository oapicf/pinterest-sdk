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
open OpenAPI.LeadsExportApiHandler
open OpenAPI.LeadsExportApiHandlerParams

module LeadsExportApiHandlerTestsHelper =


  let mutable LeadsExportCreateExamples = Map.empty
  let mutable LeadsExportCreateBody = ""

  LeadsExportCreateBody <- WebUtility.HtmlDecode "{
  &quot;end_date&quot; : &quot;2020-12-20&quot;,
  &quot;ad_id&quot; : &quot;687201361754&quot;,
  &quot;start_date&quot; : &quot;2020-12-20&quot;
}"
  LeadsExportCreateExamples <- LeadsExportCreateExamples.Add("application/json", LeadsExportCreateBody)

  let getLeadsExportCreateExample mediaType =
    LeadsExportCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

