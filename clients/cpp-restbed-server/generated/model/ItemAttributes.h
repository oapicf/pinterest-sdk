/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ItemAttributes.h
 *
 * 
 */

#ifndef ItemAttributes_H_
#define ItemAttributes_H_



#include <string>
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ItemAttributes 
{
public:
    ItemAttributes() = default;
    explicit ItemAttributes(boost::property_tree::ptree const& pt);
    virtual ~ItemAttributes() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// ItemAttributes members

    /// <summary>
    /// Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
    /// </summary>
    std::string getAdLink() const;
    void setAdLink(std::string value);

    /// <summary>
    /// The links to additional images for your product. Up to five additional images can be used to show a product from different angles or to show different stages. Separate each additional image with a comma. We recommend enclosing the whole string with quotes. Must begin with http:// or https://
    /// </summary>
    std::vector<std::string> getAdditionalImageLink() const;
    void setAdditionalImageLink(std::vector<std::string> value);

    /// <summary>
    /// Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest.
    /// </summary>
    bool isAdult() const;
    void setAdult(bool value);

    /// <summary>
    /// The age group to apply a demographic range to the product. Must be one of the following values: ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, ‘adult’.
    /// </summary>
    std::string getAgeGroup() const;
    void setAgeGroup(std::string value);

    /// <summary>
    /// The availability of the product. Must be one of the following values: ‘in stock’, ‘out of stock’, ‘preorder’.
    /// </summary>
    std::string getAvailability() const;
    void setAvailability(std::string value);

    /// <summary>
    /// Average reviews for the item. Can be a number from 1-5.
    /// </summary>
    double getAverageReviewRating() const;
    void setAverageReviewRating(double value);

    /// <summary>
    /// The brand of the product.
    /// </summary>
    std::string getBrand() const;
    void setBrand(std::string value);

    /// <summary>
    /// The primary color of the product.
    /// </summary>
    std::string getColor() const;
    void setColor(std::string value);

    /// <summary>
    /// The condition of the product. Must be one of the following values: ‘new’, ‘used’, ‘refurbished’.
    /// </summary>
    std::string getCondition() const;
    void setCondition(std::string value);

    /// <summary>
    /// Custom grouping of products.
    /// </summary>
    std::string getCustomLabel0() const;
    void setCustomLabel0(std::string value);

    /// <summary>
    /// Custom grouping of products.
    /// </summary>
    std::string getCustomLabel1() const;
    void setCustomLabel1(std::string value);

    /// <summary>
    /// Custom grouping of products.
    /// </summary>
    std::string getCustomLabel2() const;
    void setCustomLabel2(std::string value);

    /// <summary>
    /// Custom grouping of products.
    /// </summary>
    std::string getCustomLabel3() const;
    void setCustomLabel3(std::string value);

    /// <summary>
    /// Custom grouping of products.
    /// </summary>
    std::string getCustomLabel4() const;
    void setCustomLabel4(std::string value);

    /// <summary>
    /// The description of the product.
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string value);

    /// <summary>
    /// The item is free to ship.
    /// </summary>
    bool isFreeShippingLabel() const;
    void setFreeShippingLabel(bool value);

    /// <summary>
    /// The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
    /// </summary>
    std::string getFreeShippingLimit() const;
    void setFreeShippingLimit(std::string value);

    /// <summary>
    /// The gender associated with the product. Must be one of the following values: ‘male’, ‘female’, ‘unisex’.
    /// </summary>
    std::string getGender() const;
    void setGender(std::string value);

    /// <summary>
    /// The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
    /// </summary>
    std::string getGoogleProductCategory() const;
    void setGoogleProductCategory(std::string value);

    /// <summary>
    /// The unique universal product identifier.
    /// </summary>
    int32_t getGtin() const;
    void setGtin(int32_t value);

    /// <summary>
    /// The user-created unique ID that represents the product. Only Unicode characters are accepted.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://
    /// </summary>
    std::vector<std::string> getImageLink() const;
    void setImageLink(std::vector<std::string> value);

    /// <summary>
    /// The parent ID of the product.
    /// </summary>
    std::string getItemGroupId() const;
    void setItemGroupId(std::string value);

    /// <summary>
    /// The millisecond timestamp when the item was lastly modified by the merchant.
    /// </summary>
    int64_t getLastUpdatedTime() const;
    void setLastUpdatedTime(int64_t value);

    /// <summary>
    /// The landing page for the product.
    /// </summary>
    std::string getLink() const;
    void setLink(std::string value);

    /// <summary>
    /// The material used to make the product.
    /// </summary>
    std::string getMaterial() const;
    void setMaterial(std::string value);

    /// <summary>
    /// The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.
    /// </summary>
    std::string getMinAdPrice() const;
    void setMinAdPrice(std::string value);

    /// <summary>
    /// The mobile-optimized version of your landing page. Must begin with http:// or https://.
    /// </summary>
    std::string getMobileLink() const;
    void setMobileLink(std::string value);

    /// <summary>
    /// Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
    /// </summary>
    std::string getMpn() const;
    void setMpn(std::string value);

    /// <summary>
    /// The number of ratings for the item.
    /// </summary>
    int32_t getNumberOfRatings() const;
    void setNumberOfRatings(int32_t value);

    /// <summary>
    /// The number of reviews available for the item.
    /// </summary>
    int32_t getNumberOfReviews() const;
    void setNumberOfReviews(int32_t value);

    /// <summary>
    /// The description of the pattern used for the product.
    /// </summary>
    std::string getPattern() const;
    void setPattern(std::string value);

    /// <summary>
    /// The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
    /// </summary>
    std::string getPrice() const;
    void setPrice(std::string value);

    /// <summary>
    /// The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.
    /// </summary>
    std::string getProductType() const;
    void setProductType(std::string value);

    /// <summary>
    /// The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars.
    /// </summary>
    std::string getSalePrice() const;
    void setSalePrice(std::string value);

    /// <summary>
    /// Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
    /// </summary>
    std::string getShipping() const;
    void setShipping(std::string value);

    /// <summary>
    /// The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
    /// </summary>
    std::string getShippingHeight() const;
    void setShippingHeight(std::string value);

    /// <summary>
    /// The weight of the product. Ensure there is a space between the numeric string and the metric.
    /// </summary>
    std::string getShippingWeight() const;
    void setShippingWeight(std::string value);

    /// <summary>
    /// The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
    /// </summary>
    std::string getShippingWidth() const;
    void setShippingWidth(std::string value);

    /// <summary>
    /// The size of the product.
    /// </summary>
    std::string getSize() const;
    void setSize(std::string value);

    /// <summary>
    /// Indicates the country’s sizing system in which you are submitting your product.
    /// </summary>
    std::string getSizeSystem() const;
    void setSizeSystem(std::string value);

    /// <summary>
    /// Additional description for the size. Must be one of the following values: ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, ‘maternity’.
    /// </summary>
    std::string getSizeType() const;
    void setSizeType(std::string value);

    /// <summary>
    /// Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
    /// </summary>
    std::string getTax() const;
    void setTax(std::string value);

    /// <summary>
    /// The name of the product.
    /// </summary>
    std::string getTitle() const;
    void setTitle(std::string value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::string m_Ad_link = "";
    std::vector<std::string> m_Additional_image_link;
    bool m_Adult = false;
    std::string m_Age_group = "";
    std::string m_Availability = "";
    double m_Average_review_rating = 0.0;
    std::string m_Brand = "";
    std::string m_Color = "";
    std::string m_Condition = "";
    std::string m_Custom_label_0 = "";
    std::string m_Custom_label_1 = "";
    std::string m_Custom_label_2 = "";
    std::string m_Custom_label_3 = "";
    std::string m_Custom_label_4 = "";
    std::string m_Description = "";
    bool m_Free_shipping_label = false;
    std::string m_Free_shipping_limit = "";
    std::string m_Gender = "";
    std::string m_Google_product_category = "";
    int32_t m_Gtin = 0;
    std::string m_Id = "";
    std::vector<std::string> m_Image_link;
    std::string m_Item_group_id = "";
    int64_t m_Last_updated_time = 0L;
    std::string m_Link = "";
    std::string m_Material = "";
    std::string m_Min_ad_price = "";
    std::string m_Mobile_link = "";
    std::string m_Mpn = "";
    int32_t m_Number_of_ratings = 0;
    int32_t m_Number_of_reviews = 0;
    std::string m_Pattern = "";
    std::string m_Price = "";
    std::string m_Product_type = "";
    std::string m_Sale_price = "";
    std::string m_Shipping = "";
    std::string m_Shipping_height = "";
    std::string m_Shipping_weight = "";
    std::string m_Shipping_width = "";
    std::string m_Size = "";
    std::string m_Size_system = "";
    std::string m_Size_type = "";
    std::string m_Tax = "";
    std::string m_Title = "";
};

std::vector<ItemAttributes> createItemAttributesVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* ItemAttributes_H_ */