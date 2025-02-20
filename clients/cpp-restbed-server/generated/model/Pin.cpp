/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "Pin.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <algorithm>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

Pin::Pin(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string Pin::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void Pin::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Pin::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("created_at", m_Created_at);
	pt.put("link", m_Link);
	pt.put("title", m_Title);
	pt.put("description", m_Description);
	pt.put("dominant_color", m_Dominant_color);
	pt.put("alt_text", m_Alt_text);
	pt.put("board_id", m_Board_id);
	pt.put("board_section_id", m_Board_section_id);
	pt.add_child("board_owner", m_Board_owner.toPropertyTree());
	pt.put("is_owner", m_Is_owner);
	pt.add_child("media", m_Media.toPropertyTree());
	pt.add_child("media_source", m_Media_source.toPropertyTree());
	pt.put("parent_pin_id", m_Parent_pin_id);
	pt.put("is_standard", m_Is_standard);
	pt.put("has_been_promoted", m_Has_been_promoted);
	pt.put("note", m_Note);
	return pt;
}

void Pin::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", "");
	m_Created_at = pt.get("created_at", "");
	m_Link = pt.get("link", "");
	m_Title = pt.get("title", "");
	m_Description = pt.get("description", "");
	m_Dominant_color = pt.get("dominant_color", "");
	m_Alt_text = pt.get("alt_text", "");
	m_Board_id = pt.get("board_id", "");
	m_Board_section_id = pt.get("board_section_id", "");
	if (pt.get_child_optional("board_owner")) {
        m_Board_owner = fromPt<BoardOwner>(pt.get_child("board_owner"));
	}
	m_Is_owner = pt.get("is_owner", false);
	if (pt.get_child_optional("media")) {
        m_Media = fromPt<PinMedia>(pt.get_child("media"));
	}
	if (pt.get_child_optional("media_source")) {
        m_Media_source = fromPt<PinMediaSource>(pt.get_child("media_source"));
	}
	m_Parent_pin_id = pt.get("parent_pin_id", "");
	m_Is_standard = pt.get("is_standard", false);
	m_Has_been_promoted = pt.get("has_been_promoted", false);
	m_Note = pt.get("note", "");
}

std::string Pin::getId() const
{
    return m_Id;
}

void Pin::setId(std::string value)
{
    m_Id = value;
}


std::string Pin::getCreatedAt() const
{
    return m_Created_at;
}

void Pin::setCreatedAt(std::string value)
{
    m_Created_at = value;
}


std::string Pin::getLink() const
{
    return m_Link;
}

void Pin::setLink(std::string value)
{
    m_Link = value;
}


std::string Pin::getTitle() const
{
    return m_Title;
}

void Pin::setTitle(std::string value)
{
    m_Title = value;
}


std::string Pin::getDescription() const
{
    return m_Description;
}

void Pin::setDescription(std::string value)
{
    m_Description = value;
}


std::string Pin::getDominantColor() const
{
    return m_Dominant_color;
}

void Pin::setDominantColor(std::string value)
{
    m_Dominant_color = value;
}


std::string Pin::getAltText() const
{
    return m_Alt_text;
}

void Pin::setAltText(std::string value)
{
    m_Alt_text = value;
}


CreativeType Pin::getCreativeType() const
{
    return m_Creative_type;
}

void Pin::setCreativeType(CreativeType value)
{
    m_Creative_type = value;
}


std::string Pin::getBoardId() const
{
    return m_Board_id;
}

void Pin::setBoardId(std::string value)
{
    m_Board_id = value;
}


std::string Pin::getBoardSectionId() const
{
    return m_Board_section_id;
}

void Pin::setBoardSectionId(std::string value)
{
    m_Board_section_id = value;
}


BoardOwner Pin::getBoardOwner() const
{
    return m_Board_owner;
}

void Pin::setBoardOwner(BoardOwner value)
{
    m_Board_owner = value;
}


bool Pin::isIsOwner() const
{
    return m_Is_owner;
}

void Pin::setIsOwner(bool value)
{
    m_Is_owner = value;
}


PinMedia Pin::getMedia() const
{
    return m_Media;
}

void Pin::setMedia(PinMedia value)
{
    m_Media = value;
}


PinMediaSource Pin::getMediaSource() const
{
    return m_Media_source;
}

void Pin::setMediaSource(PinMediaSource value)
{
    m_Media_source = value;
}


std::string Pin::getParentPinId() const
{
    return m_Parent_pin_id;
}

void Pin::setParentPinId(std::string value)
{
    m_Parent_pin_id = value;
}


bool Pin::isIsStandard() const
{
    return m_Is_standard;
}

void Pin::setIsStandard(bool value)
{
    m_Is_standard = value;
}


bool Pin::isHasBeenPromoted() const
{
    return m_Has_been_promoted;
}

void Pin::setHasBeenPromoted(bool value)
{
    m_Has_been_promoted = value;
}


std::string Pin::getNote() const
{
    return m_Note;
}

void Pin::setNote(std::string value)
{
    m_Note = value;
}


std::string Pin::getPinMetrics() const
{
    return m_Pin_metrics;
}

void Pin::setPinMetrics(std::string value)
{
    m_Pin_metrics = value;
}



std::vector<Pin> createPinVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<Pin>();
    for (const auto& child: pt) {
        vec.emplace_back(Pin(child.second));
    }

    return vec;
}

}
}
}
}

