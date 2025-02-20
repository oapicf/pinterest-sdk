/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "ProductGroupPromotion.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ProductGroupPromotion::ProductGroupPromotion()
{
    m_Id = "";
    m_IdIsSet = false;
    m_Ad_group_id = "";
    m_Ad_group_idIsSet = false;
    m_Bid_in_micro_currency = 0;
    m_Bid_in_micro_currencyIsSet = false;
    m_Included = false;
    m_IncludedIsSet = false;
    m_Definition = "";
    m_DefinitionIsSet = false;
    m_Relative_definition = "";
    m_Relative_definitionIsSet = false;
    m_Parent_id = "";
    m_Parent_idIsSet = false;
    m_Slideshow_collections_title = "";
    m_Slideshow_collections_titleIsSet = false;
    m_Slideshow_collections_description = "";
    m_Slideshow_collections_descriptionIsSet = false;
    m_Is_mdl = false;
    m_Is_mdlIsSet = false;
    m_StatusIsSet = false;
    m_Tracking_url = "";
    m_Tracking_urlIsSet = false;
    m_Catalog_product_group_id = "";
    m_Catalog_product_group_idIsSet = false;
    m_Catalog_product_group_name = "";
    m_Catalog_product_group_nameIsSet = false;
    m_Collections_hero_pin_id = "";
    m_Collections_hero_pin_idIsSet = false;
    m_Collections_hero_destination_url = "";
    m_Collections_hero_destination_urlIsSet = false;
    m_Grid_click_typeIsSet = false;
    
}

void ProductGroupPromotion::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ProductGroupPromotion::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ProductGroupPromotion::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ProductGroupPromotion" : pathPrefix;

         
    if (idIsSet())
    {
        const std::string& value = m_Id;
        const std::string currentValuePath = _pathPrefix + ".id";
                
        

    }
         
    if (adGroupIdIsSet())
    {
        const std::string& value = m_Ad_group_id;
        const std::string currentValuePath = _pathPrefix + ".adGroupId";
                
        

    }
                         
    if (parentIdIsSet())
    {
        const std::string& value = m_Parent_id;
        const std::string currentValuePath = _pathPrefix + ".parentId";
                
        

    }
                             
    if (catalogProductGroupIdIsSet())
    {
        const std::string& value = m_Catalog_product_group_id;
        const std::string currentValuePath = _pathPrefix + ".catalogProductGroupId";
                
        

    }
             
    if (collectionsHeroPinIdIsSet())
    {
        const std::string& value = m_Collections_hero_pin_id;
        const std::string currentValuePath = _pathPrefix + ".collectionsHeroPinId";
                
        

    }
            
    return success;
}

