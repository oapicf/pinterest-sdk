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
 * BrandFilter.h
 *
 * 
 */

#ifndef BrandFilter_H_
#define BrandFilter_H_



#include "CatalogsProductGroupMultipleStringCriteria.h"
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  BrandFilter 
{
public:
    BrandFilter() = default;
    explicit BrandFilter(boost::property_tree::ptree const& pt);
    virtual ~BrandFilter() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// BrandFilter members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> getBRAND() const;
    void setBRAND(std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::shared_ptr<CatalogsProductGroupMultipleStringCriteria> m_BRAND = std::make_shared<CatalogsProductGroupMultipleStringCriteria>();
};

std::vector<BrandFilter> createBrandFilterVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* BrandFilter_H_ */