# pinterestsdk.model.updatable_item_attributes.UpdatableItemAttributes

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ad_link** | None, str,  | NoneClass, str,  | Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://. | [optional] 
**adult** | None, bool,  | NoneClass, BoolClass,  | Set this attribute to TRUE if you&#x27;re submitting items that are considered “adult”. These will not be shown on Pinterest. | [optional] 
**age_group** | None, str,  | NoneClass, str,  | The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’. | [optional] 
**availability** | str,  | str,  | The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’. | [optional] 
**average_review_rating** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | Average reviews for the item. Can be a number from 1-5. | [optional] 
**brand** | None, str,  | NoneClass, str,  | The brand of the product. | [optional] 
**checkout_enabled** | None, bool,  | NoneClass, BoolClass,  | Set this attribute to FALSE to indicate items that should be excluded from the Pinterest Checkout program. Note, this product is currently being tested and your account must be enrolled. Please contact your Account Manager or contact us for more information. | [optional] 
**color** | None, str,  | NoneClass, str,  | The primary color of the product. | [optional] 
**condition** | None, str,  | NoneClass, str,  | The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’. | [optional] 
**custom_label_0** | None, str,  | NoneClass, str,  | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**custom_label_1** | None, str,  | NoneClass, str,  | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**custom_label_2** | None, str,  | NoneClass, str,  | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**custom_label_3** | None, str,  | NoneClass, str,  | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**custom_label_4** | None, str,  | NoneClass, str,  | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] 
**description** | str,  | str,  | &lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt; | [optional] 
**free_shipping_label** | None, bool,  | NoneClass, BoolClass,  | The item is free to ship. | [optional] 
**free_shipping_limit** | None, str,  | NoneClass, str,  | The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered. | [optional] 
**gender** | None, str,  | NoneClass, str,  | The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’. | [optional] 
**google_product_category** | None, str,  | NoneClass, str,  | The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. | [optional] 
**gtin** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | The unique universal product identifier. | [optional] 
**id** | str,  | str,  | &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt; | [optional] 
**item_group_id** | None, str,  | NoneClass, str,  | &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt; | [optional] 
**last_updated_time** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | The millisecond timestamp when the item was lastly modified by the merchant. | [optional] value must be a 64 bit integer
**link** | str,  | str,  | &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt; | [optional] 
**material** | None, str,  | NoneClass, str,  | The material used to make the product. | [optional] 
**min_ad_price** | None, str,  | NoneClass, str,  | The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**mobile_link** | None, str,  | NoneClass, str,  | The mobile-optimized version of your landing page. Must begin with http:// or https://. | [optional] 
**mpn** | None, str,  | NoneClass, str,  | Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer. | [optional] 
**number_of_ratings** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | The number of ratings for the item. | [optional] 
**number_of_reviews** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | The number of reviews available for the item. | [optional] 
**pattern** | None, str,  | NoneClass, str,  | The description of the pattern used for the product. | [optional] 
**price** | str,  | str,  | The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**product_type** | None, str,  | NoneClass, str,  | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt; | [optional] 
**sale_price** | None, str,  | NoneClass, str,  | The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**shipping** | None, str,  | NoneClass, str,  | Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required. | [optional] 
**shipping_height** | None, str,  | NoneClass, str,  | The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. | [optional] 
**shipping_weight** | None, str,  | NoneClass, str,  | The weight of the product. Ensure there is a space between the numeric string and the metric. | [optional] 
**shipping_width** | None, str,  | NoneClass, str,  | The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. | [optional] 
**size** | None, str,  | NoneClass, str,  | The size of the product. | [optional] 
**size_system** | None, str,  | NoneClass, str,  | Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’. | [optional] 
**size_type** | None, str,  | NoneClass, str,  | Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’. | [optional] 
**tax** | None, str,  | NoneClass, str,  | Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required. | [optional] 
**title** | str,  | str,  | &lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt; | [optional] 
**[variant_names](#variant_names)** | list, tuple, None,  | tuple, NoneClass,  | Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. | [optional] 
**[variant_values](#variant_values)** | list, tuple, None,  | tuple, NoneClass,  | Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# variant_names

Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# variant_values

Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

