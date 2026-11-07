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
open OpenAPI.KeywordsApiHandler
open OpenAPI.KeywordsApiHandlerParams

module KeywordsApiHandlerTestsHelper =

  ()


  let mutable KeywordsCreateExamples = Map.empty
  let mutable KeywordsCreateBody = ""

  KeywordsCreateBody <- WebUtility.HtmlDecode "{
  &quot;keywords&quot; : [ {
    &quot;bid&quot; : 0,
    &quot;match_type&quot; : &quot;&quot;,
    &quot;value&quot; : &quot;value&quot;
  }, {
    &quot;bid&quot; : 0,
    &quot;match_type&quot; : &quot;&quot;,
    &quot;value&quot; : &quot;value&quot;
  } ],
  &quot;parent_id&quot; : &quot;parent_id&quot;
}"
  KeywordsCreateExamples <- KeywordsCreateExamples.Add("application/json", KeywordsCreateBody)

  let getKeywordsCreateExample mediaType =
    KeywordsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()


  let mutable KeywordsUpdateExamples = Map.empty
  let mutable KeywordsUpdateBody = ""

  KeywordsUpdateBody <- WebUtility.HtmlDecode "{
  &quot;keywords&quot; : [ {
    &quot;archived&quot; : false,
    &quot;bid&quot; : 0,
    &quot;id&quot; : &quot;383791336903426391&quot;
  }, {
    &quot;archived&quot; : false,
    &quot;bid&quot; : 0,
    &quot;id&quot; : &quot;383791336903426391&quot;
  } ]
}"
  KeywordsUpdateExamples <- KeywordsUpdateExamples.Add("application/json", KeywordsUpdateBody)

  let getKeywordsUpdateExample mediaType =
    KeywordsUpdateExamples.[mediaType]
      |> getConverter mediaType
  ()

