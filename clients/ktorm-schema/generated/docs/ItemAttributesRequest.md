
# Table `ItemAttributesRequest`
(mapped from: ItemAttributesRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adLink** | ad_link | text |  | **kotlin.String** | Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://. |  [optional]
**adult** | adult | boolean |  | **kotlin.Boolean** | Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest. |  [optional]
**ageGroup** | age_group | text |  | **kotlin.String** | The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’. |  [optional]
**availability** | availability | text |  | **kotlin.String** | The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’. |  [optional]
**averageReviewRating** | average_review_rating | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Average reviews for the item. Can be a number from 1-5. |  [optional]
**brand** | brand | text |  | **kotlin.String** | The brand of the product. |  [optional]
**checkoutEnabled** | checkout_enabled | boolean |  | **kotlin.Boolean** | This attribute is not supported anymore. |  [optional]
**color** | color | text |  | **kotlin.String** | The primary color of the product. |  [optional]
**condition** | condition | text |  | **kotlin.String** | The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’. |  [optional]
**customLabel0** | custom_label_0 | text |  | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; |  [optional]
**customLabel1** | custom_label_1 | text |  | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; |  [optional]
**customLabel2** | custom_label_2 | text |  | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; |  [optional]
**customLabel3** | custom_label_3 | text |  | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; |  [optional]
**customLabel4** | custom_label_4 | text |  | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; |  [optional]
**description** | description | text |  | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt; |  [optional]
**freeShippingLabel** | free_shipping_label | boolean |  | **kotlin.Boolean** | The item is free to ship. |  [optional]
**freeShippingLimit** | free_shipping_limit | text |  | **kotlin.String** | The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered. |  [optional]
**gender** | gender | text |  | **kotlin.String** | The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’. |  [optional]
**googleProductCategory** | google_product_category | text |  | **kotlin.String** | The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. |  [optional]
**gtin** | gtin | int |  | **kotlin.Int** | The unique universal product identifier. |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt; |  [optional]
**itemGroupId** | item_group_id | text |  | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt; |  [optional]
**lastUpdatedTime** | last_updated_time | long |  | **kotlin.Long** | The millisecond timestamp when the item was lastly modified by the merchant. |  [optional]
**link** | link | text |  | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt; |  [optional]
**material** | material | text |  | **kotlin.String** | The material used to make the product. |  [optional]
**minAdPrice** | min_ad_price | text |  | **kotlin.String** | The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars. |  [optional]
**mobileLink** | mobile_link | text |  | **kotlin.String** | The mobile-optimized version of your landing page. Must begin with http:// or https://. |  [optional]
**mpn** | mpn | text |  | **kotlin.String** | Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer. |  [optional]
**numberOfRatings** | number_of_ratings | int |  | **kotlin.Int** | The number of ratings for the item. |  [optional]
**numberOfReviews** | number_of_reviews | int |  | **kotlin.Int** | The number of reviews available for the item. |  [optional]
**pattern** | pattern | text |  | **kotlin.String** | The description of the pattern used for the product. |  [optional]
**price** | price | text |  | **kotlin.String** | The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. |  [optional]
**productType** | product_type | text |  | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt; |  [optional]
**salePrice** | sale_price | text |  | **kotlin.String** | The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars. |  [optional]
**shipping** | shipping | text |  | **kotlin.String** | Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required. |  [optional]
**shippingHeight** | shipping_height | text |  | **kotlin.String** | The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. |  [optional]
**shippingWeight** | shipping_weight | text |  | **kotlin.String** | The weight of the product. Ensure there is a space between the numeric string and the metric. |  [optional]
**shippingWidth** | shipping_width | text |  | **kotlin.String** | The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. |  [optional]
**propertySize** | size | text |  | **kotlin.String** | The size of the product. |  [optional]
**sizeSystem** | size_system | text |  | **kotlin.String** | Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’. |  [optional]
**sizeType** | size_type | text |  | **kotlin.String** | Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’. |  [optional]
**tax** | tax | text |  | **kotlin.String** | Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required. |  [optional]
**title** | title | text |  | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt; |  [optional]
**variantNames** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. |  [optional]
**variantValues** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names. |  [optional]
**additionalImageLink** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.&lt;/p&gt; |  [optional]
**imageLink** | image_link | long |  | [**ItemAttributesRequestAllOfImageLink**](ItemAttributesRequestAllOfImageLink.md) |  |  [optional] [foreignkey]
**videoLink** | video_link | text |  | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 2,000 characters&lt;/p&gt; &lt;p&gt;Hosted link to the product video.&lt;/p&gt; &lt;p&gt;File types for linked videos must be .mp4, .mov or .m4v.&lt;/p&gt; &lt;p&gt;File size cannot exceed 2GB.&lt;/p&gt; |  [optional]













































# **Table `ItemAttributesRequestVariantNames`**
(mapped from: ItemAttributesRequestVariantNames)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemAttributesRequest | itemAttributesRequest | long | | kotlin.Long | Primary Key | *one*
variantNames | variantNames | text | | kotlin.String | Foreign Key | *many*



# **Table `ItemAttributesRequestVariantValues`**
(mapped from: ItemAttributesRequestVariantValues)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemAttributesRequest | itemAttributesRequest | long | | kotlin.Long | Primary Key | *one*
variantValues | variantValues | text | | kotlin.String | Foreign Key | *many*



# **Table `ItemAttributesRequestAdditionalImageLink`**
(mapped from: ItemAttributesRequestAdditionalImageLink)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemAttributesRequest | itemAttributesRequest | long | | kotlin.Long | Primary Key | *one*
additionalImageLink | additionalImageLink | text | | kotlin.String | Foreign Key | *many*





