/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.3.0
* Contact: pinterest-api@pinterest.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "ProductType1Filter.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ProductType1Filter::ProductType1Filter()
{
    
}

void ProductType1Filter::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ProductType1Filter::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ProductType1Filter::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ProductType1Filter" : pathPrefix;

        
    return success;
}

bool ProductType1Filter::operator==(const ProductType1Filter& rhs) const
{
    return
    
    
    (getPRODUCTTYPE1() == rhs.getPRODUCTTYPE1())
    
    
    ;
}

bool ProductType1Filter::operator!=(const ProductType1Filter& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ProductType1Filter& o)
{
    j = nlohmann::json();
    j["PRODUCT_TYPE_1"] = o.m_PRODUCT_TYPE_1;
    
}

void from_json(const nlohmann::json& j, ProductType1Filter& o)
{
    j.at("PRODUCT_TYPE_1").get_to(o.m_PRODUCT_TYPE_1);
    
}

CatalogsProductGroupMultipleStringListCriteria ProductType1Filter::getPRODUCTTYPE1() const
{
    return m_PRODUCT_TYPE_1;
}
void ProductType1Filter::setPRODUCTTYPE1(CatalogsProductGroupMultipleStringListCriteria const& value)
{
    m_PRODUCT_TYPE_1 = value;
}


} // namespace org::openapitools::server::model
