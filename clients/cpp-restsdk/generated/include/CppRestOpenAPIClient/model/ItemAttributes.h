/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ItemAttributes.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ItemAttributes_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ItemAttributes_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// 
/// </summary>
class  ItemAttributes
    : public ModelBase
{
public:
    ItemAttributes();
    virtual ~ItemAttributes();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ItemAttributes members

    /// <summary>
    /// Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
    /// </summary>
    utility::string_t getAdLink() const;
    bool adLinkIsSet() const;
    void unsetAd_link();

    void setAdLink(const utility::string_t& value);

    /// <summary>
    /// Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest.
    /// </summary>
    bool isAdult() const;
    bool adultIsSet() const;
    void unsetAdult();

    void setAdult(bool value);

    /// <summary>
    /// The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
    /// </summary>
    utility::string_t getAgeGroup() const;
    bool ageGroupIsSet() const;
    void unsetAge_group();

    void setAgeGroup(const utility::string_t& value);

    /// <summary>
    /// The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’.
    /// </summary>
    utility::string_t getAvailability() const;
    bool availabilityIsSet() const;
    void unsetAvailability();

    void setAvailability(const utility::string_t& value);

    /// <summary>
    /// Average reviews for the item. Can be a number from 1-5.
    /// </summary>
    double getAverageReviewRating() const;
    bool averageReviewRatingIsSet() const;
    void unsetAverage_review_rating();

    void setAverageReviewRating(double value);

    /// <summary>
    /// The brand of the product.
    /// </summary>
    utility::string_t getBrand() const;
    bool brandIsSet() const;
    void unsetBrand();

    void setBrand(const utility::string_t& value);

    /// <summary>
    /// This attribute is not supported anymore.
    /// </summary>
    bool isCheckoutEnabled() const;
    bool checkoutEnabledIsSet() const;
    void unsetCheckout_enabled();

    void setCheckoutEnabled(bool value);

    /// <summary>
    /// The primary color of the product.
    /// </summary>
    utility::string_t getColor() const;
    bool colorIsSet() const;
    void unsetColor();

    void setColor(const utility::string_t& value);

    /// <summary>
    /// The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
    /// </summary>
    utility::string_t getCondition() const;
    bool conditionIsSet() const;
    void unsetCondition();

    void setCondition(const utility::string_t& value);

    /// <summary>
    /// &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
    /// </summary>
    utility::string_t getCustomLabel0() const;
    bool customLabel0IsSet() const;
    void unsetCustom_label_0();

    void setCustomLabel0(const utility::string_t& value);

    /// <summary>
    /// &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
    /// </summary>
    utility::string_t getCustomLabel1() const;
    bool customLabel1IsSet() const;
    void unsetCustom_label_1();

    void setCustomLabel1(const utility::string_t& value);

    /// <summary>
    /// &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
    /// </summary>
    utility::string_t getCustomLabel2() const;
    bool customLabel2IsSet() const;
    void unsetCustom_label_2();

    void setCustomLabel2(const utility::string_t& value);

    /// <summary>
    /// &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
    /// </summary>
    utility::string_t getCustomLabel3() const;
    bool customLabel3IsSet() const;
    void unsetCustom_label_3();

    void setCustomLabel3(const utility::string_t& value);

    /// <summary>
    /// &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
    /// </summary>
    utility::string_t getCustomLabel4() const;
    bool customLabel4IsSet() const;
    void unsetCustom_label_4();

    void setCustomLabel4(const utility::string_t& value);

    /// <summary>
    /// &lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt;
    /// </summary>
    utility::string_t getDescription() const;
    bool descriptionIsSet() const;
    void unsetDescription();

    void setDescription(const utility::string_t& value);

    /// <summary>
    /// The item is free to ship.
    /// </summary>
    bool isFreeShippingLabel() const;
    bool freeShippingLabelIsSet() const;
    void unsetFree_shipping_label();

    void setFreeShippingLabel(bool value);

    /// <summary>
    /// The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
    /// </summary>
    utility::string_t getFreeShippingLimit() const;
    bool freeShippingLimitIsSet() const;
    void unsetFree_shipping_limit();

    void setFreeShippingLimit(const utility::string_t& value);

    /// <summary>
    /// The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’.
    /// </summary>
    utility::string_t getGender() const;
    bool genderIsSet() const;
    void unsetGender();

    void setGender(const utility::string_t& value);

    /// <summary>
    /// The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
    /// </summary>
    utility::string_t getGoogleProductCategory() const;
    bool googleProductCategoryIsSet() const;
    void unsetGoogle_product_category();

    void setGoogleProductCategory(const utility::string_t& value);

    /// <summary>
    /// The unique universal product identifier.
    /// </summary>
    int32_t getGtin() const;
    bool gtinIsSet() const;
    void unsetGtin();

    void setGtin(int32_t value);

    /// <summary>
    /// &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt;
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt;
    /// </summary>
    utility::string_t getItemGroupId() const;
    bool itemGroupIdIsSet() const;
    void unsetItem_group_id();

    void setItemGroupId(const utility::string_t& value);

    /// <summary>
    /// The millisecond timestamp when the item was lastly modified by the merchant.
    /// </summary>
    int64_t getLastUpdatedTime() const;
    bool lastUpdatedTimeIsSet() const;
    void unsetLast_updated_time();

    void setLastUpdatedTime(int64_t value);

    /// <summary>
    /// &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt;
    /// </summary>
    utility::string_t getLink() const;
    bool linkIsSet() const;
    void unsetLink();

    void setLink(const utility::string_t& value);

    /// <summary>
    /// The material used to make the product.
    /// </summary>
    utility::string_t getMaterial() const;
    bool materialIsSet() const;
    void unsetMaterial();

    void setMaterial(const utility::string_t& value);

    /// <summary>
    /// The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.
    /// </summary>
    utility::string_t getMinAdPrice() const;
    bool minAdPriceIsSet() const;
    void unsetMin_ad_price();

    void setMinAdPrice(const utility::string_t& value);

    /// <summary>
    /// The mobile-optimized version of your landing page. Must begin with http:// or https://.
    /// </summary>
    utility::string_t getMobileLink() const;
    bool mobileLinkIsSet() const;
    void unsetMobile_link();

    void setMobileLink(const utility::string_t& value);

    /// <summary>
    /// Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
    /// </summary>
    utility::string_t getMpn() const;
    bool mpnIsSet() const;
    void unsetMpn();

    void setMpn(const utility::string_t& value);

    /// <summary>
    /// The number of ratings for the item.
    /// </summary>
    int32_t getNumberOfRatings() const;
    bool numberOfRatingsIsSet() const;
    void unsetNumber_of_ratings();

    void setNumberOfRatings(int32_t value);

    /// <summary>
    /// The number of reviews available for the item.
    /// </summary>
    int32_t getNumberOfReviews() const;
    bool numberOfReviewsIsSet() const;
    void unsetNumber_of_reviews();

    void setNumberOfReviews(int32_t value);

    /// <summary>
    /// The description of the pattern used for the product.
    /// </summary>
    utility::string_t getPattern() const;
    bool patternIsSet() const;
    void unsetPattern();

    void setPattern(const utility::string_t& value);

    /// <summary>
    /// The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
    /// </summary>
    utility::string_t getPrice() const;
    bool priceIsSet() const;
    void unsetPrice();

    void setPrice(const utility::string_t& value);

    /// <summary>
    /// &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt;
    /// </summary>
    utility::string_t getProductType() const;
    bool productTypeIsSet() const;
    void unsetProduct_type();

    void setProductType(const utility::string_t& value);

    /// <summary>
    /// The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars.
    /// </summary>
    utility::string_t getSalePrice() const;
    bool salePriceIsSet() const;
    void unsetSale_price();

    void setSalePrice(const utility::string_t& value);

    /// <summary>
    /// Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
    /// </summary>
    utility::string_t getShipping() const;
    bool shippingIsSet() const;
    void unsetShipping();

    void setShipping(const utility::string_t& value);

    /// <summary>
    /// The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
    /// </summary>
    utility::string_t getShippingHeight() const;
    bool shippingHeightIsSet() const;
    void unsetShipping_height();

    void setShippingHeight(const utility::string_t& value);

    /// <summary>
    /// The weight of the product. Ensure there is a space between the numeric string and the metric.
    /// </summary>
    utility::string_t getShippingWeight() const;
    bool shippingWeightIsSet() const;
    void unsetShipping_weight();

    void setShippingWeight(const utility::string_t& value);

    /// <summary>
    /// The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
    /// </summary>
    utility::string_t getShippingWidth() const;
    bool shippingWidthIsSet() const;
    void unsetShipping_width();

    void setShippingWidth(const utility::string_t& value);

    /// <summary>
    /// The size of the product.
    /// </summary>
    utility::string_t getSize() const;
    bool sizeIsSet() const;
    void unsetSize();

    void setSize(const utility::string_t& value);

    /// <summary>
    /// Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’.
    /// </summary>
    utility::string_t getSizeSystem() const;
    bool sizeSystemIsSet() const;
    void unsetSize_system();

    void setSizeSystem(const utility::string_t& value);

    /// <summary>
    /// Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’.
    /// </summary>
    utility::string_t getSizeType() const;
    bool sizeTypeIsSet() const;
    void unsetSize_type();

    void setSizeType(const utility::string_t& value);

    /// <summary>
    /// Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
    /// </summary>
    utility::string_t getTax() const;
    bool taxIsSet() const;
    void unsetTax();

    void setTax(const utility::string_t& value);

    /// <summary>
    /// &lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt;
    /// </summary>
    utility::string_t getTitle() const;
    bool titleIsSet() const;
    void unsetTitle();

    void setTitle(const utility::string_t& value);

    /// <summary>
    /// Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
    /// </summary>
    std::vector<utility::string_t>& getVariantNames();
    bool variantNamesIsSet() const;
    void unsetVariant_names();

    void setVariantNames(const std::vector<utility::string_t>& value);

    /// <summary>
    /// Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
    /// </summary>
    std::vector<utility::string_t>& getVariantValues();
    bool variantValuesIsSet() const;
    void unsetVariant_values();

    void setVariantValues(const std::vector<utility::string_t>& value);

    /// <summary>
    /// &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.&lt;/p&gt;
    /// </summary>
    std::vector<utility::string_t>& getAdditionalImageLink();
    bool additionalImageLinkIsSet() const;
    void unsetAdditional_image_link();

    void setAdditionalImageLink(const std::vector<utility::string_t>& value);

    /// <summary>
    /// &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.&lt;/p&gt;
    /// </summary>
    std::vector<utility::string_t>& getImageLink();
    bool imageLinkIsSet() const;
    void unsetImage_link();

    void setImageLink(const std::vector<utility::string_t>& value);

    /// <summary>
    /// &lt;p&gt;&lt;&#x3D; 2,000 characters&lt;/p&gt; &lt;p&gt;Hosted link to the product video.&lt;/p&gt; &lt;p&gt;File types for linked videos must be .mp4, .mov or .m4v.&lt;/p&gt; &lt;p&gt;File size cannot exceed 2GB.&lt;/p&gt;
    /// </summary>
    utility::string_t getVideoLink() const;
    bool videoLinkIsSet() const;
    void unsetVideo_link();

    void setVideoLink(const utility::string_t& value);


protected:
    utility::string_t m_Ad_link;
    bool m_Ad_linkIsSet;
    bool m_Adult;
    bool m_AdultIsSet;
    utility::string_t m_Age_group;
    bool m_Age_groupIsSet;
    utility::string_t m_Availability;
    bool m_AvailabilityIsSet;
    double m_Average_review_rating;
    bool m_Average_review_ratingIsSet;
    utility::string_t m_Brand;
    bool m_BrandIsSet;
    bool m_Checkout_enabled;
    bool m_Checkout_enabledIsSet;
    utility::string_t m_Color;
    bool m_ColorIsSet;
    utility::string_t m_Condition;
    bool m_ConditionIsSet;
    utility::string_t m_Custom_label_0;
    bool m_Custom_label_0IsSet;
    utility::string_t m_Custom_label_1;
    bool m_Custom_label_1IsSet;
    utility::string_t m_Custom_label_2;
    bool m_Custom_label_2IsSet;
    utility::string_t m_Custom_label_3;
    bool m_Custom_label_3IsSet;
    utility::string_t m_Custom_label_4;
    bool m_Custom_label_4IsSet;
    utility::string_t m_Description;
    bool m_DescriptionIsSet;
    bool m_Free_shipping_label;
    bool m_Free_shipping_labelIsSet;
    utility::string_t m_Free_shipping_limit;
    bool m_Free_shipping_limitIsSet;
    utility::string_t m_Gender;
    bool m_GenderIsSet;
    utility::string_t m_Google_product_category;
    bool m_Google_product_categoryIsSet;
    int32_t m_Gtin;
    bool m_GtinIsSet;
    utility::string_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Item_group_id;
    bool m_Item_group_idIsSet;
    int64_t m_Last_updated_time;
    bool m_Last_updated_timeIsSet;
    utility::string_t m_Link;
    bool m_LinkIsSet;
    utility::string_t m_Material;
    bool m_MaterialIsSet;
    utility::string_t m_Min_ad_price;
    bool m_Min_ad_priceIsSet;
    utility::string_t m_Mobile_link;
    bool m_Mobile_linkIsSet;
    utility::string_t m_Mpn;
    bool m_MpnIsSet;
    int32_t m_Number_of_ratings;
    bool m_Number_of_ratingsIsSet;
    int32_t m_Number_of_reviews;
    bool m_Number_of_reviewsIsSet;
    utility::string_t m_Pattern;
    bool m_PatternIsSet;
    utility::string_t m_Price;
    bool m_PriceIsSet;
    utility::string_t m_Product_type;
    bool m_Product_typeIsSet;
    utility::string_t m_Sale_price;
    bool m_Sale_priceIsSet;
    utility::string_t m_Shipping;
    bool m_ShippingIsSet;
    utility::string_t m_Shipping_height;
    bool m_Shipping_heightIsSet;
    utility::string_t m_Shipping_weight;
    bool m_Shipping_weightIsSet;
    utility::string_t m_Shipping_width;
    bool m_Shipping_widthIsSet;
    utility::string_t m_Size;
    bool m_SizeIsSet;
    utility::string_t m_Size_system;
    bool m_Size_systemIsSet;
    utility::string_t m_Size_type;
    bool m_Size_typeIsSet;
    utility::string_t m_Tax;
    bool m_TaxIsSet;
    utility::string_t m_Title;
    bool m_TitleIsSet;
    std::vector<utility::string_t> m_Variant_names;
    bool m_Variant_namesIsSet;
    std::vector<utility::string_t> m_Variant_values;
    bool m_Variant_valuesIsSet;
    std::vector<utility::string_t> m_Additional_image_link;
    bool m_Additional_image_linkIsSet;
    std::vector<utility::string_t> m_Image_link;
    bool m_Image_linkIsSet;
    utility::string_t m_Video_link;
    bool m_Video_linkIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ItemAttributes_H_ */
