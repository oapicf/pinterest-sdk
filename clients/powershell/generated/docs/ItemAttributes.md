# ItemAttributes
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdLink** | **String** | Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://. | [optional] 
**Adult** | **Boolean** | Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest. | [optional] 
**AgeGroup** | **String** | The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’. | [optional] 
**Availability** | **String** | The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’. | [optional] 
**AverageReviewRating** | **Decimal** | Average reviews for the item. Can be a number from 1-5. | [optional] 
**Brand** | **String** | The brand of the product. | [optional] 
**CheckoutEnabled** | **Boolean** | This attribute is not supported anymore. | [optional] 
**Color** | **String** | The primary color of the product. | [optional] 
**Condition** | **String** | The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’. | [optional] 
**CustomLabel0** | **String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**CustomLabel1** | **String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**CustomLabel2** | **String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**CustomLabel3** | **String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**CustomLabel4** | **String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**Description** | **String** | &lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt; | [optional] 
**FreeShippingLabel** | **Boolean** | The item is free to ship. | [optional] 
**FreeShippingLimit** | **String** | The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered. | [optional] 
**Gender** | **String** | The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’. | [optional] 
**GoogleProductCategory** | **String** | The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. | [optional] 
**Gtin** | **Int32** | The unique universal product identifier. | [optional] 
**Id** | **String** | &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt; | [optional] 
**ItemGroupId** | **String** | &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt; | [optional] 
**LastUpdatedTime** | **Int64** | The millisecond timestamp when the item was lastly modified by the merchant. | [optional] 
**Link** | **String** | &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt; | [optional] 
**Material** | **String** | The material used to make the product. | [optional] 
**MinAdPrice** | **String** | The minimum advertised price of the product. It supports the following formats, &quot;&quot;19.99 USD&quot;&quot;, &quot;&quot;19.99USD&quot;&quot; and &quot;&quot;19.99&quot;&quot;. If the currency is not included, we default to US dollars. | [optional] 
**MobileLink** | **String** | The mobile-optimized version of your landing page. Must begin with http:// or https://. | [optional] 
**Mpn** | **String** | Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer. | [optional] 
**NumberOfRatings** | **Int32** | The number of ratings for the item. | [optional] 
**NumberOfReviews** | **Int32** | The number of reviews available for the item. | [optional] 
**Pattern** | **String** | The description of the pattern used for the product. | [optional] 
**Price** | **String** | The price of the product. It supports the following formats, &quot;&quot;24.99 USD&quot;&quot;, &quot;&quot;24.99USD&quot;&quot; and &quot;&quot;24.99&quot;&quot;. If the currency is not included, we default to US dollars. | [optional] 
**ProductType** | **String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt; | [optional] 
**SalePrice** | **String** | The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, &quot;&quot;14.99 USD&quot;&quot;, &quot;&quot;14.99USD&quot;&quot; and &quot;&quot;14.99&quot;&quot;. If the currency is not included, we default to US dollars. | [optional] 
**Shipping** | **String** | Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required. | [optional] 
**ShippingHeight** | **String** | The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. | [optional] 
**ShippingWeight** | **String** | The weight of the product. Ensure there is a space between the numeric string and the metric. | [optional] 
**ShippingWidth** | **String** | The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. | [optional] 
**Size** | **String** | The size of the product. | [optional] 
**SizeSystem** | **String** | Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’. | [optional] 
**SizeType** | **String** | Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’. | [optional] 
**Tax** | **String** | Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required. | [optional] 
**Title** | **String** | &lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt; | [optional] 
**VariantNames** | **String[]** | Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. | [optional] 
**VariantValues** | **String[]** | Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names. | [optional] 
**AdditionalImageLink** | **String[]** | &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.&lt;/p&gt; | [optional] 
**ImageLink** | **String[]** | &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.&lt;/p&gt; | [optional] 

## Examples

- Prepare the resource
```powershell
$ItemAttributes = Initialize-PSOpenAPIToolsItemAttributes  -AdLink https://www.example.com/cat/denim-shirt/item012?utm_source&#x3D;Pinterest `
 -Adult true `
 -AgeGroup newborn `
 -Availability in stock `
 -AverageReviewRating 5 `
 -Brand Josie’s Denim `
 -CheckoutEnabled false `
 -Color blue `
 -Condition new `
 -CustomLabel0 Best sellers `
 -CustomLabel1 Summer promotion `
 -CustomLabel2 Winter sales `
 -CustomLabel3 Woman dress `
 -CustomLabel4 Man hat `
 -Description Casual fit denim shirt made with the finest quality Japanese denim. `
 -FreeShippingLabel true `
 -FreeShippingLimit 35 USD `
 -Gender unisex `
 -GoogleProductCategory Apparel &amp; Accessories &gt; Clothing &gt; Shirts &amp; Tops `
 -Gtin 3234567890126 `
 -Id DS0294-L `
 -ItemGroupId DS0294 `
 -LastUpdatedTime 1641483432072 `
 -Link https://www.example.com/cat/womens-clothing/denim-shirt-0294 `
 -Material cotton `
 -MinAdPrice 19.99 USD `
 -MobileLink https://m.example.com/cat/womens-clothing/denim-shirt-0294 `
 -Mpn PI12345NTEREST `
 -NumberOfRatings 10 `
 -NumberOfReviews 10 `
 -Pattern plaid `
 -Price 24.99 USD `
 -ProductType Clothing &gt; Women’s &gt; Shirts &gt; Denim `
 -SalePrice 14.99 USD `
 -Shipping US:CA:Ground:0 USD `
 -ShippingHeight 12 in `
 -ShippingWeight 3 kg `
 -ShippingWidth 16 in `
 -Size M `
 -SizeSystem US `
 -SizeType regular `
 -Tax US:1025433:6.00:y `
 -Title Women’s denim shirt, large `
 -VariantNames [Color, Size] `
 -VariantValues [Red, Small] `
 -AdditionalImageLink [&quot;https://scene.example.com/image/image_v2.jpg&quot;,&quot;https://scene.example.com/image/image_v3.jpg&quot;] `
 -ImageLink [&quot;https://scene.example.com/image/image.jpg&quot;]
```

- Convert the resource to JSON
```powershell
$ItemAttributes | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

