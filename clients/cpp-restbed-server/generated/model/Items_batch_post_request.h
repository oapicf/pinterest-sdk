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
 * Items_batch_post_request.h
 *
 * 
 */

#ifndef Items_batch_post_request_H_
#define Items_batch_post_request_H_



#include "BatchOperation.h"
#include "Country.h"
#include "CatalogsVerticalBatchRequest.h"
#include "CatalogsItemsRequest_language.h"
#include <string>
#include "ItemDeleteBatchRecord.h"
#include "CatalogsItemsBatchRequest.h"
#include <vector>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "CatalogsVerticalBatchRequest.h"
#include "CatalogsItemsBatchRequest.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  Items_batch_post_request : public CatalogsVerticalBatchRequest, public CatalogsItemsBatchRequest
{
public:
    Items_batch_post_request() = default;
    explicit Items_batch_post_request(boost::property_tree::ptree const& pt);
    virtual ~Items_batch_post_request() = default;

    Items_batch_post_request(const Items_batch_post_request& other) = default; // copy constructor
    Items_batch_post_request(Items_batch_post_request&& other) noexcept = default; // move constructor

    Items_batch_post_request& operator=(const Items_batch_post_request& other) = default; // copy assignment
    Items_batch_post_request& operator=(Items_batch_post_request&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// Items_batch_post_request members

    /// <summary>
    /// 
    /// </summary>
    std::string getCatalogType() const;
    void setCatalogType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    Country getCountry() const;
    void setCountry(Country value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemsRequest_language getLanguage() const;
    void setLanguage(CatalogsItemsRequest_language value);

    /// <summary>
    /// Array with catalogs items
    /// </summary>
    std::vector<ItemDeleteBatchRecord> getItems() const;
    void setItems(std::vector<ItemDeleteBatchRecord> value);

    /// <summary>
    /// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
    /// </summary>
    std::string getCatalogId() const;
    void setCatalogId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    BatchOperation getOperation() const;
    void setOperation(BatchOperation value);

protected:
    std::string m_Catalog_type = "";
    Country m_Country = Country{};
    CatalogsItemsRequest_language m_Language;
    std::vector<ItemDeleteBatchRecord> m_Items;
    std::string m_Catalog_id = "";
    BatchOperation m_Operation = BatchOperation{};
};

std::vector<Items_batch_post_request> createItems_batch_post_requestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Items_batch_post_request>(const Items_batch_post_request& val) {
    return val.toPropertyTree();
}

template<>
inline Items_batch_post_request fromPt<Items_batch_post_request>(const boost::property_tree::ptree& pt) {
    Items_batch_post_request ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Items_batch_post_request_H_ */
