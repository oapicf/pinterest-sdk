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
open OpenAPI.ConversionDeletionRequestsApiHandler
open OpenAPI.ConversionDeletionRequestsApiHandlerParams

module ConversionDeletionRequestsApiHandlerTestsHelper =


  let mutable ConversionDeletionRequestCreateExamples = Map.empty
  let mutable ConversionDeletionRequestCreateBody = ""

  ConversionDeletionRequestCreateBody <- WebUtility.HtmlDecode "{
  &quot;deletion_targets&quot; : &quot;&quot;
}"
  ConversionDeletionRequestCreateExamples <- ConversionDeletionRequestCreateExamples.Add("application/json", ConversionDeletionRequestCreateBody)

  let getConversionDeletionRequestCreateExample mediaType =
    ConversionDeletionRequestCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

