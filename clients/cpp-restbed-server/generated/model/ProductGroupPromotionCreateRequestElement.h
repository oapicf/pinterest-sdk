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
 * ProductGroupPromotionCreateRequestElement.h
 *
 * 
 */

#ifndef ProductGroupPromotionCreateRequestElement_H_
#define ProductGroupPromotionCreateRequestElement_H_



#include "CreativeType.h"
#include "EntityStatus.h"
#include <string>
#include "GridClickType.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "ProductGroupPromotion.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ProductGroupPromotionCreateRequestElement : public ProductGroupPromotion
{
public:
    ProductGroupPromotionCreateRequestElement() = default;
    explicit ProductGroupPromotionCreateRequestElement(boost::property_tree::ptree const& pt);
    virtual ~ProductGroupPromotionCreateRequestElement() = default;

    ProductGroupPromotionCreateRequestElement(const ProductGroupPromotionCreateRequestElement& other) = default; // copy constructor
    ProductGroupPromotionCreateRequestElement(ProductGroupPromotionCreateRequestElement&& other) noexcept = default; // move constructor

    ProductGroupPromotionCreateRequestElement& operator=(const ProductGroupPromotionCreateRequestElement& other) = default; // copy assignment
    ProductGroupPromotionCreateRequestElement& operator=(ProductGroupPromotionCreateRequestElement&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ProductGroupPromotionCreateRequestElement members

    /// <summary>
    /// ID of the product group promotion.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// ID of the ad group the product group belongs to.
    /// </summary>
    std::string getAdGroupId() const;
    void setAdGroupId(std::string value);

    /// <summary>
    /// The bid in micro currency.
    /// </summary>
    int32_t getBidInMicroCurrency() const;
    void setBidInMicroCurrency(int32_t value);

    /// <summary>
    /// True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
    /// </summary>
    bool isIncluded() const;
    void setIncluded(bool value);

    /// <summary>
    /// The full product group definition path
    /// </summary>
    std::string getDefinition() const;
    void setDefinition(std::string value);

    /// <summary>
    /// The definition of the product group, relative to its parent - an attribute name/value pair
    /// </summary>
    std::string getRelativeDefinition() const;
    void setRelativeDefinition(std::string value);

    /// <summary>
    /// The parent Product Group ID of this Product Group
    /// </summary>
    std::string getParentId() const;
    void setParentId(std::string value);

    /// <summary>
    /// Slideshow Collections Title
    /// </summary>
    std::string getSlideshowCollectionsTitle() const;
    void setSlideshowCollectionsTitle(std::string value);

    /// <summary>
    /// Slideshow Collections Description
    /// </summary>
    std::string getSlideshowCollectionsDescription() const;
    void setSlideshowCollectionsDescription(std::string value);

    /// <summary>
    /// If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
    /// </summary>
    bool isIsMdl() const;
    void setIsMdl(bool value);

    /// <summary>
    /// 
    /// </summary>
    EntityStatus getStatus() const;
    void setStatus(EntityStatus value);

    /// <summary>
    /// Tracking template for proudct group promotions. 4000 limit
    /// </summary>
    std::string getTrackingUrl() const;
    void setTrackingUrl(std::string value);

    /// <summary>
    /// ID of the catalogs product group that this product group promotion references
    /// </summary>
    std::string getCatalogProductGroupId() const;
    void setCatalogProductGroupId(std::string value);

    /// <summary>
    /// Catalogs product group name
    /// </summary>
    std::string getCatalogProductGroupName() const;
    void setCatalogProductGroupName(std::string value);

    /// <summary>
    /// Hero Pin ID if this PG is promoted as a Collection
    /// </summary>
    std::string getCollectionsHeroPinId() const;
    void setCollectionsHeroPinId(std::string value);

    /// <summary>
    /// Collections Hero Destination Url
    /// </summary>
    std::string getCollectionsHeroDestinationUrl() const;
    void setCollectionsHeroDestinationUrl(std::string value);

    /// <summary>
    /// 
    /// </summary>
    GridClickType getGridClickType() const;
    void setGridClickType(GridClickType value);

    /// <summary>
    /// 
    /// </summary>
    CreativeType getCreativeType() const;
    void setCreativeType(CreativeType value);

protected:
    std::string m_Id = "";
    std::string m_Ad_group_id = "";
    int32_t m_Bid_in_micro_currency = 0;
    bool m_Included = false;
    std::string m_Definition = "";
    std::string m_Relative_definition = "";
    std::string m_Parent_id = "";
    std::string m_Slideshow_collections_title = "";
    std::string m_Slideshow_collections_description = "";
    bool m_Is_mdl = false;
    EntityStatus m_Status = EntityStatus{};
    std::string m_Tracking_url = "";
    std::string m_Catalog_product_group_id = "";
    std::string m_Catalog_product_group_name = "";
    std::string m_Collections_hero_pin_id = "";
    std::string m_Collections_hero_destination_url = "";
    GridClickType m_Grid_click_type = GridClickType{};
    CreativeType m_Creative_type = CreativeType{};
};

std::vector<ProductGroupPromotionCreateRequestElement> createProductGroupPromotionCreateRequestElementVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ProductGroupPromotionCreateRequestElement>(const ProductGroupPromotionCreateRequestElement& val) {
    return val.toPropertyTree();
}

template<>
inline ProductGroupPromotionCreateRequestElement fromPt<ProductGroupPromotionCreateRequestElement>(const boost::property_tree::ptree& pt) {
    ProductGroupPromotionCreateRequestElement ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ProductGroupPromotionCreateRequestElement_H_ */
