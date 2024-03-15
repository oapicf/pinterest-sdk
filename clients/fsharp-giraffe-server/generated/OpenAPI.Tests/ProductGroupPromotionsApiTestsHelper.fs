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
open OpenAPI.ProductGroupPromotionsApiHandler
open OpenAPI.ProductGroupPromotionsApiHandlerParams

module ProductGroupPromotionsApiHandlerTestsHelper =


  let mutable ProductGroupPromotionsCreateExamples = Map.empty
  let mutable ProductGroupPromotionsCreateBody = ""

  ProductGroupPromotionsCreateBody <- WebUtility.HtmlDecode "{
  &quot;product_group_promotion&quot; : [ {
    &quot;slideshow_collections_description&quot; : &quot;Description&quot;,
    &quot;creative_type&quot; : &quot;REGULAR&quot;,
    &quot;collections_hero_pin_id&quot; : &quot;123123&quot;,
    &quot;catalog_product_group_name&quot; : &quot;catalogProductGroupName&quot;,
    &quot;collections_hero_destination_url&quot; : &quot;http://www.pinterest.com&quot;,
    &quot;tracking_url&quot; : &quot;https://www.pinterest.com&quot;,
    &quot;slideshow_collections_title&quot; : &quot;Title&quot;,
    &quot;is_mdl&quot; : true,
    &quot;status&quot; : &quot;ACTIVE&quot;
  }, {
    &quot;slideshow_collections_description&quot; : &quot;Description&quot;,
    &quot;creative_type&quot; : &quot;REGULAR&quot;,
    &quot;collections_hero_pin_id&quot; : &quot;123123&quot;,
    &quot;catalog_product_group_name&quot; : &quot;catalogProductGroupName&quot;,
    &quot;collections_hero_destination_url&quot; : &quot;http://www.pinterest.com&quot;,
    &quot;tracking_url&quot; : &quot;https://www.pinterest.com&quot;,
    &quot;slideshow_collections_title&quot; : &quot;Title&quot;,
    &quot;is_mdl&quot; : true,
    &quot;status&quot; : &quot;ACTIVE&quot;
  } ],
  &quot;ad_group_id&quot; : &quot;2680059592705&quot;
}"
  ProductGroupPromotionsCreateExamples <- ProductGroupPromotionsCreateExamples.Add("application/json", ProductGroupPromotionsCreateBody)

  let getProductGroupPromotionsCreateExample mediaType =
    ProductGroupPromotionsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()


  let mutable ProductGroupPromotionsUpdateExamples = Map.empty
  let mutable ProductGroupPromotionsUpdateBody = ""

  ProductGroupPromotionsUpdateBody <- WebUtility.HtmlDecode "{
  &quot;product_group_promotion&quot; : [ {
    &quot;catalog_product_group_id&quot; : &quot;1234123&quot;,
    &quot;slideshow_collections_description&quot; : &quot;Description&quot;,
    &quot;creative_type&quot; : &quot;REGULAR&quot;,
    &quot;collections_hero_pin_id&quot; : &quot;123123&quot;,
    &quot;catalog_product_group_name&quot; : &quot;ProductGroupName&quot;,
    &quot;collections_hero_destination_url&quot; : &quot;http://www.pinterest.com&quot;,
    &quot;tracking_url&quot; : &quot;https://www.pinterest.com&quot;,
    &quot;slideshow_collections_title&quot; : &quot;Title&quot;,
    &quot;status&quot; : &quot;ACTIVE&quot;,
    &quot;id&quot; : &quot;2680059592705&quot;
  }, {
    &quot;catalog_product_group_id&quot; : &quot;1231231&quot;,
    &quot;slideshow_collections_description&quot; : &quot;Other description&quot;,
    &quot;creative_type&quot; : &quot;REGULAR&quot;,
    &quot;collections_hero_pin_id&quot; : &quot;123124&quot;,
    &quot;catalog_product_group_name&quot; : &quot;ProductGroupName&quot;,
    &quot;collections_hero_destination_url&quot; : &quot;http://www.pinterest.com&quot;,
    &quot;tracking_url&quot; : &quot;https://www.pinterest.com&quot;,
    &quot;slideshow_collections_title&quot; : &quot;Title&quot;,
    &quot;status&quot; : &quot;ACTIVE&quot;,
    &quot;id&quot; : &quot;2680059592706&quot;
  } ],
  &quot;ad_group_id&quot; : &quot;26823439592705&quot;
}"
  ProductGroupPromotionsUpdateExamples <- ProductGroupPromotionsUpdateExamples.Add("application/json", ProductGroupPromotionsUpdateBody)

  let getProductGroupPromotionsUpdateExample mediaType =
    ProductGroupPromotionsUpdateExamples.[mediaType]
      |> getConverter mediaType
  ()

