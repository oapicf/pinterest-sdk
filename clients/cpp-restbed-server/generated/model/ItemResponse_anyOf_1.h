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
 * ItemResponse_anyOf_1.h
 *
 * 
 */

#ifndef ItemResponse_anyOf_1_H_
#define ItemResponse_anyOf_1_H_



#include "ItemValidationEvent.h"
#include "CatalogsHotelItemErrorResponse.h"
#include "CatalogsCreativeAssetsItemErrorResponse.h"
#include <string>
#include "CatalogsRetailItemErrorResponse.h"
#include <vector>
#include "CatalogsType.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "CatalogsRetailItemErrorResponse.h"
#include "CatalogsHotelItemErrorResponse.h"
#include "CatalogsCreativeAssetsItemErrorResponse.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ItemResponse_anyOf_1 : public CatalogsRetailItemErrorResponse, public CatalogsHotelItemErrorResponse, public CatalogsCreativeAssetsItemErrorResponse
{
public:
    ItemResponse_anyOf_1() = default;
    explicit ItemResponse_anyOf_1(boost::property_tree::ptree const& pt);
    virtual ~ItemResponse_anyOf_1() = default;

    ItemResponse_anyOf_1(const ItemResponse_anyOf_1& other) = default; // copy constructor
    ItemResponse_anyOf_1(ItemResponse_anyOf_1&& other) noexcept = default; // move constructor

    ItemResponse_anyOf_1& operator=(const ItemResponse_anyOf_1& other) = default; // copy assignment
    ItemResponse_anyOf_1& operator=(ItemResponse_anyOf_1&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ItemResponse_anyOf_1 members

    /// <summary>
    /// 
    /// </summary>
    CatalogsType getCatalogType() const;
    void setCatalogType(CatalogsType value);

    /// <summary>
    /// The catalog item id in the merchant namespace
    /// </summary>
    std::string getItemId() const;
    void setItemId(std::string value);

    /// <summary>
    /// Array with the errors for the item id requested
    /// </summary>
    std::vector<ItemValidationEvent> getErrors() const;
    void setErrors(std::vector<ItemValidationEvent> value);

    /// <summary>
    /// The catalog hotel id in the merchant namespace
    /// </summary>
    std::string getHotelId() const;
    void setHotelId(std::string value);

    /// <summary>
    /// The catalog creative assets id in the merchant namespace
    /// </summary>
    std::string getCreativeAssetsId() const;
    void setCreativeAssetsId(std::string value);

protected:
    CatalogsType m_Catalog_type = CatalogsType{};
    std::string m_Item_id = "";
    std::vector<ItemValidationEvent> m_Errors;
    std::string m_Hotel_id = "";
    std::string m_Creative_assets_id = "";
};

std::vector<ItemResponse_anyOf_1> createItemResponse_anyOf_1VectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ItemResponse_anyOf_1>(const ItemResponse_anyOf_1& val) {
    return val.toPropertyTree();
}

template<>
inline ItemResponse_anyOf_1 fromPt<ItemResponse_anyOf_1>(const boost::property_tree::ptree& pt) {
    ItemResponse_anyOf_1 ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ItemResponse_anyOf_1_H_ */
