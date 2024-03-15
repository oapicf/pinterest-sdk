package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import scala.collection.immutable.Seq

/**
 * 
 * @param adUnderscorelink Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
 * @param adult Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
 * @param ageUnderscoregroup The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
 * @param availability The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.
 * @param averageUnderscorereviewUnderscorerating Average reviews for the item. Can be a number from 1-5.
 * @param brand The brand of the product.
 * @param checkoutUnderscoreenabled This attribute is not supported anymore.
 * @param color The primary color of the product.
 * @param condition The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
 * @param customUnderscorelabelUnderscore0 <p><= 1000 characters</p> <p>Custom grouping of products.</p>
 * @param customUnderscorelabelUnderscore1 <p><= 1000 characters</p> <p>Custom grouping of products.</p>
 * @param customUnderscorelabelUnderscore2 <p><= 1000 characters</p> <p>Custom grouping of products.</p>
 * @param customUnderscorelabelUnderscore3 <p><= 1000 characters</p> <p>Custom grouping of products.</p>
 * @param customUnderscorelabelUnderscore4 <p><= 1000 characters</p> <p>Custom grouping of products.</p>
 * @param description <p><= 10000 characters</p> <p>The description of the product.</p>
 * @param freeUnderscoreshippingUnderscorelabel The item is free to ship.
 * @param freeUnderscoreshippingUnderscorelimit The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
 * @param gender The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.
 * @param googleUnderscoreproductUnderscorecategory The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
 * @param gtin The unique universal product identifier.
 * @param id <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>
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
 * @param saleUnderscoreprice The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
 * @param shipping Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
 * @param shippingUnderscoreheight The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
 * @param shippingUnderscoreweight The weight of the product. Ensure there is a space between the numeric string and the metric.
 * @param shippingUnderscorewidth The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
 * @param size The size of the product.
 * @param sizeUnderscoresystem Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.
 * @param sizeUnderscoretype Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.
 * @param tax Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
 * @param title <p><= 500 characters</p> <p>The name of the product.</p>
 * @param variantUnderscorenames Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
 * @param variantUnderscorevalues Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
 * @param additionalUnderscoreimageUnderscorelink <p><= 2000 characters</p> <p>The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.</p>
 * @param imageUnderscorelink <p><= 2000 characters</p> <p>The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p>
 */
case class ItemAttributes(adUnderscorelink: Option[String],
                adult: Option[Boolean],
                ageUnderscoregroup: Option[String],
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
                description: Option[String],
                freeUnderscoreshippingUnderscorelabel: Option[Boolean],
                freeUnderscoreshippingUnderscorelimit: Option[String],
                gender: Option[String],
                googleUnderscoreproductUnderscorecategory: Option[String],
                gtin: Option[Int],
                id: Option[String],
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
                saleUnderscoreprice: Option[String],
                shipping: Option[String],
                shippingUnderscoreheight: Option[String],
                shippingUnderscoreweight: Option[String],
                shippingUnderscorewidth: Option[String],
                size: Option[String],
                sizeUnderscoresystem: Option[String],
                sizeUnderscoretype: Option[String],
                tax: Option[String],
                title: Option[String],
                variantUnderscorenames: Option[Seq[String]],
                variantUnderscorevalues: Option[Seq[String]],
                additionalUnderscoreimageUnderscorelink: Option[Seq[String]],
                imageUnderscorelink: Option[Seq[String]]
                )

object ItemAttributes {
    /**
     * Creates the codec for converting ItemAttributes from and to JSON.
     */
    implicit val decoder: Decoder[ItemAttributes] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemAttributes] = deriveEncoder
}
