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
 * AudienceCreateRequest_1_audience_type.h
 *
 * 
 */

#ifndef AudienceCreateRequest_1_audience_type_H_
#define AudienceCreateRequest_1_audience_type_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "AudienceType.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  AudienceCreateRequest_1_audience_type : public AudienceType
{
public:
    AudienceCreateRequest_1_audience_type() = default;
    explicit AudienceCreateRequest_1_audience_type(boost::property_tree::ptree const& pt);
    virtual ~AudienceCreateRequest_1_audience_type() = default;

    AudienceCreateRequest_1_audience_type(const AudienceCreateRequest_1_audience_type& other) = default; // copy constructor
    AudienceCreateRequest_1_audience_type(AudienceCreateRequest_1_audience_type&& other) noexcept = default; // move constructor

    AudienceCreateRequest_1_audience_type& operator=(const AudienceCreateRequest_1_audience_type& other) = default; // copy assignment
    AudienceCreateRequest_1_audience_type& operator=(AudienceCreateRequest_1_audience_type&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// AudienceCreateRequest_1_audience_type members

protected:
};

std::vector<AudienceCreateRequest_1_audience_type> createAudienceCreateRequest_1_audience_typeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<AudienceCreateRequest_1_audience_type>(const AudienceCreateRequest_1_audience_type& val) {
    return val.toPropertyTree();
}

template<>
inline AudienceCreateRequest_1_audience_type fromPt<AudienceCreateRequest_1_audience_type>(const boost::property_tree::ptree& pt) {
    AudienceCreateRequest_1_audience_type ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* AudienceCreateRequest_1_audience_type_H_ */
