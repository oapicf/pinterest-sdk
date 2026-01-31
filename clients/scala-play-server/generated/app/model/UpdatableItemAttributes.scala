package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdatableItemAttributes.
  * @param adImage0Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage0Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adImage10Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage10Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adImage11Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage11Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adImage12Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage12Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adImage13Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage13Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adImage14Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage14Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adImage15Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage15Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adImage16Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage16Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adImage17Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage17Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adImage18Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage18Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adImage19Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage19Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adImage1Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage1Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adImage2Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage2Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adImage3Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage3Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adImage4Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage4Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adImage5Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage5Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adImage6Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage6Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adImage7Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage7Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adImage8Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage8Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adImage9Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adImage9Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
  * @param adLink Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
  * @param adVideo0Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adVideo0Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p>
  * @param adVideo1Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adVideo1Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p>
  * @param adVideo2Link <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
  * @param adVideo2Tag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p>
  * @param adult Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
  * @param ageGroup The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
  * @param androidDeepLink The deep link to the product on the Android app.
  * @param availability The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.
  * @param averageReviewRating Average reviews for the item. Can be a number from 1-5.
  * @param brand The brand of the product.
  * @param checkoutEnabled This attribute is not supported anymore.
  * @param color The primary color of the product.
  * @param condition The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
  * @param customLabel0 <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
  * @param customLabel1 <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
  * @param customLabel2 <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
  * @param customLabel3 <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
  * @param customLabel4 <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
  * @param customNumber0 an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
  * @param customNumber1 an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
  * @param customNumber2 an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
  * @param customNumber3 an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
  * @param customNumber4 an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
  * @param description <p><= 10000 characters</p> <p>The description of the product.</p>
  * @param freeShippingLabel The item is free to ship.
  * @param freeShippingLimit The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
  * @param gender The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.
  * @param googleProductCategory The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
  * @param id <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>
  * @param installmentPrice Installment price of the product. This data will only be shown to pinners in the enabled countries. Expected format: <payment_count>:<payment_amount> <currency>
  * @param iosDeepLink The deep link to the product on the iOS app.
  * @param itemGroupId <p><= 127 characters</p> <p>The parent ID of the product.</p>
  * @param lastUpdatedTime The millisecond timestamp when the item was lastly modified by the merchant.
  * @param link <p><= 511 characters</p> <p>The landing page for the product.</p>
  * @param material The material used to make the product.
  * @param minAdPrice The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
  * @param mobileLink The mobile-optimized version of your landing page. Must begin with http:// or https://.
  * @param mpn Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
  * @param numberOfRatings The number of ratings for the item.
  * @param numberOfReviews The number of reviews available for the item.
  * @param pattern The description of the pattern used for the product.
  * @param price The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
  * @param productType <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>
  * @param promotionId A unique identifier referencing the promotion associated with this catalog item.
  * @param salePrice The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
  * @param salePriceEffectiveDate Sale price effective date. Expected format: <start_date>/<end_date> (ISO 8601 format)
  * @param shipping Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
  * @param shippingHeight The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
  * @param shippingWeight The weight of the product. Ensure there is a space between the numeric string and the metric.
  * @param shippingWidth The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
  * @param size The size of the product.
  * @param sizeSystem Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.
  * @param sizeType Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.
  * @param tax Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
  * @param title <p><= 500 characters</p> <p>The name of the product.</p>
  * @param unitPricingBaseMeasure Unit pricing base measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: <base_measure> <unit_type>
  * @param unitPricingMeasure Unit pricing total measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: <total_units> <unit_type>
  * @param variantNames Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
  * @param variantValues Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UpdatableItemAttributes(
  adImage0Link: Option[String],
  adImage0Tag: Option[String],
  adImage10Link: Option[String],
  adImage10Tag: Option[String],
  adImage11Link: Option[String],
  adImage11Tag: Option[String],
  adImage12Link: Option[String],
  adImage12Tag: Option[String],
  adImage13Link: Option[String],
  adImage13Tag: Option[String],
  adImage14Link: Option[String],
  adImage14Tag: Option[String],
  adImage15Link: Option[String],
  adImage15Tag: Option[String],
  adImage16Link: Option[String],
  adImage16Tag: Option[String],
  adImage17Link: Option[String],
  adImage17Tag: Option[String],
  adImage18Link: Option[String],
  adImage18Tag: Option[String],
  adImage19Link: Option[String],
  adImage19Tag: Option[String],
  adImage1Link: Option[String],
  adImage1Tag: Option[String],
  adImage2Link: Option[String],
  adImage2Tag: Option[String],
  adImage3Link: Option[String],
  adImage3Tag: Option[String],
  adImage4Link: Option[String],
  adImage4Tag: Option[String],
  adImage5Link: Option[String],
  adImage5Tag: Option[String],
  adImage6Link: Option[String],
  adImage6Tag: Option[String],
  adImage7Link: Option[String],
  adImage7Tag: Option[String],
  adImage8Link: Option[String],
  adImage8Tag: Option[String],
  adImage9Link: Option[String],
  adImage9Tag: Option[String],
  adLink: Option[String],
  adVideo0Link: Option[String],
  adVideo0Tag: Option[String],
  adVideo1Link: Option[String],
  adVideo1Tag: Option[String],
  adVideo2Link: Option[String],
  adVideo2Tag: Option[String],
  adult: Option[Boolean],
  ageGroup: Option[String],
  androidDeepLink: Option[String],
  availability: Option[String],
  averageReviewRating: Option[BigDecimal],
  brand: Option[String],
  checkoutEnabled: Option[Boolean],
  color: Option[String],
  condition: Option[String],
  customLabel0: Option[String],
  customLabel1: Option[String],
  customLabel2: Option[String],
  customLabel3: Option[String],
  customLabel4: Option[String],
  customNumber0: Option[Int],
  customNumber1: Option[Int],
  customNumber2: Option[Int],
  customNumber3: Option[Int],
  customNumber4: Option[Int],
  description: Option[String],
  freeShippingLabel: Option[Boolean],
  freeShippingLimit: Option[String],
  gender: Option[String],
  googleProductCategory: Option[String],
  gtin: Option[UpdatableItemAttributesGtin],
  id: Option[String],
  installmentPrice: Option[String],
  iosDeepLink: Option[String],
  itemGroupId: Option[String],
  lastUpdatedTime: Option[Long],
  link: Option[String],
  material: Option[String],
  minAdPrice: Option[String],
  mobileLink: Option[String],
  mpn: Option[String],
  numberOfRatings: Option[Int],
  numberOfReviews: Option[Int],
  pattern: Option[String],
  price: Option[String],
  productType: Option[String],
  promotionId: Option[String],
  salePrice: Option[String],
  salePriceEffectiveDate: Option[String],
  shipping: Option[String],
  shippingHeight: Option[String],
  shippingWeight: Option[String],
  shippingWidth: Option[String],
  size: Option[String],
  sizeSystem: Option[String],
  sizeType: Option[String],
  tax: Option[String],
  title: Option[String],
  unitPricingBaseMeasure: Option[String],
  unitPricingMeasure: Option[String],
  variantNames: Option[List[String]],
  variantValues: Option[List[String]]
)

object UpdatableItemAttributes {
  implicit lazy val updatableItemAttributesJsonFormat: Format[UpdatableItemAttributes] = Json.format[UpdatableItemAttributes]
}

