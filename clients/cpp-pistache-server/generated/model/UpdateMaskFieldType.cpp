/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "UpdateMaskFieldType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

UpdateMaskFieldType::UpdateMaskFieldType()
{
    
}

void UpdateMaskFieldType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool UpdateMaskFieldType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool UpdateMaskFieldType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "UpdateMaskFieldType" : pathPrefix;

    
    if (m_value == UpdateMaskFieldType::eUpdateMaskFieldType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool UpdateMaskFieldType::operator==(const UpdateMaskFieldType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool UpdateMaskFieldType::operator!=(const UpdateMaskFieldType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const UpdateMaskFieldType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case UpdateMaskFieldType::eUpdateMaskFieldType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::AD_LINK:
            j = "ad_link";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::ADULT:
            j = "adult";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::AGE_GROUP:
            j = "age_group";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::AVAILABILITY:
            j = "availability";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::AVERAGE_REVIEW_RATING:
            j = "average_review_rating";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::BRAND:
            j = "brand";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::CHECKOUT_ENABLED:
            j = "checkout_enabled";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::COLOR:
            j = "color";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::CONDITION:
            j = "condition";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::CUSTOM_LABEL_0:
            j = "custom_label_0";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::CUSTOM_LABEL_1:
            j = "custom_label_1";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::CUSTOM_LABEL_2:
            j = "custom_label_2";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::CUSTOM_LABEL_3:
            j = "custom_label_3";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::CUSTOM_LABEL_4:
            j = "custom_label_4";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::DESCRIPTION:
            j = "description";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::FREE_SHIPPING_LABEL:
            j = "free_shipping_label";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::FREE_SHIPPING_LIMIT:
            j = "free_shipping_limit";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::GENDER:
            j = "gender";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::GOOGLE_PRODUCT_CATEGORY:
            j = "google_product_category";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::GTIN:
            j = "gtin";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::ITEM_GROUP_ID:
            j = "item_group_id";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::LAST_UPDATED_TIME:
            j = "last_updated_time";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::LINK:
            j = "link";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::MATERIAL:
            j = "material";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::MIN_AD_PRICE:
            j = "min_ad_price";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::MPN:
            j = "mpn";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::NUMBER_OF_RATINGS:
            j = "number_of_ratings";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::NUMBER_OF_REVIEWS:
            j = "number_of_reviews";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::PATTERN:
            j = "pattern";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::PRICE:
            j = "price";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::PRODUCT_TYPE:
            j = "product_type";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::SALE_PRICE:
            j = "sale_price";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::SHIPPING:
            j = "shipping";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::SHIPPING_HEIGHT:
            j = "shipping_height";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::SHIPPING_WEIGHT:
            j = "shipping_weight";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::SHIPPING_WIDTH:
            j = "shipping_width";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::SIZE:
            j = "size";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::SIZE_SYSTEM:
            j = "size_system";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::SIZE_TYPE:
            j = "size_type";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::TAX:
            j = "tax";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::TITLE:
            j = "title";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::VARIANT_NAMES:
            j = "variant_names";
            break;
        case UpdateMaskFieldType::eUpdateMaskFieldType::VARIANT_VALUES:
            j = "variant_values";
            break;
    }
}

void from_json(const nlohmann::json& j, UpdateMaskFieldType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "ad_link") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::AD_LINK);
    } 
    else if (s == "adult") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::ADULT);
    } 
    else if (s == "age_group") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::AGE_GROUP);
    } 
    else if (s == "availability") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::AVAILABILITY);
    } 
    else if (s == "average_review_rating") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::AVERAGE_REVIEW_RATING);
    } 
    else if (s == "brand") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::BRAND);
    } 
    else if (s == "checkout_enabled") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::CHECKOUT_ENABLED);
    } 
    else if (s == "color") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::COLOR);
    } 
    else if (s == "condition") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::CONDITION);
    } 
    else if (s == "custom_label_0") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::CUSTOM_LABEL_0);
    } 
    else if (s == "custom_label_1") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::CUSTOM_LABEL_1);
    } 
    else if (s == "custom_label_2") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::CUSTOM_LABEL_2);
    } 
    else if (s == "custom_label_3") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::CUSTOM_LABEL_3);
    } 
    else if (s == "custom_label_4") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::CUSTOM_LABEL_4);
    } 
    else if (s == "description") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::DESCRIPTION);
    } 
    else if (s == "free_shipping_label") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::FREE_SHIPPING_LABEL);
    } 
    else if (s == "free_shipping_limit") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::FREE_SHIPPING_LIMIT);
    } 
    else if (s == "gender") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::GENDER);
    } 
    else if (s == "google_product_category") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::GOOGLE_PRODUCT_CATEGORY);
    } 
    else if (s == "gtin") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::GTIN);
    } 
    else if (s == "item_group_id") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::ITEM_GROUP_ID);
    } 
    else if (s == "last_updated_time") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::LAST_UPDATED_TIME);
    } 
    else if (s == "link") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::LINK);
    } 
    else if (s == "material") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::MATERIAL);
    } 
    else if (s == "min_ad_price") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::MIN_AD_PRICE);
    } 
    else if (s == "mpn") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::MPN);
    } 
    else if (s == "number_of_ratings") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::NUMBER_OF_RATINGS);
    } 
    else if (s == "number_of_reviews") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::NUMBER_OF_REVIEWS);
    } 
    else if (s == "pattern") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::PATTERN);
    } 
    else if (s == "price") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::PRICE);
    } 
    else if (s == "product_type") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::PRODUCT_TYPE);
    } 
    else if (s == "sale_price") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::SALE_PRICE);
    } 
    else if (s == "shipping") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::SHIPPING);
    } 
    else if (s == "shipping_height") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::SHIPPING_HEIGHT);
    } 
    else if (s == "shipping_weight") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::SHIPPING_WEIGHT);
    } 
    else if (s == "shipping_width") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::SHIPPING_WIDTH);
    } 
    else if (s == "size") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::SIZE);
    } 
    else if (s == "size_system") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::SIZE_SYSTEM);
    } 
    else if (s == "size_type") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::SIZE_TYPE);
    } 
    else if (s == "tax") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::TAX);
    } 
    else if (s == "title") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::TITLE);
    } 
    else if (s == "variant_names") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::VARIANT_NAMES);
    } 
    else if (s == "variant_values") {
     o.setValue(UpdateMaskFieldType::eUpdateMaskFieldType::VARIANT_VALUES);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " UpdateMaskFieldType::eUpdateMaskFieldType";
     throw std::invalid_argument(ss.str());
    } 

}

UpdateMaskFieldType::eUpdateMaskFieldType UpdateMaskFieldType::getValue() const
{
    return m_value;
}
void UpdateMaskFieldType::setValue(UpdateMaskFieldType::eUpdateMaskFieldType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model
