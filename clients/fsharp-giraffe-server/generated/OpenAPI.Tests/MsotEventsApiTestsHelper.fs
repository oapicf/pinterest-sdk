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
  &quot;action_timestamps&quot; : [ 1451410040 ],
  &quot;ad_group_id&quot; : &quot;2680060704746&quot;,
  &quot;attribution_model&quot; : &quot;multi_touch&quot;,
  &quot;attribution_scope&quot; : &quot;click&quot;,
  &quot;attribution_score&quot; : 0.5,
  &quot;campaign_id&quot; : &quot;626736533506&quot;,
  &quot;click_window&quot; : &quot;click_window&quot;,
  &quot;currency&quot; : &quot;&quot;,
  &quot;event_id&quot; : &quot;eventId0001&quot;,
  &quot;event_name&quot; : &quot;add_to_cart&quot;,
  &quot;event_timestamp&quot; : 1451431341,
  &quot;total_event_touchpoints&quot; : 2,
  &quot;total_events&quot; : 2,
  &quot;total_events_fractional&quot; : 0.08008281904610115,
  &quot;value&quot; : 123.45,
  &quot;view_window&quot; : &quot;view_window&quot;
}"
  MsotEventsCreateExamples <- MsotEventsCreateExamples.Add("application/json", MsotEventsCreateBody)

  let getMsotEventsCreateExample mediaType =
    MsotEventsCreateExamples.[mediaType]
      |> getConverter mediaType
