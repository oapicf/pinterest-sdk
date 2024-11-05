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
open OpenAPI.AdsApiHandler
open OpenAPI.AdsApiHandlerParams

module AdsApiHandlerTestsHelper =


  let mutable AdPreviewsCreateExamples = Map.empty
  let mutable AdPreviewsCreateBody = ""

  AdPreviewsCreateBody <- WebUtility.HtmlDecode "{
  &quot;image_url&quot; : &quot;https://somewebsite.com/someimage.jpg&quot;,
  &quot;title&quot; : &quot;My Preview Image&quot;
}"
  AdPreviewsCreateExamples <- AdPreviewsCreateExamples.Add("application/json", AdPreviewsCreateBody)

  let getAdPreviewsCreateExample mediaType =
    AdPreviewsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()


  let mutable AdsCreateExamples = Map.empty
  let mutable AdsCreateBody = ""

  AdsCreateBody <- WebUtility.HtmlDecode "{
  &quot;is_removable&quot; : false,
  &quot;view_tracking_url&quot; : &quot;view_tracking_url&quot;,
  &quot;android_deep_link&quot; : &quot;android_deep_link&quot;,
  &quot;destination_url&quot; : &quot;destination_url&quot;,
  &quot;carousel_android_deep_links&quot; : [ &quot;carousel_android_deep_links&quot;, &quot;carousel_android_deep_links&quot; ],
  &quot;carousel_destination_urls&quot; : [ &quot;carousel_destination_urls&quot;, &quot;carousel_destination_urls&quot; ],
  &quot;tracking_urls&quot; : &quot;{}&quot;,
  &quot;ios_deep_link&quot; : &quot;ios_deep_link&quot;,
  &quot;carousel_ios_deep_links&quot; : [ &quot;carousel_ios_deep_links&quot;, &quot;carousel_ios_deep_links&quot; ],
  &quot;click_tracking_url&quot; : &quot;click_tracking_url&quot;,
  &quot;is_pin_deleted&quot; : false,
  &quot;creative_type&quot; : &quot;REGULAR&quot;,
  &quot;grid_click_type&quot; : &quot;CLOSEUP&quot;,
  &quot;quiz_pin_data&quot; : &quot;{}&quot;,
  &quot;name&quot; : &quot;name&quot;,
  &quot;lead_form_id&quot; : &quot;lead_form_id&quot;,
  &quot;customizable_cta_type&quot; : &quot;LEARN_MORE&quot;,
  &quot;ad_group_id&quot; : &quot;2680059592705&quot;,
  &quot;pin_id&quot; : &quot;394205773611545468&quot;,
  &quot;status&quot; : &quot;ACTIVE&quot;
}"
  AdsCreateExamples <- AdsCreateExamples.Add("application/json", AdsCreateBody)

  let getAdsCreateExample mediaType =
    AdsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()


  let mutable AdsUpdateExamples = Map.empty
  let mutable AdsUpdateBody = ""

  AdsUpdateBody <- WebUtility.HtmlDecode "{
  &quot;is_removable&quot; : false,
  &quot;view_tracking_url&quot; : &quot;view_tracking_url&quot;,
  &quot;android_deep_link&quot; : &quot;android_deep_link&quot;,
  &quot;destination_url&quot; : &quot;destination_url&quot;,
  &quot;carousel_android_deep_links&quot; : [ &quot;carousel_android_deep_links&quot;, &quot;carousel_android_deep_links&quot; ],
  &quot;carousel_destination_urls&quot; : [ &quot;carousel_destination_urls&quot;, &quot;carousel_destination_urls&quot; ],
  &quot;tracking_urls&quot; : &quot;{}&quot;,
  &quot;ios_deep_link&quot; : &quot;ios_deep_link&quot;,
  &quot;carousel_ios_deep_links&quot; : [ &quot;carousel_ios_deep_links&quot;, &quot;carousel_ios_deep_links&quot; ],
  &quot;click_tracking_url&quot; : &quot;click_tracking_url&quot;,
  &quot;is_pin_deleted&quot; : false,
  &quot;creative_type&quot; : &quot;REGULAR&quot;,
  &quot;grid_click_type&quot; : &quot;CLOSEUP&quot;,
  &quot;quiz_pin_data&quot; : &quot;{}&quot;,
  &quot;name&quot; : &quot;name&quot;,
  &quot;lead_form_id&quot; : &quot;lead_form_id&quot;,
  &quot;customizable_cta_type&quot; : &quot;LEARN_MORE&quot;,
  &quot;id&quot; : &quot;687195134316&quot;,
  &quot;ad_group_id&quot; : &quot;2680059592705&quot;,
  &quot;pin_id&quot; : &quot;394205773611545468&quot;,
  &quot;status&quot; : &quot;ACTIVE&quot;
}"
  AdsUpdateExamples <- AdsUpdateExamples.Add("application/json", AdsUpdateBody)

  let getAdsUpdateExample mediaType =
    AdsUpdateExamples.[mediaType]
      |> getConverter mediaType
