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
 * BulkUpsertStatusResponse.h
 *
 * ID of the bulk request.
 */

#ifndef BulkUpsertStatusResponse_H_
#define BulkUpsertStatusResponse_H_



#include "BulkUpsertStatus.h"
#include <string>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// ID of the bulk request.
/// </summary>
class  BulkUpsertStatusResponse 
{
public:
    BulkUpsertStatusResponse() = default;
    explicit BulkUpsertStatusResponse(boost::property_tree::ptree const& pt);
    virtual ~BulkUpsertStatusResponse() = default;

    BulkUpsertStatusResponse(const BulkUpsertStatusResponse& other) = default; // copy constructor
    BulkUpsertStatusResponse(BulkUpsertStatusResponse&& other) noexcept = default; // move constructor

    BulkUpsertStatusResponse& operator=(const BulkUpsertStatusResponse& other) = default; // copy assignment
    BulkUpsertStatusResponse& operator=(BulkUpsertStatusResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// BulkUpsertStatusResponse members

    /// <summary>
    /// 
    /// </summary>
    BulkUpsertStatus getStatus() const;
    void setStatus(BulkUpsertStatus value);

    /// <summary>
    /// 
    /// </summary>
    std::string getResultUrl() const;
    void setResultUrl(std::string value);

protected:
    BulkUpsertStatus m_Status = BulkUpsertStatus{};
    std::string m_Result_url = "";
};

std::vector<BulkUpsertStatusResponse> createBulkUpsertStatusResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<BulkUpsertStatusResponse>(const BulkUpsertStatusResponse& val) {
    return val.toPropertyTree();
}

template<>
inline BulkUpsertStatusResponse fromPt<BulkUpsertStatusResponse>(const boost::property_tree::ptree& pt) {
    BulkUpsertStatusResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* BulkUpsertStatusResponse_H_ */
