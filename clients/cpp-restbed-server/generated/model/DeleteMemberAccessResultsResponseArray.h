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
 * DeleteMemberAccessResultsResponseArray.h
 *
 * 
 */

#ifndef DeleteMemberAccessResultsResponseArray_H_
#define DeleteMemberAccessResultsResponseArray_H_



#include "DeleteMemberAccessResult.h"
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
class  DeleteMemberAccessResultsResponseArray 
{
public:
    DeleteMemberAccessResultsResponseArray() = default;
    explicit DeleteMemberAccessResultsResponseArray(boost::property_tree::ptree const& pt);
    virtual ~DeleteMemberAccessResultsResponseArray() = default;

    DeleteMemberAccessResultsResponseArray(const DeleteMemberAccessResultsResponseArray& other) = default; // copy constructor
    DeleteMemberAccessResultsResponseArray(DeleteMemberAccessResultsResponseArray&& other) noexcept = default; // move constructor

    DeleteMemberAccessResultsResponseArray& operator=(const DeleteMemberAccessResultsResponseArray& other) = default; // copy assignment
    DeleteMemberAccessResultsResponseArray& operator=(DeleteMemberAccessResultsResponseArray&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// DeleteMemberAccessResultsResponseArray members

    /// <summary>
    /// List of member asset permissions that were deleted.
    /// </summary>
    std::vector<DeleteMemberAccessResult> getItems() const;
    void setItems(std::vector<DeleteMemberAccessResult> value);

protected:
    std::vector<DeleteMemberAccessResult> m_Items;
};

std::vector<DeleteMemberAccessResultsResponseArray> createDeleteMemberAccessResultsResponseArrayVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<DeleteMemberAccessResultsResponseArray>(const DeleteMemberAccessResultsResponseArray& val) {
    return val.toPropertyTree();
}

template<>
inline DeleteMemberAccessResultsResponseArray fromPt<DeleteMemberAccessResultsResponseArray>(const boost::property_tree::ptree& pt) {
    DeleteMemberAccessResultsResponseArray ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* DeleteMemberAccessResultsResponseArray_H_ */
