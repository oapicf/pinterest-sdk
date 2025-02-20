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
 * UpdatePartnerAssetAccessBody_accesses_inner.h
 *
 * 
 */

#ifndef UpdatePartnerAssetAccessBody_accesses_inner_H_
#define UpdatePartnerAssetAccessBody_accesses_inner_H_



#include "Permissions.h"
#include <string>
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  UpdatePartnerAssetAccessBody_accesses_inner 
{
public:
    UpdatePartnerAssetAccessBody_accesses_inner() = default;
    explicit UpdatePartnerAssetAccessBody_accesses_inner(boost::property_tree::ptree const& pt);
    virtual ~UpdatePartnerAssetAccessBody_accesses_inner() = default;

    UpdatePartnerAssetAccessBody_accesses_inner(const UpdatePartnerAssetAccessBody_accesses_inner& other) = default; // copy constructor
    UpdatePartnerAssetAccessBody_accesses_inner(UpdatePartnerAssetAccessBody_accesses_inner&& other) noexcept = default; // move constructor

    UpdatePartnerAssetAccessBody_accesses_inner& operator=(const UpdatePartnerAssetAccessBody_accesses_inner& other) = default; // copy assignment
    UpdatePartnerAssetAccessBody_accesses_inner& operator=(UpdatePartnerAssetAccessBody_accesses_inner&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// UpdatePartnerAssetAccessBody_accesses_inner members

    /// <summary>
    /// Unique identifier of a business partner to update asset access to.
    /// </summary>
    std::string getPartnerId() const;
    void setPartnerId(std::string value);

    /// <summary>
    /// Unique identifier of the business asset.
    /// </summary>
    std::string getAssetId() const;
    void setAssetId(std::string value);

    /// <summary>
    /// A non-empty array of permissions to assign to the partner.
    /// </summary>
    std::vector<Permissions> getPermissions() const;
    void setPermissions(std::vector<Permissions> value);

protected:
    std::string m_Partner_id = "";
    std::string m_Asset_id = "";
    std::vector<Permissions> m_Permissions;
};

std::vector<UpdatePartnerAssetAccessBody_accesses_inner> createUpdatePartnerAssetAccessBody_accesses_innerVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<UpdatePartnerAssetAccessBody_accesses_inner>(const UpdatePartnerAssetAccessBody_accesses_inner& val) {
    return val.toPropertyTree();
}

template<>
inline UpdatePartnerAssetAccessBody_accesses_inner fromPt<UpdatePartnerAssetAccessBody_accesses_inner>(const boost::property_tree::ptree& pt) {
    UpdatePartnerAssetAccessBody_accesses_inner ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* UpdatePartnerAssetAccessBody_accesses_inner_H_ */
