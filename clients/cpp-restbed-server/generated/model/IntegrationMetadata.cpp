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



#include "IntegrationMetadata.h"

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

IntegrationMetadata::IntegrationMetadata(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string IntegrationMetadata::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void IntegrationMetadata::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree IntegrationMetadata::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("external_business_id", m_External_business_id);
	pt.put("connected_merchant_id", m_Connected_merchant_id);
	pt.put("connected_user_id", m_Connected_user_id);
	pt.put("connected_advertiser_id", m_Connected_advertiser_id);
	pt.put("connected_lba_id", m_Connected_lba_id);
	pt.put("connected_tag_id", m_Connected_tag_id);
	pt.put("partner_access_token_expiry", m_Partner_access_token_expiry);
	pt.put("partner_refresh_token_expiry", m_Partner_refresh_token_expiry);
	pt.put("scopes", m_Scopes);
	pt.put("created_timestamp", m_Created_timestamp);
	pt.put("updated_timestamp", m_Updated_timestamp);
	pt.put("additional_id_1", m_Additional_id_1);
	pt.put("partner_metadata", m_Partner_metadata);
	return pt;
}

void IntegrationMetadata::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", "");
	m_External_business_id = pt.get("external_business_id", "");
	m_Connected_merchant_id = pt.get("connected_merchant_id", "");
	m_Connected_user_id = pt.get("connected_user_id", "");
	m_Connected_advertiser_id = pt.get("connected_advertiser_id", "");
	m_Connected_lba_id = pt.get("connected_lba_id", "");
	m_Connected_tag_id = pt.get("connected_tag_id", "");
	m_Partner_access_token_expiry = pt.get("partner_access_token_expiry", 0.0);
	m_Partner_refresh_token_expiry = pt.get("partner_refresh_token_expiry", 0.0);
	m_Scopes = pt.get("scopes", "");
	m_Created_timestamp = pt.get("created_timestamp", 0.0);
	m_Updated_timestamp = pt.get("updated_timestamp", 0.0);
	m_Additional_id_1 = pt.get("additional_id_1", "");
	m_Partner_metadata = pt.get("partner_metadata", "");
}

std::string IntegrationMetadata::getId() const
{
    return m_Id;
}

void IntegrationMetadata::setId(std::string value)
{
    m_Id = value;
}


std::string IntegrationMetadata::getExternalBusinessId() const
{
    return m_External_business_id;
}

void IntegrationMetadata::setExternalBusinessId(std::string value)
{
    m_External_business_id = value;
}


std::string IntegrationMetadata::getConnectedMerchantId() const
{
    return m_Connected_merchant_id;
}

void IntegrationMetadata::setConnectedMerchantId(std::string value)
{
    m_Connected_merchant_id = value;
}


std::string IntegrationMetadata::getConnectedUserId() const
{
    return m_Connected_user_id;
}

void IntegrationMetadata::setConnectedUserId(std::string value)
{
    m_Connected_user_id = value;
}


std::string IntegrationMetadata::getConnectedAdvertiserId() const
{
    return m_Connected_advertiser_id;
}

void IntegrationMetadata::setConnectedAdvertiserId(std::string value)
{
    m_Connected_advertiser_id = value;
}


std::string IntegrationMetadata::getConnectedLbaId() const
{
    return m_Connected_lba_id;
}

void IntegrationMetadata::setConnectedLbaId(std::string value)
{
    m_Connected_lba_id = value;
}


std::string IntegrationMetadata::getConnectedTagId() const
{
    return m_Connected_tag_id;
}

void IntegrationMetadata::setConnectedTagId(std::string value)
{
    m_Connected_tag_id = value;
}


double IntegrationMetadata::getPartnerAccessTokenExpiry() const
{
    return m_Partner_access_token_expiry;
}

void IntegrationMetadata::setPartnerAccessTokenExpiry(double value)
{
    m_Partner_access_token_expiry = value;
}


double IntegrationMetadata::getPartnerRefreshTokenExpiry() const
{
    return m_Partner_refresh_token_expiry;
}

void IntegrationMetadata::setPartnerRefreshTokenExpiry(double value)
{
    m_Partner_refresh_token_expiry = value;
}


std::string IntegrationMetadata::getScopes() const
{
    return m_Scopes;
}

void IntegrationMetadata::setScopes(std::string value)
{
    m_Scopes = value;
}


double IntegrationMetadata::getCreatedTimestamp() const
{
    return m_Created_timestamp;
}

void IntegrationMetadata::setCreatedTimestamp(double value)
{
    m_Created_timestamp = value;
}


double IntegrationMetadata::getUpdatedTimestamp() const
{
    return m_Updated_timestamp;
}

void IntegrationMetadata::setUpdatedTimestamp(double value)
{
    m_Updated_timestamp = value;
}


std::string IntegrationMetadata::getAdditionalId1() const
{
    return m_Additional_id_1;
}

void IntegrationMetadata::setAdditionalId1(std::string value)
{
    m_Additional_id_1 = value;
}


std::string IntegrationMetadata::getPartnerMetadata() const
{
    return m_Partner_metadata;
}

void IntegrationMetadata::setPartnerMetadata(std::string value)
{
    m_Partner_metadata = value;
}



std::vector<IntegrationMetadata> createIntegrationMetadataVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<IntegrationMetadata>();
    for (const auto& child: pt) {
        vec.emplace_back(IntegrationMetadata(child.second));
    }

    return vec;
}

}
}
}
}

