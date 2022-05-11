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
 * CatalogsItems.h
 *
 * Response object of catalogs items
 */

#ifndef CatalogsItems_H_
#define CatalogsItems_H_



#include "ItemBatchRecord.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Response object of catalogs items
/// </summary>
class  CatalogsItems 
{
public:
    CatalogsItems() = default;
    explicit CatalogsItems(boost::property_tree::ptree const& pt);
    virtual ~CatalogsItems() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// CatalogsItems members

    /// <summary>
    /// Array with catalogs items
    /// </summary>
    std::vector<std::shared_ptr<ItemBatchRecord>> getItems() const;
    void setItems(std::vector<std::shared_ptr<ItemBatchRecord>> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::vector<std::shared_ptr<ItemBatchRecord>> m_Items;
};

std::vector<CatalogsItems> createCatalogsItemsVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* CatalogsItems_H_ */