bool ProductGroupPromotion::operator==(const ProductGroupPromotion& rhs) const
{
    return
    
    
    
    ((!idIsSet() && !rhs.idIsSet()) || (idIsSet() && rhs.idIsSet() && getId() == rhs.getId())) &&
    
    
    ((!adGroupIdIsSet() && !rhs.adGroupIdIsSet()) || (adGroupIdIsSet() && rhs.adGroupIdIsSet() && getAdGroupId() == rhs.getAdGroupId())) &&
    
    
    ((!bidInMicroCurrencyIsSet() && !rhs.bidInMicroCurrencyIsSet()) || (bidInMicroCurrencyIsSet() && rhs.bidInMicroCurrencyIsSet() && getBidInMicroCurrency() == rhs.getBidInMicroCurrency())) &&
    
    
    ((!includedIsSet() && !rhs.includedIsSet()) || (includedIsSet() && rhs.includedIsSet() && isIncluded() == rhs.isIncluded())) &&
    
    
    ((!definitionIsSet() && !rhs.definitionIsSet()) || (definitionIsSet() && rhs.definitionIsSet() && getDefinition() == rhs.getDefinition())) &&
    
    
    ((!relativeDefinitionIsSet() && !rhs.relativeDefinitionIsSet()) || (relativeDefinitionIsSet() && rhs.relativeDefinitionIsSet() && getRelativeDefinition() == rhs.getRelativeDefinition())) &&
    
    
    ((!parentIdIsSet() && !rhs.parentIdIsSet()) || (parentIdIsSet() && rhs.parentIdIsSet() && getParentId() == rhs.getParentId())) &&
    
    
    ((!slideshowCollectionsTitleIsSet() && !rhs.slideshowCollectionsTitleIsSet()) || (slideshowCollectionsTitleIsSet() && rhs.slideshowCollectionsTitleIsSet() && getSlideshowCollectionsTitle() == rhs.getSlideshowCollectionsTitle())) &&
    
    
    ((!slideshowCollectionsDescriptionIsSet() && !rhs.slideshowCollectionsDescriptionIsSet()) || (slideshowCollectionsDescriptionIsSet() && rhs.slideshowCollectionsDescriptionIsSet() && getSlideshowCollectionsDescription() == rhs.getSlideshowCollectionsDescription())) &&
    
    
    ((!isMdlIsSet() && !rhs.isMdlIsSet()) || (isMdlIsSet() && rhs.isMdlIsSet() && isIsMdl() == rhs.isIsMdl())) &&
    
    
    ((!statusIsSet() && !rhs.statusIsSet()) || (statusIsSet() && rhs.statusIsSet() && getStatus() == rhs.getStatus())) &&
    
    
    ((!trackingUrlIsSet() && !rhs.trackingUrlIsSet()) || (trackingUrlIsSet() && rhs.trackingUrlIsSet() && getTrackingUrl() == rhs.getTrackingUrl())) &&
    
    
    ((!catalogProductGroupIdIsSet() && !rhs.catalogProductGroupIdIsSet()) || (catalogProductGroupIdIsSet() && rhs.catalogProductGroupIdIsSet() && getCatalogProductGroupId() == rhs.getCatalogProductGroupId())) &&
    
    
    ((!catalogProductGroupNameIsSet() && !rhs.catalogProductGroupNameIsSet()) || (catalogProductGroupNameIsSet() && rhs.catalogProductGroupNameIsSet() && getCatalogProductGroupName() == rhs.getCatalogProductGroupName())) &&
    
    
    ((!collectionsHeroPinIdIsSet() && !rhs.collectionsHeroPinIdIsSet()) || (collectionsHeroPinIdIsSet() && rhs.collectionsHeroPinIdIsSet() && getCollectionsHeroPinId() == rhs.getCollectionsHeroPinId())) &&
    
    
    ((!collectionsHeroDestinationUrlIsSet() && !rhs.collectionsHeroDestinationUrlIsSet()) || (collectionsHeroDestinationUrlIsSet() && rhs.collectionsHeroDestinationUrlIsSet() && getCollectionsHeroDestinationUrl() == rhs.getCollectionsHeroDestinationUrl())) &&
    
    
    ((!gridClickTypeIsSet() && !rhs.gridClickTypeIsSet()) || (gridClickTypeIsSet() && rhs.gridClickTypeIsSet() && getGridClickType() == rhs.getGridClickType()))
    
    ;
}

bool ProductGroupPromotion::operator!=(const ProductGroupPromotion& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ProductGroupPromotion& o)
{
    j = nlohmann::json::object();
    if(o.idIsSet())
        j["id"] = o.m_Id;
    if(o.adGroupIdIsSet())
        j["ad_group_id"] = o.m_Ad_group_id;
    if(o.bidInMicroCurrencyIsSet())
        j["bid_in_micro_currency"] = o.m_Bid_in_micro_currency;
    if(o.includedIsSet())
        j["included"] = o.m_Included;
    if(o.definitionIsSet())
        j["definition"] = o.m_Definition;
    if(o.relativeDefinitionIsSet())
        j["relative_definition"] = o.m_Relative_definition;
    if(o.parentIdIsSet())
        j["parent_id"] = o.m_Parent_id;
    if(o.slideshowCollectionsTitleIsSet())
        j["slideshow_collections_title"] = o.m_Slideshow_collections_title;
    if(o.slideshowCollectionsDescriptionIsSet())
        j["slideshow_collections_description"] = o.m_Slideshow_collections_description;
    if(o.isMdlIsSet())
        j["is_mdl"] = o.m_Is_mdl;
    if(o.statusIsSet())
        j["status"] = o.m_Status;
    if(o.trackingUrlIsSet())
        j["tracking_url"] = o.m_Tracking_url;
    if(o.catalogProductGroupIdIsSet())
        j["catalog_product_group_id"] = o.m_Catalog_product_group_id;
    if(o.catalogProductGroupNameIsSet())
        j["catalog_product_group_name"] = o.m_Catalog_product_group_name;
    if(o.collectionsHeroPinIdIsSet())
        j["collections_hero_pin_id"] = o.m_Collections_hero_pin_id;
    if(o.collectionsHeroDestinationUrlIsSet())
        j["collections_hero_destination_url"] = o.m_Collections_hero_destination_url;
    if(o.gridClickTypeIsSet())
        j["grid_click_type"] = o.m_Grid_click_type;
    
}

