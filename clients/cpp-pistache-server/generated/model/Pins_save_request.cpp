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


#include "Pins_save_request.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

Pins_save_request::Pins_save_request()
{
    m_Board_id = "";
    m_Board_idIsSet = false;
    m_Board_section_id = "";
    m_Board_section_idIsSet = false;
    
}

void Pins_save_request::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool Pins_save_request::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool Pins_save_request::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "Pins_save_request" : pathPrefix;

         
    if (boardIdIsSet())
    {
        const std::string& value = m_Board_id;
        const std::string currentValuePath = _pathPrefix + ".boardId";
                
        

    }
         
    if (boardSectionIdIsSet())
    {
        const std::string& value = m_Board_section_id;
        const std::string currentValuePath = _pathPrefix + ".boardSectionId";
                
        

    }
    
    return success;
}

bool Pins_save_request::operator==(const Pins_save_request& rhs) const
{
    return
    
    
    
    ((!boardIdIsSet() && !rhs.boardIdIsSet()) || (boardIdIsSet() && rhs.boardIdIsSet() && getBoardId() == rhs.getBoardId())) &&
    
    
    ((!boardSectionIdIsSet() && !rhs.boardSectionIdIsSet()) || (boardSectionIdIsSet() && rhs.boardSectionIdIsSet() && getBoardSectionId() == rhs.getBoardSectionId()))
    
    ;
}

bool Pins_save_request::operator!=(const Pins_save_request& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const Pins_save_request& o)
{
    j = nlohmann::json::object();
    if(o.boardIdIsSet())
        j["board_id"] = o.m_Board_id;
    if(o.boardSectionIdIsSet())
        j["board_section_id"] = o.m_Board_section_id;
    
}

void from_json(const nlohmann::json& j, Pins_save_request& o)
{
    if(j.find("board_id") != j.end())
    {
        j.at("board_id").get_to(o.m_Board_id);
        o.m_Board_idIsSet = true;
    } 
    if(j.find("board_section_id") != j.end())
    {
        j.at("board_section_id").get_to(o.m_Board_section_id);
        o.m_Board_section_idIsSet = true;
    } 
    
}

std::string Pins_save_request::getBoardId() const
{
    return m_Board_id;
}
void Pins_save_request::setBoardId(std::string const& value)
{
    m_Board_id = value;
    m_Board_idIsSet = true;
}
bool Pins_save_request::boardIdIsSet() const
{
    return m_Board_idIsSet;
}
void Pins_save_request::unsetBoard_id()
{
    m_Board_idIsSet = false;
}
std::string Pins_save_request::getBoardSectionId() const
{
    return m_Board_section_id;
}
void Pins_save_request::setBoardSectionId(std::string const& value)
{
    m_Board_section_id = value;
    m_Board_section_idIsSet = true;
}
bool Pins_save_request::boardSectionIdIsSet() const
{
    return m_Board_section_idIsSet;
}
void Pins_save_request::unsetBoard_section_id()
{
    m_Board_section_idIsSet = false;
}


} // namespace org::openapitools::server::model

