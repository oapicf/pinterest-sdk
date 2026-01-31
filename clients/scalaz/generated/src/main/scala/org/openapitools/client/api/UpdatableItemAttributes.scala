package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdatableItemAttributes._

case class UpdatableItemAttributes (
  /* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage0Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage0Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage10Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage10Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage11Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage11Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage12Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage12Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage13Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage13Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage14Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage14Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage15Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage15Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage16Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage16Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage17Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage17Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage18Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage18Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage19Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage19Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage1Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage1Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage2Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage2Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage3Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage3Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage4Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage4Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage5Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage5Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage6Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage6Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage7Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage7Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage8Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage8Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adImage9Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p> */
  adImage9Tag: Option[String],
/* Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://. */
  adLink: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adVideo0Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p> */
  adVideo0Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adVideo1Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p> */
  adVideo1Tag: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul> */
  adVideo2Link: Option[String],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p> */
  adVideo2Tag: Option[String],
/* Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest. */
  adult: Option[Boolean],
/* The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’. */
  ageGroup: Option[String],
/* The deep link to the product on the Android app. */
  androidDeepLink: Option[String],
/* The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’. */
  availability: Option[String],
/* Average reviews for the item. Can be a number from 1-5. */
  averageReviewRating: Option[BigDecimal],
/* The brand of the product. */
  brand: Option[String],
/* This attribute is not supported anymore. */
  checkoutEnabled: Option[Boolean],
/* The primary color of the product. */
  color: Option[String],
/* The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’. */
  condition: Option[String],
/* <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p> */
  customLabel0: Option[String],
/* <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p> */
  customLabel1: Option[String],
/* <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p> */
  customLabel2: Option[String],
/* <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p> */
  customLabel3: Option[String],
/* <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p> */
  customLabel4: Option[String],
/* an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items. */
  customNumber0: Option[Integer],
/* an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items. */
  customNumber1: Option[Integer],
/* an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items. */
  customNumber2: Option[Integer],
/* an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items. */
  customNumber3: Option[Integer],
/* an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items. */
  customNumber4: Option[Integer],
/* <p><= 10000 characters</p> <p>The description of the product.</p> */
  description: Option[String],
/* The item is free to ship. */
  freeShippingLabel: Option[Boolean],
/* The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered. */
  freeShippingLimit: Option[String],
/* The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’. */
  gender: Option[String],
/* The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. */
  googleProductCategory: Option[String],
gtin: Option[UpdatableItemAttributesGtin],
/* <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p> */
  id: Option[String],
/* Installment price of the product. This data will only be shown to pinners in the enabled countries. Expected format: <payment_count>:<payment_amount> <currency> */
  installmentPrice: Option[String],
/* The deep link to the product on the iOS app. */
  iosDeepLink: Option[String],
/* <p><= 127 characters</p> <p>The parent ID of the product.</p> */
  itemGroupId: Option[String],
/* The millisecond timestamp when the item was lastly modified by the merchant. */
  lastUpdatedTime: Option[Long],
/* <p><= 511 characters</p> <p>The landing page for the product.</p> */
  link: Option[String],
/* The material used to make the product. */
  material: Option[String],
/* The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars. */
  minAdPrice: Option[String],
/* The mobile-optimized version of your landing page. Must begin with http:// or https://. */
  mobileLink: Option[String],
/* Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer. */
  mpn: Option[String],
/* The number of ratings for the item. */
  numberOfRatings: Option[Integer],
/* The number of reviews available for the item. */
  numberOfReviews: Option[Integer],
/* The description of the pattern used for the product. */
  pattern: Option[String],
/* The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. */
  price: Option[String],
/* <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p> */
  productType: Option[String],
/* A unique identifier referencing the promotion associated with this catalog item. */
  promotionId: Option[String],
/* The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars. */
  salePrice: Option[String],
/* Sale price effective date. Expected format: <start_date>/<end_date> (ISO 8601 format) */
  salePriceEffectiveDate: Option[String],
/* Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required. */
  shipping: Option[String],
/* The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. */
  shippingHeight: Option[String],
/* The weight of the product. Ensure there is a space between the numeric string and the metric. */
  shippingWeight: Option[String],
/* The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. */
  shippingWidth: Option[String],
/* The size of the product. */
  size: Option[String],
/* Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’. */
  sizeSystem: Option[String],
/* Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’. */
  sizeType: Option[String],
/* Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required. */
  tax: Option[String],
/* <p><= 500 characters</p> <p>The name of the product.</p> */
  title: Option[String],
/* Unit pricing base measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: <base_measure> <unit_type> */
  unitPricingBaseMeasure: Option[String],
/* Unit pricing total measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: <total_units> <unit_type> */
  unitPricingMeasure: Option[String],
/* Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. */
  variantNames: Option[List[String]],
/* Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names. */
  variantValues: Option[List[String]])

object UpdatableItemAttributes {
  import DateTimeCodecs._

  implicit val UpdatableItemAttributesCodecJson: CodecJson[UpdatableItemAttributes] = CodecJson.derive[UpdatableItemAttributes]
  implicit val UpdatableItemAttributesDecoder: EntityDecoder[UpdatableItemAttributes] = jsonOf[UpdatableItemAttributes]
  implicit val UpdatableItemAttributesEncoder: EntityEncoder[UpdatableItemAttributes] = jsonEncoderOf[UpdatableItemAttributes]
}
