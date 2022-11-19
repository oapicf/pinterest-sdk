/*
 * ItemAttributes.h
 *
 * 
 */

#ifndef _ItemAttributes_H_
#define _ItemAttributes_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ItemAttributes : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemAttributes();
	ItemAttributes(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemAttributes();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get <p><= 2000 characters</p> <p>The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.</p>
	 */
	std::list<std::string> getAdditionalImageLink();

	/*! \brief Set <p><= 2000 characters</p> <p>The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.</p>
	 */
	void setAdditionalImageLink(std::list <std::string> additional_image_link);
	/*! \brief Get <p><= 2000 characters</p> <p>The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p>
	 */
	std::list<std::string> getImageLink();

	/*! \brief Set <p><= 2000 characters</p> <p>The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p>
	 */
	void setImageLink(std::list <std::string> image_link);
	/*! \brief Get Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
	 */
	std::string getAdLink();

	/*! \brief Set Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
	 */
	void setAdLink(std::string  ad_link);
	/*! \brief Get Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
	 */
	bool getAdult();

	/*! \brief Set Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
	 */
	void setAdult(bool  adult);
	/*! \brief Get The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
	 */
	std::string getAgeGroup();

	/*! \brief Set The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
	 */
	void setAgeGroup(std::string  age_group);
	/*! \brief Get The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.
	 */
	std::string getAvailability();

	/*! \brief Set The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.
	 */
	void setAvailability(std::string  availability);
	/*! \brief Get Average reviews for the item. Can be a number from 1-5.
	 */
	long long getAverageReviewRating();

	/*! \brief Set Average reviews for the item. Can be a number from 1-5.
	 */
	void setAverageReviewRating(long long  average_review_rating);
	/*! \brief Get The brand of the product.
	 */
	std::string getBrand();

	/*! \brief Set The brand of the product.
	 */
	void setBrand(std::string  brand);
	/*! \brief Get Set this attribute to FALSE to indicate items that should be excluded from the Pinterest Checkout program. Note, this product is currently being tested and your account must be enrolled. Please contact your Account Manager or contact us for more information.
	 */
	bool getCheckoutEnabled();

	/*! \brief Set Set this attribute to FALSE to indicate items that should be excluded from the Pinterest Checkout program. Note, this product is currently being tested and your account must be enrolled. Please contact your Account Manager or contact us for more information.
	 */
	void setCheckoutEnabled(bool  checkout_enabled);
	/*! \brief Get The primary color of the product.
	 */
	std::string getColor();

	/*! \brief Set The primary color of the product.
	 */
	void setColor(std::string  color);
	/*! \brief Get The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
	 */
	std::string getCondition();

	/*! \brief Set The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
	 */
	void setCondition(std::string  condition);
	/*! \brief Get <p><= 1000 characters</p> <p>Custom grouping of products.</p>
	 */
	std::string getCustomLabel0();

	/*! \brief Set <p><= 1000 characters</p> <p>Custom grouping of products.</p>
	 */
	void setCustomLabel0(std::string  custom_label_0);
	/*! \brief Get <p><= 1000 characters</p> <p>Custom grouping of products.</p>
	 */
	std::string getCustomLabel1();

	/*! \brief Set <p><= 1000 characters</p> <p>Custom grouping of products.</p>
	 */
	void setCustomLabel1(std::string  custom_label_1);
	/*! \brief Get <p><= 1000 characters</p> <p>Custom grouping of products.</p>
	 */
	std::string getCustomLabel2();

	/*! \brief Set <p><= 1000 characters</p> <p>Custom grouping of products.</p>
	 */
	void setCustomLabel2(std::string  custom_label_2);
	/*! \brief Get <p><= 1000 characters</p> <p>Custom grouping of products.</p>
	 */
	std::string getCustomLabel3();

	/*! \brief Set <p><= 1000 characters</p> <p>Custom grouping of products.</p>
	 */
	void setCustomLabel3(std::string  custom_label_3);
	/*! \brief Get <p><= 1000 characters</p> <p>Custom grouping of products.</p>
	 */
	std::string getCustomLabel4();

	/*! \brief Set <p><= 1000 characters</p> <p>Custom grouping of products.</p>
	 */
	void setCustomLabel4(std::string  custom_label_4);
	/*! \brief Get <p><= 10000 characters</p> <p>The description of the product.</p>
	 */
	std::string getDescription();

	/*! \brief Set <p><= 10000 characters</p> <p>The description of the product.</p>
	 */
	void setDescription(std::string  description);
	/*! \brief Get The item is free to ship.
	 */
	bool getFreeShippingLabel();

	/*! \brief Set The item is free to ship.
	 */
	void setFreeShippingLabel(bool  free_shipping_label);
	/*! \brief Get The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
	 */
	std::string getFreeShippingLimit();

	/*! \brief Set The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
	 */
	void setFreeShippingLimit(std::string  free_shipping_limit);
	/*! \brief Get The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.
	 */
	std::string getGender();

	/*! \brief Set The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.
	 */
	void setGender(std::string  gender);
	/*! \brief Get The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
	 */
	std::string getGoogleProductCategory();

	/*! \brief Set The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
	 */
	void setGoogleProductCategory(std::string  google_product_category);
	/*! \brief Get The unique universal product identifier.
	 */
	int getGtin();

	/*! \brief Set The unique universal product identifier.
	 */
	void setGtin(int  gtin);
	/*! \brief Get <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>
	 */
	std::string getId();

	/*! \brief Set <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>
	 */
	void setId(std::string  id);
	/*! \brief Get <p><= 127 characters</p> <p>The parent ID of the product.</p>
	 */
	std::string getItemGroupId();

	/*! \brief Set <p><= 127 characters</p> <p>The parent ID of the product.</p>
	 */
	void setItemGroupId(std::string  item_group_id);
	/*! \brief Get The millisecond timestamp when the item was lastly modified by the merchant.
	 */
	long long getLastUpdatedTime();

	/*! \brief Set The millisecond timestamp when the item was lastly modified by the merchant.
	 */
	void setLastUpdatedTime(long long  last_updated_time);
	/*! \brief Get <p><= 511 characters</p> <p>The landing page for the product.</p>
	 */
	std::string getLink();

	/*! \brief Set <p><= 511 characters</p> <p>The landing page for the product.</p>
	 */
	void setLink(std::string  link);
	/*! \brief Get The material used to make the product.
	 */
	std::string getMaterial();

	/*! \brief Set The material used to make the product.
	 */
	void setMaterial(std::string  material);
	/*! \brief Get The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
	 */
	std::string getMinAdPrice();

	/*! \brief Set The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
	 */
	void setMinAdPrice(std::string  min_ad_price);
	/*! \brief Get The mobile-optimized version of your landing page. Must begin with http:// or https://.
	 */
	std::string getMobileLink();

	/*! \brief Set The mobile-optimized version of your landing page. Must begin with http:// or https://.
	 */
	void setMobileLink(std::string  mobile_link);
	/*! \brief Get Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
	 */
	std::string getMpn();

	/*! \brief Set Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
	 */
	void setMpn(std::string  mpn);
	/*! \brief Get The number of ratings for the item.
	 */
	int getNumberOfRatings();

	/*! \brief Set The number of ratings for the item.
	 */
	void setNumberOfRatings(int  number_of_ratings);
	/*! \brief Get The number of reviews available for the item.
	 */
	int getNumberOfReviews();

	/*! \brief Set The number of reviews available for the item.
	 */
	void setNumberOfReviews(int  number_of_reviews);
	/*! \brief Get The description of the pattern used for the product.
	 */
	std::string getPattern();

	/*! \brief Set The description of the pattern used for the product.
	 */
	void setPattern(std::string  pattern);
	/*! \brief Get The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
	 */
	std::string getPrice();

	/*! \brief Set The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
	 */
	void setPrice(std::string  price);
	/*! \brief Get <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>
	 */
	std::string getProductType();

	/*! \brief Set <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>
	 */
	void setProductType(std::string  product_type);
	/*! \brief Get The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
	 */
	std::string getSalePrice();

	/*! \brief Set The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
	 */
	void setSalePrice(std::string  sale_price);
	/*! \brief Get Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
	 */
	std::string getShipping();

	/*! \brief Set Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
	 */
	void setShipping(std::string  shipping);
	/*! \brief Get The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
	 */
	std::string getShippingHeight();

	/*! \brief Set The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
	 */
	void setShippingHeight(std::string  shipping_height);
	/*! \brief Get The weight of the product. Ensure there is a space between the numeric string and the metric.
	 */
	std::string getShippingWeight();

	/*! \brief Set The weight of the product. Ensure there is a space between the numeric string and the metric.
	 */
	void setShippingWeight(std::string  shipping_weight);
	/*! \brief Get The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
	 */
	std::string getShippingWidth();

	/*! \brief Set The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
	 */
	void setShippingWidth(std::string  shipping_width);
	/*! \brief Get The size of the product.
	 */
	std::string getSize();

	/*! \brief Set The size of the product.
	 */
	void setSize(std::string  size);
	/*! \brief Get Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.
	 */
	std::string getSizeSystem();

	/*! \brief Set Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.
	 */
	void setSizeSystem(std::string  size_system);
	/*! \brief Get Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.
	 */
	std::string getSizeType();

	/*! \brief Set Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.
	 */
	void setSizeType(std::string  size_type);
	/*! \brief Get Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
	 */
	std::string getTax();

	/*! \brief Set Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
	 */
	void setTax(std::string  tax);
	/*! \brief Get <p><= 500 characters</p> <p>The name of the product.</p>
	 */
	std::string getTitle();

	/*! \brief Set <p><= 500 characters</p> <p>The name of the product.</p>
	 */
	void setTitle(std::string  title);
	/*! \brief Get Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
	 */
	std::list<std::string> getVariantNames();

	/*! \brief Set Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
	 */
	void setVariantNames(std::list <std::string> variant_names);
	/*! \brief Get Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
	 */
	std::list<std::string> getVariantValues();

	/*! \brief Set Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
	 */
	void setVariantValues(std::list <std::string> variant_values);

private:
	std::list <std::string>additional_image_link;
	std::list <std::string>image_link;
	std::string ad_link;
	bool adult;
	std::string age_group;
	std::string availability;
	long long average_review_rating;
	std::string brand;
	bool checkout_enabled;
	std::string color;
	std::string condition;
	std::string custom_label_0;
	std::string custom_label_1;
	std::string custom_label_2;
	std::string custom_label_3;
	std::string custom_label_4;
	std::string description;
	bool free_shipping_label;
	std::string free_shipping_limit;
	std::string gender;
	std::string google_product_category;
	int gtin;
	std::string id;
	std::string item_group_id;
	long long last_updated_time;
	std::string link;
	std::string material;
	std::string min_ad_price;
	std::string mobile_link;
	std::string mpn;
	int number_of_ratings;
	int number_of_reviews;
	std::string pattern;
	std::string price;
	std::string product_type;
	std::string sale_price;
	std::string shipping;
	std::string shipping_height;
	std::string shipping_weight;
	std::string shipping_width;
	std::string size;
	std::string size_system;
	std::string size_type;
	std::string tax;
	std::string title;
	std::list <std::string>variant_names;
	std::list <std::string>variant_values;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemAttributes_H_ */
