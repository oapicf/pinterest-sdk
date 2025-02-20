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



#include "AdsAnalyticsGetAsyncResponse.h"

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

AdsAnalyticsGetAsyncResponse::AdsAnalyticsGetAsyncResponse(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string AdsAnalyticsGetAsyncResponse::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void AdsAnalyticsGetAsyncResponse::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree AdsAnalyticsGetAsyncResponse::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("url", m_Url);
	pt.put("size", m_Size);
	return pt;
}

void AdsAnalyticsGetAsyncResponse::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Url = pt.get("url", "");
	m_Size = pt.get("size", 0.0);
}

BulkReportingJobStatus AdsAnalyticsGetAsyncResponse::getReportStatus() const
{
    return m_Report_status;
}

void AdsAnalyticsGetAsyncResponse::setReportStatus(BulkReportingJobStatus value)
{
    m_Report_status = value;
}


std::string AdsAnalyticsGetAsyncResponse::getUrl() const
{
    return m_Url;
}

void AdsAnalyticsGetAsyncResponse::setUrl(std::string value)
{
    m_Url = value;
}


double AdsAnalyticsGetAsyncResponse::getSize() const
{
    return m_Size;
}

void AdsAnalyticsGetAsyncResponse::setSize(double value)
{
    m_Size = value;
}



std::vector<AdsAnalyticsGetAsyncResponse> createAdsAnalyticsGetAsyncResponseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<AdsAnalyticsGetAsyncResponse>();
    for (const auto& child: pt) {
        vec.emplace_back(AdsAnalyticsGetAsyncResponse(child.second));
    }

    return vec;
}

}
}
}
}

