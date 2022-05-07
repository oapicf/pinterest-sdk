package org.openapitools.server.model


/**
 * @param adLink Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://. for example: ''https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest''
 * @param additionalImageLink The links to additional images for your product. Up to five additional images can be used to show a product from different angles or to show different stages. Separate each additional image with a comma. We recommend enclosing the whole string with quotes. Must begin with http:// or https:// for example: ''["https://scene.example.com/image/image_v2.jpg","https://scene.example.com/image/image_v3.jpg"]''
 * @param adult Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest. for example: ''true''
 * @param ageGroup The age group to apply a demographic range to the product. Must be one of the following values: ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, ‘adult’. for example: ''newborn''
 * @param availability The availability of the product. Must be one of the following values: ‘in stock’, ‘out of stock’, ‘preorder’. for example: ''in stock''
 * @param averageReviewRating Average reviews for the item. Can be a number from 1-5. for example: ''5''
 * @param brand The brand of the product. for example: ''Josie’s Denim''
 * @param color The primary color of the product. for example: ''blue''
 * @param condition The condition of the product. Must be one of the following values: ‘new’, ‘used’, ‘refurbished’. for example: ''new''
 * @param customLabel0 Custom grouping of products. for example: ''Best sellers''
 * @param customLabel1 Custom grouping of products. for example: ''Summer promotion''
 * @param customLabel2 Custom grouping of products. for example: ''Winter sales''
 * @param customLabel3 Custom grouping of products. for example: ''Woman dress''
 * @param customLabel4 Custom grouping of products. for example: ''Man hat''
 * @param description The description of the product. for example: ''Casual fit denim shirt made with the finest quality Japanese denim.''
 * @param freeShippingLabel The item is free to ship. for example: ''true''
 * @param freeShippingLimit The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered. for example: ''35 USD''
 * @param gender The gender associated with the product. Must be one of the following values: ‘male’, ‘female’, ‘unisex’. for example: ''unisex''
 * @param googleProductCategory The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. for example: ''Apparel & Accessories > Clothing > Shirts & Tops''
 * @param gtin The unique universal product identifier. for example: ''3234567890126''
 * @param id The user-created unique ID that represents the product. Only Unicode characters are accepted. for example: ''DS0294-L''
 * @param imageLink The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https:// for example: ''["https://scene.example.com/image/image.jpg"]''
 * @param itemGroupId The parent ID of the product. for example: ''DS0294''
 * @param lastUpdatedTime The millisecond timestamp when the item was lastly modified by the merchant. for example: ''1641483432072''
 * @param link The landing page for the product. for example: ''https://www.example.com/cat/womens-clothing/denim-shirt-0294''
 * @param material The material used to make the product. for example: ''cotton''
 * @param minAdPrice The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars. for example: ''19.99 USD''
 * @param mobileLink The mobile-optimized version of your landing page. Must begin with http:// or https://. for example: ''https://m.example.com/cat/womens-clothing/denim-shirt-0294''
 * @param mpn Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer. for example: ''PI12345NTEREST''
 * @param numberOfRatings The number of ratings for the item. for example: ''10''
 * @param numberOfReviews The number of reviews available for the item. for example: ''10''
 * @param pattern The description of the pattern used for the product. for example: ''plaid''
 * @param price The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. for example: ''24.99 USD''
 * @param productType The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe. for example: ''Clothing > Women’s > Shirts > Denim''
 * @param salePrice The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars. for example: ''14.99 USD''
 * @param shipping Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required. for example: ''US:CA:Ground:0 USD''
 * @param shippingHeight The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. for example: ''12 in''
 * @param shippingWeight The weight of the product. Ensure there is a space between the numeric string and the metric. for example: ''3 kg''
 * @param shippingWidth The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. for example: ''16 in''
 * @param size The size of the product. for example: ''M''
 * @param sizeSystem Indicates the country’s sizing system in which you are submitting your product. for example: ''US''
 * @param sizeType Additional description for the size. Must be one of the following values: ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, ‘maternity’. for example: ''regular''
 * @param tax Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required. for example: ''US:1025433:6.00:y''
 * @param title The name of the product. for example: ''Women’s denim shirt, large''
*/
final case class ItemAttributes (
  adLink: Option[String],
  additionalImageLink: Option[Seq[String]],
  adult: Option[Boolean],
  ageGroup: Option[String],
  availability: Option[String],
  averageReviewRating: Option[Double],
  brand: Option[String],
  color: Option[String],
  condition: Option[String],
  customLabel0: Option[String],
  customLabel1: Option[String],
  customLabel2: Option[String],
  customLabel3: Option[String],
  customLabel4: Option[String],
  description: Option[String],
  freeShippingLabel: Option[Boolean],
  freeShippingLimit: Option[String],
  gender: Option[String],
  googleProductCategory: Option[String],
  gtin: Option[Int],
  id: Option[String],
  imageLink: Option[Seq[String]],
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
  salePrice: Option[String],
  shipping: Option[String],
  shippingHeight: Option[String],
  shippingWeight: Option[String],
  shippingWidth: Option[String],
  size: Option[String],
  sizeSystem: Option[String],
  sizeType: Option[String],
  tax: Option[String],
  title: Option[String]
)

