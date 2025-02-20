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

/*
 * GetBusinessAssetsResponse.h
 *
 * An object containing the permissions a business has on the asset.
 */

#ifndef GetBusinessAssetsResponse_H_
#define GetBusinessAssetsResponse_H_



#include <string>
#include "AssetGroupBinding.h"
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// An object containing the permissions a business has on the asset.
/// </summary>
class  GetBusinessAssetsResponse 
{
public:
    GetBusinessAssetsResponse() = default;
    explicit GetBusinessAssetsResponse(boost::property_tree::ptree const& pt);
    virtual ~GetBusinessAssetsResponse() = default;

    GetBusinessAssetsResponse(const GetBusinessAssetsResponse& other) = default; // copy constructor
    GetBusinessAssetsResponse(GetBusinessAssetsResponse&& other) noexcept = default; // move constructor

    GetBusinessAssetsResponse& operator=(const GetBusinessAssetsResponse& other) = default; // copy assignment
    GetBusinessAssetsResponse& operator=(GetBusinessAssetsResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// GetBusinessAssetsResponse members

    /// <summary>
    /// Unique identifier of a business asset.
    /// </summary>
    std::string getAssetId() const;
    void setAssetId(std::string value);

    /// <summary>
    /// Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
    /// </summary>
    std::string getAssetType() const;
    void setAssetType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    AssetGroupBinding getAssetGroupInfo() const;
    void setAssetGroupInfo(AssetGroupBinding value);

protected:
    std::string m_Asset_id = "";
    std::string m_Asset_type = "";
    AssetGroupBinding m_Asset_group_info;
};

std::vector<GetBusinessAssetsResponse> createGetBusinessAssetsResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<GetBusinessAssetsResponse>(const GetBusinessAssetsResponse& val) {
    return val.toPropertyTree();
}

template<>
inline GetBusinessAssetsResponse fromPt<GetBusinessAssetsResponse>(const boost::property_tree::ptree& pt) {
    GetBusinessAssetsResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* GetBusinessAssetsResponse_H_ */
