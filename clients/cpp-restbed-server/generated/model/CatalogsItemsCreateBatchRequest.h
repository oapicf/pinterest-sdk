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
 * CatalogsItemsCreateBatchRequest.h
 *
 * Request object to create catalogs items
 */

#ifndef CatalogsItemsCreateBatchRequest_H_
#define CatalogsItemsCreateBatchRequest_H_



#include "BatchOperation.h"
#include "Country.h"
#include "CatalogsItemsRequest_language.h"
#include "ItemCreateBatchRecord.h"
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
/// Request object to create catalogs items
/// </summary>
class  CatalogsItemsCreateBatchRequest 
{
public:
    CatalogsItemsCreateBatchRequest() = default;
    explicit CatalogsItemsCreateBatchRequest(boost::property_tree::ptree const& pt);
    virtual ~CatalogsItemsCreateBatchRequest() = default;

    CatalogsItemsCreateBatchRequest(const CatalogsItemsCreateBatchRequest& other) = default; // copy constructor
    CatalogsItemsCreateBatchRequest(CatalogsItemsCreateBatchRequest&& other) noexcept = default; // move constructor

    CatalogsItemsCreateBatchRequest& operator=(const CatalogsItemsCreateBatchRequest& other) = default; // copy assignment
    CatalogsItemsCreateBatchRequest& operator=(CatalogsItemsCreateBatchRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CatalogsItemsCreateBatchRequest members

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
    /// 
    /// </summary>
    BatchOperation getOperation() const;
    void setOperation(BatchOperation value);

    /// <summary>
    /// Array with catalogs items
    /// </summary>
    std::vector<ItemCreateBatchRecord> getItems() const;
    void setItems(std::vector<ItemCreateBatchRecord> value);

protected:
    Country m_Country = Country{};
    CatalogsItemsRequest_language m_Language;
    BatchOperation m_Operation = BatchOperation{};
    std::vector<ItemCreateBatchRecord> m_Items;
};

std::vector<CatalogsItemsCreateBatchRequest> createCatalogsItemsCreateBatchRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CatalogsItemsCreateBatchRequest>(const CatalogsItemsCreateBatchRequest& val) {
    return val.toPropertyTree();
}

template<>
inline CatalogsItemsCreateBatchRequest fromPt<CatalogsItemsCreateBatchRequest>(const boost::property_tree::ptree& pt) {
    CatalogsItemsCreateBatchRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CatalogsItemsCreateBatchRequest_H_ */
