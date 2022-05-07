
# Table `ItemAttributes`
(mapped from: ItemAttributes)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adLink** | ad_link | text |  | **kotlin.String** | Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://. |  [optional]
**additionalImageLink** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | The links to additional images for your product. Up to five additional images can be used to show a product from different angles or to show different stages. Separate each additional image with a comma. We recommend enclosing the whole string with quotes. Must begin with http:// or https:// |  [optional]
**adult** | adult | boolean |  | **kotlin.Boolean** | Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest. |  [optional]
**ageGroup** | age_group | text |  | **kotlin.String** | The age group to apply a demographic range to the product. Must be one of the following values: ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, ‘adult’. |  [optional]
**availability** | availability | text |  | **kotlin.String** | The availability of the product. Must be one of the following values: ‘in stock’, ‘out of stock’, ‘preorder’. |  [optional]
**averageReviewRating** | average_review_rating | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Average reviews for the item. Can be a number from 1-5. |  [optional]
**brand** | brand | text |  | **kotlin.String** | The brand of the product. |  [optional]
**color** | color | text |  | **kotlin.String** | The primary color of the product. |  [optional]
**condition** | condition | text |  | **kotlin.String** | The condition of the product. Must be one of the following values: ‘new’, ‘used’, ‘refurbished’. |  [optional]
**customLabel0** | custom_label_0 | text |  | **kotlin.String** | Custom grouping of products. |  [optional]
**customLabel1** | custom_label_1 | text |  | **kotlin.String** | Custom grouping of products. |  [optional]
**customLabel2** | custom_label_2 | text |  | **kotlin.String** | Custom grouping of products. |  [optional]
**customLabel3** | custom_label_3 | text |  | **kotlin.String** | Custom grouping of products. |  [optional]
**customLabel4** | custom_label_4 | text |  | **kotlin.String** | Custom grouping of products. |  [optional]
**description** | description | text |  | **kotlin.String** | The description of the product. |  [optional]
**freeShippingLabel** | free_shipping_label | boolean |  | **kotlin.Boolean** | The item is free to ship. |  [optional]
**freeShippingLimit** | free_shipping_limit | text |  | **kotlin.String** | The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered. |  [optional]
**gender** | gender | text |  | **kotlin.String** | The gender associated with the product. Must be one of the following values: ‘male’, ‘female’, ‘unisex’. |  [optional]
**googleProductCategory** | google_product_category | text |  | **kotlin.String** | The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. |  [optional]
**gtin** | gtin | int |  | **kotlin.Int** | The unique universal product identifier. |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | The user-created unique ID that represents the product. Only Unicode characters are accepted. |  [optional]
**imageLink** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https:// |  [optional]
**itemGroupId** | item_group_id | text |  | **kotlin.String** | The parent ID of the product. |  [optional]
**lastUpdatedTime** | last_updated_time | long |  | **kotlin.Long** | The millisecond timestamp when the item was lastly modified by the merchant. |  [optional]
**link** | link | text |  | **kotlin.String** | The landing page for the product. |  [optional]
**material** | material | text |  | **kotlin.String** | The material used to make the product. |  [optional]
**minAdPrice** | min_ad_price | text |  | **kotlin.String** | The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars. |  [optional]
**mobileLink** | mobile_link | text |  | **kotlin.String** | The mobile-optimized version of your landing page. Must begin with http:// or https://. |  [optional]
**mpn** | mpn | text |  | **kotlin.String** | Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer. |  [optional]
**numberOfRatings** | number_of_ratings | int |  | **kotlin.Int** | The number of ratings for the item. |  [optional]
**numberOfReviews** | number_of_reviews | int |  | **kotlin.Int** | The number of reviews available for the item. |  [optional]
**pattern** | pattern | text |  | **kotlin.String** | The description of the pattern used for the product. |  [optional]
**price** | price | text |  | **kotlin.String** | The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. |  [optional]
**productType** | product_type | text |  | **kotlin.String** | The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe. |  [optional]
**salePrice** | sale_price | text |  | **kotlin.String** | The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars. |  [optional]
**shipping** | shipping | text |  | **kotlin.String** | Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required. |  [optional]
**shippingHeight** | shipping_height | text |  | **kotlin.String** | The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. |  [optional]
**shippingWeight** | shipping_weight | text |  | **kotlin.String** | The weight of the product. Ensure there is a space between the numeric string and the metric. |  [optional]
**shippingWidth** | shipping_width | text |  | **kotlin.String** | The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. |  [optional]
**propertySize** | size | text |  | **kotlin.String** | The size of the product. |  [optional]
**sizeSystem** | size_system | text |  | **kotlin.String** | Indicates the country’s sizing system in which you are submitting your product. |  [optional]
**sizeType** | size_type | text |  | **kotlin.String** | Additional description for the size. Must be one of the following values: ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, ‘maternity’. |  [optional]
**tax** | tax | text |  | **kotlin.String** | Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required. |  [optional]
**title** | title | text |  | **kotlin.String** | The name of the product. |  [optional]



# **Table `ItemAttributesAdditionalImageLink`**
(mapped from: ItemAttributesAdditionalImageLink)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemAttributes | itemAttributes | long | | kotlin.Long | Primary Key | *one*
additionalImageLink | additionalImageLink | text | | kotlin.String | Foreign Key | *many*






















# **Table `ItemAttributesImageLink`**
(mapped from: ItemAttributesImageLink)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemAttributes | itemAttributes | long | | kotlin.Long | Primary Key | *one*
imageLink | imageLink | text | | kotlin.String | Foreign Key | *many*

























