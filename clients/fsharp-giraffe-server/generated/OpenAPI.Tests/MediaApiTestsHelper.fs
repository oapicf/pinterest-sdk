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
open OpenAPI.MediaApiHandler
open OpenAPI.MediaApiHandlerParams

module MediaApiHandlerTestsHelper =


  let mutable MediaCreateExamples = Map.empty
  let mutable MediaCreateBody = ""

  MediaCreateBody <- WebUtility.HtmlDecode "{
  &quot;media_type&quot; : &quot;video&quot;
}"
  MediaCreateExamples <- MediaCreateExamples.Add("application/json", MediaCreateBody)

  let getMediaCreateExample mediaType =
    MediaCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

