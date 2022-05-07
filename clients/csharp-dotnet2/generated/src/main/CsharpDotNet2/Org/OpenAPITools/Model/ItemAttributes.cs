using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class ItemAttributes {
    /// <summary>
    /// Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
    /// </summary>
    /// <value>Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.</value>
    [DataMember(Name="ad_link", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ad_link")]
    public string AdLink { get; set; }

    /// <summary>
    /// The links to additional images for your product. Up to five additional images can be used to show a product from different angles or to show different stages. Separate each additional image with a comma. We recommend enclosing the whole string with quotes. Must begin with http:// or https://
    /// </summary>
    /// <value>The links to additional images for your product. Up to five additional images can be used to show a product from different angles or to show different stages. Separate each additional image with a comma. We recommend enclosing the whole string with quotes. Must begin with http:// or https://</value>
    [DataMember(Name="additional_image_link", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "additional_image_link")]
    public List<string> AdditionalImageLink { get; set; }

    /// <summary>
    /// Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
    /// </summary>
    /// <value>Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.</value>
    [DataMember(Name="adult", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "adult")]
    public bool? Adult { get; set; }

    /// <summary>
    /// The age group to apply a demographic range to the product. Must be one of the following values: ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, ‘adult’.
    /// </summary>
    /// <value>The age group to apply a demographic range to the product. Must be one of the following values: ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, ‘adult’.</value>
    [DataMember(Name="age_group", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "age_group")]
    public string AgeGroup { get; set; }

    /// <summary>
    /// The availability of the product. Must be one of the following values: ‘in stock’, ‘out of stock’, ‘preorder’.
    /// </summary>
    /// <value>The availability of the product. Must be one of the following values: ‘in stock’, ‘out of stock’, ‘preorder’.</value>
    [DataMember(Name="availability", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "availability")]
    public string Availability { get; set; }

    /// <summary>
    /// Average reviews for the item. Can be a number from 1-5.
    /// </summary>
    /// <value>Average reviews for the item. Can be a number from 1-5.</value>
    [DataMember(Name="average_review_rating", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "average_review_rating")]
    public decimal? AverageReviewRating { get; set; }

    /// <summary>
    /// The brand of the product.
    /// </summary>
    /// <value>The brand of the product.</value>
    [DataMember(Name="brand", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "brand")]
    public string Brand { get; set; }

    /// <summary>
    /// The primary color of the product.
    /// </summary>
    /// <value>The primary color of the product.</value>
    [DataMember(Name="color", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "color")]
    public string Color { get; set; }

    /// <summary>
    /// The condition of the product. Must be one of the following values: ‘new’, ‘used’, ‘refurbished’.
    /// </summary>
    /// <value>The condition of the product. Must be one of the following values: ‘new’, ‘used’, ‘refurbished’.</value>
    [DataMember(Name="condition", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "condition")]
    public string Condition { get; set; }

    /// <summary>
    /// Custom grouping of products.
    /// </summary>
    /// <value>Custom grouping of products.</value>
    [DataMember(Name="custom_label_0", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "custom_label_0")]
    public string CustomLabel0 { get; set; }

    /// <summary>
    /// Custom grouping of products.
    /// </summary>
    /// <value>Custom grouping of products.</value>
    [DataMember(Name="custom_label_1", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "custom_label_1")]
    public string CustomLabel1 { get; set; }

    /// <summary>
    /// Custom grouping of products.
    /// </summary>
    /// <value>Custom grouping of products.</value>
    [DataMember(Name="custom_label_2", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "custom_label_2")]
    public string CustomLabel2 { get; set; }

    /// <summary>
    /// Custom grouping of products.
    /// </summary>
    /// <value>Custom grouping of products.</value>
    [DataMember(Name="custom_label_3", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "custom_label_3")]
    public string CustomLabel3 { get; set; }

    /// <summary>
    /// Custom grouping of products.
    /// </summary>
    /// <value>Custom grouping of products.</value>
    [DataMember(Name="custom_label_4", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "custom_label_4")]
    public string CustomLabel4 { get; set; }

    /// <summary>
    /// The description of the product.
    /// </summary>
    /// <value>The description of the product.</value>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public string Description { get; set; }

    /// <summary>
    /// The item is free to ship.
    /// </summary>
    /// <value>The item is free to ship.</value>
    [DataMember(Name="free_shipping_label", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "free_shipping_label")]
    public bool? FreeShippingLabel { get; set; }

    /// <summary>
    /// The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
    /// </summary>
    /// <value>The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.</value>
    [DataMember(Name="free_shipping_limit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "free_shipping_limit")]
    public string FreeShippingLimit { get; set; }

    /// <summary>
    /// The gender associated with the product. Must be one of the following values: ‘male’, ‘female’, ‘unisex’.
    /// </summary>
    /// <value>The gender associated with the product. Must be one of the following values: ‘male’, ‘female’, ‘unisex’.</value>
    [DataMember(Name="gender", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "gender")]
    public string Gender { get; set; }

    /// <summary>
    /// The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
    /// </summary>
    /// <value>The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.</value>
    [DataMember(Name="google_product_category", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "google_product_category")]
    public string GoogleProductCategory { get; set; }

    /// <summary>
    /// The unique universal product identifier.
    /// </summary>
    /// <value>The unique universal product identifier.</value>
    [DataMember(Name="gtin", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "gtin")]
    public int? Gtin { get; set; }

    /// <summary>
    /// The user-created unique ID that represents the product. Only Unicode characters are accepted.
    /// </summary>
    /// <value>The user-created unique ID that represents the product. Only Unicode characters are accepted.</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public string Id { get; set; }

    /// <summary>
    /// The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://
    /// </summary>
    /// <value>The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://</value>
    [DataMember(Name="image_link", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "image_link")]
    public List<string> ImageLink { get; set; }

    /// <summary>
    /// The parent ID of the product.
    /// </summary>
    /// <value>The parent ID of the product.</value>
    [DataMember(Name="item_group_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "item_group_id")]
    public string ItemGroupId { get; set; }

    /// <summary>
    /// The millisecond timestamp when the item was lastly modified by the merchant.
    /// </summary>
    /// <value>The millisecond timestamp when the item was lastly modified by the merchant.</value>
    [DataMember(Name="last_updated_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "last_updated_time")]
    public long? LastUpdatedTime { get; set; }

    /// <summary>
    /// The landing page for the product.
    /// </summary>
    /// <value>The landing page for the product.</value>
    [DataMember(Name="link", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "link")]
    public string Link { get; set; }

    /// <summary>
    /// The material used to make the product.
    /// </summary>
    /// <value>The material used to make the product.</value>
    [DataMember(Name="material", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "material")]
    public string Material { get; set; }

    /// <summary>
    /// The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
    /// </summary>
    /// <value>The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.</value>
    [DataMember(Name="min_ad_price", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "min_ad_price")]
    public string MinAdPrice { get; set; }

    /// <summary>
    /// The mobile-optimized version of your landing page. Must begin with http:// or https://.
    /// </summary>
    /// <value>The mobile-optimized version of your landing page. Must begin with http:// or https://.</value>
    [DataMember(Name="mobile_link", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mobile_link")]
    public string MobileLink { get; set; }

    /// <summary>
    /// Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
    /// </summary>
    /// <value>Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.</value>
    [DataMember(Name="mpn", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mpn")]
    public string Mpn { get; set; }

    /// <summary>
    /// The number of ratings for the item.
    /// </summary>
    /// <value>The number of ratings for the item.</value>
    [DataMember(Name="number_of_ratings", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "number_of_ratings")]
    public int? NumberOfRatings { get; set; }

    /// <summary>
    /// The number of reviews available for the item.
    /// </summary>
    /// <value>The number of reviews available for the item.</value>
    [DataMember(Name="number_of_reviews", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "number_of_reviews")]
    public int? NumberOfReviews { get; set; }

    /// <summary>
    /// The description of the pattern used for the product.
    /// </summary>
    /// <value>The description of the pattern used for the product.</value>
    [DataMember(Name="pattern", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pattern")]
    public string Pattern { get; set; }

    /// <summary>
    /// The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
    /// </summary>
    /// <value>The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.</value>
    [DataMember(Name="price", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "price")]
    public string Price { get; set; }

    /// <summary>
    /// The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.
    /// </summary>
    /// <value>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</value>
    [DataMember(Name="product_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "product_type")]
    public string ProductType { get; set; }

    /// <summary>
    /// The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
    /// </summary>
    /// <value>The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.</value>
    [DataMember(Name="sale_price", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sale_price")]
    public string SalePrice { get; set; }

    /// <summary>
    /// Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
    /// </summary>
    /// <value>Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.</value>
    [DataMember(Name="shipping", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "shipping")]
    public string Shipping { get; set; }

    /// <summary>
    /// The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
    /// </summary>
    /// <value>The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.</value>
    [DataMember(Name="shipping_height", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "shipping_height")]
    public string ShippingHeight { get; set; }

    /// <summary>
    /// The weight of the product. Ensure there is a space between the numeric string and the metric.
    /// </summary>
    /// <value>The weight of the product. Ensure there is a space between the numeric string and the metric.</value>
    [DataMember(Name="shipping_weight", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "shipping_weight")]
    public string ShippingWeight { get; set; }

    /// <summary>
    /// The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
    /// </summary>
    /// <value>The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.</value>
    [DataMember(Name="shipping_width", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "shipping_width")]
    public string ShippingWidth { get; set; }

    /// <summary>
    /// The size of the product.
    /// </summary>
    /// <value>The size of the product.</value>
    [DataMember(Name="size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "size")]
    public string Size { get; set; }

    /// <summary>
    /// Indicates the country’s sizing system in which you are submitting your product.
    /// </summary>
    /// <value>Indicates the country’s sizing system in which you are submitting your product.</value>
    [DataMember(Name="size_system", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "size_system")]
    public string SizeSystem { get; set; }

    /// <summary>
    /// Additional description for the size. Must be one of the following values: ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, ‘maternity’.
    /// </summary>
    /// <value>Additional description for the size. Must be one of the following values: ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, ‘maternity’.</value>
    [DataMember(Name="size_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "size_type")]
    public string SizeType { get; set; }

    /// <summary>
    /// Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
    /// </summary>
    /// <value>Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.</value>
    [DataMember(Name="tax", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tax")]
    public string Tax { get; set; }

    /// <summary>
    /// The name of the product.
    /// </summary>
    /// <value>The name of the product.</value>
    [DataMember(Name="title", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "title")]
    public string Title { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ItemAttributes {\n");
      sb.Append("  AdLink: ").Append(AdLink).Append("\n");
      sb.Append("  AdditionalImageLink: ").Append(AdditionalImageLink).Append("\n");
      sb.Append("  Adult: ").Append(Adult).Append("\n");
      sb.Append("  AgeGroup: ").Append(AgeGroup).Append("\n");
      sb.Append("  Availability: ").Append(Availability).Append("\n");
      sb.Append("  AverageReviewRating: ").Append(AverageReviewRating).Append("\n");
      sb.Append("  Brand: ").Append(Brand).Append("\n");
      sb.Append("  Color: ").Append(Color).Append("\n");
      sb.Append("  Condition: ").Append(Condition).Append("\n");
      sb.Append("  CustomLabel0: ").Append(CustomLabel0).Append("\n");
      sb.Append("  CustomLabel1: ").Append(CustomLabel1).Append("\n");
      sb.Append("  CustomLabel2: ").Append(CustomLabel2).Append("\n");
      sb.Append("  CustomLabel3: ").Append(CustomLabel3).Append("\n");
      sb.Append("  CustomLabel4: ").Append(CustomLabel4).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
      sb.Append("  FreeShippingLabel: ").Append(FreeShippingLabel).Append("\n");
      sb.Append("  FreeShippingLimit: ").Append(FreeShippingLimit).Append("\n");
      sb.Append("  Gender: ").Append(Gender).Append("\n");
      sb.Append("  GoogleProductCategory: ").Append(GoogleProductCategory).Append("\n");
      sb.Append("  Gtin: ").Append(Gtin).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  ImageLink: ").Append(ImageLink).Append("\n");
      sb.Append("  ItemGroupId: ").Append(ItemGroupId).Append("\n");
      sb.Append("  LastUpdatedTime: ").Append(LastUpdatedTime).Append("\n");
      sb.Append("  Link: ").Append(Link).Append("\n");
      sb.Append("  Material: ").Append(Material).Append("\n");
      sb.Append("  MinAdPrice: ").Append(MinAdPrice).Append("\n");
      sb.Append("  MobileLink: ").Append(MobileLink).Append("\n");
      sb.Append("  Mpn: ").Append(Mpn).Append("\n");
      sb.Append("  NumberOfRatings: ").Append(NumberOfRatings).Append("\n");
      sb.Append("  NumberOfReviews: ").Append(NumberOfReviews).Append("\n");
      sb.Append("  Pattern: ").Append(Pattern).Append("\n");
      sb.Append("  Price: ").Append(Price).Append("\n");
      sb.Append("  ProductType: ").Append(ProductType).Append("\n");
      sb.Append("  SalePrice: ").Append(SalePrice).Append("\n");
      sb.Append("  Shipping: ").Append(Shipping).Append("\n");
      sb.Append("  ShippingHeight: ").Append(ShippingHeight).Append("\n");
      sb.Append("  ShippingWeight: ").Append(ShippingWeight).Append("\n");
      sb.Append("  ShippingWidth: ").Append(ShippingWidth).Append("\n");
      sb.Append("  Size: ").Append(Size).Append("\n");
      sb.Append("  SizeSystem: ").Append(SizeSystem).Append("\n");
      sb.Append("  SizeType: ").Append(SizeType).Append("\n");
      sb.Append("  Tax: ").Append(Tax).Append("\n");
      sb.Append("  Title: ").Append(Title).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
    }

}
}
