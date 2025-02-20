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
 * MetricsResponse.h
 *
 * 
 */

#ifndef MetricsResponse_H_
#define MetricsResponse_H_



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
class  MetricsResponse 
{
public:
    MetricsResponse() = default;
    explicit MetricsResponse(boost::property_tree::ptree const& pt);
    virtual ~MetricsResponse() = default;

    MetricsResponse(const MetricsResponse& other) = default; // copy constructor
    MetricsResponse(MetricsResponse&& other) noexcept = default; // move constructor

    MetricsResponse& operator=(const MetricsResponse& other) = default; // copy assignment
    MetricsResponse& operator=(MetricsResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// MetricsResponse members

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::string> getData() const;
    void setData(std::vector<std::string> value);

protected:
    std::vector<std::string> m_Data;
};

std::vector<MetricsResponse> createMetricsResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<MetricsResponse>(const MetricsResponse& val) {
    return val.toPropertyTree();
}

template<>
inline MetricsResponse fromPt<MetricsResponse>(const boost::property_tree::ptree& pt) {
    MetricsResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* MetricsResponse_H_ */
