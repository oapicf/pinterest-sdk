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


#include "CatalogsProductGroupType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

CatalogsProductGroupType::CatalogsProductGroupType()
{
    
}

void CatalogsProductGroupType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CatalogsProductGroupType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CatalogsProductGroupType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CatalogsProductGroupType" : pathPrefix;

    
    if (m_value == CatalogsProductGroupType::eCatalogsProductGroupType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool CatalogsProductGroupType::operator==(const CatalogsProductGroupType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool CatalogsProductGroupType::operator!=(const CatalogsProductGroupType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CatalogsProductGroupType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case CatalogsProductGroupType::eCatalogsProductGroupType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case CatalogsProductGroupType::eCatalogsProductGroupType::MERCHANT_CREATED:
            j = "MERCHANT_CREATED";
            break;
        case CatalogsProductGroupType::eCatalogsProductGroupType::ALL_PRODUCTS:
            j = "ALL_PRODUCTS";
            break;
        case CatalogsProductGroupType::eCatalogsProductGroupType::BEST_DEALS:
            j = "BEST_DEALS";
            break;
        case CatalogsProductGroupType::eCatalogsProductGroupType::PINNER_FAVORITES:
            j = "PINNER_FAVORITES";
            break;
        case CatalogsProductGroupType::eCatalogsProductGroupType::TOP_SELLERS:
            j = "TOP_SELLERS";
            break;
        case CatalogsProductGroupType::eCatalogsProductGroupType::BACK_IN_STOCK:
            j = "BACK_IN_STOCK";
            break;
        case CatalogsProductGroupType::eCatalogsProductGroupType::NEW_ARRIVALS:
            j = "NEW_ARRIVALS";
            break;
        case CatalogsProductGroupType::eCatalogsProductGroupType::SHOPIFY_COLLECTIONS:
            j = "SHOPIFY_COLLECTIONS";
            break;
        case CatalogsProductGroupType::eCatalogsProductGroupType::I2PC:
            j = "I2PC";
            break;
    }
}

void from_json(const nlohmann::json& j, CatalogsProductGroupType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "MERCHANT_CREATED") {
     o.setValue(CatalogsProductGroupType::eCatalogsProductGroupType::MERCHANT_CREATED);
    } 
    else if (s == "ALL_PRODUCTS") {
     o.setValue(CatalogsProductGroupType::eCatalogsProductGroupType::ALL_PRODUCTS);
    } 
    else if (s == "BEST_DEALS") {
     o.setValue(CatalogsProductGroupType::eCatalogsProductGroupType::BEST_DEALS);
    } 
    else if (s == "PINNER_FAVORITES") {
     o.setValue(CatalogsProductGroupType::eCatalogsProductGroupType::PINNER_FAVORITES);
    } 
    else if (s == "TOP_SELLERS") {
     o.setValue(CatalogsProductGroupType::eCatalogsProductGroupType::TOP_SELLERS);
    } 
    else if (s == "BACK_IN_STOCK") {
     o.setValue(CatalogsProductGroupType::eCatalogsProductGroupType::BACK_IN_STOCK);
    } 
    else if (s == "NEW_ARRIVALS") {
     o.setValue(CatalogsProductGroupType::eCatalogsProductGroupType::NEW_ARRIVALS);
    } 
    else if (s == "SHOPIFY_COLLECTIONS") {
     o.setValue(CatalogsProductGroupType::eCatalogsProductGroupType::SHOPIFY_COLLECTIONS);
    } 
    else if (s == "I2PC") {
     o.setValue(CatalogsProductGroupType::eCatalogsProductGroupType::I2PC);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " CatalogsProductGroupType::eCatalogsProductGroupType";
     throw std::invalid_argument(ss.str());
    } 

}

CatalogsProductGroupType::eCatalogsProductGroupType CatalogsProductGroupType::getValue() const
{
    return m_value;
}
void CatalogsProductGroupType::setValue(CatalogsProductGroupType::eCatalogsProductGroupType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

