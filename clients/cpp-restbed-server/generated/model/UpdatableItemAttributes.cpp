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



#include "UpdatableItemAttributes.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

UpdatableItemAttributes::UpdatableItemAttributes(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string UpdatableItemAttributes::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void UpdatableItemAttributes::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree UpdatableItemAttributes::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("ad_link", m_Ad_link);
	pt.put("adult", m_Adult);
	pt.put("age_group", m_Age_group);
	pt.put("availability", m_Availability);
	pt.put("average_review_rating", m_Average_review_rating);
	pt.put("brand", m_Brand);
	pt.put("checkout_enabled", m_Checkout_enabled);
	pt.put("color", m_Color);
	pt.put("condition", m_Condition);
	pt.put("custom_label_0", m_Custom_label_0);
	pt.put("custom_label_1", m_Custom_label_1);
	pt.put("custom_label_2", m_Custom_label_2);
	pt.put("custom_label_3", m_Custom_label_3);
	pt.put("custom_label_4", m_Custom_label_4);
	pt.put("description", m_Description);
	pt.put("free_shipping_label", m_Free_shipping_label);
	pt.put("free_shipping_limit", m_Free_shipping_limit);
	pt.put("gender", m_Gender);
	pt.put("google_product_category", m_Google_product_category);
	pt.put("gtin", m_Gtin);
	pt.put("id", m_Id);
	pt.put("item_group_id", m_Item_group_id);
	pt.put("last_updated_time", m_Last_updated_time);
	pt.put("link", m_Link);
	pt.put("material", m_Material);
	pt.put("min_ad_price", m_Min_ad_price);
	pt.put("mobile_link", m_Mobile_link);
	pt.put("mpn", m_Mpn);
	pt.put("number_of_ratings", m_Number_of_ratings);
	pt.put("number_of_reviews", m_Number_of_reviews);
	pt.put("pattern", m_Pattern);
	pt.put("price", m_Price);
	pt.put("product_type", m_Product_type);
	pt.put("sale_price", m_Sale_price);
	pt.put("shipping", m_Shipping);
	pt.put("shipping_height", m_Shipping_height);
	pt.put("shipping_weight", m_Shipping_weight);
	pt.put("shipping_width", m_Shipping_width);
	pt.put("size", m_Size);
	pt.put("size_system", m_Size_system);
	pt.put("size_type", m_Size_type);
	pt.put("tax", m_Tax);
	pt.put("title", m_Title);
	// generate tree for Variant_names
    tmp_node.clear();
	if (!m_Variant_names.empty()) {
        tmp_node = toPt(m_Variant_names);
		pt.add_child("variant_names", tmp_node);
		tmp_node.clear();
	}
	// generate tree for Variant_values
    tmp_node.clear();
	if (!m_Variant_values.empty()) {
        tmp_node = toPt(m_Variant_values);
		pt.add_child("variant_values", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void UpdatableItemAttributes::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Ad_link = pt.get("ad_link", "");
	m_Adult = pt.get("adult", false);
	m_Age_group = pt.get("age_group", "");
	m_Availability = pt.get("availability", "");
	m_Average_review_rating = pt.get("average_review_rating", 0.0);
	m_Brand = pt.get("brand", "");
	m_Checkout_enabled = pt.get("checkout_enabled", false);
	m_Color = pt.get("color", "");
	m_Condition = pt.get("condition", "");
	m_Custom_label_0 = pt.get("custom_label_0", "");
	m_Custom_label_1 = pt.get("custom_label_1", "");
	m_Custom_label_2 = pt.get("custom_label_2", "");
	m_Custom_label_3 = pt.get("custom_label_3", "");
	m_Custom_label_4 = pt.get("custom_label_4", "");
	m_Description = pt.get("description", "");
	m_Free_shipping_label = pt.get("free_shipping_label", false);
	m_Free_shipping_limit = pt.get("free_shipping_limit", "");
	m_Gender = pt.get("gender", "");
	m_Google_product_category = pt.get("google_product_category", "");
	m_Gtin = pt.get("gtin", 0);
	m_Id = pt.get("id", "");
	m_Item_group_id = pt.get("item_group_id", "");
	m_Last_updated_time = pt.get("last_updated_time", 0L);
	m_Link = pt.get("link", "");
	m_Material = pt.get("material", "");
	m_Min_ad_price = pt.get("min_ad_price", "");
	m_Mobile_link = pt.get("mobile_link", "");
	m_Mpn = pt.get("mpn", "");
	m_Number_of_ratings = pt.get("number_of_ratings", 0);
	m_Number_of_reviews = pt.get("number_of_reviews", 0);
	m_Pattern = pt.get("pattern", "");
	m_Price = pt.get("price", "");
	m_Product_type = pt.get("product_type", "");
	m_Sale_price = pt.get("sale_price", "");
	m_Shipping = pt.get("shipping", "");
	m_Shipping_height = pt.get("shipping_height", "");
	m_Shipping_weight = pt.get("shipping_weight", "");
	m_Shipping_width = pt.get("shipping_width", "");
	m_Size = pt.get("size", "");
	m_Size_system = pt.get("size_system", "");
	m_Size_type = pt.get("size_type", "");
	m_Tax = pt.get("tax", "");
	m_Title = pt.get("title", "");
	// push all items of Variant_names into member
	if (pt.get_child_optional("variant_names")) {
        m_Variant_names = fromPt<std::vector<std::string>>(pt.get_child("variant_names"));
	}
	// push all items of Variant_values into member
	if (pt.get_child_optional("variant_values")) {
        m_Variant_values = fromPt<std::vector<std::string>>(pt.get_child("variant_values"));
	}
}

std::string UpdatableItemAttributes::getAdLink() const
{
    return m_Ad_link;
}

void UpdatableItemAttributes::setAdLink(std::string value)
{
    m_Ad_link = value;
}


bool UpdatableItemAttributes::isAdult() const
{
    return m_Adult;
}

void UpdatableItemAttributes::setAdult(bool value)
{
    m_Adult = value;
}


std::string UpdatableItemAttributes::getAgeGroup() const
{
    return m_Age_group;
}

void UpdatableItemAttributes::setAgeGroup(std::string value)
{
    m_Age_group = value;
}


std::string UpdatableItemAttributes::getAvailability() const
{
    return m_Availability;
}

void UpdatableItemAttributes::setAvailability(std::string value)
{
    m_Availability = value;
}


double UpdatableItemAttributes::getAverageReviewRating() const
{
    return m_Average_review_rating;
}

void UpdatableItemAttributes::setAverageReviewRating(double value)
{
    m_Average_review_rating = value;
}


std::string UpdatableItemAttributes::getBrand() const
{
    return m_Brand;
}

void UpdatableItemAttributes::setBrand(std::string value)
{
    m_Brand = value;
}


bool UpdatableItemAttributes::isCheckoutEnabled() const
{
    return m_Checkout_enabled;
}

void UpdatableItemAttributes::setCheckoutEnabled(bool value)
{
    m_Checkout_enabled = value;
}


std::string UpdatableItemAttributes::getColor() const
{
    return m_Color;
}

void UpdatableItemAttributes::setColor(std::string value)
{
    m_Color = value;
}


std::string UpdatableItemAttributes::getCondition() const
{
    return m_Condition;
}

void UpdatableItemAttributes::setCondition(std::string value)
{
    m_Condition = value;
}


std::string UpdatableItemAttributes::getCustomLabel0() const
{
    return m_Custom_label_0;
}

void UpdatableItemAttributes::setCustomLabel0(std::string value)
{
    m_Custom_label_0 = value;
}


std::string UpdatableItemAttributes::getCustomLabel1() const
{
    return m_Custom_label_1;
}

void UpdatableItemAttributes::setCustomLabel1(std::string value)
{
    m_Custom_label_1 = value;
}


std::string UpdatableItemAttributes::getCustomLabel2() const
{
    return m_Custom_label_2;
}

void UpdatableItemAttributes::setCustomLabel2(std::string value)
{
    m_Custom_label_2 = value;
}


std::string UpdatableItemAttributes::getCustomLabel3() const
{
    return m_Custom_label_3;
}

void UpdatableItemAttributes::setCustomLabel3(std::string value)
{
    m_Custom_label_3 = value;
}


std::string UpdatableItemAttributes::getCustomLabel4() const
{
    return m_Custom_label_4;
}

void UpdatableItemAttributes::setCustomLabel4(std::string value)
{
    m_Custom_label_4 = value;
}


std::string UpdatableItemAttributes::getDescription() const
{
    return m_Description;
}

void UpdatableItemAttributes::setDescription(std::string value)
{
    m_Description = value;
}


bool UpdatableItemAttributes::isFreeShippingLabel() const
{
    return m_Free_shipping_label;
}

void UpdatableItemAttributes::setFreeShippingLabel(bool value)
{
    m_Free_shipping_label = value;
}


std::string UpdatableItemAttributes::getFreeShippingLimit() const
{
    return m_Free_shipping_limit;
}

void UpdatableItemAttributes::setFreeShippingLimit(std::string value)
{
    m_Free_shipping_limit = value;
}


std::string UpdatableItemAttributes::getGender() const
{
    return m_Gender;
}

void UpdatableItemAttributes::setGender(std::string value)
{
    m_Gender = value;
}


std::string UpdatableItemAttributes::getGoogleProductCategory() const
{
    return m_Google_product_category;
}

void UpdatableItemAttributes::setGoogleProductCategory(std::string value)
{
    m_Google_product_category = value;
}


int32_t UpdatableItemAttributes::getGtin() const
{
    return m_Gtin;
}

void UpdatableItemAttributes::setGtin(int32_t value)
{
    m_Gtin = value;
}


std::string UpdatableItemAttributes::getId() const
{
    return m_Id;
}

void UpdatableItemAttributes::setId(std::string value)
{
    m_Id = value;
}


std::string UpdatableItemAttributes::getItemGroupId() const
{
    return m_Item_group_id;
}

void UpdatableItemAttributes::setItemGroupId(std::string value)
{
    m_Item_group_id = value;
}


int64_t UpdatableItemAttributes::getLastUpdatedTime() const
{
    return m_Last_updated_time;
}

void UpdatableItemAttributes::setLastUpdatedTime(int64_t value)
{
    m_Last_updated_time = value;
}


std::string UpdatableItemAttributes::getLink() const
{
    return m_Link;
}

void UpdatableItemAttributes::setLink(std::string value)
{
    m_Link = value;
}


std::string UpdatableItemAttributes::getMaterial() const
{
    return m_Material;
}

void UpdatableItemAttributes::setMaterial(std::string value)
{
    m_Material = value;
}


std::string UpdatableItemAttributes::getMinAdPrice() const
{
    return m_Min_ad_price;
}

void UpdatableItemAttributes::setMinAdPrice(std::string value)
{
    m_Min_ad_price = value;
}


std::string UpdatableItemAttributes::getMobileLink() const
{
    return m_Mobile_link;
}

void UpdatableItemAttributes::setMobileLink(std::string value)
{
    m_Mobile_link = value;
}


std::string UpdatableItemAttributes::getMpn() const
{
    return m_Mpn;
}

void UpdatableItemAttributes::setMpn(std::string value)
{
    m_Mpn = value;
}


int32_t UpdatableItemAttributes::getNumberOfRatings() const
{
    return m_Number_of_ratings;
}

void UpdatableItemAttributes::setNumberOfRatings(int32_t value)
{
    m_Number_of_ratings = value;
}


int32_t UpdatableItemAttributes::getNumberOfReviews() const
{
    return m_Number_of_reviews;
}

void UpdatableItemAttributes::setNumberOfReviews(int32_t value)
{
    m_Number_of_reviews = value;
}


std::string UpdatableItemAttributes::getPattern() const
{
    return m_Pattern;
}

void UpdatableItemAttributes::setPattern(std::string value)
{
    m_Pattern = value;
}


std::string UpdatableItemAttributes::getPrice() const
{
    return m_Price;
}

void UpdatableItemAttributes::setPrice(std::string value)
{
    m_Price = value;
}


std::string UpdatableItemAttributes::getProductType() const
{
    return m_Product_type;
}

void UpdatableItemAttributes::setProductType(std::string value)
{
    m_Product_type = value;
}


std::string UpdatableItemAttributes::getSalePrice() const
{
    return m_Sale_price;
}

void UpdatableItemAttributes::setSalePrice(std::string value)
{
    m_Sale_price = value;
}


std::string UpdatableItemAttributes::getShipping() const
{
    return m_Shipping;
}

void UpdatableItemAttributes::setShipping(std::string value)
{
    m_Shipping = value;
}


std::string UpdatableItemAttributes::getShippingHeight() const
{
    return m_Shipping_height;
}

void UpdatableItemAttributes::setShippingHeight(std::string value)
{
    m_Shipping_height = value;
}


std::string UpdatableItemAttributes::getShippingWeight() const
{
    return m_Shipping_weight;
}

void UpdatableItemAttributes::setShippingWeight(std::string value)
{
    m_Shipping_weight = value;
}


std::string UpdatableItemAttributes::getShippingWidth() const
{
    return m_Shipping_width;
}

void UpdatableItemAttributes::setShippingWidth(std::string value)
{
    m_Shipping_width = value;
}


std::string UpdatableItemAttributes::getSize() const
{
    return m_Size;
}

void UpdatableItemAttributes::setSize(std::string value)
{
    m_Size = value;
}


std::string UpdatableItemAttributes::getSizeSystem() const
{
    return m_Size_system;
}

void UpdatableItemAttributes::setSizeSystem(std::string value)
{
    m_Size_system = value;
}


std::string UpdatableItemAttributes::getSizeType() const
{
    return m_Size_type;
}

void UpdatableItemAttributes::setSizeType(std::string value)
{
    m_Size_type = value;
}


std::string UpdatableItemAttributes::getTax() const
{
    return m_Tax;
}

void UpdatableItemAttributes::setTax(std::string value)
{
    m_Tax = value;
}


std::string UpdatableItemAttributes::getTitle() const
{
    return m_Title;
}

void UpdatableItemAttributes::setTitle(std::string value)
{
    m_Title = value;
}


std::vector<std::string> UpdatableItemAttributes::getVariantNames() const
{
    return m_Variant_names;
}

void UpdatableItemAttributes::setVariantNames(std::vector<std::string> value)
{
    m_Variant_names = value;
}


std::vector<std::string> UpdatableItemAttributes::getVariantValues() const
{
    return m_Variant_values;
}

void UpdatableItemAttributes::setVariantValues(std::vector<std::string> value)
{
    m_Variant_values = value;
}



std::vector<UpdatableItemAttributes> createUpdatableItemAttributesVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<UpdatableItemAttributes>();
    for (const auto& child: pt) {
        vec.emplace_back(UpdatableItemAttributes(child.second));
    }

    return vec;
}

}
}
}
}

