
# Table `ConversionEvents_data_inner_custom_data_contents_inner`
(mapped from: ConversionEventsDataInnerCustomDataContentsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). |  [optional]
**itemPrice** | item_price | text |  | **kotlin.String** | The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). |  [optional]
**quantity** | quantity | long |  | **kotlin.Long** | The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). |  [optional]
**itemName** | item_name | text |  | **kotlin.String** | The name of a product. |  [optional]
**itemCategory** | item_category | text |  | **kotlin.String** | The category of a product. |  [optional]
**itemBrand** | item_brand | text |  | **kotlin.String** | The brand of a product. |  [optional]








