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
open OpenAPI.LabelsApiHandler
open OpenAPI.LabelsApiHandlerParams

module LabelsApiHandlerTestsHelper =


  let mutable LabelsApplyExamples = Map.empty
  let mutable LabelsApplyBody = ""

  LabelsApplyBody <- WebUtility.HtmlDecode "{
  &quot;entity_ids&quot; : [ &quot;entity_ids&quot;, &quot;entity_ids&quot; ]
}"
  LabelsApplyExamples <- LabelsApplyExamples.Add("application/json", LabelsApplyBody)

  let getLabelsApplyExample mediaType =
    LabelsApplyExamples.[mediaType]
      |> getConverter mediaType

  let mutable LabelsCreateExamples = Map.empty
  let mutable LabelsCreateBody = ""

  LabelsCreateBody <- WebUtility.HtmlDecode "{
  &quot;labels&quot; : [ {
    &quot;label_type&quot; : &quot;BRAND&quot;,
    &quot;value&quot; : &quot;value&quot;
  }, {
    &quot;label_type&quot; : &quot;BRAND&quot;,
    &quot;value&quot; : &quot;value&quot;
  } ]
}"
  LabelsCreateExamples <- LabelsCreateExamples.Add("application/json", LabelsCreateBody)

  let getLabelsCreateExample mediaType =
    LabelsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()


  let mutable LabelsRemoveExamples = Map.empty
  let mutable LabelsRemoveBody = ""

  LabelsRemoveBody <- WebUtility.HtmlDecode "{
  &quot;entity_ids&quot; : [ &quot;entity_ids&quot;, &quot;entity_ids&quot; ]
}"
  LabelsRemoveExamples <- LabelsRemoveExamples.Add("application/json", LabelsRemoveBody)

  let getLabelsRemoveExample mediaType =
    LabelsRemoveExamples.[mediaType]
      |> getConverter mediaType

  let mutable LabelsUpdateExamples = Map.empty
  let mutable LabelsUpdateBody = ""

  LabelsUpdateBody <- WebUtility.HtmlDecode "{
  &quot;labels&quot; : [ {
    &quot;id&quot; : &quot;1106385754497&quot;,
    &quot;status&quot; : &quot;ACTIVE&quot;,
    &quot;value&quot; : &quot;value&quot;
  }, {
    &quot;id&quot; : &quot;1106385754497&quot;,
    &quot;status&quot; : &quot;ACTIVE&quot;,
    &quot;value&quot; : &quot;value&quot;
  } ]
}"
  LabelsUpdateExamples <- LabelsUpdateExamples.Add("application/json", LabelsUpdateBody)

  let getLabelsUpdateExample mediaType =
    LabelsUpdateExamples.[mediaType]
      |> getConverter mediaType
