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



#include "LeadsExportCreateResponse.h"

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

LeadsExportCreateResponse::LeadsExportCreateResponse(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string LeadsExportCreateResponse::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void LeadsExportCreateResponse::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree LeadsExportCreateResponse::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("leads_export_id", m_Leads_export_id);
	return pt;
}

void LeadsExportCreateResponse::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Leads_export_id = pt.get("leads_export_id", "");
}

std::string LeadsExportCreateResponse::getLeadsExportId() const
{
    return m_Leads_export_id;
}

void LeadsExportCreateResponse::setLeadsExportId(std::string value)
{
    m_Leads_export_id = value;
}



std::vector<LeadsExportCreateResponse> createLeadsExportCreateResponseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<LeadsExportCreateResponse>();
    for (const auto& child: pt) {
        vec.emplace_back(LeadsExportCreateResponse(child.second));
    }

    return vec;
}

}
}
}
}

