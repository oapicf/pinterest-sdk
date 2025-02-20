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


#include "LeadFormQuestion.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

LeadFormQuestion::LeadFormQuestion()
{
    m_Question_typeIsSet = false;
    m_Custom_question_field_typeIsSet = false;
    m_Custom_question_label = "";
    m_Custom_question_labelIsSet = false;
    m_Custom_question_optionsIsSet = false;
    
}

void LeadFormQuestion::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool LeadFormQuestion::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool LeadFormQuestion::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "LeadFormQuestion" : pathPrefix;

                     
    if (customQuestionOptionsIsSet())
    {
        const std::vector<std::string>& value = m_Custom_question_options;
        const std::string currentValuePath = _pathPrefix + ".customQuestionOptions";
                
        
        if (value.size() < 0)
        {
            success = false;
            msg << currentValuePath << ": must have at least 0 elements;";
        }
        if (value.size() > 5)
        {
            success = false;
            msg << currentValuePath << ": must have at most 5 elements;";
        }
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

bool LeadFormQuestion::operator==(const LeadFormQuestion& rhs) const
{
    return
    
    
    
    ((!questionTypeIsSet() && !rhs.questionTypeIsSet()) || (questionTypeIsSet() && rhs.questionTypeIsSet() && getQuestionType() == rhs.getQuestionType())) &&
    
    
    ((!customQuestionFieldTypeIsSet() && !rhs.customQuestionFieldTypeIsSet()) || (customQuestionFieldTypeIsSet() && rhs.customQuestionFieldTypeIsSet() && getCustomQuestionFieldType() == rhs.getCustomQuestionFieldType())) &&
    
    
    ((!customQuestionLabelIsSet() && !rhs.customQuestionLabelIsSet()) || (customQuestionLabelIsSet() && rhs.customQuestionLabelIsSet() && getCustomQuestionLabel() == rhs.getCustomQuestionLabel())) &&
    
    
    ((!customQuestionOptionsIsSet() && !rhs.customQuestionOptionsIsSet()) || (customQuestionOptionsIsSet() && rhs.customQuestionOptionsIsSet() && getCustomQuestionOptions() == rhs.getCustomQuestionOptions()))
    
    ;
}

bool LeadFormQuestion::operator!=(const LeadFormQuestion& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const LeadFormQuestion& o)
{
    j = nlohmann::json::object();
    if(o.questionTypeIsSet())
        j["question_type"] = o.m_Question_type;
    if(o.customQuestionFieldTypeIsSet())
        j["custom_question_field_type"] = o.m_Custom_question_field_type;
    if(o.customQuestionLabelIsSet())
        j["custom_question_label"] = o.m_Custom_question_label;
    if(o.customQuestionOptionsIsSet() || !o.m_Custom_question_options.empty())
        j["custom_question_options"] = o.m_Custom_question_options;
    
}

void from_json(const nlohmann::json& j, LeadFormQuestion& o)
{
    if(j.find("question_type") != j.end())
    {
        j.at("question_type").get_to(o.m_Question_type);
        o.m_Question_typeIsSet = true;
    } 
    if(j.find("custom_question_field_type") != j.end())
    {
        j.at("custom_question_field_type").get_to(o.m_Custom_question_field_type);
        o.m_Custom_question_field_typeIsSet = true;
    } 
    if(j.find("custom_question_label") != j.end())
    {
        j.at("custom_question_label").get_to(o.m_Custom_question_label);
        o.m_Custom_question_labelIsSet = true;
    } 
    if(j.find("custom_question_options") != j.end())
    {
        j.at("custom_question_options").get_to(o.m_Custom_question_options);
        o.m_Custom_question_optionsIsSet = true;
    } 
    
}

org::openapitools::server::model::LeadFormQuestionType LeadFormQuestion::getQuestionType() const
{
    return m_Question_type;
}
void LeadFormQuestion::setQuestionType(org::openapitools::server::model::LeadFormQuestionType const& value)
{
    m_Question_type = value;
    m_Question_typeIsSet = true;
}
bool LeadFormQuestion::questionTypeIsSet() const
{
    return m_Question_typeIsSet;
}
void LeadFormQuestion::unsetQuestion_type()
{
    m_Question_typeIsSet = false;
}
org::openapitools::server::model::LeadFormQuestionFieldType LeadFormQuestion::getCustomQuestionFieldType() const
{
    return m_Custom_question_field_type;
}
void LeadFormQuestion::setCustomQuestionFieldType(org::openapitools::server::model::LeadFormQuestionFieldType const& value)
{
    m_Custom_question_field_type = value;
    m_Custom_question_field_typeIsSet = true;
}
bool LeadFormQuestion::customQuestionFieldTypeIsSet() const
{
    return m_Custom_question_field_typeIsSet;
}
void LeadFormQuestion::unsetCustom_question_field_type()
{
    m_Custom_question_field_typeIsSet = false;
}
std::string LeadFormQuestion::getCustomQuestionLabel() const
{
    return m_Custom_question_label;
}
void LeadFormQuestion::setCustomQuestionLabel(std::string const& value)
{
    m_Custom_question_label = value;
    m_Custom_question_labelIsSet = true;
}
bool LeadFormQuestion::customQuestionLabelIsSet() const
{
    return m_Custom_question_labelIsSet;
}
void LeadFormQuestion::unsetCustom_question_label()
{
    m_Custom_question_labelIsSet = false;
}
std::vector<std::string> LeadFormQuestion::getCustomQuestionOptions() const
{
    return m_Custom_question_options;
}
void LeadFormQuestion::setCustomQuestionOptions(std::vector<std::string> const& value)
{
    m_Custom_question_options = value;
    m_Custom_question_optionsIsSet = true;
}
bool LeadFormQuestion::customQuestionOptionsIsSet() const
{
    return m_Custom_question_optionsIsSet;
}
void LeadFormQuestion::unsetCustom_question_options()
{
    m_Custom_question_optionsIsSet = false;
}


} // namespace org::openapitools::server::model

