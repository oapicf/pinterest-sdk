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



#include "ConversionTagCreate.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
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

ConversionTagCreate::ConversionTagCreate(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ConversionTagCreate::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ConversionTagCreate::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ConversionTagCreate::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("name", m_Name);
	pt.put("aem_enabled", m_Aem_enabled);
	pt.put("md_frequency", m_Md_frequency);
	pt.put("aem_fnln_enabled", m_Aem_fnln_enabled);
	pt.put("aem_ph_enabled", m_Aem_ph_enabled);
	pt.put("aem_ge_enabled", m_Aem_ge_enabled);
	pt.put("aem_db_enabled", m_Aem_db_enabled);
	pt.put("aem_loc_enabled", m_Aem_loc_enabled);
	return pt;
}

void ConversionTagCreate::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Name = pt.get("name", "");
	m_Aem_enabled = pt.get("aem_enabled", false);
	m_Md_frequency = pt.get("md_frequency", 1);
	m_Aem_fnln_enabled = pt.get("aem_fnln_enabled", false);
	m_Aem_ph_enabled = pt.get("aem_ph_enabled", false);
	m_Aem_ge_enabled = pt.get("aem_ge_enabled", false);
	m_Aem_db_enabled = pt.get("aem_db_enabled", false);
	m_Aem_loc_enabled = pt.get("aem_loc_enabled", false);
}

std::string ConversionTagCreate::getName() const
{
    return m_Name;
}

void ConversionTagCreate::setName(std::string value)
{
    m_Name = value;
}


bool ConversionTagCreate::isAemEnabled() const
{
    return m_Aem_enabled;
}

void ConversionTagCreate::setAemEnabled(bool value)
{
    m_Aem_enabled = value;
}


double ConversionTagCreate::getMdFrequency() const
{
    return m_Md_frequency;
}

void ConversionTagCreate::setMdFrequency(double value)
{
    m_Md_frequency = value;
}


bool ConversionTagCreate::isAemFnlnEnabled() const
{
    return m_Aem_fnln_enabled;
}

void ConversionTagCreate::setAemFnlnEnabled(bool value)
{
    m_Aem_fnln_enabled = value;
}


bool ConversionTagCreate::isAemPhEnabled() const
{
    return m_Aem_ph_enabled;
}

void ConversionTagCreate::setAemPhEnabled(bool value)
{
    m_Aem_ph_enabled = value;
}


bool ConversionTagCreate::isAemGeEnabled() const
{
    return m_Aem_ge_enabled;
}

void ConversionTagCreate::setAemGeEnabled(bool value)
{
    m_Aem_ge_enabled = value;
}


bool ConversionTagCreate::isAemDbEnabled() const
{
    return m_Aem_db_enabled;
}

void ConversionTagCreate::setAemDbEnabled(bool value)
{
    m_Aem_db_enabled = value;
}


bool ConversionTagCreate::isAemLocEnabled() const
{
    return m_Aem_loc_enabled;
}

void ConversionTagCreate::setAemLocEnabled(bool value)
{
    m_Aem_loc_enabled = value;
}



std::vector<ConversionTagCreate> createConversionTagCreateVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ConversionTagCreate>();
    for (const auto& child: pt) {
        vec.emplace_back(ConversionTagCreate(child.second));
    }

    return vec;
}

}
}
}
}

