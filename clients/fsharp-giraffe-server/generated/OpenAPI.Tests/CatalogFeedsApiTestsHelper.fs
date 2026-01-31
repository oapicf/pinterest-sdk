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

  FeedsCreateBody <- WebUtility.HtmlDecode ""
  FeedsCreateExamples <- FeedsCreateExamples.Add("", FeedsCreateBody)

  let getFeedsCreateExample mediaType =
    FeedsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()


  let mutable FeedsUpdateExamples = Map.empty
  let mutable FeedsUpdateBody = ""

  FeedsUpdateBody <- WebUtility.HtmlDecode ""
  FeedsUpdateExamples <- FeedsUpdateExamples.Add("", FeedsUpdateBody)

  let getFeedsUpdateExample mediaType =
    FeedsUpdateExamples.[mediaType]
      |> getConverter mediaType
  ()

