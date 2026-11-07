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
open OpenAPI.AudiencesApiHandler
open OpenAPI.AudiencesApiHandlerParams

module AudiencesApiHandlerTestsHelper =


  let mutable AudiencesCreateExamples = Map.empty
  let mutable AudiencesCreateBody = ""

  AudiencesCreateBody <- WebUtility.HtmlDecode "{
  &quot;ad_account_id&quot; : &quot;ad_account_id&quot;,
  &quot;audience_type&quot; : &quot;&quot;,
  &quot;description&quot; : &quot;description&quot;,
  &quot;name&quot; : &quot;name&quot;,
  &quot;rule&quot; : {
    &quot;ad_account_id&quot; : &quot;ad_account_id&quot;,
    &quot;ad_id&quot; : [ &quot;ad_id&quot;, &quot;ad_id&quot; ],
    &quot;campaign_id&quot; : [ &quot;campaign_id&quot;, &quot;campaign_id&quot; ],
    &quot;country&quot; : &quot;country&quot;,
    &quot;customer_list_id&quot; : &quot;customer_list_id&quot;,
    &quot;engagement_domain&quot; : [ &quot;engagement_domain&quot;, &quot;engagement_domain&quot; ],
    &quot;engagement_type&quot; : &quot;engagement_type&quot;,
    &quot;engager_type&quot; : 6,
    &quot;event&quot; : &quot;event&quot;,
    &quot;event_data&quot; : {
      &quot;currency&quot; : &quot;&quot;,
      &quot;lead_type&quot; : &quot;Newsletter&quot;,
      &quot;line_items&quot; : &quot;&quot;,
      &quot;order_id&quot; : &quot;X-151481&quot;,
      &quot;order_quantity&quot; : 1,
      &quot;page_name&quot; : &quot;Our Favorite Pins on Pinterest&quot;,
      &quot;promo_code&quot; : &quot;WINTER10&quot;,
      &quot;property&quot; : &quot;Athleta&quot;,
      &quot;search_query&quot; : &quot;boots&quot;,
      &quot;value&quot; : &quot;199.98&quot;,
      &quot;video_title&quot; : &quot;How to style your Parker Boots&quot;
    },
    &quot;event_source&quot; : &quot;{}&quot;,
    &quot;ingestion_source&quot; : &quot;{}&quot;,
    &quot;objective_type&quot; : [ &quot;AWARENESS&quot;, &quot;AWARENESS&quot; ],
    &quot;percentage&quot; : 1,
    &quot;pin_id&quot; : [ &quot;pin_id&quot;, &quot;pin_id&quot; ],
    &quot;prefill&quot; : true,
    &quot;retention_days&quot; : 5,
    &quot;seed_id&quot; : [ &quot;seed_id&quot;, &quot;seed_id&quot; ],
    &quot;url&quot; : [ &quot;url&quot;, &quot;url&quot; ],
    &quot;visitor_source_id&quot; : &quot;visitor_source_id&quot;
  }
}"
  AudiencesCreateExamples <- AudiencesCreateExamples.Add("application/json", AudiencesCreateBody)

  let getAudiencesCreateExample mediaType =
    AudiencesCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()


  let mutable AudiencesUpdateExamples = Map.empty
  let mutable AudiencesUpdateBody = ""

  AudiencesUpdateBody <- WebUtility.HtmlDecode "{
  &quot;ad_account_id&quot; : &quot;ad_account_id&quot;,
  &quot;audience_type&quot; : &quot;&quot;,
  &quot;description&quot; : &quot;description&quot;,
  &quot;name&quot; : &quot;name&quot;,
  &quot;operation_type&quot; : &quot;&quot;,
  &quot;rule&quot; : {
    &quot;ad_account_id&quot; : &quot;ad_account_id&quot;,
    &quot;ad_id&quot; : [ &quot;ad_id&quot;, &quot;ad_id&quot; ],
    &quot;campaign_id&quot; : [ &quot;campaign_id&quot;, &quot;campaign_id&quot; ],
    &quot;country&quot; : &quot;country&quot;,
    &quot;customer_list_id&quot; : &quot;customer_list_id&quot;,
    &quot;engagement_domain&quot; : [ &quot;engagement_domain&quot;, &quot;engagement_domain&quot; ],
    &quot;engagement_type&quot; : &quot;engagement_type&quot;,
    &quot;engager_type&quot; : 6,
    &quot;event&quot; : &quot;event&quot;,
    &quot;event_data&quot; : {
      &quot;currency&quot; : &quot;&quot;,
      &quot;lead_type&quot; : &quot;Newsletter&quot;,
      &quot;line_items&quot; : &quot;&quot;,
      &quot;order_id&quot; : &quot;X-151481&quot;,
      &quot;order_quantity&quot; : 1,
      &quot;page_name&quot; : &quot;Our Favorite Pins on Pinterest&quot;,
      &quot;promo_code&quot; : &quot;WINTER10&quot;,
      &quot;property&quot; : &quot;Athleta&quot;,
      &quot;search_query&quot; : &quot;boots&quot;,
      &quot;value&quot; : &quot;199.98&quot;,
      &quot;video_title&quot; : &quot;How to style your Parker Boots&quot;
    },
    &quot;event_source&quot; : &quot;{}&quot;,
    &quot;ingestion_source&quot; : &quot;{}&quot;,
    &quot;objective_type&quot; : [ &quot;AWARENESS&quot;, &quot;AWARENESS&quot; ],
    &quot;percentage&quot; : 1,
    &quot;pin_id&quot; : [ &quot;pin_id&quot;, &quot;pin_id&quot; ],
    &quot;prefill&quot; : true,
    &quot;retention_days&quot; : 5,
    &quot;seed_id&quot; : [ &quot;seed_id&quot;, &quot;seed_id&quot; ],
    &quot;url&quot; : [ &quot;url&quot;, &quot;url&quot; ],
    &quot;visitor_source_id&quot; : &quot;visitor_source_id&quot;
  }
}"
  AudiencesUpdateExamples <- AudiencesUpdateExamples.Add("application/json", AudiencesUpdateBody)

  let getAudiencesUpdateExample mediaType =
    AudiencesUpdateExamples.[mediaType]
      |> getConverter mediaType
