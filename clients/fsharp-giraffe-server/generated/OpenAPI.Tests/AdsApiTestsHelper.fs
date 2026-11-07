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
  &quot;ad_group_id&quot; : &quot;ad_group_id&quot;,
  &quot;android_deep_link&quot; : &quot;android_deep_link&quot;,
  &quot;carousel_android_deep_links&quot; : [ &quot;carousel_android_deep_links&quot;, &quot;carousel_android_deep_links&quot; ],
  &quot;carousel_destination_urls&quot; : [ &quot;carousel_destination_urls&quot;, &quot;carousel_destination_urls&quot; ],
  &quot;carousel_ios_deep_links&quot; : [ &quot;carousel_ios_deep_links&quot;, &quot;carousel_ios_deep_links&quot; ],
  &quot;click_tracking_url&quot; : &quot;click_tracking_url&quot;,
  &quot;collection_items_destination_url_template&quot; : &quot;collection_items_destination_url_template&quot;,
  &quot;collections_header_type&quot; : &quot;&quot;,
  &quot;creative_type&quot; : &quot;REGULAR&quot;,
  &quot;customizable_cta_type&quot; : &quot;LEARN_MORE&quot;,
  &quot;destination_url&quot; : &quot;destination_url&quot;,
  &quot;disclosure_type&quot; : &quot;MED_GUIDE&quot;,
  &quot;disclosure_url&quot; : &quot;disclosure_url&quot;,
  &quot;grid_click_type&quot; : &quot;CLOSEUP&quot;,
  &quot;ios_deep_link&quot; : &quot;ios_deep_link&quot;,
  &quot;is_carting&quot; : true,
  &quot;is_collage_accepted_terms&quot; : true,
  &quot;is_collage_single_destination&quot; : true,
  &quot;is_pin_deleted&quot; : true,
  &quot;is_removable&quot; : true,
  &quot;lead_form_id&quot; : &quot;lead_form_id&quot;,
  &quot;name&quot; : &quot;name&quot;,
  &quot;pin_id&quot; : &quot;pin_id&quot;,
  &quot;quiz_pin_data&quot; : &quot;{}&quot;,
  &quot;status&quot; : &quot;ACTIVE&quot;,
  &quot;tracking_urls&quot; : {
    &quot;impression&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;click&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;engagement&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;buyable_button&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;audience_verification&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ]
  },
  &quot;view_tracking_url&quot; : &quot;view_tracking_url&quot;
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
  &quot;ad_group_id&quot; : &quot;ad_group_id&quot;,
  &quot;android_deep_link&quot; : &quot;android_deep_link&quot;,
  &quot;carousel_android_deep_links&quot; : [ &quot;carousel_android_deep_links&quot;, &quot;carousel_android_deep_links&quot; ],
  &quot;carousel_destination_urls&quot; : [ &quot;carousel_destination_urls&quot;, &quot;carousel_destination_urls&quot; ],
  &quot;carousel_ios_deep_links&quot; : [ &quot;carousel_ios_deep_links&quot;, &quot;carousel_ios_deep_links&quot; ],
  &quot;click_tracking_url&quot; : &quot;click_tracking_url&quot;,
  &quot;collection_items_destination_url_template&quot; : &quot;collection_items_destination_url_template&quot;,
  &quot;collections_header_type&quot; : &quot;&quot;,
  &quot;creative_type&quot; : &quot;REGULAR&quot;,
  &quot;customizable_cta_type&quot; : &quot;LEARN_MORE&quot;,
  &quot;destination_url&quot; : &quot;destination_url&quot;,
  &quot;disclosure_type&quot; : &quot;MED_GUIDE&quot;,
  &quot;disclosure_url&quot; : &quot;disclosure_url&quot;,
  &quot;grid_click_type&quot; : &quot;CLOSEUP&quot;,
  &quot;id&quot; : &quot;id&quot;,
  &quot;ios_deep_link&quot; : &quot;ios_deep_link&quot;,
  &quot;is_carting&quot; : true,
  &quot;is_collage_accepted_terms&quot; : true,
  &quot;is_collage_single_destination&quot; : true,
  &quot;is_pin_deleted&quot; : true,
  &quot;is_removable&quot; : true,
  &quot;lead_form_id&quot; : &quot;lead_form_id&quot;,
  &quot;name&quot; : &quot;name&quot;,
  &quot;pin_id&quot; : &quot;pin_id&quot;,
  &quot;quiz_pin_data&quot; : &quot;{}&quot;,
  &quot;status&quot; : &quot;ACTIVE&quot;,
  &quot;tracking_urls&quot; : {
    &quot;impression&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;click&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;engagement&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;buyable_button&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ],
    &quot;audience_verification&quot; : [ &quot;URL1&quot;, &quot;URL2&quot; ]
  },
  &quot;view_tracking_url&quot; : &quot;view_tracking_url&quot;
}"
  AdsUpdateExamples <- AdsUpdateExamples.Add("application/json", AdsUpdateBody)

  let getAdsUpdateExample mediaType =
    AdsUpdateExamples.[mediaType]
      |> getConverter mediaType

  let mutable CampaignAdPreviewCreateExamples = Map.empty
  let mutable CampaignAdPreviewCreateBody = ""

  CampaignAdPreviewCreateBody <- WebUtility.HtmlDecode "{
  &quot;ad_group_id&quot; : &quot;1234567890&quot;
}"
  CampaignAdPreviewCreateExamples <- CampaignAdPreviewCreateExamples.Add("application/json", CampaignAdPreviewCreateBody)

  let getCampaignAdPreviewCreateExample mediaType =
    CampaignAdPreviewCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

