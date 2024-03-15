package org.openapitools.server.model


/**
 * @param adLink Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://. for example: ''https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest''
 * @param adult Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest. for example: ''true''
 * @param ageGroup The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’. for example: ''newborn''
 * @param availability The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’. for example: ''in stock''
 * @param averageReviewRating Average reviews for the item. Can be a number from 1-5. for example: ''5''
 * @param brand The brand of the product. for example: ''Josie’s Denim''
 * @param checkoutEnabled This attribute is not supported anymore. for example: ''false''
 * @param color The primary color of the product. for example: ''blue''
 * @param condition The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’. for example: ''new''
 * @param customLabel0 <p><= 1000 characters</p> <p>Custom grouping of products.</p> for example: ''Best sellers''
 * @param customLabel1 <p><= 1000 characters</p> <p>Custom grouping of products.</p> for example: ''Summer promotion''
 * @param customLabel2 <p><= 1000 characters</p> <p>Custom grouping of products.</p> for example: ''Winter sales''
 * @param customLabel3 <p><= 1000 characters</p> <p>Custom grouping of products.</p> for example: ''Woman dress''
 * @param customLabel4 <p><= 1000 characters</p> <p>Custom grouping of products.</p> for example: ''Man hat''
 * @param description <p><= 10000 characters</p> <p>The description of the product.</p> for example: ''Casual fit denim shirt made with the finest quality Japanese denim.''
 * @param freeShippingLabel The item is free to ship. for example: ''true''
 * @param freeShippingLimit The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered. for example: ''35 USD''
 * @param gender The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’. for example: ''unisex''
 * @param googleProductCategory The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. for example: ''Apparel & Accessories > Clothing > Shirts & Tops''
 * @param gtin The unique universal product identifier. for example: ''3234567890126''
 * @param id <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p> for example: ''DS0294-L''
 * @param itemGroupId <p><= 127 characters</p> <p>The parent ID of the product.</p> for example: ''DS0294''
 * @param lastUpdatedTime The millisecond timestamp when the item was lastly modified by the merchant. for example: ''1641483432072''
 * @param link <p><= 511 characters</p> <p>The landing page for the product.</p> for example: ''https://www.example.com/cat/womens-clothing/denim-shirt-0294''
 * @param material The material used to make the product. for example: ''cotton''
 * @param minAdPrice The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars. for example: ''19.99 USD''
 * @param mobileLink The mobile-optimized version of your landing page. Must begin with http:// or https://. for example: ''https://m.example.com/cat/womens-clothing/denim-shirt-0294''
 * @param mpn Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer. for example: ''PI12345NTEREST''
 * @param numberOfRatings The number of ratings for the item. for example: ''10''
 * @param numberOfReviews The number of reviews available for the item. for example: ''10''
 * @param pattern The description of the pattern used for the product. for example: ''plaid''
 * @param price The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. for example: ''24.99 USD''
 * @param productType <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p> for example: ''Clothing > Women’s > Shirts > Denim''
 * @param salePrice The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars. for example: ''14.99 USD''
 * @param shipping Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required. for example: ''US:CA:Ground:0 USD''
 * @param shippingHeight The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. for example: ''12 in''
 * @param shippingWeight The weight of the product. Ensure there is a space between the numeric string and the metric. for example: ''3 kg''
 * @param shippingWidth The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric. for example: ''16 in''
 * @param size The size of the product. for example: ''M''
 * @param sizeSystem Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’. for example: ''US''
 * @param sizeType Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’. for example: ''regular''
 * @param tax Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required. for example: ''US:1025433:6.00:y''
 * @param title <p><= 500 characters</p> <p>The name of the product.</p> for example: ''Women’s denim shirt, large''
 * @param variantNames Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. for example: ''["Color","Size"]''
 * @param variantValues Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names. for example: ''["Red","Small"]''
*/
final case class UpdatableItemAttributes (
  adLink: Option[String] = None,
  adult: Option[Boolean] = None,
  ageGroup: Option[String] = None,
  availability: Option[String] = None,
  averageReviewRating: Option[Double] = None,
  brand: Option[String] = None,
  checkoutEnabled: Option[Boolean] = None,
  color: Option[String] = None,
  condition: Option[String] = None,
  customLabel0: Option[String] = None,
  customLabel1: Option[String] = None,
  customLabel2: Option[String] = None,
  customLabel3: Option[String] = None,
  customLabel4: Option[String] = None,
  description: Option[String] = None,
  freeShippingLabel: Option[Boolean] = None,
  freeShippingLimit: Option[String] = None,
  gender: Option[String] = None,
  googleProductCategory: Option[String] = None,
  gtin: Option[Int] = None,
  id: Option[String] = None,
  itemGroupId: Option[String] = None,
  lastUpdatedTime: Option[Long] = None,
  link: Option[String] = None,
  material: Option[String] = None,
  minAdPrice: Option[String] = None,
  mobileLink: Option[String] = None,
  mpn: Option[String] = None,
  numberOfRatings: Option[Int] = None,
  numberOfReviews: Option[Int] = None,
  pattern: Option[String] = None,
  price: Option[String] = None,
  productType: Option[String] = None,
  salePrice: Option[String] = None,
  shipping: Option[String] = None,
  shippingHeight: Option[String] = None,
  shippingWeight: Option[String] = None,
  shippingWidth: Option[String] = None,
  size: Option[String] = None,
  sizeSystem: Option[String] = None,
  sizeType: Option[String] = None,
  tax: Option[String] = None,
  title: Option[String] = None,
  variantNames: Option[Seq[String]] = None,
  variantValues: Option[Seq[String]] = None
)

