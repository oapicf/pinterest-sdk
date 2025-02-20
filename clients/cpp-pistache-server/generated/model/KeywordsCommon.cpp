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


#include "KeywordsCommon.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

KeywordsCommon::KeywordsCommon()
{
    m_Bid = 0;
    m_BidIsSet = false;
    m_Value = "";
    
}

void KeywordsCommon::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool KeywordsCommon::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool KeywordsCommon::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "KeywordsCommon" : pathPrefix;

                
    return success;
}

bool KeywordsCommon::operator==(const KeywordsCommon& rhs) const
{
    return
    
    
    
    ((!bidIsSet() && !rhs.bidIsSet()) || (bidIsSet() && rhs.bidIsSet() && getBid() == rhs.getBid())) &&
    
    (getMatchType() == rhs.getMatchType())
     &&
    
    (getValue() == rhs.getValue())
    
    
    ;
}

bool KeywordsCommon::operator!=(const KeywordsCommon& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const KeywordsCommon& o)
{
    j = nlohmann::json::object();
    if(o.bidIsSet())
        j["bid"] = o.m_Bid;
    j["match_type"] = o.m_Match_type;
    j["value"] = o.m_Value;
    
}

void from_json(const nlohmann::json& j, KeywordsCommon& o)
{
    if(j.find("bid") != j.end())
    {
        j.at("bid").get_to(o.m_Bid);
        o.m_BidIsSet = true;
    } 
    j.at("match_type").get_to(o.m_Match_type);
    j.at("value").get_to(o.m_Value);
    
}

int32_t KeywordsCommon::getBid() const
{
    return m_Bid;
}
void KeywordsCommon::setBid(int32_t const value)
{
    m_Bid = value;
    m_BidIsSet = true;
}
bool KeywordsCommon::bidIsSet() const
{
    return m_BidIsSet;
}
void KeywordsCommon::unsetBid()
{
    m_BidIsSet = false;
}
org::openapitools::server::model::MatchTypeResponse KeywordsCommon::getMatchType() const
{
    return m_Match_type;
}
void KeywordsCommon::setMatchType(org::openapitools::server::model::MatchTypeResponse const& value)
{
    m_Match_type = value;
}
std::string KeywordsCommon::getValue() const
{
    return m_Value;
}
void KeywordsCommon::setValue(std::string const& value)
{
    m_Value = value;
}


} // namespace org::openapitools::server::model

