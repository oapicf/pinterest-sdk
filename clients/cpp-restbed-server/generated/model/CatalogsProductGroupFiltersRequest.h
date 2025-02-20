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
 * CatalogsProductGroupFiltersRequest.h
 *
 * Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
 */

#ifndef CatalogsProductGroupFiltersRequest_H_
#define CatalogsProductGroupFiltersRequest_H_



#include "CatalogsProductGroupFilterKeys.h"
#include "CatalogsProductGroupFiltersRequest_anyOf.h"
#include "CatalogsProductGroupFiltersRequest_anyOf_1.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "CatalogsProductGroupFiltersRequest_anyOf.h"
#include "CatalogsProductGroupFiltersRequest_anyOf_1.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
/// </summary>
class  CatalogsProductGroupFiltersRequest : public CatalogsProductGroupFiltersRequest_anyOf, public CatalogsProductGroupFiltersRequest_anyOf_1
{
public:
    CatalogsProductGroupFiltersRequest() = default;
    explicit CatalogsProductGroupFiltersRequest(boost::property_tree::ptree const& pt);
    virtual ~CatalogsProductGroupFiltersRequest() = default;

    CatalogsProductGroupFiltersRequest(const CatalogsProductGroupFiltersRequest& other) = default; // copy constructor
    CatalogsProductGroupFiltersRequest(CatalogsProductGroupFiltersRequest&& other) noexcept = default; // move constructor

    CatalogsProductGroupFiltersRequest& operator=(const CatalogsProductGroupFiltersRequest& other) = default; // copy assignment
    CatalogsProductGroupFiltersRequest& operator=(CatalogsProductGroupFiltersRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CatalogsProductGroupFiltersRequest members

    /// <summary>
    /// 
    /// </summary>
    std::vector<CatalogsProductGroupFilterKeys> getAnyOf() const;
    void setAnyOf(std::vector<CatalogsProductGroupFilterKeys> value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<CatalogsProductGroupFilterKeys> getAllOf() const;
    void setAllOf(std::vector<CatalogsProductGroupFilterKeys> value);

protected:
    std::vector<CatalogsProductGroupFilterKeys> m_Any_of;
    std::vector<CatalogsProductGroupFilterKeys> m_All_of;
};

std::vector<CatalogsProductGroupFiltersRequest> createCatalogsProductGroupFiltersRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CatalogsProductGroupFiltersRequest>(const CatalogsProductGroupFiltersRequest& val) {
    return val.toPropertyTree();
}

template<>
inline CatalogsProductGroupFiltersRequest fromPt<CatalogsProductGroupFiltersRequest>(const boost::property_tree::ptree& pt) {
    CatalogsProductGroupFiltersRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CatalogsProductGroupFiltersRequest_H_ */
