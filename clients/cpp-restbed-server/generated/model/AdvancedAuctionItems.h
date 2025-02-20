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
 * AdvancedAuctionItems.h
 *
 * Response object containing item bid options
 */

#ifndef AdvancedAuctionItems_H_
#define AdvancedAuctionItems_H_



#include "AdvancedAuctionItem.h"
#include <string>
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
/// Response object containing item bid options
/// </summary>
class  AdvancedAuctionItems 
{
public:
    AdvancedAuctionItems() = default;
    explicit AdvancedAuctionItems(boost::property_tree::ptree const& pt);
    virtual ~AdvancedAuctionItems() = default;

    AdvancedAuctionItems(const AdvancedAuctionItems& other) = default; // copy constructor
    AdvancedAuctionItems(AdvancedAuctionItems&& other) noexcept = default; // move constructor

    AdvancedAuctionItems& operator=(const AdvancedAuctionItems& other) = default; // copy assignment
    AdvancedAuctionItems& operator=(AdvancedAuctionItems&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// AdvancedAuctionItems members

    /// <summary>
    /// Response object of item bid options
    /// </summary>
    std::string getCatalogId() const;
    void setCatalogId(std::string value);

    /// <summary>
    /// Array with item bid options
    /// </summary>
    std::vector<AdvancedAuctionItem> getItems() const;
    void setItems(std::vector<AdvancedAuctionItem> value);

protected:
    std::string m_Catalog_id = "";
    std::vector<AdvancedAuctionItem> m_Items;
};

std::vector<AdvancedAuctionItems> createAdvancedAuctionItemsVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<AdvancedAuctionItems>(const AdvancedAuctionItems& val) {
    return val.toPropertyTree();
}

template<>
inline AdvancedAuctionItems fromPt<AdvancedAuctionItems>(const boost::property_tree::ptree& pt) {
    AdvancedAuctionItems ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* AdvancedAuctionItems_H_ */
