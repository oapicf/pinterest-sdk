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
open OpenAPI.MsotEventsApiHandler
open OpenAPI.MsotEventsApiHandlerParams

module MsotEventsApiHandlerTestsHelper =


  let mutable MsotEventsCreateExamples = Map.empty
  let mutable MsotEventsCreateBody = ""

  MsotEventsCreateBody <- WebUtility.HtmlDecode "{
  &quot;attribution_score&quot; : 0.5,
  &quot;total_events&quot; : 2,
  &quot;attribution_scope&quot; : &quot;click&quot;,
  &quot;attribution_model&quot; : &quot;multi_touch&quot;,
  &quot;event_timestamp&quot; : 1451431341,
  &quot;action_timestamps&quot; : [ 1451410040 ],
  &quot;total_event_touchpoints&quot; : 2,
  &quot;event_id&quot; : &quot;eventId0001&quot;,
  &quot;event_name&quot; : &quot;add_to_cart&quot;,
  &quot;currency&quot; : &quot;&quot;,
  &quot;ad_group_id&quot; : &quot;2680060704746&quot;,
  &quot;value&quot; : 123.45,
  &quot;campaign_id&quot; : &quot;626736533506&quot;
}"
  MsotEventsCreateExamples <- MsotEventsCreateExamples.Add("application/json", MsotEventsCreateBody)

  let getMsotEventsCreateExample mediaType =
    MsotEventsCreateExamples.[mediaType]
      |> getConverter mediaType
