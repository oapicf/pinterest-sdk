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
 * UpdateMemberAssetsResultsResponseArray.h
 *
 * 
 */

#ifndef UpdateMemberAssetsResultsResponseArray_H_
#define UpdateMemberAssetsResultsResponseArray_H_



#include "UpdateMemberAssetsResultsResponseArray_items_inner.h"
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
class  UpdateMemberAssetsResultsResponseArray 
{
public:
    UpdateMemberAssetsResultsResponseArray() = default;
    explicit UpdateMemberAssetsResultsResponseArray(boost::property_tree::ptree const& pt);
    virtual ~UpdateMemberAssetsResultsResponseArray() = default;

    UpdateMemberAssetsResultsResponseArray(const UpdateMemberAssetsResultsResponseArray& other) = default; // copy constructor
    UpdateMemberAssetsResultsResponseArray(UpdateMemberAssetsResultsResponseArray&& other) noexcept = default; // move constructor

    UpdateMemberAssetsResultsResponseArray& operator=(const UpdateMemberAssetsResultsResponseArray& other) = default; // copy assignment
    UpdateMemberAssetsResultsResponseArray& operator=(UpdateMemberAssetsResultsResponseArray&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// UpdateMemberAssetsResultsResponseArray members

    /// <summary>
    /// List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.
    /// </summary>
    std::vector<UpdateMemberAssetsResultsResponseArray_items_inner> getItems() const;
    void setItems(std::vector<UpdateMemberAssetsResultsResponseArray_items_inner> value);

protected:
    std::vector<UpdateMemberAssetsResultsResponseArray_items_inner> m_Items;
};

std::vector<UpdateMemberAssetsResultsResponseArray> createUpdateMemberAssetsResultsResponseArrayVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<UpdateMemberAssetsResultsResponseArray>(const UpdateMemberAssetsResultsResponseArray& val) {
    return val.toPropertyTree();
}

template<>
inline UpdateMemberAssetsResultsResponseArray fromPt<UpdateMemberAssetsResultsResponseArray>(const boost::property_tree::ptree& pt) {
    UpdateMemberAssetsResultsResponseArray ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* UpdateMemberAssetsResultsResponseArray_H_ */
