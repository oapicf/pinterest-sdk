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
 * CatalogsRetailItemsPostFilter.h
 *
 * 
 */

#ifndef CatalogsRetailItemsPostFilter_H_
#define CatalogsRetailItemsPostFilter_H_



#include <string>
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
class  CatalogsRetailItemsPostFilter 
{
public:
    CatalogsRetailItemsPostFilter() = default;
    explicit CatalogsRetailItemsPostFilter(boost::property_tree::ptree const& pt);
    virtual ~CatalogsRetailItemsPostFilter() = default;

    CatalogsRetailItemsPostFilter(const CatalogsRetailItemsPostFilter& other) = default; // copy constructor
    CatalogsRetailItemsPostFilter(CatalogsRetailItemsPostFilter&& other) noexcept = default; // move constructor

    CatalogsRetailItemsPostFilter& operator=(const CatalogsRetailItemsPostFilter& other) = default; // copy assignment
    CatalogsRetailItemsPostFilter& operator=(CatalogsRetailItemsPostFilter&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CatalogsRetailItemsPostFilter members

    /// <summary>
    /// 
    /// </summary>
    std::string getCatalogType() const;
    void setCatalogType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::string> getItemIds() const;
    void setItemIds(std::vector<std::string> value);

    /// <summary>
    /// Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
    /// </summary>
    std::string getCatalogId() const;
    void setCatalogId(std::string value);

protected:
    std::string m_Catalog_type = "";
    std::vector<std::string> m_Item_ids;
    std::string m_Catalog_id = "";
};

std::vector<CatalogsRetailItemsPostFilter> createCatalogsRetailItemsPostFilterVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CatalogsRetailItemsPostFilter>(const CatalogsRetailItemsPostFilter& val) {
    return val.toPropertyTree();
}

template<>
inline CatalogsRetailItemsPostFilter fromPt<CatalogsRetailItemsPostFilter>(const boost::property_tree::ptree& pt) {
    CatalogsRetailItemsPostFilter ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CatalogsRetailItemsPostFilter_H_ */
