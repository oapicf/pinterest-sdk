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
 * UpdateMaskFieldType.h
 *
 * The field types supported by the update mask
 */

#ifndef UpdateMaskFieldType_H_
#define UpdateMaskFieldType_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// The field types supported by the update mask
/// </summary>
class  UpdateMaskFieldType 
{
public:
    UpdateMaskFieldType() = default;
    explicit UpdateMaskFieldType(boost::property_tree::ptree const& pt);
    virtual ~UpdateMaskFieldType() = default;

    UpdateMaskFieldType(const UpdateMaskFieldType& other) = default; // copy constructor
    UpdateMaskFieldType(UpdateMaskFieldType&& other) noexcept = default; // move constructor

    UpdateMaskFieldType& operator=(const UpdateMaskFieldType& other) = default; // copy assignment
    UpdateMaskFieldType& operator=(UpdateMaskFieldType&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// UpdateMaskFieldType members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_UpdateMaskFieldTypeEnumValue;
};

std::vector<UpdateMaskFieldType> createUpdateMaskFieldTypeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<UpdateMaskFieldType>(const UpdateMaskFieldType& val) {
    return val.toPropertyTree();
}

template<>
inline UpdateMaskFieldType fromPt<UpdateMaskFieldType>(const boost::property_tree::ptree& pt) {
    UpdateMaskFieldType ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* UpdateMaskFieldType_H_ */
