/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * CatalogsProductGroupFilters.h
 *
 * Object holding a group of filters for a catalog product group
 */

#ifndef CatalogsProductGroupFilters_H_
#define CatalogsProductGroupFilters_H_



#include "CatalogsProductGroupFiltersAnyOf.h"
#include "CatalogsProductGroupFilterKeys.h"
#include "CatalogsProductGroupFiltersAllOf.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Object holding a group of filters for a catalog product group
/// </summary>
class  CatalogsProductGroupFilters : public CatalogsProductGroupFiltersAnyOf, public CatalogsProductGroupFiltersAllOf
{
public:
    CatalogsProductGroupFilters() = default;
    explicit CatalogsProductGroupFilters(boost::property_tree::ptree const& pt);
    virtual ~CatalogsProductGroupFilters() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// CatalogsProductGroupFilters members

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<CatalogsProductGroupFilterKeys>> getAnyOf() const;
    void setAnyOf(std::vector<std::shared_ptr<CatalogsProductGroupFilterKeys>> value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<CatalogsProductGroupFilterKeys>> getAllOf() const;
    void setAllOf(std::vector<std::shared_ptr<CatalogsProductGroupFilterKeys>> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::vector<std::shared_ptr<CatalogsProductGroupFilterKeys>> m_Any_of;
    std::vector<std::shared_ptr<CatalogsProductGroupFilterKeys>> m_All_of;
};

std::vector<CatalogsProductGroupFilters> createCatalogsProductGroupFiltersVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* CatalogsProductGroupFilters_H_ */