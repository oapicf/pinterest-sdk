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
 * CatalogsCreativeAssetsProductGroupFilters.h
 *
 * Object holding a group of filters for a creative assets product group
 */

#ifndef CatalogsCreativeAssetsProductGroupFilters_H_
#define CatalogsCreativeAssetsProductGroupFilters_H_



#include "CatalogsCreativeAssetsProductGroupFiltersAnyOf.h"
#include "CatalogsCreativeAssetsProductGroupFiltersAllOf.h"
#include "CatalogsCreativeAssetsProductGroupFilterKeys.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "CatalogsCreativeAssetsProductGroupFiltersAnyOf.h"
#include "CatalogsCreativeAssetsProductGroupFiltersAllOf.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Object holding a group of filters for a creative assets product group
/// </summary>
class  CatalogsCreativeAssetsProductGroupFilters : public CatalogsCreativeAssetsProductGroupFiltersAnyOf, public CatalogsCreativeAssetsProductGroupFiltersAllOf
{
public:
    CatalogsCreativeAssetsProductGroupFilters() = default;
    explicit CatalogsCreativeAssetsProductGroupFilters(boost::property_tree::ptree const& pt);
    virtual ~CatalogsCreativeAssetsProductGroupFilters() = default;

    CatalogsCreativeAssetsProductGroupFilters(const CatalogsCreativeAssetsProductGroupFilters& other) = default; // copy constructor
    CatalogsCreativeAssetsProductGroupFilters(CatalogsCreativeAssetsProductGroupFilters&& other) noexcept = default; // move constructor

    CatalogsCreativeAssetsProductGroupFilters& operator=(const CatalogsCreativeAssetsProductGroupFilters& other) = default; // copy assignment
    CatalogsCreativeAssetsProductGroupFilters& operator=(CatalogsCreativeAssetsProductGroupFilters&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CatalogsCreativeAssetsProductGroupFilters members

    /// <summary>
    /// 
    /// </summary>
    std::vector<CatalogsCreativeAssetsProductGroupFilterKeys> getAnyOf() const;
    void setAnyOf(std::vector<CatalogsCreativeAssetsProductGroupFilterKeys> value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<CatalogsCreativeAssetsProductGroupFilterKeys> getAllOf() const;
    void setAllOf(std::vector<CatalogsCreativeAssetsProductGroupFilterKeys> value);

protected:
    std::vector<CatalogsCreativeAssetsProductGroupFilterKeys> m_Any_of;
    std::vector<CatalogsCreativeAssetsProductGroupFilterKeys> m_All_of;
};

std::vector<CatalogsCreativeAssetsProductGroupFilters> createCatalogsCreativeAssetsProductGroupFiltersVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CatalogsCreativeAssetsProductGroupFilters>(const CatalogsCreativeAssetsProductGroupFilters& val) {
    return val.toPropertyTree();
}

template<>
inline CatalogsCreativeAssetsProductGroupFilters fromPt<CatalogsCreativeAssetsProductGroupFilters>(const boost::property_tree::ptree& pt) {
    CatalogsCreativeAssetsProductGroupFilters ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CatalogsCreativeAssetsProductGroupFilters_H_ */
