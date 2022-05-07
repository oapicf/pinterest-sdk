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
open OpenAPI.CatalogsApiHandler
open OpenAPI.CatalogsApiHandlerParams

module CatalogsApiHandlerTestsHelper =


  let mutable CatalogsProductGroupsCreateExamples = Map.empty
  let mutable CatalogsProductGroupsCreateBody = ""

  CatalogsProductGroupsCreateBody <- WebUtility.HtmlDecode "{
  &quot;name&quot; : &quot;name&quot;,
  &quot;description&quot; : &quot;description&quot;,
  &quot;feed_id&quot; : &quot;2680059592705&quot;
}"
  CatalogsProductGroupsCreateExamples <- CatalogsProductGroupsCreateExamples.Add("application/json", CatalogsProductGroupsCreateBody)

  let getCatalogsProductGroupsCreateExample mediaType =
    CatalogsProductGroupsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()


  let mutable CatalogsProductGroupsUpdateExamples = Map.empty
  let mutable CatalogsProductGroupsUpdateBody = ""

  CatalogsProductGroupsUpdateBody <- WebUtility.HtmlDecode "{
  &quot;name&quot; : &quot;name&quot;,
  &quot;description&quot; : &quot;description&quot;,
  &quot;feed_id&quot; : &quot;2680059592705&quot;
}"
  CatalogsProductGroupsUpdateExamples <- CatalogsProductGroupsUpdateExamples.Add("application/json", CatalogsProductGroupsUpdateBody)

  let getCatalogsProductGroupsUpdateExample mediaType =
    CatalogsProductGroupsUpdateExamples.[mediaType]
      |> getConverter mediaType
  ()


  let mutable FeedsCreateExamples = Map.empty
  let mutable FeedsCreateBody = ""

  FeedsCreateBody <- WebUtility.HtmlDecode "{
  &quot;credentials&quot; : {
    &quot;password&quot; : &quot;password&quot;,
    &quot;username&quot; : &quot;username&quot;
  },
  &quot;name&quot; : &quot;name&quot;,
  &quot;preferred_processing_schedule&quot; : {
    &quot;timezone&quot; : &quot;Africa/Abidjan&quot;,
    &quot;time&quot; : &quot;02:59&quot;
  },
  &quot;default_locale&quot; : &quot;en_US&quot;,
  &quot;location&quot; : &quot;location&quot;,
  &quot;default_currency&quot; : &quot;USD&quot;,
  &quot;default_country&quot; : &quot;US&quot;
}"
  FeedsCreateExamples <- FeedsCreateExamples.Add("application/json", FeedsCreateBody)

  let getFeedsCreateExample mediaType =
    FeedsCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()


  let mutable FeedsUpdateExamples = Map.empty
  let mutable FeedsUpdateBody = ""

  FeedsUpdateBody <- WebUtility.HtmlDecode "{
  &quot;credentials&quot; : {
    &quot;password&quot; : &quot;password&quot;,
    &quot;username&quot; : &quot;username&quot;
  },
  &quot;name&quot; : &quot;name&quot;,
  &quot;preferred_processing_schedule&quot; : {
    &quot;timezone&quot; : &quot;Africa/Abidjan&quot;,
    &quot;time&quot; : &quot;02:59&quot;
  },
  &quot;location&quot; : &quot;location&quot;,
  &quot;default_currency&quot; : &quot;USD&quot;
}"
  FeedsUpdateExamples <- FeedsUpdateExamples.Add("application/json", FeedsUpdateBody)

  let getFeedsUpdateExample mediaType =
    FeedsUpdateExamples.[mediaType]
      |> getConverter mediaType
  ()


  let mutable ItemsBatchPostExamples = Map.empty
  let mutable ItemsBatchPostBody = ""

  ItemsBatchPostBody <- WebUtility.HtmlDecode "{
  &quot;country&quot; : &quot;US&quot;,
  &quot;language&quot; : &quot;EN&quot;,
  &quot;operation&quot; : &quot;UPDATE&quot;,
  &quot;items&quot; : [ {
    &quot;item_id&quot; : &quot;DS0294-M&quot;,
    &quot;attributes&quot; : {
      &quot;custom_label_4&quot; : &quot;Man hat&quot;,
      &quot;custom_label_3&quot; : &quot;Woman dress&quot;,
      &quot;custom_label_2&quot; : &quot;Winter sales&quot;,
      &quot;shipping_width&quot; : &quot;16 in&quot;,
      &quot;custom_label_1&quot; : &quot;Summer promotion&quot;,
      &quot;color&quot; : &quot;blue&quot;,
      &quot;gender&quot; : &quot;unisex&quot;,
      &quot;item_group_id&quot; : &quot;DS0294&quot;,
      &quot;link&quot; : &quot;https://www.example.com/cat/womens-clothing/denim-shirt-0294&quot;,
      &quot;pattern&quot; : &quot;plaid&quot;,
      &quot;additional_image_link&quot; : [ &quot;https://scene.example.com/image/image_v2.jpg&quot;, &quot;https://scene.example.com/image/image_v3.jpg&quot; ],
      &quot;description&quot; : &quot;Casual fit denim shirt made with the finest quality Japanese denim.&quot;,
      &quot;availability&quot; : &quot;in stock&quot;,
      &quot;number_of_reviews&quot; : 10,
      &quot;custom_label_0&quot; : &quot;Best sellers&quot;,
      &quot;title&quot; : &quot;Women’s denim shirt, large&quot;,
      &quot;average_review_rating&quot; : 5,
      &quot;shipping&quot; : &quot;US:CA:Ground:0 USD&quot;,
      &quot;price&quot; : &quot;24.99 USD&quot;,
      &quot;ad_link&quot; : &quot;https://www.example.com/cat/denim-shirt/item012?utm_source&#x3D;Pinterest&quot;,
      &quot;mobile_link&quot; : &quot;https://m.example.com/cat/womens-clothing/denim-shirt-0294&quot;,
      &quot;id&quot; : &quot;DS0294-L&quot;,
      &quot;min_ad_price&quot; : &quot;19.99 USD&quot;,
      &quot;brand&quot; : &quot;Josie’s Denim&quot;,
      &quot;google_product_category&quot; : &quot;Apparel &amp; Accessories &gt; Clothing &gt; Shirts &amp; Tops&quot;,
      &quot;gtin&quot; : 3234567890126,
      &quot;image_link&quot; : [ &quot;https://scene.example.com/image/image.jpg&quot; ],
      &quot;size_type&quot; : &quot;regular&quot;,
      &quot;age_group&quot; : &quot;newborn&quot;,
      &quot;free_shipping_label&quot; : true,
      &quot;free_shipping_limit&quot; : &quot;35 USD&quot;,
      &quot;mpn&quot; : &quot;PI12345NTEREST&quot;,
      &quot;tax&quot; : &quot;US:1025433:6.00:y&quot;,
      &quot;sale_price&quot; : &quot;14.99 USD&quot;,
      &quot;shipping_height&quot; : &quot;12 in&quot;,
      &quot;condition&quot; : &quot;new&quot;,
      &quot;product_type&quot; : &quot;Clothing &gt; Women’s &gt; Shirts &gt; Denim&quot;,
      &quot;last_updated_time&quot; : 1641483432072,
      &quot;material&quot; : &quot;cotton&quot;,
      &quot;size&quot; : &quot;M&quot;,
      &quot;size_system&quot; : &quot;US&quot;,
      &quot;number_of_ratings&quot; : 10,
      &quot;shipping_weight&quot; : &quot;3 kg&quot;,
      &quot;adult&quot; : true
    }
  }, {
    &quot;item_id&quot; : &quot;DS0294-M&quot;,
    &quot;attributes&quot; : {
      &quot;custom_label_4&quot; : &quot;Man hat&quot;,
      &quot;custom_label_3&quot; : &quot;Woman dress&quot;,
      &quot;custom_label_2&quot; : &quot;Winter sales&quot;,
      &quot;shipping_width&quot; : &quot;16 in&quot;,
      &quot;custom_label_1&quot; : &quot;Summer promotion&quot;,
      &quot;color&quot; : &quot;blue&quot;,
      &quot;gender&quot; : &quot;unisex&quot;,
      &quot;item_group_id&quot; : &quot;DS0294&quot;,
      &quot;link&quot; : &quot;https://www.example.com/cat/womens-clothing/denim-shirt-0294&quot;,
      &quot;pattern&quot; : &quot;plaid&quot;,
      &quot;additional_image_link&quot; : [ &quot;https://scene.example.com/image/image_v2.jpg&quot;, &quot;https://scene.example.com/image/image_v3.jpg&quot; ],
      &quot;description&quot; : &quot;Casual fit denim shirt made with the finest quality Japanese denim.&quot;,
      &quot;availability&quot; : &quot;in stock&quot;,
      &quot;number_of_reviews&quot; : 10,
      &quot;custom_label_0&quot; : &quot;Best sellers&quot;,
      &quot;title&quot; : &quot;Women’s denim shirt, large&quot;,
      &quot;average_review_rating&quot; : 5,
      &quot;shipping&quot; : &quot;US:CA:Ground:0 USD&quot;,
      &quot;price&quot; : &quot;24.99 USD&quot;,
      &quot;ad_link&quot; : &quot;https://www.example.com/cat/denim-shirt/item012?utm_source&#x3D;Pinterest&quot;,
      &quot;mobile_link&quot; : &quot;https://m.example.com/cat/womens-clothing/denim-shirt-0294&quot;,
      &quot;id&quot; : &quot;DS0294-L&quot;,
      &quot;min_ad_price&quot; : &quot;19.99 USD&quot;,
      &quot;brand&quot; : &quot;Josie’s Denim&quot;,
      &quot;google_product_category&quot; : &quot;Apparel &amp; Accessories &gt; Clothing &gt; Shirts &amp; Tops&quot;,
      &quot;gtin&quot; : 3234567890126,
      &quot;image_link&quot; : [ &quot;https://scene.example.com/image/image.jpg&quot; ],
      &quot;size_type&quot; : &quot;regular&quot;,
      &quot;age_group&quot; : &quot;newborn&quot;,
      &quot;free_shipping_label&quot; : true,
      &quot;free_shipping_limit&quot; : &quot;35 USD&quot;,
      &quot;mpn&quot; : &quot;PI12345NTEREST&quot;,
      &quot;tax&quot; : &quot;US:1025433:6.00:y&quot;,
      &quot;sale_price&quot; : &quot;14.99 USD&quot;,
      &quot;shipping_height&quot; : &quot;12 in&quot;,
      &quot;condition&quot; : &quot;new&quot;,
      &quot;product_type&quot; : &quot;Clothing &gt; Women’s &gt; Shirts &gt; Denim&quot;,
      &quot;last_updated_time&quot; : 1641483432072,
      &quot;material&quot; : &quot;cotton&quot;,
      &quot;size&quot; : &quot;M&quot;,
      &quot;size_system&quot; : &quot;US&quot;,
      &quot;number_of_ratings&quot; : 10,
      &quot;shipping_weight&quot; : &quot;3 kg&quot;,
      &quot;adult&quot; : true
    }
  } ]
}"
  ItemsBatchPostExamples <- ItemsBatchPostExamples.Add("application/json", ItemsBatchPostBody)

  let getItemsBatchPostExample mediaType =
    ItemsBatchPostExamples.[mediaType]
      |> getConverter mediaType
  ()

