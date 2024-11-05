

# ItemAttributes

The class is defined in **[ItemAttributes.java](../../src/main/java/org/openapitools/model/ItemAttributes.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adLink** | `String` | Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://. |  [optional property]
**adult** | `Boolean` | Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest. |  [optional property]
**ageGroup** | `String` | The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’. |  [optional property]
**availability** | `String` | The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’. |  [optional property]
**averageReviewRating** | `BigDecimal` | Average reviews for the item. Can be a number from 1-5. |  [optional property]
**brand** | `String` | The brand of the product. |  [optional property]
**checkoutEnabled** | `Boolean` | This attribute is not supported anymore. |  [optional property]
**color** | `String` | The primary color of the product. |  [optional property]
**condition** | `String` | The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’. |  [optional property]
**customLabel0** | `String` | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; |  [optional property]
**customLabel1** | `String` | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; |  [optional property]
**customLabel2** | `String` | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; |  [optional property]
**customLabel3** | `String` | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; |  [optional property]
**customLabel4** | `String` | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; |  [optional property]
**description** | `String` | &lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt; |  [optional property]
**freeShippingLabel** | `Boolean` | The item is free to ship. |  [optional property]
**freeShippingLimit** | `String` | The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered. |  [optional property]
**gender** | `String` | The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’. |  [optional property]
**googleProductCategory** | `String` | The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. |  [optional property]
**gtin** | `Integer` | The unique universal product identifier. |  [optional property]
**id** | `String` | &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt; |  [optional property]
**itemGroupId** | `String` | &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt; |  [optional property]
**lastUpdatedTime** | `Long` | The millisecond timestamp when the item was lastly modified by the merchant. |  [optional property]
**link** | `String` | &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt; |  [optional property]
**material** | `String` | The material used to make the product. |  [optional property]
**minAdPrice** | `String` | The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars. |  [optional property]
**mobileLink** | `String` | The mobile-optimized version of your landing page. Must begin with http:// or https://. |  [optional property]
**mpn** | `String` | Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer. |  [optional property]
**numberOfRatings** | `Integer` | The number of ratings for the item. |  [optional property]
**numberOfReviews** | `Integer` | The number of reviews available for the item. |  [optional property]
**pattern** | `String` | The description of the pattern used for the product. |  [optional property]
**price** | `String` | The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. |  [optional property]
**productType** | `String` | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt; |  [optional property]
**salePrice** | `String` | The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars. |  [optional property]
**shipping** | `String` | Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required. |  [optional property]
**shippingHeight** | `String` | The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. |  [optional property]
**shippingWeight** | `String` | The weight of the product. Ensure there is a space between the numeric string and the metric. |  [optional property]
**shippingWidth** | `String` | The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. |  [optional property]
**size** | `String` | The size of the product. |  [optional property]
**sizeSystem** | `String` | Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’. |  [optional property]
**sizeType** | `String` | Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’. |  [optional property]
**tax** | `String` | Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required. |  [optional property]
**title** | `String` | &lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt; |  [optional property]
**variantNames** | `List&lt;String&gt;` | Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. |  [optional property]
**variantValues** | `List&lt;String&gt;` | Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names. |  [optional property]
**additionalImageLink** | `List&lt;String&gt;` | &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.&lt;/p&gt; |  [optional property]
**imageLink** | `List&lt;String&gt;` | &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.&lt;/p&gt; |  [optional property]
**videoLink** | `String` | &lt;p&gt;&lt;&#x3D; 2,000 characters&lt;/p&gt; &lt;p&gt;Hosted link to the product video.&lt;/p&gt; &lt;p&gt;File types for linked videos must be .mp4, .mov or .m4v.&lt;/p&gt; &lt;p&gt;File size cannot exceed 2GB.&lt;/p&gt; |  [optional property]


















































