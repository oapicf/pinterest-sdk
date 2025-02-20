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
 * CatalogsProductGroupFilterKeys.h
 *
 * 
 */

#ifndef CatalogsProductGroupFilterKeys_H_
#define CatalogsProductGroupFilterKeys_H_



#include "MinPriceFilter.h"
#include "GoogleProductCategory0Filter.h"
#include "GoogleProductCategory6Filter.h"
#include "CustomLabel3Filter.h"
#include "AvailabilityFilter.h"
#include "ProductType4Filter.h"
#include "GoogleProductCategory3Filter.h"
#include "ProductType0Filter.h"
#include "ProductGroupReferenceFilter.h"
#include "CustomLabel4Filter.h"
#include "CatalogsProductGroupCurrencyCriteria.h"
#include "GoogleProductCategory5Filter.h"
#include "BrandFilter.h"
#include "CustomLabel1Filter.h"
#include "GenderFilter.h"
#include "GoogleProductCategory2Filter.h"
#include "CatalogsProductGroupPricingCriteria.h"
#include "CatalogsProductGroupMultipleGenderCriteria.h"
#include "ProductType2Filter.h"
#include "GoogleProductCategory4Filter.h"
#include "ConditionFilter.h"
#include "CatalogsProductGroupMultipleStringListCriteria.h"
#include "CurrencyFilter.h"
#include "ItemIdFilter.h"
#include "CatalogsProductGroupMultipleMediaTypesCriteria.h"
#include "ItemGroupIdFilter.h"
#include "CatalogsProductGroupMultipleStringCriteria.h"
#include "CustomLabel2Filter.h"
#include "MediaTypeFilter.h"
#include "ProductType3Filter.h"
#include "MaxPriceFilter.h"
#include "ProductType1Filter.h"
#include "CustomLabel0Filter.h"
#include "GoogleProductCategory1Filter.h"
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "MinPriceFilter.h"
#include "MaxPriceFilter.h"
#include "CurrencyFilter.h"
#include "ItemIdFilter.h"
#include "AvailabilityFilter.h"
#include "BrandFilter.h"
#include "ConditionFilter.h"
#include "CustomLabel0Filter.h"
#include "CustomLabel1Filter.h"
#include "CustomLabel2Filter.h"
#include "CustomLabel3Filter.h"
#include "CustomLabel4Filter.h"
#include "ItemGroupIdFilter.h"
#include "GenderFilter.h"
#include "MediaTypeFilter.h"
#include "ProductType4Filter.h"
#include "ProductType3Filter.h"
#include "ProductType2Filter.h"
#include "ProductType1Filter.h"
#include "ProductType0Filter.h"
#include "GoogleProductCategory6Filter.h"
#include "GoogleProductCategory5Filter.h"
#include "GoogleProductCategory4Filter.h"
#include "GoogleProductCategory3Filter.h"
#include "GoogleProductCategory2Filter.h"
#include "GoogleProductCategory1Filter.h"
#include "GoogleProductCategory0Filter.h"
#include "ProductGroupReferenceFilter.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  CatalogsProductGroupFilterKeys : public MinPriceFilter, public MaxPriceFilter, public CurrencyFilter, public ItemIdFilter, public AvailabilityFilter, public BrandFilter, public ConditionFilter, public CustomLabel0Filter, public CustomLabel1Filter, public CustomLabel2Filter, public CustomLabel3Filter, public CustomLabel4Filter, public ItemGroupIdFilter, public GenderFilter, public MediaTypeFilter, public ProductType4Filter, public ProductType3Filter, public ProductType2Filter, public ProductType1Filter, public ProductType0Filter, public GoogleProductCategory6Filter, public GoogleProductCategory5Filter, public GoogleProductCategory4Filter, public GoogleProductCategory3Filter, public GoogleProductCategory2Filter, public GoogleProductCategory1Filter, public GoogleProductCategory0Filter, public ProductGroupReferenceFilter
{
public:
    CatalogsProductGroupFilterKeys() = default;
    explicit CatalogsProductGroupFilterKeys(boost::property_tree::ptree const& pt);
    virtual ~CatalogsProductGroupFilterKeys() = default;

    CatalogsProductGroupFilterKeys(const CatalogsProductGroupFilterKeys& other) = default; // copy constructor
    CatalogsProductGroupFilterKeys(CatalogsProductGroupFilterKeys&& other) noexcept = default; // move constructor

    CatalogsProductGroupFilterKeys& operator=(const CatalogsProductGroupFilterKeys& other) = default; // copy assignment
    CatalogsProductGroupFilterKeys& operator=(CatalogsProductGroupFilterKeys&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CatalogsProductGroupFilterKeys members

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupPricingCriteria getMINPRICE() const;
    void setMINPRICE(CatalogsProductGroupPricingCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupPricingCriteria getMAXPRICE() const;
    void setMAXPRICE(CatalogsProductGroupPricingCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupCurrencyCriteria getCURRENCY() const;
    void setCURRENCY(CatalogsProductGroupCurrencyCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringCriteria getITEMID() const;
    void setITEMID(CatalogsProductGroupMultipleStringCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringCriteria getAVAILABILITY() const;
    void setAVAILABILITY(CatalogsProductGroupMultipleStringCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringCriteria getBRAND() const;
    void setBRAND(CatalogsProductGroupMultipleStringCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringCriteria getCONDITION() const;
    void setCONDITION(CatalogsProductGroupMultipleStringCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL0() const;
    void setCUSTOMLABEL0(CatalogsProductGroupMultipleStringCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL1() const;
    void setCUSTOMLABEL1(CatalogsProductGroupMultipleStringCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL2() const;
    void setCUSTOMLABEL2(CatalogsProductGroupMultipleStringCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL3() const;
    void setCUSTOMLABEL3(CatalogsProductGroupMultipleStringCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL4() const;
    void setCUSTOMLABEL4(CatalogsProductGroupMultipleStringCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringCriteria getITEMGROUPID() const;
    void setITEMGROUPID(CatalogsProductGroupMultipleStringCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleGenderCriteria getGENDER() const;
    void setGENDER(CatalogsProductGroupMultipleGenderCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleMediaTypesCriteria getMEDIATYPE() const;
    void setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE4() const;
    void setPRODUCTTYPE4(CatalogsProductGroupMultipleStringListCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE3() const;
    void setPRODUCTTYPE3(CatalogsProductGroupMultipleStringListCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE2() const;
    void setPRODUCTTYPE2(CatalogsProductGroupMultipleStringListCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE1() const;
    void setPRODUCTTYPE1(CatalogsProductGroupMultipleStringListCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE0() const;
    void setPRODUCTTYPE0(CatalogsProductGroupMultipleStringListCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY6() const;
    void setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5() const;
    void setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY4() const;
    void setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY3() const;
    void setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY2() const;
    void setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY1() const;
    void setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY0() const;
    void setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsProductGroupMultipleStringCriteria getPRODUCTGROUP() const;
    void setPRODUCTGROUP(CatalogsProductGroupMultipleStringCriteria value);

protected:
    CatalogsProductGroupPricingCriteria m_MIN_PRICE = CatalogsProductGroupPricingCriteria{};
    CatalogsProductGroupPricingCriteria m_MAX_PRICE = CatalogsProductGroupPricingCriteria{};
    CatalogsProductGroupCurrencyCriteria m_CURRENCY = CatalogsProductGroupCurrencyCriteria{};
    CatalogsProductGroupMultipleStringCriteria m_ITEM_ID = CatalogsProductGroupMultipleStringCriteria{};
    CatalogsProductGroupMultipleStringCriteria m_AVAILABILITY = CatalogsProductGroupMultipleStringCriteria{};
    CatalogsProductGroupMultipleStringCriteria m_BRAND = CatalogsProductGroupMultipleStringCriteria{};
    CatalogsProductGroupMultipleStringCriteria m_CONDITION = CatalogsProductGroupMultipleStringCriteria{};
    CatalogsProductGroupMultipleStringCriteria m_CUSTOM_LABEL_0 = CatalogsProductGroupMultipleStringCriteria{};
    CatalogsProductGroupMultipleStringCriteria m_CUSTOM_LABEL_1 = CatalogsProductGroupMultipleStringCriteria{};
    CatalogsProductGroupMultipleStringCriteria m_CUSTOM_LABEL_2 = CatalogsProductGroupMultipleStringCriteria{};
    CatalogsProductGroupMultipleStringCriteria m_CUSTOM_LABEL_3 = CatalogsProductGroupMultipleStringCriteria{};
    CatalogsProductGroupMultipleStringCriteria m_CUSTOM_LABEL_4 = CatalogsProductGroupMultipleStringCriteria{};
    CatalogsProductGroupMultipleStringCriteria m_ITEM_GROUP_ID = CatalogsProductGroupMultipleStringCriteria{};
    CatalogsProductGroupMultipleGenderCriteria m_GENDER = CatalogsProductGroupMultipleGenderCriteria{};
    CatalogsProductGroupMultipleMediaTypesCriteria m_MEDIA_TYPE = CatalogsProductGroupMultipleMediaTypesCriteria{};
    CatalogsProductGroupMultipleStringListCriteria m_PRODUCT_TYPE_4 = CatalogsProductGroupMultipleStringListCriteria{};
    CatalogsProductGroupMultipleStringListCriteria m_PRODUCT_TYPE_3 = CatalogsProductGroupMultipleStringListCriteria{};
    CatalogsProductGroupMultipleStringListCriteria m_PRODUCT_TYPE_2 = CatalogsProductGroupMultipleStringListCriteria{};
    CatalogsProductGroupMultipleStringListCriteria m_PRODUCT_TYPE_1 = CatalogsProductGroupMultipleStringListCriteria{};
    CatalogsProductGroupMultipleStringListCriteria m_PRODUCT_TYPE_0 = CatalogsProductGroupMultipleStringListCriteria{};
    CatalogsProductGroupMultipleStringListCriteria m_GOOGLE_PRODUCT_CATEGORY_6 = CatalogsProductGroupMultipleStringListCriteria{};
    CatalogsProductGroupMultipleStringListCriteria m_GOOGLE_PRODUCT_CATEGORY_5 = CatalogsProductGroupMultipleStringListCriteria{};
    CatalogsProductGroupMultipleStringListCriteria m_GOOGLE_PRODUCT_CATEGORY_4 = CatalogsProductGroupMultipleStringListCriteria{};
    CatalogsProductGroupMultipleStringListCriteria m_GOOGLE_PRODUCT_CATEGORY_3 = CatalogsProductGroupMultipleStringListCriteria{};
    CatalogsProductGroupMultipleStringListCriteria m_GOOGLE_PRODUCT_CATEGORY_2 = CatalogsProductGroupMultipleStringListCriteria{};
    CatalogsProductGroupMultipleStringListCriteria m_GOOGLE_PRODUCT_CATEGORY_1 = CatalogsProductGroupMultipleStringListCriteria{};
    CatalogsProductGroupMultipleStringListCriteria m_GOOGLE_PRODUCT_CATEGORY_0 = CatalogsProductGroupMultipleStringListCriteria{};
    CatalogsProductGroupMultipleStringCriteria m_PRODUCT_GROUP = CatalogsProductGroupMultipleStringCriteria{};
};

std::vector<CatalogsProductGroupFilterKeys> createCatalogsProductGroupFilterKeysVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CatalogsProductGroupFilterKeys>(const CatalogsProductGroupFilterKeys& val) {
    return val.toPropertyTree();
}

template<>
inline CatalogsProductGroupFilterKeys fromPt<CatalogsProductGroupFilterKeys>(const boost::property_tree::ptree& pt) {
    CatalogsProductGroupFilterKeys ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CatalogsProductGroupFilterKeys_H_ */
