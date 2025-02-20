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
 * AudienceUpdateOperationType.h
 *
 * Audience operation type (update or remove).
 */

#ifndef AudienceUpdateOperationType_H_
#define AudienceUpdateOperationType_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Audience operation type (update or remove).
/// </summary>
class  AudienceUpdateOperationType 
{
public:
    AudienceUpdateOperationType() = default;
    explicit AudienceUpdateOperationType(boost::property_tree::ptree const& pt);
    virtual ~AudienceUpdateOperationType() = default;

    AudienceUpdateOperationType(const AudienceUpdateOperationType& other) = default; // copy constructor
    AudienceUpdateOperationType(AudienceUpdateOperationType&& other) noexcept = default; // move constructor

    AudienceUpdateOperationType& operator=(const AudienceUpdateOperationType& other) = default; // copy assignment
    AudienceUpdateOperationType& operator=(AudienceUpdateOperationType&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// AudienceUpdateOperationType members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_AudienceUpdateOperationTypeEnumValue;
};

std::vector<AudienceUpdateOperationType> createAudienceUpdateOperationTypeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<AudienceUpdateOperationType>(const AudienceUpdateOperationType& val) {
    return val.toPropertyTree();
}

template<>
inline AudienceUpdateOperationType fromPt<AudienceUpdateOperationType>(const boost::property_tree::ptree& pt) {
    AudienceUpdateOperationType ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* AudienceUpdateOperationType_H_ */
