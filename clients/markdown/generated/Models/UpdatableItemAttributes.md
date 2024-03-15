# UpdatableItemAttributes
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ad\_link** | **String** | Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://. | [optional] [default to null] |
| **adult** | **Boolean** | Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest. | [optional] [default to null] |
| **age\_group** | **String** | The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’. | [optional] [default to null] |
| **availability** | **String** | The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’. | [optional] [default to null] |
| **average\_review\_rating** | **BigDecimal** | Average reviews for the item. Can be a number from 1-5. | [optional] [default to null] |
| **brand** | **String** | The brand of the product. | [optional] [default to null] |
| **checkout\_enabled** | **Boolean** | This attribute is not supported anymore. | [optional] [default to null] |
| **color** | **String** | The primary color of the product. | [optional] [default to null] |
| **condition** | **String** | The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’. | [optional] [default to null] |
| **custom\_label\_0** | **String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] [default to null] |
| **custom\_label\_1** | **String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] [default to null] |
| **custom\_label\_2** | **String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] [default to null] |
| **custom\_label\_3** | **String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] [default to null] |
| **custom\_label\_4** | **String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] [default to null] |
| **description** | **String** | &lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt; | [optional] [default to null] |
| **free\_shipping\_label** | **Boolean** | The item is free to ship. | [optional] [default to null] |
| **free\_shipping\_limit** | **String** | The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered. | [optional] [default to null] |
| **gender** | **String** | The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’. | [optional] [default to null] |
| **google\_product\_category** | **String** | The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. | [optional] [default to null] |
| **gtin** | **Integer** | The unique universal product identifier. | [optional] [default to null] |
| **id** | **String** | &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt; | [optional] [default to null] |
| **item\_group\_id** | **String** | &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt; | [optional] [default to null] |
| **last\_updated\_time** | **Long** | The millisecond timestamp when the item was lastly modified by the merchant. | [optional] [default to null] |
| **link** | **String** | &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt; | [optional] [default to null] |
| **material** | **String** | The material used to make the product. | [optional] [default to null] |
| **min\_ad\_price** | **String** | The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars. | [optional] [default to null] |
| **mobile\_link** | **String** | The mobile-optimized version of your landing page. Must begin with http:// or https://. | [optional] [default to null] |
| **mpn** | **String** | Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer. | [optional] [default to null] |
| **number\_of\_ratings** | **Integer** | The number of ratings for the item. | [optional] [default to null] |
| **number\_of\_reviews** | **Integer** | The number of reviews available for the item. | [optional] [default to null] |
| **pattern** | **String** | The description of the pattern used for the product. | [optional] [default to null] |
| **price** | **String** | The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] [default to null] |
| **product\_type** | **String** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt; | [optional] [default to null] |
| **sale\_price** | **String** | The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars. | [optional] [default to null] |
| **shipping** | **String** | Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required. | [optional] [default to null] |
| **shipping\_height** | **String** | The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. | [optional] [default to null] |
| **shipping\_weight** | **String** | The weight of the product. Ensure there is a space between the numeric string and the metric. | [optional] [default to null] |
| **shipping\_width** | **String** | The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. | [optional] [default to null] |
| **size** | **String** | The size of the product. | [optional] [default to null] |
| **size\_system** | **String** | Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’. | [optional] [default to null] |
| **size\_type** | **String** | Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’. | [optional] [default to null] |
| **tax** | **String** | Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required. | [optional] [default to null] |
| **title** | **String** | &lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt; | [optional] [default to null] |
| **variant\_names** | **List** | Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. | [optional] [default to null] |
| **variant\_values** | **List** | Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