void from_json(const nlohmann::json& j, ProductGroupPromotion& o)
{
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    if(j.find("ad_group_id") != j.end())
    {
        j.at("ad_group_id").get_to(o.m_Ad_group_id);
        o.m_Ad_group_idIsSet = true;
    } 
    if(j.find("bid_in_micro_currency") != j.end())
    {
        j.at("bid_in_micro_currency").get_to(o.m_Bid_in_micro_currency);
        o.m_Bid_in_micro_currencyIsSet = true;
    } 
    if(j.find("included") != j.end())
    {
        j.at("included").get_to(o.m_Included);
        o.m_IncludedIsSet = true;
    } 
    if(j.find("definition") != j.end())
    {
        j.at("definition").get_to(o.m_Definition);
        o.m_DefinitionIsSet = true;
    } 
    if(j.find("relative_definition") != j.end())
    {
        j.at("relative_definition").get_to(o.m_Relative_definition);
        o.m_Relative_definitionIsSet = true;
    } 
    if(j.find("parent_id") != j.end())
    {
        j.at("parent_id").get_to(o.m_Parent_id);
        o.m_Parent_idIsSet = true;
    } 
    if(j.find("slideshow_collections_title") != j.end())
    {
        j.at("slideshow_collections_title").get_to(o.m_Slideshow_collections_title);
        o.m_Slideshow_collections_titleIsSet = true;
    } 
    if(j.find("slideshow_collections_description") != j.end())
    {
        j.at("slideshow_collections_description").get_to(o.m_Slideshow_collections_description);
        o.m_Slideshow_collections_descriptionIsSet = true;
    } 
    if(j.find("is_mdl") != j.end())
    {
        j.at("is_mdl").get_to(o.m_Is_mdl);
        o.m_Is_mdlIsSet = true;
    } 
    if(j.find("status") != j.end())
    {
        j.at("status").get_to(o.m_Status);
        o.m_StatusIsSet = true;
    } 
    if(j.find("tracking_url") != j.end())
    {
        j.at("tracking_url").get_to(o.m_Tracking_url);
        o.m_Tracking_urlIsSet = true;
    } 
    if(j.find("catalog_product_group_id") != j.end())
    {
        j.at("catalog_product_group_id").get_to(o.m_Catalog_product_group_id);
        o.m_Catalog_product_group_idIsSet = true;
    } 
    if(j.find("catalog_product_group_name") != j.end())
    {
        j.at("catalog_product_group_name").get_to(o.m_Catalog_product_group_name);
        o.m_Catalog_product_group_nameIsSet = true;
    } 
    if(j.find("collections_hero_pin_id") != j.end())
    {
        j.at("collections_hero_pin_id").get_to(o.m_Collections_hero_pin_id);
        o.m_Collections_hero_pin_idIsSet = true;
    } 
    if(j.find("collections_hero_destination_url") != j.end())
    {
        j.at("collections_hero_destination_url").get_to(o.m_Collections_hero_destination_url);
        o.m_Collections_hero_destination_urlIsSet = true;
    } 
    if(j.find("grid_click_type") != j.end())
    {
        j.at("grid_click_type").get_to(o.m_Grid_click_type);
        o.m_Grid_click_typeIsSet = true;
    } 
    
}

