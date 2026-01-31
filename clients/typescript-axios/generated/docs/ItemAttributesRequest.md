# ItemAttributesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_link** | **string** | Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://. | [optional] [default to undefined]
**adult** | **boolean** | Set this attribute to TRUE if you\&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest. | [optional] [default to undefined]
**age_group** | **string** | The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’. | [optional] [default to undefined]
**availability** | **string** | The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’. | [optional] [default to undefined]
**average_review_rating** | **number** | Average reviews for the item. Can be a number from 1-5. | [optional] [default to undefined]
**brand** | **string** | The brand of the product. | [optional] [default to undefined]
**checkout_enabled** | **boolean** | This attribute is not supported anymore. | [optional] [default to undefined]
**color** | **string** | The primary color of the product. | [optional] [default to undefined]
**condition** | **string** | The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’. | [optional] [default to undefined]
**custom_label_0** | **string** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] [default to undefined]
**custom_label_1** | **string** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] [default to undefined]
**custom_label_2** | **string** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] [default to undefined]
**custom_label_3** | **string** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] [default to undefined]
**custom_label_4** | **string** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt; | [optional] [default to undefined]
**description** | **string** | &lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt; | [optional] [default to undefined]
**free_shipping_label** | **boolean** | The item is free to ship. | [optional] [default to undefined]
**free_shipping_limit** | **string** | The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered. | [optional] [default to undefined]
**gender** | **string** | The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’. | [optional] [default to undefined]
**google_product_category** | **string** | The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. | [optional] [default to undefined]
**gtin** | **number** | The unique universal product identifier. | [optional] [default to undefined]
**id** | **string** | &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt; | [optional] [default to undefined]
**item_group_id** | **string** | &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt; | [optional] [default to undefined]
**last_updated_time** | **number** | The millisecond timestamp when the item was lastly modified by the merchant. | [optional] [default to undefined]
**link** | **string** | &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt; | [optional] [default to undefined]
**material** | **string** | The material used to make the product. | [optional] [default to undefined]
**min_ad_price** | **string** | The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars. | [optional] [default to undefined]
**mobile_link** | **string** | The mobile-optimized version of your landing page. Must begin with http:// or https://. | [optional] [default to undefined]
**mpn** | **string** | Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer. | [optional] [default to undefined]
**number_of_ratings** | **number** | The number of ratings for the item. | [optional] [default to undefined]
**number_of_reviews** | **number** | The number of reviews available for the item. | [optional] [default to undefined]
**pattern** | **string** | The description of the pattern used for the product. | [optional] [default to undefined]
**price** | **string** | The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] [default to undefined]
**product_type** | **string** | &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt; | [optional] [default to undefined]
**sale_price** | **string** | The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars. | [optional] [default to undefined]
**shipping** | **string** | Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required. | [optional] [default to undefined]
**shipping_height** | **string** | The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. | [optional] [default to undefined]
**shipping_weight** | **string** | The weight of the product. Ensure there is a space between the numeric string and the metric. | [optional] [default to undefined]
**shipping_width** | **string** | The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. | [optional] [default to undefined]
**size** | **string** | The size of the product. | [optional] [default to undefined]
**size_system** | **string** | Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’. | [optional] [default to undefined]
**size_type** | **string** | Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’. | [optional] [default to undefined]
**tax** | **string** | Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required. | [optional] [default to undefined]
**title** | **string** | &lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt; | [optional] [default to undefined]
**variant_names** | **Array&lt;string&gt;** | Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. | [optional] [default to undefined]
**variant_values** | **Array&lt;string&gt;** | Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names. | [optional] [default to undefined]
**additional_image_link** | **Array&lt;string&gt;** | &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.&lt;/p&gt; | [optional] [default to undefined]
**image_link** | [**ItemAttributesRequestAllOfImageLink**](ItemAttributesRequestAllOfImageLink.md) |  | [optional] [default to undefined]
**video_link** | **string** | &lt;p&gt;&lt;&#x3D; 2,000 characters&lt;/p&gt; &lt;p&gt;Hosted link to the product video.&lt;/p&gt; &lt;p&gt;File types for linked videos must be .mp4, .mov or .m4v.&lt;/p&gt; &lt;p&gt;File size cannot exceed 2GB.&lt;/p&gt; | [optional] [default to undefined]

## Example

```typescript
import { ItemAttributesRequest } from './api';

const instance: ItemAttributesRequest = {
    ad_link,
    adult,
    age_group,
    availability,
    average_review_rating,
    brand,
    checkout_enabled,
    color,
    condition,
    custom_label_0,
    custom_label_1,
    custom_label_2,
    custom_label_3,
    custom_label_4,
    description,
    free_shipping_label,
    free_shipping_limit,
    gender,
    google_product_category,
    gtin,
    id,
    item_group_id,
    last_updated_time,
    link,
    material,
    min_ad_price,
    mobile_link,
    mpn,
    number_of_ratings,
    number_of_reviews,
    pattern,
    price,
    product_type,
    sale_price,
    shipping,
    shipping_height,
    shipping_weight,
    shipping_width,
    size,
    size_system,
    size_type,
    tax,
    title,
    variant_names,
    variant_values,
    additional_image_link,
    image_link,
    video_link,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
