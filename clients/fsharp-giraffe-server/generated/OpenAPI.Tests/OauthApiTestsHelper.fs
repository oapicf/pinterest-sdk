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
open OpenAPI.OauthApiHandler
open OpenAPI.OauthApiHandlerParams

module OauthApiHandlerTestsHelper =


  let mutable OauthTokenExamples = Map.empty
  let mutable OauthTokenBody = ""

  let getOauthTokenExample mediaType =
    OauthTokenExamples.[mediaType]
      |> getConverter mediaType
