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


#include "CatalogsDeleteHotelItem.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CatalogsDeleteHotelItem::CatalogsDeleteHotelItem()
{
    m_Hotel_id = "";
    m_Operation = "";
    
}

void CatalogsDeleteHotelItem::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CatalogsDeleteHotelItem::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CatalogsDeleteHotelItem::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CatalogsDeleteHotelItem" : pathPrefix;

            
    return success;
}

bool CatalogsDeleteHotelItem::operator==(const CatalogsDeleteHotelItem& rhs) const
{
    return
    
    
    (getHotelId() == rhs.getHotelId())
     &&
    
    (getOperation() == rhs.getOperation())
    
    
    ;
}

bool CatalogsDeleteHotelItem::operator!=(const CatalogsDeleteHotelItem& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CatalogsDeleteHotelItem& o)
{
    j = nlohmann::json::object();
    j["hotel_id"] = o.m_Hotel_id;
    j["operation"] = o.m_Operation;
    
}

void from_json(const nlohmann::json& j, CatalogsDeleteHotelItem& o)
{
    j.at("hotel_id").get_to(o.m_Hotel_id);
    j.at("operation").get_to(o.m_Operation);
    
}

std::string CatalogsDeleteHotelItem::getHotelId() const
{
    return m_Hotel_id;
}
void CatalogsDeleteHotelItem::setHotelId(std::string const& value)
{
    m_Hotel_id = value;
}
std::string CatalogsDeleteHotelItem::getOperation() const
{
    return m_Operation;
}
void CatalogsDeleteHotelItem::setOperation(std::string const& value)
{
    m_Operation = value;
}


} // namespace org::openapitools::server::model

