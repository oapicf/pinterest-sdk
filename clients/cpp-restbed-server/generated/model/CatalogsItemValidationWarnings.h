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
 * CatalogsItemValidationWarnings.h
 *
 * 
 */

#ifndef CatalogsItemValidationWarnings_H_
#define CatalogsItemValidationWarnings_H_



#include "CatalogsItemValidationDetails.h"
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
class  CatalogsItemValidationWarnings 
{
public:
    CatalogsItemValidationWarnings() = default;
    explicit CatalogsItemValidationWarnings(boost::property_tree::ptree const& pt);
    virtual ~CatalogsItemValidationWarnings() = default;

    CatalogsItemValidationWarnings(const CatalogsItemValidationWarnings& other) = default; // copy constructor
    CatalogsItemValidationWarnings(CatalogsItemValidationWarnings&& other) noexcept = default; // move constructor

    CatalogsItemValidationWarnings& operator=(const CatalogsItemValidationWarnings& other) = default; // copy assignment
    CatalogsItemValidationWarnings& operator=(CatalogsItemValidationWarnings&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CatalogsItemValidationWarnings members

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getADLINKFORMATWARNING() const;
    void setADLINKFORMATWARNING(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getADLINKSAMEASLINK() const;
    void setADLINKSAMEASLINK(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getADDITIONALIMAGELINKLENGTHTOOLONG() const;
    void setADDITIONALIMAGELINKLENGTHTOOLONG(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getADDITIONALIMAGELINKWARNING() const;
    void setADDITIONALIMAGELINKWARNING(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getADWORDSFORMATWARNING() const;
    void setADWORDSFORMATWARNING(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getADWORDSSAMEASLINK() const;
    void setADWORDSSAMEASLINK(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getAGEGROUPINVALID() const;
    void setAGEGROUPINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getSIZESYSTEMINVALID() const;
    void setSIZESYSTEMINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getANDROIDDEEPLINKINVALID() const;
    void setANDROIDDEEPLINKINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getAVAILABILITYDATEINVALID() const;
    void setAVAILABILITYDATEINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getCOUNTRYDOESNOTMAPTOCURRENCY() const;
    void setCOUNTRYDOESNOTMAPTOCURRENCY(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getCUSTOMLABELLENGTHTOOLONG() const;
    void setCUSTOMLABELLENGTHTOOLONG(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getDESCRIPTIONLENGTHTOOLONG() const;
    void setDESCRIPTIONLENGTHTOOLONG(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getEXPIRATIONDATEINVALID() const;
    void setEXPIRATIONDATEINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getGENDERINVALID() const;
    void setGENDERINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getGTININVALID() const;
    void setGTININVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getIMAGELINKWARNING() const;
    void setIMAGELINKWARNING(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getIOSDEEPLINKINVALID() const;
    void setIOSDEEPLINKINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getISBUNDLEINVALID() const;
    void setISBUNDLEINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getITEMADDITIONALIMAGEDOWNLOADFAILURE() const;
    void setITEMADDITIONALIMAGEDOWNLOADFAILURE(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getLINKFORMATWARNING() const;
    void setLINKFORMATWARNING(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getMINADPRICEINVALID() const;
    void setMINADPRICEINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getMPNINVALID() const;
    void setMPNINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getMULTIPACKINVALID() const;
    void setMULTIPACKINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getOPTIONALCONDITIONINVALID() const;
    void setOPTIONALCONDITIONINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getOPTIONALCONDITIONMISSING() const;
    void setOPTIONALCONDITIONMISSING(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getOPTIONALPRODUCTCATEGORYINVALID() const;
    void setOPTIONALPRODUCTCATEGORYINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getOPTIONALPRODUCTCATEGORYMISSING() const;
    void setOPTIONALPRODUCTCATEGORYMISSING(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getPRODUCTCATEGORYDEPTHWARNING() const;
    void setPRODUCTCATEGORYDEPTHWARNING(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getPRODUCTTYPELENGTHTOOLONG() const;
    void setPRODUCTTYPELENGTHTOOLONG(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getSALESPRICEINVALID() const;
    void setSALESPRICEINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getSALESPRICETOOLOW() const;
    void setSALESPRICETOOLOW(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getSALESPRICETOOHIGH() const;
    void setSALESPRICETOOHIGH(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getSALEDATEINVALID() const;
    void setSALEDATEINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getSHIPPINGINVALID() const;
    void setSHIPPINGINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getSHIPPINGHEIGHTINVALID() const;
    void setSHIPPINGHEIGHTINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getSHIPPINGWEIGHTINVALID() const;
    void setSHIPPINGWEIGHTINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getSHIPPINGWIDTHINVALID() const;
    void setSHIPPINGWIDTHINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getSIZETYPEINVALID() const;
    void setSIZETYPEINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getTAXINVALID() const;
    void setTAXINVALID(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getTITLELENGTHTOOLONG() const;
    void setTITLELENGTHTOOLONG(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getTOOMANYADDITIONALIMAGELINKS() const;
    void setTOOMANYADDITIONALIMAGELINKS(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getUTMSOURCEAUTOCORRECTED() const;
    void setUTMSOURCEAUTOCORRECTED(CatalogsItemValidationDetails value);

    /// <summary>
    /// 
    /// </summary>
    CatalogsItemValidationDetails getWEIGHTUNITINVALID() const;
    void setWEIGHTUNITINVALID(CatalogsItemValidationDetails value);

protected:
    CatalogsItemValidationDetails m_AD_LINK_FORMAT_WARNING;
    CatalogsItemValidationDetails m_AD_LINK_SAME_AS_LINK;
    CatalogsItemValidationDetails m_ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails m_ADDITIONAL_IMAGE_LINK_WARNING;
    CatalogsItemValidationDetails m_ADWORDS_FORMAT_WARNING;
    CatalogsItemValidationDetails m_ADWORDS_SAME_AS_LINK;
    CatalogsItemValidationDetails m_AGE_GROUP_INVALID;
    CatalogsItemValidationDetails m_SIZE_SYSTEM_INVALID;
    CatalogsItemValidationDetails m_ANDROID_DEEP_LINK_INVALID;
    CatalogsItemValidationDetails m_AVAILABILITY_DATE_INVALID;
    CatalogsItemValidationDetails m_COUNTRY_DOES_NOT_MAP_TO_CURRENCY;
    CatalogsItemValidationDetails m_CUSTOM_LABEL_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails m_DESCRIPTION_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails m_EXPIRATION_DATE_INVALID;
    CatalogsItemValidationDetails m_GENDER_INVALID;
    CatalogsItemValidationDetails m_GTIN_INVALID;
    CatalogsItemValidationDetails m_IMAGE_LINK_WARNING;
    CatalogsItemValidationDetails m_IOS_DEEP_LINK_INVALID;
    CatalogsItemValidationDetails m_IS_BUNDLE_INVALID;
    CatalogsItemValidationDetails m_ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
    CatalogsItemValidationDetails m_LINK_FORMAT_WARNING;
    CatalogsItemValidationDetails m_MIN_AD_PRICE_INVALID;
    CatalogsItemValidationDetails m_MPN_INVALID;
    CatalogsItemValidationDetails m_MULTIPACK_INVALID;
    CatalogsItemValidationDetails m_OPTIONAL_CONDITION_INVALID;
    CatalogsItemValidationDetails m_OPTIONAL_CONDITION_MISSING;
    CatalogsItemValidationDetails m_OPTIONAL_PRODUCT_CATEGORY_INVALID;
    CatalogsItemValidationDetails m_OPTIONAL_PRODUCT_CATEGORY_MISSING;
    CatalogsItemValidationDetails m_PRODUCT_CATEGORY_DEPTH_WARNING;
    CatalogsItemValidationDetails m_PRODUCT_TYPE_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails m_SALES_PRICE_INVALID;
    CatalogsItemValidationDetails m_SALES_PRICE_TOO_LOW;
    CatalogsItemValidationDetails m_SALES_PRICE_TOO_HIGH;
    CatalogsItemValidationDetails m_SALE_DATE_INVALID;
    CatalogsItemValidationDetails m_SHIPPING_INVALID;
    CatalogsItemValidationDetails m_SHIPPING_HEIGHT_INVALID;
    CatalogsItemValidationDetails m_SHIPPING_WEIGHT_INVALID;
    CatalogsItemValidationDetails m_SHIPPING_WIDTH_INVALID;
    CatalogsItemValidationDetails m_SIZE_TYPE_INVALID;
    CatalogsItemValidationDetails m_TAX_INVALID;
    CatalogsItemValidationDetails m_TITLE_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails m_TOO_MANY_ADDITIONAL_IMAGE_LINKS;
    CatalogsItemValidationDetails m_UTM_SOURCE_AUTO_CORRECTED;
    CatalogsItemValidationDetails m_WEIGHT_UNIT_INVALID;
};

std::vector<CatalogsItemValidationWarnings> createCatalogsItemValidationWarningsVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CatalogsItemValidationWarnings>(const CatalogsItemValidationWarnings& val) {
    return val.toPropertyTree();
}

template<>
inline CatalogsItemValidationWarnings fromPt<CatalogsItemValidationWarnings>(const boost::property_tree::ptree& pt) {
    CatalogsItemValidationWarnings ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CatalogsItemValidationWarnings_H_ */
