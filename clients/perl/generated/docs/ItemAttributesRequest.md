# WWW::OpenAPIClient::Object::ItemAttributesRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::ItemAttributesRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_link** | **string** | Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://. | [optional] 
**adult** | **boolean** | Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest. | [optional] 
**age_group** | **string** | The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’. | [optional] 
**availability** | **string** | The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’. | [optional] 
**average_review_rating** | **double** | Average reviews for the item. Can be a number from 1-5. | [optional] 
**brand** | **string** | The brand of the product. | [optional] 
**checkout_enabled** | **boolean** | This attribute is not supported anymore. | [optional] 
**color** | **string** | The primary color of the product. | [optional] 
**condition** | **string** | The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’. | [optional] 
**custom_label_0** | **string** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**custom_label_1** | **string** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**custom_label_2** | **string** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**custom_label_3** | **string** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**custom_label_4** | **string** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**description** | **string** | &lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt; | [optional] 
**free_shipping_label** | **boolean** | The item is free to ship. | [optional] 
**free_shipping_limit** | **string** | The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered. | [optional] 
**gender** | **string** | The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’. | [optional] 
**google_product_category** | **string** | The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. | [optional] 
**gtin** | **int** | The unique universal product identifier. | [optional] 
**id** | **string** | &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt; | [optional] 
**item_group_id** | **string** | &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt; | [optional] 
**last_updated_time** | **int** | The millisecond timestamp when the item was lastly modified by the merchant. | [optional] 
**link** | **string** | &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt; | [optional] 
**material** | **string** | The material used to make the product. | [optional] 
**min_ad_price** | **string** | The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**mobile_link** | **string** | The mobile-optimized version of your landing page. Must begin with http:// or https://. | [optional] 
**mpn** | **string** | Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer. | [optional] 
**number_of_ratings** | **int** | The number of ratings for the item. | [optional] 
**number_of_reviews** | **int** | The number of reviews available for the item. | [optional] 
**pattern** | **string** | The description of the pattern used for the product. | [optional] 
**price** | **string** | The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**product_type** | **string** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt; | [optional] 
**sale_price** | **string** | The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**shipping** | **string** | Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required. | [optional] 
**shipping_height** | **string** | The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. | [optional] 
**shipping_weight** | **string** | The weight of the product. Ensure there is a space between the numeric string and the metric. | [optional] 
**shipping_width** | **string** | The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. | [optional] 
**size** | **string** | The size of the product. | [optional] 
**size_system** | **string** | Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’. | [optional] 
**size_type** | **string** | Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’. | [optional] 
**tax** | **string** | Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required. | [optional] 
**title** | **string** | &lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt; | [optional] 
**variant_names** | **ARRAY[string]** | Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. | [optional] 
**variant_values** | **ARRAY[string]** | Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names. | [optional] 
**additional_image_link** | **ARRAY[string]** | &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.&lt;/p&gt; | [optional] 
**image_link** | [**ItemAttributesRequestAllOfImageLink**](ItemAttributesRequestAllOfImageLink.md) |  | [optional] 
**video_link** | **string** | &lt;p&gt;&lt;&#x3D; 2,000 characters&lt;/p&gt; &lt;p&gt;Hosted link to the product video.&lt;/p&gt; &lt;p&gt;File types for linked videos must be .mp4, .mov or .m4v.&lt;/p&gt; &lt;p&gt;File size cannot exceed 2GB.&lt;/p&gt; | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


