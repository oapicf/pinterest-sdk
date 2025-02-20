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
 * ItemDeleteBatchRecord.h
 *
 * Object describing an item batch record to delete items
 */

#ifndef ItemDeleteBatchRecord_H_
#define ItemDeleteBatchRecord_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Object describing an item batch record to delete items
/// </summary>
class  ItemDeleteBatchRecord 
{
public:
    ItemDeleteBatchRecord() = default;
    explicit ItemDeleteBatchRecord(boost::property_tree::ptree const& pt);
    virtual ~ItemDeleteBatchRecord() = default;

    ItemDeleteBatchRecord(const ItemDeleteBatchRecord& other) = default; // copy constructor
    ItemDeleteBatchRecord(ItemDeleteBatchRecord&& other) noexcept = default; // move constructor

    ItemDeleteBatchRecord& operator=(const ItemDeleteBatchRecord& other) = default; // copy assignment
    ItemDeleteBatchRecord& operator=(ItemDeleteBatchRecord&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ItemDeleteBatchRecord members

    /// <summary>
    /// The catalog item id in the merchant namespace
    /// </summary>
    std::string getItemId() const;
    void setItemId(std::string value);

protected:
    std::string m_Item_id = "";
};

std::vector<ItemDeleteBatchRecord> createItemDeleteBatchRecordVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ItemDeleteBatchRecord>(const ItemDeleteBatchRecord& val) {
    return val.toPropertyTree();
}

template<>
inline ItemDeleteBatchRecord fromPt<ItemDeleteBatchRecord>(const boost::property_tree::ptree& pt) {
    ItemDeleteBatchRecord ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ItemDeleteBatchRecord_H_ */
