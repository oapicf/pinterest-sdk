package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.UpdatableItemAttributesGtin
import scala.collection.immutable.Seq

/**
 * 
 * @param adUnderscoreimageUnderscore0Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore0Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscoreimageUnderscore10Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore10Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscoreimageUnderscore11Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore11Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscoreimageUnderscore12Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore12Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscoreimageUnderscore13Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore13Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscoreimageUnderscore14Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore14Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscoreimageUnderscore15Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore15Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscoreimageUnderscore16Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore16Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscoreimageUnderscore17Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore17Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscoreimageUnderscore18Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore18Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscoreimageUnderscore19Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore19Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscoreimageUnderscore1Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore1Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscoreimageUnderscore2Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore2Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscoreimageUnderscore3Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore3Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscoreimageUnderscore4Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore4Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscoreimageUnderscore5Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore5Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscoreimageUnderscore6Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore6Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscoreimageUnderscore7Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore7Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscoreimageUnderscore8Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore8Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscoreimageUnderscore9Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscoreimageUnderscore9Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
 * @param adUnderscorelink Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
 * @param adUnderscorevideoUnderscore0Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscorevideoUnderscore0Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p>
 * @param adUnderscorevideoUnderscore1Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscorevideoUnderscore1Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p>
 * @param adUnderscorevideoUnderscore2Underscorelink <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
 * @param adUnderscorevideoUnderscore2Underscoretag <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p>
 * @param adult Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
 * @param ageUnderscoregroup The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
 * @param androidUnderscoredeepUnderscorelink The deep link to the product on the Android app.
 * @param availability The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.
 * @param averageUnderscorereviewUnderscorerating Average reviews for the item. Can be a number from 1-5.
 * @param brand The brand of the product.
 * @param checkoutUnderscoreenabled This attribute is not supported anymore.
 * @param color The primary color of the product.
 * @param condition The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
 * @param customUnderscorelabelUnderscore0 <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
 * @param customUnderscorelabelUnderscore1 <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
 * @param customUnderscorelabelUnderscore2 <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
 * @param customUnderscorelabelUnderscore3 <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
 * @param customUnderscorelabelUnderscore4 <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
 * @param customUnderscorenumberUnderscore0 an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
 * @param customUnderscorenumberUnderscore1 an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
 * @param customUnderscorenumberUnderscore2 an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
 * @param customUnderscorenumberUnderscore3 an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
 * @param customUnderscorenumberUnderscore4 an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
 * @param description <p><= 10000 characters</p> <p>The description of the product.</p>
 * @param freeUnderscoreshippingUnderscorelabel The item is free to ship.
 * @param freeUnderscoreshippingUnderscorelimit The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
 * @param gender The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.
 * @param googleUnderscoreproductUnderscorecategory The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
 * @param gtin 
 * @param id <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>
 * @param installmentUnderscoreprice Installment price of the product. This data will only be shown to pinners in the enabled countries. Expected format: <payment_count>:<payment_amount> <currency>
 * @param iosUnderscoredeepUnderscorelink The deep link to the product on the iOS app.
 * @param itemUnderscoregroupUnderscoreid <p><= 127 characters</p> <p>The parent ID of the product.</p>
 * @param lastUnderscoreupdatedUnderscoretime The millisecond timestamp when the item was lastly modified by the merchant.
 * @param link <p><= 511 characters</p> <p>The landing page for the product.</p>
 * @param material The material used to make the product.
 * @param minUnderscoreadUnderscoreprice The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
 * @param mobileUnderscorelink The mobile-optimized version of your landing page. Must begin with http:// or https://.
 * @param mpn Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
 * @param numberUnderscoreofUnderscoreratings The number of ratings for the item.
 * @param numberUnderscoreofUnderscorereviews The number of reviews available for the item.
 * @param pattern The description of the pattern used for the product.
 * @param price The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
 * @param productUnderscoretype <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>
 * @param promotionUnderscoreid A unique identifier referencing the promotion associated with this catalog item.
 * @param saleUnderscoreprice The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
 * @param saleUnderscorepriceUnderscoreeffectiveUnderscoredate Sale price effective date. Expected format: <start_date>/<end_date> (ISO 8601 format)
 * @param shipping Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
 * @param shippingUnderscoreheight The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
 * @param shippingUnderscoreweight The weight of the product. Ensure there is a space between the numeric string and the metric.
 * @param shippingUnderscorewidth The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
 * @param size The size of the product.
 * @param sizeUnderscoresystem Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.
 * @param sizeUnderscoretype Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.
 * @param tax Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
 * @param title <p><= 500 characters</p> <p>The name of the product.</p>
 * @param unitUnderscorepricingUnderscorebaseUnderscoremeasure Unit pricing base measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: <base_measure> <unit_type>
 * @param unitUnderscorepricingUnderscoremeasure Unit pricing total measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: <total_units> <unit_type>
 * @param variantUnderscorenames Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
 * @param variantUnderscorevalues Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
 */
