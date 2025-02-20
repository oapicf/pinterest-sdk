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
 * CatalogsUpdateHotelItem.h
 *
 * Object describing an hotel item batch record
 */

#ifndef CatalogsUpdateHotelItem_H_
#define CatalogsUpdateHotelItem_H_



#include "CatalogsUpdatableHotelAttributes.h"
#include <string>
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
/// Object describing an hotel item batch record
/// </summary>
class  CatalogsUpdateHotelItem 
{
public:
    CatalogsUpdateHotelItem() = default;
    explicit CatalogsUpdateHotelItem(boost::property_tree::ptree const& pt);
    virtual ~CatalogsUpdateHotelItem() = default;

    CatalogsUpdateHotelItem(const CatalogsUpdateHotelItem& other) = default; // copy constructor
    CatalogsUpdateHotelItem(CatalogsUpdateHotelItem&& other) noexcept = default; // move constructor

    CatalogsUpdateHotelItem& operator=(const CatalogsUpdateHotelItem& other) = default; // copy assignment
    CatalogsUpdateHotelItem& operator=(CatalogsUpdateHotelItem&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CatalogsUpdateHotelItem members

    /// <summary>
    /// The catalog hotel item id in the merchant namespace
    /// </summary>
    std::string getHotelId() const;
    void setHotelId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getOperation() const;
    void setOperation(std::string value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsUpdatableHotelAttributes getAttributes() const;
    void setAttributes(CatalogsUpdatableHotelAttributes value);

protected:
    std::string m_Hotel_id = "";
    std::string m_Operation = "";
    CatalogsUpdatableHotelAttributes m_Attributes;
};

std::vector<CatalogsUpdateHotelItem> createCatalogsUpdateHotelItemVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CatalogsUpdateHotelItem>(const CatalogsUpdateHotelItem& val) {
    return val.toPropertyTree();
}

template<>
inline CatalogsUpdateHotelItem fromPt<CatalogsUpdateHotelItem>(const boost::property_tree::ptree& pt) {
    CatalogsUpdateHotelItem ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CatalogsUpdateHotelItem_H_ */
