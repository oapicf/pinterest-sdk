
package org.openapitools.client.model


case class ItemAttributes (
    /* Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://. */
    _adLink: Option[String],
    /* Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest. */
    _adult: Option[Boolean],
    /* The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’. */
    _ageGroup: Option[String],
    /* The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’. */
    _availability: Option[String],
    /* Average reviews for the item. Can be a number from 1-5. */
    _averageReviewRating: Option[Number],
    /* The brand of the product. */
    _brand: Option[String],
    /* This attribute is not supported anymore. */
    _checkoutEnabled: Option[Boolean],
    /* The primary color of the product. */
    _color: Option[String],
    /* The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’. */
    _condition: Option[String],
    /* <p><= 1000 characters</p> <p>Custom grouping of products.</p> */
    _customLabel0: Option[String],
    /* <p><= 1000 characters</p> <p>Custom grouping of products.</p> */
    _customLabel1: Option[String],
    /* <p><= 1000 characters</p> <p>Custom grouping of products.</p> */
    _customLabel2: Option[String],
    /* <p><= 1000 characters</p> <p>Custom grouping of products.</p> */
    _customLabel3: Option[String],
    /* <p><= 1000 characters</p> <p>Custom grouping of products.</p> */
    _customLabel4: Option[String],
    /* <p><= 10000 characters</p> <p>The description of the product.</p> */
    _description: Option[String],
    /* The item is free to ship. */
    _freeShippingLabel: Option[Boolean],
    /* The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered. */
    _freeShippingLimit: Option[String],
    /* The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’. */
    _gender: Option[String],
    /* The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. */
    _googleProductCategory: Option[String],
    /* The unique universal product identifier. */
    _gtin: Option[Integer],
    /* <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p> */
    _id: Option[String],
    /* <p><= 127 characters</p> <p>The parent ID of the product.</p> */
    _itemGroupId: Option[String],
    /* The millisecond timestamp when the item was lastly modified by the merchant. */
    _lastUpdatedTime: Option[Long],
    /* <p><= 511 characters</p> <p>The landing page for the product.</p> */
    _link: Option[String],
    /* The material used to make the product. */
    _material: Option[String],
    /* The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars. */
    _minAdPrice: Option[String],
    /* The mobile-optimized version of your landing page. Must begin with http:// or https://. */
    _mobileLink: Option[String],
    /* Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer. */
    _mpn: Option[String],
    /* The number of ratings for the item. */
    _numberOfRatings: Option[Integer],
    /* The number of reviews available for the item. */
    _numberOfReviews: Option[Integer],
    /* The description of the pattern used for the product. */
    _pattern: Option[String],
    /* The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. */
    _price: Option[String],
    /* <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p> */
    _productType: Option[String],
    /* The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars. */
    _salePrice: Option[String],
    /* Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required. */
    _shipping: Option[String],
    /* The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. */
    _shippingHeight: Option[String],
    /* The weight of the product. Ensure there is a space between the numeric string and the metric. */
    _shippingWeight: Option[String],
    /* The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. */
    _shippingWidth: Option[String],
    /* The size of the product. */
    _size: Option[String],
    /* Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’. */
    _sizeSystem: Option[String],
    /* Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’. */
    _sizeType: Option[String],
    /* Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required. */
    _tax: Option[String],
    /* <p><= 500 characters</p> <p>The name of the product.</p> */
    _title: Option[String],
    /* Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. */
    _variantNames: Option[List[String]],
    /* Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names. */
    _variantValues: Option[List[String]],
    /* <p><= 2000 characters</p> <p>The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.</p> */
    _additionalImageLink: Option[List[String]],
    /* <p><= 2000 characters</p> <p>The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p> */
    _imageLink: Option[List[String]]
)
object ItemAttributes {
    def toStringBody(var_adLink: Object, var_adult: Object, var_ageGroup: Object, var_availability: Object, var_averageReviewRating: Object, var_brand: Object, var_checkoutEnabled: Object, var_color: Object, var_condition: Object, var_customLabel0: Object, var_customLabel1: Object, var_customLabel2: Object, var_customLabel3: Object, var_customLabel4: Object, var_description: Object, var_freeShippingLabel: Object, var_freeShippingLimit: Object, var_gender: Object, var_googleProductCategory: Object, var_gtin: Object, var_id: Object, var_itemGroupId: Object, var_lastUpdatedTime: Object, var_link: Object, var_material: Object, var_minAdPrice: Object, var_mobileLink: Object, var_mpn: Object, var_numberOfRatings: Object, var_numberOfReviews: Object, var_pattern: Object, var_price: Object, var_productType: Object, var_salePrice: Object, var_shipping: Object, var_shippingHeight: Object, var_shippingWeight: Object, var_shippingWidth: Object, var_size: Object, var_sizeSystem: Object, var_sizeType: Object, var_tax: Object, var_title: Object, var_variantNames: Object, var_variantValues: Object, var_additionalImageLink: Object, var_imageLink: Object) =
        s"""
        | {
        | "adLink":$var_adLink,"adult":$var_adult,"ageGroup":$var_ageGroup,"availability":$var_availability,"averageReviewRating":$var_averageReviewRating,"brand":$var_brand,"checkoutEnabled":$var_checkoutEnabled,"color":$var_color,"condition":$var_condition,"customLabel0":$var_customLabel0,"customLabel1":$var_customLabel1,"customLabel2":$var_customLabel2,"customLabel3":$var_customLabel3,"customLabel4":$var_customLabel4,"description":$var_description,"freeShippingLabel":$var_freeShippingLabel,"freeShippingLimit":$var_freeShippingLimit,"gender":$var_gender,"googleProductCategory":$var_googleProductCategory,"gtin":$var_gtin,"id":$var_id,"itemGroupId":$var_itemGroupId,"lastUpdatedTime":$var_lastUpdatedTime,"link":$var_link,"material":$var_material,"minAdPrice":$var_minAdPrice,"mobileLink":$var_mobileLink,"mpn":$var_mpn,"numberOfRatings":$var_numberOfRatings,"numberOfReviews":$var_numberOfReviews,"pattern":$var_pattern,"price":$var_price,"productType":$var_productType,"salePrice":$var_salePrice,"shipping":$var_shipping,"shippingHeight":$var_shippingHeight,"shippingWeight":$var_shippingWeight,"shippingWidth":$var_shippingWidth,"size":$var_size,"sizeSystem":$var_sizeSystem,"sizeType":$var_sizeType,"tax":$var_tax,"title":$var_title,"variantNames":$var_variantNames,"variantValues":$var_variantValues,"additionalImageLink":$var_additionalImageLink,"imageLink":$var_imageLink
        | }
        """.stripMargin
}
