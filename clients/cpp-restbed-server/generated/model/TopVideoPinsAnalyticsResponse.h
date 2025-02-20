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
 * TopVideoPinsAnalyticsResponse.h
 *
 * 
 */

#ifndef TopVideoPinsAnalyticsResponse_H_
#define TopVideoPinsAnalyticsResponse_H_



#include "TopPinsAnalyticsResponse_date_availability.h"
#include <string>
#include "TopVideoPinsAnalyticsResponse_pins_inner.h"
#include <vector>
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
/// 
/// </summary>
class  TopVideoPinsAnalyticsResponse 
{
public:
    TopVideoPinsAnalyticsResponse() = default;
    explicit TopVideoPinsAnalyticsResponse(boost::property_tree::ptree const& pt);
    virtual ~TopVideoPinsAnalyticsResponse() = default;

    TopVideoPinsAnalyticsResponse(const TopVideoPinsAnalyticsResponse& other) = default; // copy constructor
    TopVideoPinsAnalyticsResponse(TopVideoPinsAnalyticsResponse&& other) noexcept = default; // move constructor

    TopVideoPinsAnalyticsResponse& operator=(const TopVideoPinsAnalyticsResponse& other) = default; // copy assignment
    TopVideoPinsAnalyticsResponse& operator=(TopVideoPinsAnalyticsResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// TopVideoPinsAnalyticsResponse members

    /// <summary>
    /// 
    /// </summary>
    TopPinsAnalyticsResponse_date_availability getDateAvailability() const;
    void setDateAvailability(TopPinsAnalyticsResponse_date_availability value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<TopVideoPinsAnalyticsResponse_pins_inner> getPins() const;
    void setPins(std::vector<TopVideoPinsAnalyticsResponse_pins_inner> value);

    /// <summary>
    /// 
    /// </summary>
    std::string getSortBy() const;
    void setSortBy(std::string value);

protected:
    TopPinsAnalyticsResponse_date_availability m_Date_availability;
    std::vector<TopVideoPinsAnalyticsResponse_pins_inner> m_Pins;
    std::string m_Sort_by = "";
};

std::vector<TopVideoPinsAnalyticsResponse> createTopVideoPinsAnalyticsResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<TopVideoPinsAnalyticsResponse>(const TopVideoPinsAnalyticsResponse& val) {
    return val.toPropertyTree();
}

template<>
inline TopVideoPinsAnalyticsResponse fromPt<TopVideoPinsAnalyticsResponse>(const boost::property_tree::ptree& pt) {
    TopVideoPinsAnalyticsResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* TopVideoPinsAnalyticsResponse_H_ */