case class UpdatableItemAttributes(adUnderscoreimageUnderscore0Underscorelink: Option[String],
                adUnderscoreimageUnderscore0Underscoretag: Option[String],
                adUnderscoreimageUnderscore10Underscorelink: Option[String],
                adUnderscoreimageUnderscore10Underscoretag: Option[String],
                adUnderscoreimageUnderscore11Underscorelink: Option[String],
                adUnderscoreimageUnderscore11Underscoretag: Option[String],
                adUnderscoreimageUnderscore12Underscorelink: Option[String],
                adUnderscoreimageUnderscore12Underscoretag: Option[String],
                adUnderscoreimageUnderscore13Underscorelink: Option[String],
                adUnderscoreimageUnderscore13Underscoretag: Option[String],
                adUnderscoreimageUnderscore14Underscorelink: Option[String],
                adUnderscoreimageUnderscore14Underscoretag: Option[String],
                adUnderscoreimageUnderscore15Underscorelink: Option[String],
                adUnderscoreimageUnderscore15Underscoretag: Option[String],
                adUnderscoreimageUnderscore16Underscorelink: Option[String],
                adUnderscoreimageUnderscore16Underscoretag: Option[String],
                adUnderscoreimageUnderscore17Underscorelink: Option[String],
                adUnderscoreimageUnderscore17Underscoretag: Option[String],
                adUnderscoreimageUnderscore18Underscorelink: Option[String],
                adUnderscoreimageUnderscore18Underscoretag: Option[String],
                adUnderscoreimageUnderscore19Underscorelink: Option[String],
                adUnderscoreimageUnderscore19Underscoretag: Option[String],
                adUnderscoreimageUnderscore1Underscorelink: Option[String],
                adUnderscoreimageUnderscore1Underscoretag: Option[String],
                adUnderscoreimageUnderscore2Underscorelink: Option[String],
                adUnderscoreimageUnderscore2Underscoretag: Option[String],
                adUnderscoreimageUnderscore3Underscorelink: Option[String],
                adUnderscoreimageUnderscore3Underscoretag: Option[String],
                adUnderscoreimageUnderscore4Underscorelink: Option[String],
                adUnderscoreimageUnderscore4Underscoretag: Option[String],
                adUnderscoreimageUnderscore5Underscorelink: Option[String],
                adUnderscoreimageUnderscore5Underscoretag: Option[String],
                adUnderscoreimageUnderscore6Underscorelink: Option[String],
                adUnderscoreimageUnderscore6Underscoretag: Option[String],
                adUnderscoreimageUnderscore7Underscorelink: Option[String],
                adUnderscoreimageUnderscore7Underscoretag: Option[String],
                adUnderscoreimageUnderscore8Underscorelink: Option[String],
                adUnderscoreimageUnderscore8Underscoretag: Option[String],
                adUnderscoreimageUnderscore9Underscorelink: Option[String],
                adUnderscoreimageUnderscore9Underscoretag: Option[String],
                adUnderscorelink: Option[String],
                adUnderscorevideoUnderscore0Underscorelink: Option[String],
                adUnderscorevideoUnderscore0Underscoretag: Option[String],
                adUnderscorevideoUnderscore1Underscorelink: Option[String],
                adUnderscorevideoUnderscore1Underscoretag: Option[String],
                adUnderscorevideoUnderscore2Underscorelink: Option[String],
                adUnderscorevideoUnderscore2Underscoretag: Option[String],
                adult: Option[Boolean],
                ageUnderscoregroup: Option[String],
                androidUnderscoredeepUnderscorelink: Option[String],
                availability: Option[String],
                averageUnderscorereviewUnderscorerating: Option[BigDecimal],
                brand: Option[String],
                checkoutUnderscoreenabled: Option[Boolean],
                color: Option[String],
                condition: Option[String],
                customUnderscorelabelUnderscore0: Option[String],
                customUnderscorelabelUnderscore1: Option[String],
                customUnderscorelabelUnderscore2: Option[String],
                customUnderscorelabelUnderscore3: Option[String],
                customUnderscorelabelUnderscore4: Option[String],
                customUnderscorenumberUnderscore0: Option[Int],
                customUnderscorenumberUnderscore1: Option[Int],
                customUnderscorenumberUnderscore2: Option[Int],
                customUnderscorenumberUnderscore3: Option[Int],
                customUnderscorenumberUnderscore4: Option[Int],
                description: Option[String],
                freeUnderscoreshippingUnderscorelabel: Option[Boolean],
                freeUnderscoreshippingUnderscorelimit: Option[String],
                gender: Option[String],
                googleUnderscoreproductUnderscorecategory: Option[String],
                gtin: Option[UpdatableItemAttributesGtin],
                id: Option[String],
                installmentUnderscoreprice: Option[String],
                iosUnderscoredeepUnderscorelink: Option[String],
                itemUnderscoregroupUnderscoreid: Option[String],
                lastUnderscoreupdatedUnderscoretime: Option[Long],
                link: Option[String],
                material: Option[String],
                minUnderscoreadUnderscoreprice: Option[String],
                mobileUnderscorelink: Option[String],
                mpn: Option[String],
                numberUnderscoreofUnderscoreratings: Option[Int],
                numberUnderscoreofUnderscorereviews: Option[Int],
                pattern: Option[String],
                price: Option[String],
                productUnderscoretype: Option[String],
                promotionUnderscoreid: Option[String],
                saleUnderscoreprice: Option[String],
                saleUnderscorepriceUnderscoreeffectiveUnderscoredate: Option[String],
                shipping: Option[String],
                shippingUnderscoreheight: Option[String],
                shippingUnderscoreweight: Option[String],
                shippingUnderscorewidth: Option[String],
                size: Option[String],
                sizeUnderscoresystem: Option[String],
                sizeUnderscoretype: Option[String],
                tax: Option[String],
                title: Option[String],
                unitUnderscorepricingUnderscorebaseUnderscoremeasure: Option[String],
                unitUnderscorepricingUnderscoremeasure: Option[String],
                variantUnderscorenames: Option[Seq[String]],
                variantUnderscorevalues: Option[Seq[String]]
                )

object UpdatableItemAttributes {
    /**
     * Creates the codec for converting UpdatableItemAttributes from and to JSON.
     */
    implicit val decoder: Decoder[UpdatableItemAttributes] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdatableItemAttributes] = deriveEncoder
}
