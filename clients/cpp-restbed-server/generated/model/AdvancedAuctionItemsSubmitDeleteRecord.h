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
 * AdvancedAuctionItemsSubmitDeleteRecord.h
 *
 * Object describing an item bid option deletion operation
 */

#ifndef AdvancedAuctionItemsSubmitDeleteRecord_H_
#define AdvancedAuctionItemsSubmitDeleteRecord_H_



#include "Country.h"
#include <string>
#include "Language.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "AdvancedAuctionKey.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Object describing an item bid option deletion operation
/// </summary>
class  AdvancedAuctionItemsSubmitDeleteRecord : public AdvancedAuctionKey
{
public:
    AdvancedAuctionItemsSubmitDeleteRecord() = default;
    explicit AdvancedAuctionItemsSubmitDeleteRecord(boost::property_tree::ptree const& pt);
    virtual ~AdvancedAuctionItemsSubmitDeleteRecord() = default;

    AdvancedAuctionItemsSubmitDeleteRecord(const AdvancedAuctionItemsSubmitDeleteRecord& other) = default; // copy constructor
    AdvancedAuctionItemsSubmitDeleteRecord(AdvancedAuctionItemsSubmitDeleteRecord&& other) noexcept = default; // move constructor

    AdvancedAuctionItemsSubmitDeleteRecord& operator=(const AdvancedAuctionItemsSubmitDeleteRecord& other) = default; // copy assignment
    AdvancedAuctionItemsSubmitDeleteRecord& operator=(AdvancedAuctionItemsSubmitDeleteRecord&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// AdvancedAuctionItemsSubmitDeleteRecord members

    /// <summary>
    /// The catalog retail item id in the merchant namespace
    /// </summary>
    std::string getItemId() const;
    void setItemId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    Country getCountry() const;
    void setCountry(Country value);

    /// <summary>
    /// 
    /// </summary>
    Language getLanguage() const;
    void setLanguage(Language value);

protected:
    std::string m_Item_id = "";
    Country m_Country = Country{};
    Language m_Language = Language{};
};

std::vector<AdvancedAuctionItemsSubmitDeleteRecord> createAdvancedAuctionItemsSubmitDeleteRecordVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<AdvancedAuctionItemsSubmitDeleteRecord>(const AdvancedAuctionItemsSubmitDeleteRecord& val) {
    return val.toPropertyTree();
}

template<>
inline AdvancedAuctionItemsSubmitDeleteRecord fromPt<AdvancedAuctionItemsSubmitDeleteRecord>(const boost::property_tree::ptree& pt) {
    AdvancedAuctionItemsSubmitDeleteRecord ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* AdvancedAuctionItemsSubmitDeleteRecord_H_ */
