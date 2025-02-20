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
 * CatalogsHotelProductGroup.h
 *
 * 
 */

#ifndef CatalogsHotelProductGroup_H_
#define CatalogsHotelProductGroup_H_



#include <string>
#include "CatalogsHotelProductGroupFilters.h"
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
/// 
/// </summary>
class  CatalogsHotelProductGroup 
{
public:
    CatalogsHotelProductGroup() = default;
    explicit CatalogsHotelProductGroup(boost::property_tree::ptree const& pt);
    virtual ~CatalogsHotelProductGroup() = default;

    CatalogsHotelProductGroup(const CatalogsHotelProductGroup& other) = default; // copy constructor
    CatalogsHotelProductGroup(CatalogsHotelProductGroup&& other) noexcept = default; // move constructor

    CatalogsHotelProductGroup& operator=(const CatalogsHotelProductGroup& other) = default; // copy assignment
    CatalogsHotelProductGroup& operator=(CatalogsHotelProductGroup&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CatalogsHotelProductGroup members

    /// <summary>
    /// 
    /// </summary>
    std::string getCatalogType() const;
    void setCatalogType(std::string value);

    /// <summary>
    /// ID of the hotel product group.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// Name of hotel product group
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsHotelProductGroupFilters getFilters() const;
    void setFilters(CatalogsHotelProductGroupFilters value);

    /// <summary>
    /// Unix timestamp in seconds of when catalog product group was created.
    /// </summary>
    int32_t getCreatedAt() const;
    void setCreatedAt(int32_t value);

    /// <summary>
    /// Unix timestamp in seconds of last time catalog product group was updated.
    /// </summary>
    int32_t getUpdatedAt() const;
    void setUpdatedAt(int32_t value);

    /// <summary>
    /// Catalog id pertaining to the hotel product group.
    /// </summary>
    std::string getCatalogId() const;
    void setCatalogId(std::string value);

protected:
    std::string m_Catalog_type = "";
    std::string m_Id = "";
    std::string m_Name = "";
    std::string m_Description = "";
    CatalogsHotelProductGroupFilters m_Filters;
    int32_t m_Created_at = 0;
    int32_t m_Updated_at = 0;
    std::string m_Catalog_id = "";
};

std::vector<CatalogsHotelProductGroup> createCatalogsHotelProductGroupVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CatalogsHotelProductGroup>(const CatalogsHotelProductGroup& val) {
    return val.toPropertyTree();
}

template<>
inline CatalogsHotelProductGroup fromPt<CatalogsHotelProductGroup>(const boost::property_tree::ptree& pt) {
    CatalogsHotelProductGroup ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CatalogsHotelProductGroup_H_ */
