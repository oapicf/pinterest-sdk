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
  &quot;audience_type&quot; : { },
  &quot;name&quot; : &quot;string&quot;,
  &quot;rule&quot; : {
    &quot;country&quot; : &quot;US&quot;,
    &quot;visitor_source_id&quot; : &quot;549755885175&quot;,
    &quot;prefill&quot; : true,
    &quot;customer_list_id&quot; : &quot;5497558859876&quot;,
    &quot;event_source&quot; : {
      &quot;&#x3D;&quot; : [ &quot;web&quot;, &quot;mobile&quot; ]
    },
    &quot;objective_type&quot; : [ &quot;AWARENESS&quot; ],
    &quot;event_data&quot; : {
      &quot;video_title&quot; : &quot;How to style your Parker Boots&quot;,
      &quot;page_name&quot; : &quot;Our Favorite Pins on Pinterest.&quot;,
      &quot;order_quantity&quot; : 1,
      &quot;property&quot; : &quot;Athleta&quot;,
      &quot;currency&quot; : &quot;USD&quot;,
      &quot;lead_type&quot; : &quot;Newsletter&quot;,
      &quot;promo_code&quot; : &quot;WINTER10&quot;,
      &quot;line_items&quot; : {
        &quot;product_id&quot; : 1414,
        &quot;product_variant&quot; : &quot;Red&quot;,
        &quot;product_brand&quot; : &quot;Parker&quot;,
        &quot;product_price&quot; : &quot;99.99&quot;,
        &quot;product_variant_id&quot; : &quot;1414-34832&quot;,
        &quot;product_name&quot; : &quot;Parker Boots&quot;,
        &quot;product_category&quot; : &quot;Shoes&quot;,
        &quot;product_quantity&quot; : 2
      },
      &quot;search_query&quot; : &quot;boots&quot;,
      &quot;order_id&quot; : &quot;X-151481&quot;,
      &quot;value&quot; : &quot;199.98&quot;
    },
    &quot;seed_id&quot; : [ &quot;2542620639259&quot;, &quot;2542620639261&quot; ],
    &quot;url&quot; : [ &quot;url&quot;, &quot;url&quot; ],
    &quot;ad_account_id&quot; : &quot;549755885175&quot;,
    &quot;ingestion_source&quot; : {
      &quot;&#x3D;&quot; : [ &quot;tag&quot; ]
    },
    &quot;ad_id&quot; : [ &quot;687201361754&quot; ],
    &quot;retention_days&quot; : 30,
    &quot;engager_type&quot; : 1,
    &quot;engagement_type&quot; : &quot;click&quot;,
    &quot;percentage&quot; : 3,
    &quot;engagement_domain&quot; : [ &quot;www.somedomain.com&quot; ],
    &quot;event&quot; : &quot;checkout&quot;,
    &quot;pin_id&quot; : [ &quot;34567&quot; ],
    &quot;campaign_id&quot; : [ &quot;626744528398&quot; ]
  },
  &quot;description&quot; : &quot;string&quot;,
  &quot;ad_account_id&quot; : &quot;549755885175&quot;
}"
  AudiencesCreateExamples <- AudiencesCreateExamples.Add("application/json", AudiencesCreateBody)

  let getAudiencesCreateExample mediaType =
    AudiencesCreateExamples.[mediaType]
      |> getConverter mediaType

  let mutable AudiencesCreateCustomExamples = Map.empty
  let mutable AudiencesCreateCustomBody = ""

  AudiencesCreateCustomBody <- WebUtility.HtmlDecode "{
  &quot;name&quot; : &quot;string&quot;,
  &quot;rule&quot; : {
    &quot;country&quot; : &quot;US&quot;,
    &quot;visitor_source_id&quot; : &quot;549755885175&quot;,
    &quot;prefill&quot; : true,
    &quot;customer_list_id&quot; : &quot;5497558859876&quot;,
    &quot;event_source&quot; : {
      &quot;&#x3D;&quot; : [ &quot;web&quot;, &quot;mobile&quot; ]
    },
    &quot;objective_type&quot; : [ &quot;AWARENESS&quot; ],
    &quot;event_data&quot; : {
      &quot;video_title&quot; : &quot;How to style your Parker Boots&quot;,
      &quot;page_name&quot; : &quot;Our Favorite Pins on Pinterest.&quot;,
      &quot;order_quantity&quot; : 1,
      &quot;property&quot; : &quot;Athleta&quot;,
      &quot;currency&quot; : &quot;USD&quot;,
      &quot;lead_type&quot; : &quot;Newsletter&quot;,
      &quot;promo_code&quot; : &quot;WINTER10&quot;,
      &quot;line_items&quot; : {
        &quot;product_id&quot; : 1414,
        &quot;product_variant&quot; : &quot;Red&quot;,
        &quot;product_brand&quot; : &quot;Parker&quot;,
        &quot;product_price&quot; : &quot;99.99&quot;,
        &quot;product_variant_id&quot; : &quot;1414-34832&quot;,
        &quot;product_name&quot; : &quot;Parker Boots&quot;,
        &quot;product_category&quot; : &quot;Shoes&quot;,
        &quot;product_quantity&quot; : 2
      },
      &quot;search_query&quot; : &quot;boots&quot;,
      &quot;order_id&quot; : &quot;X-151481&quot;,
      &quot;value&quot; : &quot;199.98&quot;
    },
    &quot;seed_id&quot; : [ &quot;2542620639259&quot;, &quot;2542620639261&quot; ],
    &quot;url&quot; : [ &quot;url&quot;, &quot;url&quot; ],
    &quot;ad_account_id&quot; : &quot;549755885175&quot;,
    &quot;ingestion_source&quot; : {
      &quot;&#x3D;&quot; : [ &quot;tag&quot; ]
    },
    &quot;ad_id&quot; : [ &quot;687201361754&quot; ],
    &quot;retention_days&quot; : 30,
    &quot;engager_type&quot; : 1,
    &quot;engagement_type&quot; : &quot;click&quot;,
    &quot;percentage&quot; : 3,
    &quot;engagement_domain&quot; : [ &quot;www.somedomain.com&quot; ],
    &quot;event&quot; : &quot;checkout&quot;,
    &quot;pin_id&quot; : [ &quot;34567&quot; ],
    &quot;campaign_id&quot; : [ &quot;626744528398&quot; ]
  },
  &quot;category&quot; : &quot;DLX Demographics&quot;,
  &quot;ad_account_id&quot; : &quot;549755885175&quot;
}"
  AudiencesCreateCustomExamples <- AudiencesCreateCustomExamples.Add("application/json", AudiencesCreateCustomBody)

  let getAudiencesCreateCustomExample mediaType =
    AudiencesCreateCustomExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()


  let mutable AudiencesUpdateExamples = Map.empty
  let mutable AudiencesUpdateBody = ""

  AudiencesUpdateBody <- WebUtility.HtmlDecode "{
  &quot;operation_type&quot; : &quot;UPDATE&quot;,
  &quot;name&quot; : &quot;string&quot;,
  &quot;rule&quot; : {
    &quot;country&quot; : &quot;US&quot;,
    &quot;visitor_source_id&quot; : &quot;549755885175&quot;,
    &quot;prefill&quot; : true,
    &quot;customer_list_id&quot; : &quot;5497558859876&quot;,
    &quot;event_source&quot; : {
      &quot;&#x3D;&quot; : [ &quot;web&quot;, &quot;mobile&quot; ]
    },
    &quot;objective_type&quot; : [ &quot;AWARENESS&quot; ],
    &quot;event_data&quot; : {
      &quot;video_title&quot; : &quot;How to style your Parker Boots&quot;,
      &quot;page_name&quot; : &quot;Our Favorite Pins on Pinterest.&quot;,
      &quot;order_quantity&quot; : 1,
      &quot;property&quot; : &quot;Athleta&quot;,
      &quot;currency&quot; : &quot;USD&quot;,
      &quot;lead_type&quot; : &quot;Newsletter&quot;,
      &quot;promo_code&quot; : &quot;WINTER10&quot;,
      &quot;line_items&quot; : {
        &quot;product_id&quot; : 1414,
        &quot;product_variant&quot; : &quot;Red&quot;,
        &quot;product_brand&quot; : &quot;Parker&quot;,
        &quot;product_price&quot; : &quot;99.99&quot;,
        &quot;product_variant_id&quot; : &quot;1414-34832&quot;,
        &quot;product_name&quot; : &quot;Parker Boots&quot;,
        &quot;product_category&quot; : &quot;Shoes&quot;,
        &quot;product_quantity&quot; : 2
      },
      &quot;search_query&quot; : &quot;boots&quot;,
      &quot;order_id&quot; : &quot;X-151481&quot;,
      &quot;value&quot; : &quot;199.98&quot;
    },
    &quot;seed_id&quot; : [ &quot;2542620639259&quot;, &quot;2542620639261&quot; ],
    &quot;url&quot; : [ &quot;url&quot;, &quot;url&quot; ],
    &quot;ad_account_id&quot; : &quot;549755885175&quot;,
    &quot;ingestion_source&quot; : {
      &quot;&#x3D;&quot; : [ &quot;tag&quot; ]
    },
    &quot;ad_id&quot; : [ &quot;687201361754&quot; ],
    &quot;retention_days&quot; : 30,
    &quot;engager_type&quot; : 1,
    &quot;engagement_type&quot; : &quot;click&quot;,
    &quot;percentage&quot; : 3,
    &quot;engagement_domain&quot; : [ &quot;www.somedomain.com&quot; ],
    &quot;event&quot; : &quot;checkout&quot;,
    &quot;pin_id&quot; : [ &quot;34567&quot; ],
    &quot;campaign_id&quot; : [ &quot;626744528398&quot; ]
  },
  &quot;description&quot; : &quot;string&quot;,
  &quot;ad_account_id&quot; : &quot;549755885175&quot;
}"
  AudiencesUpdateExamples <- AudiencesUpdateExamples.Add("application/json", AudiencesUpdateBody)

  let getAudiencesUpdateExample mediaType =
    AudiencesUpdateExamples.[mediaType]
      |> getConverter mediaType
