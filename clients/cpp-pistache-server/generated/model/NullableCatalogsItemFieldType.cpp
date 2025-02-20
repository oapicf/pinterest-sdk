/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "NullableCatalogsItemFieldType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

NullableCatalogsItemFieldType::NullableCatalogsItemFieldType()
{
    
}

void NullableCatalogsItemFieldType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool NullableCatalogsItemFieldType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool NullableCatalogsItemFieldType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "NullableCatalogsItemFieldType" : pathPrefix;

    
    if (m_value == NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool NullableCatalogsItemFieldType::operator==(const NullableCatalogsItemFieldType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool NullableCatalogsItemFieldType::operator!=(const NullableCatalogsItemFieldType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const NullableCatalogsItemFieldType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::ITEM_ID:
            j = "ITEM_ID";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::ITEM_GROUP_ID:
            j = "ITEM_GROUP_ID";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::TITLE:
            j = "TITLE";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::DESCRIPTION:
            j = "DESCRIPTION";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::ITEM_LINK:
            j = "ITEM_LINK";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::ORGANIC_LINK:
            j = "ORGANIC_LINK";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::IMAGE_LINK:
            j = "IMAGE_LINK";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::ADWORDS_REDIRECT_LINK:
            j = "ADWORDS_REDIRECT_LINK";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::AD_LINK:
            j = "AD_LINK";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::SIZE:
            j = "SIZE";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::GOOGLE_PRODUCT_CATEGORY:
            j = "GOOGLE_PRODUCT_CATEGORY";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::PRODUCT_CATEGORY:
            j = "PRODUCT_CATEGORY";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::CONDITION:
            j = "CONDITION";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::AVAILABILITY:
            j = "AVAILABILITY";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::GENDER:
            j = "GENDER";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::AGE_GROUP:
            j = "AGE_GROUP";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::SIZE_TYPE:
            j = "SIZE_TYPE";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::SIZE_SYSTEM:
            j = "SIZE_SYSTEM";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::ADULT:
            j = "ADULT";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::SHIPPING:
            j = "SHIPPING";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::SHIPPING_WEIGHT:
            j = "SHIPPING_WEIGHT";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::TAX:
            j = "TAX";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::MULTIPACK:
            j = "MULTIPACK";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::ADDITIONAL_IMAGE_LINK:
            j = "ADDITIONAL_IMAGE_LINK";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::PRICE:
            j = "PRICE";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::SALE_PRICE:
            j = "SALE_PRICE";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::IS_BUNDLE:
            j = "IS_BUNDLE";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::EXPIRATION_DATE:
            j = "EXPIRATION_DATE";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::SALE_PRICE_EFFECTIVE_DATE:
            j = "SALE_PRICE_EFFECTIVE_DATE";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::AVAILABILITY_DATE:
            j = "AVAILABILITY_DATE";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::WEIGHT_UNIT:
            j = "WEIGHT_UNIT";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::PRODUCT_TYPE:
            j = "PRODUCT_TYPE";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::CUSTOM_LABEL_0:
            j = "CUSTOM_LABEL_0";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::CUSTOM_LABEL_1:
            j = "CUSTOM_LABEL_1";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::CUSTOM_LABEL_2:
            j = "CUSTOM_LABEL_2";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::CUSTOM_LABEL_3:
            j = "CUSTOM_LABEL_3";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::CUSTOM_LABEL_4:
            j = "CUSTOM_LABEL_4";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::MATERIAL:
            j = "MATERIAL";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::PATTERN:
            j = "PATTERN";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::COLOR:
            j = "COLOR";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::BRAND:
            j = "BRAND";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::GTIN:
            j = "GTIN";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::MPN:
            j = "MPN";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::IOS_DEEP_LINK:
            j = "IOS_DEEP_LINK";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::ANDROID_DEEP_LINK:
            j = "ANDROID_DEEP_LINK";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::FREE_SHIPPING_LABEL:
            j = "FREE_SHIPPING_LABEL";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::FREE_SHIPPING_LIMIT:
            j = "FREE_SHIPPING_LIMIT";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::AVG_REVIEW_RATING:
            j = "AVG_REVIEW_RATING";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::NUM_RATINGS:
            j = "NUM_RATINGS";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::NUM_REVIEWS:
            j = "NUM_REVIEWS";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::ALT_TEXT:
            j = "ALT_TEXT";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::VARIANT_NAMES:
            j = "VARIANT_NAMES";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::VARIANT_VALUES:
            j = "VARIANT_VALUES";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::MIN_AD_PRICE:
            j = "MIN_AD_PRICE";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::SHIPPING_WIDTH:
            j = "SHIPPING_WIDTH";
            break;
        case NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::SHIPPING_HEIGHT:
            j = "SHIPPING_HEIGHT";
            break;
    }
}

void from_json(const nlohmann::json& j, NullableCatalogsItemFieldType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "ITEM_ID") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::ITEM_ID);
    } 
    else if (s == "ITEM_GROUP_ID") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::ITEM_GROUP_ID);
    } 
    else if (s == "TITLE") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::TITLE);
    } 
    else if (s == "DESCRIPTION") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::DESCRIPTION);
    } 
    else if (s == "ITEM_LINK") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::ITEM_LINK);
    } 
    else if (s == "ORGANIC_LINK") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::ORGANIC_LINK);
    } 
    else if (s == "IMAGE_LINK") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::IMAGE_LINK);
    } 
    else if (s == "ADWORDS_REDIRECT_LINK") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::ADWORDS_REDIRECT_LINK);
    } 
    else if (s == "AD_LINK") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::AD_LINK);
    } 
    else if (s == "SIZE") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::SIZE);
    } 
    else if (s == "GOOGLE_PRODUCT_CATEGORY") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::GOOGLE_PRODUCT_CATEGORY);
    } 
    else if (s == "PRODUCT_CATEGORY") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::PRODUCT_CATEGORY);
    } 
    else if (s == "CONDITION") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::CONDITION);
    } 
    else if (s == "AVAILABILITY") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::AVAILABILITY);
    } 
    else if (s == "GENDER") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::GENDER);
    } 
    else if (s == "AGE_GROUP") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::AGE_GROUP);
    } 
    else if (s == "SIZE_TYPE") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::SIZE_TYPE);
    } 
    else if (s == "SIZE_SYSTEM") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::SIZE_SYSTEM);
    } 
    else if (s == "ADULT") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::ADULT);
    } 
    else if (s == "SHIPPING") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::SHIPPING);
    } 
    else if (s == "SHIPPING_WEIGHT") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::SHIPPING_WEIGHT);
    } 
    else if (s == "TAX") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::TAX);
    } 
    else if (s == "MULTIPACK") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::MULTIPACK);
    } 
    else if (s == "ADDITIONAL_IMAGE_LINK") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::ADDITIONAL_IMAGE_LINK);
    } 
    else if (s == "PRICE") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::PRICE);
    } 
    else if (s == "SALE_PRICE") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::SALE_PRICE);
    } 
    else if (s == "IS_BUNDLE") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::IS_BUNDLE);
    } 
    else if (s == "EXPIRATION_DATE") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::EXPIRATION_DATE);
    } 
    else if (s == "SALE_PRICE_EFFECTIVE_DATE") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::SALE_PRICE_EFFECTIVE_DATE);
    } 
    else if (s == "AVAILABILITY_DATE") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::AVAILABILITY_DATE);
    } 
    else if (s == "WEIGHT_UNIT") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::WEIGHT_UNIT);
    } 
    else if (s == "PRODUCT_TYPE") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::PRODUCT_TYPE);
    } 
    else if (s == "CUSTOM_LABEL_0") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::CUSTOM_LABEL_0);
    } 
    else if (s == "CUSTOM_LABEL_1") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::CUSTOM_LABEL_1);
    } 
    else if (s == "CUSTOM_LABEL_2") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::CUSTOM_LABEL_2);
    } 
    else if (s == "CUSTOM_LABEL_3") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::CUSTOM_LABEL_3);
    } 
    else if (s == "CUSTOM_LABEL_4") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::CUSTOM_LABEL_4);
    } 
    else if (s == "MATERIAL") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::MATERIAL);
    } 
    else if (s == "PATTERN") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::PATTERN);
    } 
    else if (s == "COLOR") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::COLOR);
    } 
    else if (s == "BRAND") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::BRAND);
    } 
    else if (s == "GTIN") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::GTIN);
    } 
    else if (s == "MPN") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::MPN);
    } 
    else if (s == "IOS_DEEP_LINK") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::IOS_DEEP_LINK);
    } 
    else if (s == "ANDROID_DEEP_LINK") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::ANDROID_DEEP_LINK);
    } 
    else if (s == "FREE_SHIPPING_LABEL") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::FREE_SHIPPING_LABEL);
    } 
    else if (s == "FREE_SHIPPING_LIMIT") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::FREE_SHIPPING_LIMIT);
    } 
    else if (s == "AVG_REVIEW_RATING") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::AVG_REVIEW_RATING);
    } 
    else if (s == "NUM_RATINGS") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::NUM_RATINGS);
    } 
    else if (s == "NUM_REVIEWS") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::NUM_REVIEWS);
    } 
    else if (s == "ALT_TEXT") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::ALT_TEXT);
    } 
    else if (s == "VARIANT_NAMES") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::VARIANT_NAMES);
    } 
    else if (s == "VARIANT_VALUES") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::VARIANT_VALUES);
    } 
    else if (s == "MIN_AD_PRICE") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::MIN_AD_PRICE);
    } 
    else if (s == "SHIPPING_WIDTH") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::SHIPPING_WIDTH);
    } 
    else if (s == "SHIPPING_HEIGHT") {
     o.setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType::SHIPPING_HEIGHT);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType";
     throw std::invalid_argument(ss.str());
    } 

}

NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType NullableCatalogsItemFieldType::getValue() const
{
    return m_value;
}
void NullableCatalogsItemFieldType::setValue(NullableCatalogsItemFieldType::eNullableCatalogsItemFieldType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

