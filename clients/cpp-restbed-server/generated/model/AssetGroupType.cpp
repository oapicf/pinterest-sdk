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



#include "AssetGroupType.h"

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

AssetGroupType::AssetGroupType(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string AssetGroupType::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void AssetGroupType::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree AssetGroupType::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	return pt;
}

void AssetGroupType::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
}

std::string AssetGroupType::toString() const {
    return boost::lexical_cast<std::string>(getEnumValue());
}

void AssetGroupType::fromString(const std::string& str) {
    setEnumValue(boost::lexical_cast<std::string>(str));
}

std::string AssetGroupType::getEnumValue() const {
    return m_AssetGroupTypeEnumValue;
}

void AssetGroupType::setEnumValue(const std::string& val) {
    static const std::array<std::string, 4> allowedValues = {
        "BRAND", "LOCATION_OR_LANGUAGE", "PRODUCT_LINE", "OTHER"
    };
    if (std::find(allowedValues.begin(), allowedValues.end(), val) != allowedValues.end()) {
        m_AssetGroupTypeEnumValue = val;
    } else {
        throw std::runtime_error("Value " + boost::lexical_cast<std::string>(val) + " not allowed");
    }
}

std::vector<AssetGroupType> createAssetGroupTypeVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<AssetGroupType>();
    for (const auto& child: pt) {
        vec.emplace_back(AssetGroupType(child.second));
    }

    return vec;
}

}
}
}
}

