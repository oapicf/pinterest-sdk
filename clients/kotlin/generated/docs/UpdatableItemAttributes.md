
# UpdatableItemAttributes

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **adLink** | **kotlin.String** | Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://. |  [optional] |
| **adult** | **kotlin.Boolean** | Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest. |  [optional] |
| **ageGroup** | **kotlin.String** | The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’. |  [optional] |
| **availability** | **kotlin.String** | The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’. |  [optional] |
| **averageReviewRating** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Average reviews for the item. Can be a number from 1-5. |  [optional] |
| **brand** | **kotlin.String** | The brand of the product. |  [optional] |
| **checkoutEnabled** | **kotlin.Boolean** | This attribute is not supported anymore. |  [optional] |
| **color** | **kotlin.String** | The primary color of the product. |  [optional] |
| **condition** | **kotlin.String** | The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’. |  [optional] |
| **customLabel0** | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; |  [optional] |
| **customLabel1** | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; |  [optional] |
| **customLabel2** | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; |  [optional] |
| **customLabel3** | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; |  [optional] |
| **customLabel4** | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; |  [optional] |
| **description** | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt; |  [optional] |
| **freeShippingLabel** | **kotlin.Boolean** | The item is free to ship. |  [optional] |
| **freeShippingLimit** | **kotlin.String** | The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered. |  [optional] |
| **gender** | **kotlin.String** | The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’. |  [optional] |
| **googleProductCategory** | **kotlin.String** | The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. |  [optional] |
| **gtin** | **kotlin.Int** | The unique universal product identifier. |  [optional] |
| **id** | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt; |  [optional] |
| **itemGroupId** | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt; |  [optional] |
| **lastUpdatedTime** | **kotlin.Long** | The millisecond timestamp when the item was lastly modified by the merchant. |  [optional] |
| **link** | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt; |  [optional] |
| **material** | **kotlin.String** | The material used to make the product. |  [optional] |
| **minAdPrice** | **kotlin.String** | The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars. |  [optional] |
| **mobileLink** | **kotlin.String** | The mobile-optimized version of your landing page. Must begin with http:// or https://. |  [optional] |
| **mpn** | **kotlin.String** | Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer. |  [optional] |
| **numberOfRatings** | **kotlin.Int** | The number of ratings for the item. |  [optional] |
| **numberOfReviews** | **kotlin.Int** | The number of reviews available for the item. |  [optional] |
| **pattern** | **kotlin.String** | The description of the pattern used for the product. |  [optional] |
| **price** | **kotlin.String** | The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. |  [optional] |
| **productType** | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt; |  [optional] |
| **salePrice** | **kotlin.String** | The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars. |  [optional] |
| **shipping** | **kotlin.String** | Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required. |  [optional] |
| **shippingHeight** | **kotlin.String** | The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. |  [optional] |
| **shippingWeight** | **kotlin.String** | The weight of the product. Ensure there is a space between the numeric string and the metric. |  [optional] |
| **shippingWidth** | **kotlin.String** | The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. |  [optional] |
| **propertySize** | **kotlin.String** | The size of the product. |  [optional] |
| **sizeSystem** | **kotlin.String** | Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’. |  [optional] |
| **sizeType** | **kotlin.String** | Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’. |  [optional] |
| **tax** | **kotlin.String** | Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required. |  [optional] |
| **title** | **kotlin.String** | &lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt; |  [optional] |
| **variantNames** | **kotlin.collections.List&lt;kotlin.String&gt;** | Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. |  [optional] |
| **variantValues** | **kotlin.collections.List&lt;kotlin.String&gt;** | Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names. |  [optional] |



