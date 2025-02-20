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
 * UpdatePartnerResultsResponseArray.h
 *
 * 
 */

#ifndef UpdatePartnerResultsResponseArray_H_
#define UpdatePartnerResultsResponseArray_H_



#include "UpdatePartnerResultsResponseArray_items_inner.h"
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
class  UpdatePartnerResultsResponseArray 
{
public:
    UpdatePartnerResultsResponseArray() = default;
    explicit UpdatePartnerResultsResponseArray(boost::property_tree::ptree const& pt);
    virtual ~UpdatePartnerResultsResponseArray() = default;

    UpdatePartnerResultsResponseArray(const UpdatePartnerResultsResponseArray& other) = default; // copy constructor
    UpdatePartnerResultsResponseArray(UpdatePartnerResultsResponseArray&& other) noexcept = default; // move constructor

    UpdatePartnerResultsResponseArray& operator=(const UpdatePartnerResultsResponseArray& other) = default; // copy assignment
    UpdatePartnerResultsResponseArray& operator=(UpdatePartnerResultsResponseArray&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// UpdatePartnerResultsResponseArray members

    /// <summary>
    /// 
    /// </summary>
    std::vector<UpdatePartnerResultsResponseArray_items_inner> getItems() const;
    void setItems(std::vector<UpdatePartnerResultsResponseArray_items_inner> value);

protected:
    std::vector<UpdatePartnerResultsResponseArray_items_inner> m_Items;
};

std::vector<UpdatePartnerResultsResponseArray> createUpdatePartnerResultsResponseArrayVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<UpdatePartnerResultsResponseArray>(const UpdatePartnerResultsResponseArray& val) {
    return val.toPropertyTree();
}

template<>
inline UpdatePartnerResultsResponseArray fromPt<UpdatePartnerResultsResponseArray>(const boost::property_tree::ptree& pt) {
    UpdatePartnerResultsResponseArray ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* UpdatePartnerResultsResponseArray_H_ */