std::string ProductGroupPromotion::getId() const
{
    return m_Id;
}
void ProductGroupPromotion::setId(std::string const& value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool ProductGroupPromotion::idIsSet() const
{
    return m_IdIsSet;
}
void ProductGroupPromotion::unsetId()
{
    m_IdIsSet = false;
}
std::string ProductGroupPromotion::getAdGroupId() const
{
    return m_Ad_group_id;
}
void ProductGroupPromotion::setAdGroupId(std::string const& value)
{
    m_Ad_group_id = value;
    m_Ad_group_idIsSet = true;
}
bool ProductGroupPromotion::adGroupIdIsSet() const
{
    return m_Ad_group_idIsSet;
}
void ProductGroupPromotion::unsetAd_group_id()
{
    m_Ad_group_idIsSet = false;
}
int32_t ProductGroupPromotion::getBidInMicroCurrency() const
{
    return m_Bid_in_micro_currency;
}
void ProductGroupPromotion::setBidInMicroCurrency(int32_t const value)
{
    m_Bid_in_micro_currency = value;
    m_Bid_in_micro_currencyIsSet = true;
}
bool ProductGroupPromotion::bidInMicroCurrencyIsSet() const
{
    return m_Bid_in_micro_currencyIsSet;
}
void ProductGroupPromotion::unsetBid_in_micro_currency()
{
    m_Bid_in_micro_currencyIsSet = false;
}
bool ProductGroupPromotion::isIncluded() const
{
    return m_Included;
}
void ProductGroupPromotion::setIncluded(bool const value)
{
    m_Included = value;
    m_IncludedIsSet = true;
}
bool ProductGroupPromotion::includedIsSet() const
{
    return m_IncludedIsSet;
}
void ProductGroupPromotion::unsetIncluded()
{
    m_IncludedIsSet = false;
}
std::string ProductGroupPromotion::getDefinition() const
{
    return m_Definition;
}
void ProductGroupPromotion::setDefinition(std::string const& value)
{
    m_Definition = value;
    m_DefinitionIsSet = true;
}
bool ProductGroupPromotion::definitionIsSet() const
{
    return m_DefinitionIsSet;
}
void ProductGroupPromotion::unsetDefinition()
{
    m_DefinitionIsSet = false;
}
std::string ProductGroupPromotion::getRelativeDefinition() const
{
    return m_Relative_definition;
}
void ProductGroupPromotion::setRelativeDefinition(std::string const& value)
{
    m_Relative_definition = value;
    m_Relative_definitionIsSet = true;
}
bool ProductGroupPromotion::relativeDefinitionIsSet() const
{
    return m_Relative_definitionIsSet;
}
void ProductGroupPromotion::unsetRelative_definition()
{
    m_Relative_definitionIsSet = false;
}
std::string ProductGroupPromotion::getParentId() const
{
    return m_Parent_id;
}
void ProductGroupPromotion::setParentId(std::string const& value)
{
    m_Parent_id = value;
    m_Parent_idIsSet = true;
}
bool ProductGroupPromotion::parentIdIsSet() const
{
    return m_Parent_idIsSet;
}
void ProductGroupPromotion::unsetParent_id()
{
    m_Parent_idIsSet = false;
}
std::string ProductGroupPromotion::getSlideshowCollectionsTitle() const
{
    return m_Slideshow_collections_title;
}
void ProductGroupPromotion::setSlideshowCollectionsTitle(std::string const& value)
{
    m_Slideshow_collections_title = value;
    m_Slideshow_collections_titleIsSet = true;
}
bool ProductGroupPromotion::slideshowCollectionsTitleIsSet() const
{
    return m_Slideshow_collections_titleIsSet;
}
void ProductGroupPromotion::unsetSlideshow_collections_title()
{
    m_Slideshow_collections_titleIsSet = false;
}
std::string ProductGroupPromotion::getSlideshowCollectionsDescription() const
{
    return m_Slideshow_collections_description;
}
void ProductGroupPromotion::setSlideshowCollectionsDescription(std::string const& value)
{
    m_Slideshow_collections_description = value;
    m_Slideshow_collections_descriptionIsSet = true;
}
bool ProductGroupPromotion::slideshowCollectionsDescriptionIsSet() const
{
    return m_Slideshow_collections_descriptionIsSet;
}
void ProductGroupPromotion::unsetSlideshow_collections_description()
{
    m_Slideshow_collections_descriptionIsSet = false;
}
bool ProductGroupPromotion::isIsMdl() const
{
    return m_Is_mdl;
}
void ProductGroupPromotion::setIsMdl(bool const value)
{
    m_Is_mdl = value;
    m_Is_mdlIsSet = true;
}
bool ProductGroupPromotion::isMdlIsSet() const
{
    return m_Is_mdlIsSet;
}
void ProductGroupPromotion::unsetIs_mdl()
{
    m_Is_mdlIsSet = false;
}
org::openapitools::server::model::EntityStatus ProductGroupPromotion::getStatus() const
{
    return m_Status;
}
void ProductGroupPromotion::setStatus(org::openapitools::server::model::EntityStatus const& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}
bool ProductGroupPromotion::statusIsSet() const
{
    return m_StatusIsSet;
}
void ProductGroupPromotion::unsetStatus()
{
    m_StatusIsSet = false;
}
std::string ProductGroupPromotion::getTrackingUrl() const
{
    return m_Tracking_url;
}
void ProductGroupPromotion::setTrackingUrl(std::string const& value)
{
    m_Tracking_url = value;
    m_Tracking_urlIsSet = true;
}
bool ProductGroupPromotion::trackingUrlIsSet() const
{
    return m_Tracking_urlIsSet;
}
void ProductGroupPromotion::unsetTracking_url()
{
    m_Tracking_urlIsSet = false;
}
std::string ProductGroupPromotion::getCatalogProductGroupId() const
{
    return m_Catalog_product_group_id;
}
void ProductGroupPromotion::setCatalogProductGroupId(std::string const& value)
{
    m_Catalog_product_group_id = value;
    m_Catalog_product_group_idIsSet = true;
}
bool ProductGroupPromotion::catalogProductGroupIdIsSet() const
{
    return m_Catalog_product_group_idIsSet;
}
void ProductGroupPromotion::unsetCatalog_product_group_id()
{
    m_Catalog_product_group_idIsSet = false;
}
std::string ProductGroupPromotion::getCatalogProductGroupName() const
{
    return m_Catalog_product_group_name;
}
void ProductGroupPromotion::setCatalogProductGroupName(std::string const& value)
{
    m_Catalog_product_group_name = value;
    m_Catalog_product_group_nameIsSet = true;
}
bool ProductGroupPromotion::catalogProductGroupNameIsSet() const
{
    return m_Catalog_product_group_nameIsSet;
}
void ProductGroupPromotion::unsetCatalog_product_group_name()
{
    m_Catalog_product_group_nameIsSet = false;
}
std::string ProductGroupPromotion::getCollectionsHeroPinId() const
{
    return m_Collections_hero_pin_id;
}
void ProductGroupPromotion::setCollectionsHeroPinId(std::string const& value)
{
    m_Collections_hero_pin_id = value;
    m_Collections_hero_pin_idIsSet = true;
}
bool ProductGroupPromotion::collectionsHeroPinIdIsSet() const
{
    return m_Collections_hero_pin_idIsSet;
}
void ProductGroupPromotion::unsetCollections_hero_pin_id()
{
    m_Collections_hero_pin_idIsSet = false;
}
std::string ProductGroupPromotion::getCollectionsHeroDestinationUrl() const
{
    return m_Collections_hero_destination_url;
}
void ProductGroupPromotion::setCollectionsHeroDestinationUrl(std::string const& value)
{
    m_Collections_hero_destination_url = value;
    m_Collections_hero_destination_urlIsSet = true;
}
bool ProductGroupPromotion::collectionsHeroDestinationUrlIsSet() const
{
    return m_Collections_hero_destination_urlIsSet;
}
void ProductGroupPromotion::unsetCollections_hero_destination_url()
{
    m_Collections_hero_destination_urlIsSet = false;
}
org::openapitools::server::model::GridClickType ProductGroupPromotion::getGridClickType() const
{
    return m_Grid_click_type;
}
void ProductGroupPromotion::setGridClickType(org::openapitools::server::model::GridClickType const& value)
{
    m_Grid_click_type = value;
    m_Grid_click_typeIsSet = true;
}
bool ProductGroupPromotion::gridClickTypeIsSet() const
{
    return m_Grid_click_typeIsSet;
}
void ProductGroupPromotion::unsetGrid_click_type()
{
    m_Grid_click_typeIsSet = false;
}


} // namespace org::openapitools::server::model

