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


#include "OrderLineSingleResponse.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

OrderLineSingleResponse::OrderLineSingleResponse()
{
    m_DataIsSet = false;
    
}

void OrderLineSingleResponse::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OrderLineSingleResponse::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OrderLineSingleResponse::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OrderLineSingleResponse" : pathPrefix;

        
    return success;
}

bool OrderLineSingleResponse::operator==(const OrderLineSingleResponse& rhs) const
{
    return
    
    
    
    ((!dataIsSet() && !rhs.dataIsSet()) || (dataIsSet() && rhs.dataIsSet() && getData() == rhs.getData()))
    
    ;
}

bool OrderLineSingleResponse::operator!=(const OrderLineSingleResponse& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OrderLineSingleResponse& o)
{
    j = nlohmann::json::object();
    if(o.dataIsSet())
        j["data"] = o.m_Data;
    
}

void from_json(const nlohmann::json& j, OrderLineSingleResponse& o)
{
    if(j.find("data") != j.end())
    {
        j.at("data").get_to(o.m_Data);
        o.m_DataIsSet = true;
    } 
    
}

org::openapitools::server::model::OrderLineResponse OrderLineSingleResponse::getData() const
{
    return m_Data;
}
void OrderLineSingleResponse::setData(org::openapitools::server::model::OrderLineResponse const& value)
{
    m_Data = value;
    m_DataIsSet = true;
}
bool OrderLineSingleResponse::dataIsSet() const
{
    return m_DataIsSet;
}
void OrderLineSingleResponse::unsetData()
{
    m_DataIsSet = false;
}


} // namespace org::openapitools::server::model
