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
 * ProductGroupPromotionResponseItem.h
 *
 * 
 */

#ifndef ProductGroupPromotionResponseItem_H_
#define ProductGroupPromotionResponseItem_H_



#include "ProductGroupPromotionResponseElement.h"
#include "Exception.h"
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
/// 
/// </summary>
class  ProductGroupPromotionResponseItem 
{
public:
    ProductGroupPromotionResponseItem() = default;
    explicit ProductGroupPromotionResponseItem(boost::property_tree::ptree const& pt);
    virtual ~ProductGroupPromotionResponseItem() = default;

    ProductGroupPromotionResponseItem(const ProductGroupPromotionResponseItem& other) = default; // copy constructor
    ProductGroupPromotionResponseItem(ProductGroupPromotionResponseItem&& other) noexcept = default; // move constructor

    ProductGroupPromotionResponseItem& operator=(const ProductGroupPromotionResponseItem& other) = default; // copy assignment
    ProductGroupPromotionResponseItem& operator=(ProductGroupPromotionResponseItem&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ProductGroupPromotionResponseItem members

    /// <summary>
    /// 
    /// </summary>
    ProductGroupPromotionResponseElement getData() const;
    void setData(ProductGroupPromotionResponseElement value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<Exception> getExceptions() const;
    void setExceptions(std::vector<Exception> value);

protected:
    ProductGroupPromotionResponseElement m_Data;
    std::vector<Exception> m_Exceptions;
};

std::vector<ProductGroupPromotionResponseItem> createProductGroupPromotionResponseItemVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ProductGroupPromotionResponseItem>(const ProductGroupPromotionResponseItem& val) {
    return val.toPropertyTree();
}

template<>
inline ProductGroupPromotionResponseItem fromPt<ProductGroupPromotionResponseItem>(const boost::property_tree::ptree& pt) {
    ProductGroupPromotionResponseItem ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ProductGroupPromotionResponseItem_H_ */
