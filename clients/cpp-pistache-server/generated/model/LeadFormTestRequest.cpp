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


#include "LeadFormTestRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

LeadFormTestRequest::LeadFormTestRequest()
{
    
}

void LeadFormTestRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool LeadFormTestRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool LeadFormTestRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "LeadFormTestRequest" : pathPrefix;

         
    
    /* Answers */ {
        const std::vector<std::string>& value = m_Answers;
        const std::string currentValuePath = _pathPrefix + ".answers";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
    
    return success;
}

bool LeadFormTestRequest::operator==(const LeadFormTestRequest& rhs) const
{
    return
    
    
    (getAnswers() == rhs.getAnswers())
    
    
    ;
}

bool LeadFormTestRequest::operator!=(const LeadFormTestRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const LeadFormTestRequest& o)
{
    j = nlohmann::json::object();
    j["answers"] = o.m_Answers;
    
}

void from_json(const nlohmann::json& j, LeadFormTestRequest& o)
{
    j.at("answers").get_to(o.m_Answers);
    
}

std::vector<std::string> LeadFormTestRequest::getAnswers() const
{
    return m_Answers;
}
void LeadFormTestRequest::setAnswers(std::vector<std::string> const& value)
{
    m_Answers = value;
}


} // namespace org::openapitools::server::model
