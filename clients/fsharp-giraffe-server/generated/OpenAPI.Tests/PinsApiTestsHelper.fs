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
open OpenAPI.PinsApiHandler
open OpenAPI.PinsApiHandlerParams

module PinsApiHandlerTestsHelper =

  ()

  ()


  let mutable PinsCreateExamples = Map.empty
  let mutable PinsCreateBody = ""

  PinsCreateBody <- WebUtility.HtmlDecode "{
  &quot;ai_disclosures&quot; : &quot;&quot;,
  &quot;alt_text&quot; : &quot;alt_text&quot;,
  &quot;board_id&quot; : &quot;board_id&quot;,
  &quot;board_section_id&quot; : &quot;board_section_id&quot;,
  &quot;description&quot; : &quot;description&quot;,
  &quot;dominant_color&quot; : &quot;dominant_color&quot;,
  &quot;link&quot; : &quot;link&quot;,
  &quot;media_source&quot; : {
    &quot;content_type&quot; : &quot;image/jpeg&quot;,
    &quot;data&quot; : &quot;data&quot;,
    &quot;is_standard&quot; : true,
    &quot;source_type&quot; : &quot;image_base64&quot;
  },
  &quot;parent_pin_id&quot; : &quot;parent_pin_id&quot;,
  &quot;sponsor_id&quot; : &quot;sponsor_id&quot;,
  &quot;title&quot; : &quot;title&quot;
}"
  PinsCreateExamples <- PinsCreateExamples.Add("application/json", PinsCreateBody)

  let getPinsCreateExample mediaType =
    PinsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()


  let mutable PinsSaveExamples = Map.empty
  let mutable PinsSaveBody = ""

  PinsSaveBody <- WebUtility.HtmlDecode "{
  &quot;board_id&quot; : &quot;board_id&quot;,
  &quot;board_section_id&quot; : &quot;board_section_id&quot;
}"
  PinsSaveExamples <- PinsSaveExamples.Add("application/json", PinsSaveBody)

  let getPinsSaveExample mediaType =
    PinsSaveExamples.[mediaType]
      |> getConverter mediaType

  let mutable PinsUpdateExamples = Map.empty
  let mutable PinsUpdateBody = ""

  PinsUpdateBody <- WebUtility.HtmlDecode "{
  &quot;ai_disclosures&quot; : &quot;&quot;,
  &quot;alt_text&quot; : &quot;alt_text&quot;,
  &quot;board_id&quot; : &quot;board_id&quot;,
  &quot;board_section_id&quot; : &quot;board_section_id&quot;,
  &quot;carousel_slots&quot; : [ {
    &quot;description&quot; : &quot;description&quot;,
    &quot;link&quot; : &quot;link&quot;,
    &quot;title&quot; : &quot;title&quot;
  }, {
    &quot;description&quot; : &quot;description&quot;,
    &quot;link&quot; : &quot;link&quot;,
    &quot;title&quot; : &quot;title&quot;
  } ],
  &quot;description&quot; : &quot;description&quot;,
  &quot;link&quot; : &quot;link&quot;,
  &quot;title&quot; : &quot;title&quot;
}"
  PinsUpdateExamples <- PinsUpdateExamples.Add("application/json", PinsUpdateBody)

  let getPinsUpdateExample mediaType =
    PinsUpdateExamples.[mediaType]
      |> getConverter mediaType
