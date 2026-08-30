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
open OpenAPI.SchedulesApiHandler
open OpenAPI.SchedulesApiHandlerParams

module SchedulesApiHandlerTestsHelper =


  let mutable SchedulesCreateExamples = Map.empty
  let mutable SchedulesCreateBody = ""

  SchedulesCreateBody <- WebUtility.HtmlDecode "{
  &quot;delta_value&quot; : &quot;Schedule_delta_value&quot;,
  &quot;end_timestamp&quot; : 0,
  &quot;entity_id&quot; : &quot;&quot;,
  &quot;entity_type&quot; : &quot;&quot;,
  &quot;name&quot; : &quot;name&quot;,
  &quot;schedule_action&quot; : &quot;&quot;,
  &quot;schedule_status&quot; : &quot;&quot;,
  &quot;schedule_type&quot; : &quot;&quot;,
  &quot;start_timestamp&quot; : 6
}"
  SchedulesCreateExamples <- SchedulesCreateExamples.Add("application/json", SchedulesCreateBody)

  let getSchedulesCreateExample mediaType =
    SchedulesCreateExamples.[mediaType]
      |> getConverter mediaType
  ()


  let mutable SchedulesUpdateExamples = Map.empty
  let mutable SchedulesUpdateBody = ""

  SchedulesUpdateBody <- WebUtility.HtmlDecode "{
  &quot;delta_value&quot; : &quot;Schedule_delta_value&quot;,
  &quot;end_timestamp&quot; : 0,
  &quot;entity_id&quot; : &quot;&quot;,
  &quot;entity_type&quot; : &quot;&quot;,
  &quot;id&quot; : &quot;id&quot;,
  &quot;name&quot; : &quot;name&quot;,
  &quot;schedule_action&quot; : &quot;&quot;,
  &quot;schedule_id&quot; : &quot;schedule_id&quot;,
  &quot;schedule_status&quot; : &quot;&quot;,
  &quot;schedule_type&quot; : &quot;&quot;,
  &quot;start_timestamp&quot; : 6
}"
  SchedulesUpdateExamples <- SchedulesUpdateExamples.Add("application/json", SchedulesUpdateBody)

  let getSchedulesUpdateExample mediaType =
    SchedulesUpdateExamples.[mediaType]
      |> getConverter mediaType
