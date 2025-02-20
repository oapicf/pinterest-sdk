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
 * CatalogsRetailProductMetadata.h
 *
 * Retail product metadata entity
 */

#ifndef CatalogsRetailProductMetadata_H_
#define CatalogsRetailProductMetadata_H_



#include "NonNullableCatalogsCurrency.h"
#include <string>
#include "NonNullableProductAvailabilityType.h"
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
/// Retail product metadata entity
/// </summary>
class  CatalogsRetailProductMetadata 
{
public:
    CatalogsRetailProductMetadata() = default;
    explicit CatalogsRetailProductMetadata(boost::property_tree::ptree const& pt);
    virtual ~CatalogsRetailProductMetadata() = default;

    CatalogsRetailProductMetadata(const CatalogsRetailProductMetadata& other) = default; // copy constructor
    CatalogsRetailProductMetadata(CatalogsRetailProductMetadata&& other) noexcept = default; // move constructor

    CatalogsRetailProductMetadata& operator=(const CatalogsRetailProductMetadata& other) = default; // copy assignment
    CatalogsRetailProductMetadata& operator=(CatalogsRetailProductMetadata&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CatalogsRetailProductMetadata members

    /// <summary>
    /// The user-created unique ID that represents the product.
    /// </summary>
    std::string getItemId() const;
    void setItemId(std::string value);

    /// <summary>
    /// The parent ID of the product.
    /// </summary>
    std::string getItemGroupId() const;
    void setItemGroupId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    NonNullableProductAvailabilityType getAvailability() const;
    void setAvailability(NonNullableProductAvailabilityType value);

    /// <summary>
    /// The price of the product.
    /// </summary>
    double getPrice() const;
    void setPrice(double value);

    /// <summary>
    /// The discounted price of the product.
    /// </summary>
    double getSalePrice() const;
    void setSalePrice(double value);

    /// <summary>
    /// 
    /// </summary>
    NonNullableCatalogsCurrency getCurrency() const;
    void setCurrency(NonNullableCatalogsCurrency value);

protected:
    std::string m_Item_id = "";
    std::string m_Item_group_id = "";
    NonNullableProductAvailabilityType m_Availability = NonNullableProductAvailabilityType{};
    double m_Price = 0.0;
    double m_Sale_price = 0.0;
    NonNullableCatalogsCurrency m_Currency = NonNullableCatalogsCurrency{};
};

std::vector<CatalogsRetailProductMetadata> createCatalogsRetailProductMetadataVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CatalogsRetailProductMetadata>(const CatalogsRetailProductMetadata& val) {
    return val.toPropertyTree();
}

template<>
inline CatalogsRetailProductMetadata fromPt<CatalogsRetailProductMetadata>(const boost::property_tree::ptree& pt) {
    CatalogsRetailProductMetadata ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CatalogsRetailProductMetadata_H_ */
