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


#include "CatalogsItemValidationErrors.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CatalogsItemValidationErrors::CatalogsItemValidationErrors()
{
    m_ADULT_INVALIDIsSet = false;
    m_ADWORDS_FORMAT_INVALIDIsSet = false;
    m_AVAILABILITY_INVALIDIsSet = false;
    m_BLOCKLISTED_IMAGE_SIGNATUREIsSet = false;
    m_DESCRIPTION_MISSINGIsSet = false;
    m_DUPLICATE_PRODUCTSIsSet = false;
    m_IMAGE_LINK_INVALIDIsSet = false;
    m_IMAGE_LINK_LENGTH_TOO_LONGIsSet = false;
    m_IMAGE_LINK_MISSINGIsSet = false;
    m_INVALID_DOMAINIsSet = false;
    m_ITEMID_MISSINGIsSet = false;
    m_ITEM_MAIN_IMAGE_DOWNLOAD_FAILUREIsSet = false;
    m_LINK_FORMAT_INVALIDIsSet = false;
    m_LINK_LENGTH_TOO_LONGIsSet = false;
    m_LIST_PRICE_INVALIDIsSet = false;
    m_MAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDIsSet = false;
    m_PARSE_LINE_ERRORIsSet = false;
    m_PINJOIN_CONTENT_UNSAFEIsSet = false;
    m_PRICE_CANNOT_BE_DETERMINEDIsSet = false;
    m_PRICE_MISSINGIsSet = false;
    m_PRODUCT_LINK_MISSINGIsSet = false;
    m_PRODUCT_PRICE_INVALIDIsSet = false;
    m_TITLE_MISSINGIsSet = false;
    
}

void CatalogsItemValidationErrors::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CatalogsItemValidationErrors::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CatalogsItemValidationErrors::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CatalogsItemValidationErrors" : pathPrefix;

                                                                                                
    return success;
}

bool CatalogsItemValidationErrors::operator==(const CatalogsItemValidationErrors& rhs) const
{
    return
    
    
    
    ((!aDULTINVALIDIsSet() && !rhs.aDULTINVALIDIsSet()) || (aDULTINVALIDIsSet() && rhs.aDULTINVALIDIsSet() && getADULTINVALID() == rhs.getADULTINVALID())) &&
    
    
    ((!aDWORDSFORMATINVALIDIsSet() && !rhs.aDWORDSFORMATINVALIDIsSet()) || (aDWORDSFORMATINVALIDIsSet() && rhs.aDWORDSFORMATINVALIDIsSet() && getADWORDSFORMATINVALID() == rhs.getADWORDSFORMATINVALID())) &&
    
    
    ((!aVAILABILITYINVALIDIsSet() && !rhs.aVAILABILITYINVALIDIsSet()) || (aVAILABILITYINVALIDIsSet() && rhs.aVAILABILITYINVALIDIsSet() && getAVAILABILITYINVALID() == rhs.getAVAILABILITYINVALID())) &&
    
    
    ((!bLOCKLISTEDIMAGESIGNATUREIsSet() && !rhs.bLOCKLISTEDIMAGESIGNATUREIsSet()) || (bLOCKLISTEDIMAGESIGNATUREIsSet() && rhs.bLOCKLISTEDIMAGESIGNATUREIsSet() && getBLOCKLISTEDIMAGESIGNATURE() == rhs.getBLOCKLISTEDIMAGESIGNATURE())) &&
    
    
    ((!dESCRIPTIONMISSINGIsSet() && !rhs.dESCRIPTIONMISSINGIsSet()) || (dESCRIPTIONMISSINGIsSet() && rhs.dESCRIPTIONMISSINGIsSet() && getDESCRIPTIONMISSING() == rhs.getDESCRIPTIONMISSING())) &&
    
    
    ((!dUPLICATEPRODUCTSIsSet() && !rhs.dUPLICATEPRODUCTSIsSet()) || (dUPLICATEPRODUCTSIsSet() && rhs.dUPLICATEPRODUCTSIsSet() && getDUPLICATEPRODUCTS() == rhs.getDUPLICATEPRODUCTS())) &&
    
    
    ((!iMAGELINKINVALIDIsSet() && !rhs.iMAGELINKINVALIDIsSet()) || (iMAGELINKINVALIDIsSet() && rhs.iMAGELINKINVALIDIsSet() && getIMAGELINKINVALID() == rhs.getIMAGELINKINVALID())) &&
    
    
    ((!iMAGELINKLENGTHTOOLONGIsSet() && !rhs.iMAGELINKLENGTHTOOLONGIsSet()) || (iMAGELINKLENGTHTOOLONGIsSet() && rhs.iMAGELINKLENGTHTOOLONGIsSet() && getIMAGELINKLENGTHTOOLONG() == rhs.getIMAGELINKLENGTHTOOLONG())) &&
    
    
    ((!iMAGELINKMISSINGIsSet() && !rhs.iMAGELINKMISSINGIsSet()) || (iMAGELINKMISSINGIsSet() && rhs.iMAGELINKMISSINGIsSet() && getIMAGELINKMISSING() == rhs.getIMAGELINKMISSING())) &&
    
    
    ((!iNVALIDDOMAINIsSet() && !rhs.iNVALIDDOMAINIsSet()) || (iNVALIDDOMAINIsSet() && rhs.iNVALIDDOMAINIsSet() && getINVALIDDOMAIN() == rhs.getINVALIDDOMAIN())) &&
    
    
    ((!iTEMIDMISSINGIsSet() && !rhs.iTEMIDMISSINGIsSet()) || (iTEMIDMISSINGIsSet() && rhs.iTEMIDMISSINGIsSet() && getITEMIDMISSING() == rhs.getITEMIDMISSING())) &&
    
    
    ((!iTEMMAINIMAGEDOWNLOADFAILUREIsSet() && !rhs.iTEMMAINIMAGEDOWNLOADFAILUREIsSet()) || (iTEMMAINIMAGEDOWNLOADFAILUREIsSet() && rhs.iTEMMAINIMAGEDOWNLOADFAILUREIsSet() && getITEMMAINIMAGEDOWNLOADFAILURE() == rhs.getITEMMAINIMAGEDOWNLOADFAILURE())) &&
    
    
    ((!lINKFORMATINVALIDIsSet() && !rhs.lINKFORMATINVALIDIsSet()) || (lINKFORMATINVALIDIsSet() && rhs.lINKFORMATINVALIDIsSet() && getLINKFORMATINVALID() == rhs.getLINKFORMATINVALID())) &&
    
    
    ((!lINKLENGTHTOOLONGIsSet() && !rhs.lINKLENGTHTOOLONGIsSet()) || (lINKLENGTHTOOLONGIsSet() && rhs.lINKLENGTHTOOLONGIsSet() && getLINKLENGTHTOOLONG() == rhs.getLINKLENGTHTOOLONG())) &&
    
    
    ((!lISTPRICEINVALIDIsSet() && !rhs.lISTPRICEINVALIDIsSet()) || (lISTPRICEINVALIDIsSet() && rhs.lISTPRICEINVALIDIsSet() && getLISTPRICEINVALID() == rhs.getLISTPRICEINVALID())) &&
    
    
    ((!mAXITEMSPERITEMGROUPEXCEEDEDIsSet() && !rhs.mAXITEMSPERITEMGROUPEXCEEDEDIsSet()) || (mAXITEMSPERITEMGROUPEXCEEDEDIsSet() && rhs.mAXITEMSPERITEMGROUPEXCEEDEDIsSet() && getMAXITEMSPERITEMGROUPEXCEEDED() == rhs.getMAXITEMSPERITEMGROUPEXCEEDED())) &&
    
    
    ((!pARSELINEERRORIsSet() && !rhs.pARSELINEERRORIsSet()) || (pARSELINEERRORIsSet() && rhs.pARSELINEERRORIsSet() && getPARSELINEERROR() == rhs.getPARSELINEERROR())) &&
    
    
    ((!pINJOINCONTENTUNSAFEIsSet() && !rhs.pINJOINCONTENTUNSAFEIsSet()) || (pINJOINCONTENTUNSAFEIsSet() && rhs.pINJOINCONTENTUNSAFEIsSet() && getPINJOINCONTENTUNSAFE() == rhs.getPINJOINCONTENTUNSAFE())) &&
    
    
    ((!pRICECANNOTBEDETERMINEDIsSet() && !rhs.pRICECANNOTBEDETERMINEDIsSet()) || (pRICECANNOTBEDETERMINEDIsSet() && rhs.pRICECANNOTBEDETERMINEDIsSet() && getPRICECANNOTBEDETERMINED() == rhs.getPRICECANNOTBEDETERMINED())) &&
    
    
    ((!pRICEMISSINGIsSet() && !rhs.pRICEMISSINGIsSet()) || (pRICEMISSINGIsSet() && rhs.pRICEMISSINGIsSet() && getPRICEMISSING() == rhs.getPRICEMISSING())) &&
    
    
    ((!pRODUCTLINKMISSINGIsSet() && !rhs.pRODUCTLINKMISSINGIsSet()) || (pRODUCTLINKMISSINGIsSet() && rhs.pRODUCTLINKMISSINGIsSet() && getPRODUCTLINKMISSING() == rhs.getPRODUCTLINKMISSING())) &&
    
    
    ((!pRODUCTPRICEINVALIDIsSet() && !rhs.pRODUCTPRICEINVALIDIsSet()) || (pRODUCTPRICEINVALIDIsSet() && rhs.pRODUCTPRICEINVALIDIsSet() && getPRODUCTPRICEINVALID() == rhs.getPRODUCTPRICEINVALID())) &&
    
    
    ((!tITLEMISSINGIsSet() && !rhs.tITLEMISSINGIsSet()) || (tITLEMISSINGIsSet() && rhs.tITLEMISSINGIsSet() && getTITLEMISSING() == rhs.getTITLEMISSING()))
    
    ;
}

bool CatalogsItemValidationErrors::operator!=(const CatalogsItemValidationErrors& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CatalogsItemValidationErrors& o)
{
    j = nlohmann::json::object();
    if(o.aDULTINVALIDIsSet())
        j["ADULT_INVALID"] = o.m_ADULT_INVALID;
    if(o.aDWORDSFORMATINVALIDIsSet())
        j["ADWORDS_FORMAT_INVALID"] = o.m_ADWORDS_FORMAT_INVALID;
    if(o.aVAILABILITYINVALIDIsSet())
        j["AVAILABILITY_INVALID"] = o.m_AVAILABILITY_INVALID;
    if(o.bLOCKLISTEDIMAGESIGNATUREIsSet())
        j["BLOCKLISTED_IMAGE_SIGNATURE"] = o.m_BLOCKLISTED_IMAGE_SIGNATURE;
    if(o.dESCRIPTIONMISSINGIsSet())
        j["DESCRIPTION_MISSING"] = o.m_DESCRIPTION_MISSING;
    if(o.dUPLICATEPRODUCTSIsSet())
        j["DUPLICATE_PRODUCTS"] = o.m_DUPLICATE_PRODUCTS;
    if(o.iMAGELINKINVALIDIsSet())
        j["IMAGE_LINK_INVALID"] = o.m_IMAGE_LINK_INVALID;
    if(o.iMAGELINKLENGTHTOOLONGIsSet())
        j["IMAGE_LINK_LENGTH_TOO_LONG"] = o.m_IMAGE_LINK_LENGTH_TOO_LONG;
    if(o.iMAGELINKMISSINGIsSet())
        j["IMAGE_LINK_MISSING"] = o.m_IMAGE_LINK_MISSING;
    if(o.iNVALIDDOMAINIsSet())
        j["INVALID_DOMAIN"] = o.m_INVALID_DOMAIN;
    if(o.iTEMIDMISSINGIsSet())
        j["ITEMID_MISSING"] = o.m_ITEMID_MISSING;
    if(o.iTEMMAINIMAGEDOWNLOADFAILUREIsSet())
        j["ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE"] = o.m_ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
    if(o.lINKFORMATINVALIDIsSet())
        j["LINK_FORMAT_INVALID"] = o.m_LINK_FORMAT_INVALID;
    if(o.lINKLENGTHTOOLONGIsSet())
        j["LINK_LENGTH_TOO_LONG"] = o.m_LINK_LENGTH_TOO_LONG;
    if(o.lISTPRICEINVALIDIsSet())
        j["LIST_PRICE_INVALID"] = o.m_LIST_PRICE_INVALID;
    if(o.mAXITEMSPERITEMGROUPEXCEEDEDIsSet())
        j["MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED"] = o.m_MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
    if(o.pARSELINEERRORIsSet())
        j["PARSE_LINE_ERROR"] = o.m_PARSE_LINE_ERROR;
    if(o.pINJOINCONTENTUNSAFEIsSet())
        j["PINJOIN_CONTENT_UNSAFE"] = o.m_PINJOIN_CONTENT_UNSAFE;
    if(o.pRICECANNOTBEDETERMINEDIsSet())
        j["PRICE_CANNOT_BE_DETERMINED"] = o.m_PRICE_CANNOT_BE_DETERMINED;
    if(o.pRICEMISSINGIsSet())
        j["PRICE_MISSING"] = o.m_PRICE_MISSING;
    if(o.pRODUCTLINKMISSINGIsSet())
        j["PRODUCT_LINK_MISSING"] = o.m_PRODUCT_LINK_MISSING;
    if(o.pRODUCTPRICEINVALIDIsSet())
        j["PRODUCT_PRICE_INVALID"] = o.m_PRODUCT_PRICE_INVALID;
    if(o.tITLEMISSINGIsSet())
        j["TITLE_MISSING"] = o.m_TITLE_MISSING;
    
}

void from_json(const nlohmann::json& j, CatalogsItemValidationErrors& o)
{
    if(j.find("ADULT_INVALID") != j.end())
    {
        j.at("ADULT_INVALID").get_to(o.m_ADULT_INVALID);
        o.m_ADULT_INVALIDIsSet = true;
    } 
    if(j.find("ADWORDS_FORMAT_INVALID") != j.end())
    {
        j.at("ADWORDS_FORMAT_INVALID").get_to(o.m_ADWORDS_FORMAT_INVALID);
        o.m_ADWORDS_FORMAT_INVALIDIsSet = true;
    } 
    if(j.find("AVAILABILITY_INVALID") != j.end())
    {
        j.at("AVAILABILITY_INVALID").get_to(o.m_AVAILABILITY_INVALID);
        o.m_AVAILABILITY_INVALIDIsSet = true;
    } 
    if(j.find("BLOCKLISTED_IMAGE_SIGNATURE") != j.end())
    {
        j.at("BLOCKLISTED_IMAGE_SIGNATURE").get_to(o.m_BLOCKLISTED_IMAGE_SIGNATURE);
        o.m_BLOCKLISTED_IMAGE_SIGNATUREIsSet = true;
    } 
    if(j.find("DESCRIPTION_MISSING") != j.end())
    {
        j.at("DESCRIPTION_MISSING").get_to(o.m_DESCRIPTION_MISSING);
        o.m_DESCRIPTION_MISSINGIsSet = true;
    } 
    if(j.find("DUPLICATE_PRODUCTS") != j.end())
    {
        j.at("DUPLICATE_PRODUCTS").get_to(o.m_DUPLICATE_PRODUCTS);
        o.m_DUPLICATE_PRODUCTSIsSet = true;
    } 
    if(j.find("IMAGE_LINK_INVALID") != j.end())
    {
        j.at("IMAGE_LINK_INVALID").get_to(o.m_IMAGE_LINK_INVALID);
        o.m_IMAGE_LINK_INVALIDIsSet = true;
    } 
    if(j.find("IMAGE_LINK_LENGTH_TOO_LONG") != j.end())
    {
        j.at("IMAGE_LINK_LENGTH_TOO_LONG").get_to(o.m_IMAGE_LINK_LENGTH_TOO_LONG);
        o.m_IMAGE_LINK_LENGTH_TOO_LONGIsSet = true;
    } 
    if(j.find("IMAGE_LINK_MISSING") != j.end())
    {
        j.at("IMAGE_LINK_MISSING").get_to(o.m_IMAGE_LINK_MISSING);
        o.m_IMAGE_LINK_MISSINGIsSet = true;
    } 
    if(j.find("INVALID_DOMAIN") != j.end())
    {
        j.at("INVALID_DOMAIN").get_to(o.m_INVALID_DOMAIN);
        o.m_INVALID_DOMAINIsSet = true;
    } 
    if(j.find("ITEMID_MISSING") != j.end())
    {
        j.at("ITEMID_MISSING").get_to(o.m_ITEMID_MISSING);
        o.m_ITEMID_MISSINGIsSet = true;
    } 
    if(j.find("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE") != j.end())
    {
        j.at("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE").get_to(o.m_ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE);
        o.m_ITEM_MAIN_IMAGE_DOWNLOAD_FAILUREIsSet = true;
    } 
    if(j.find("LINK_FORMAT_INVALID") != j.end())
    {
        j.at("LINK_FORMAT_INVALID").get_to(o.m_LINK_FORMAT_INVALID);
        o.m_LINK_FORMAT_INVALIDIsSet = true;
    } 
    if(j.find("LINK_LENGTH_TOO_LONG") != j.end())
    {
        j.at("LINK_LENGTH_TOO_LONG").get_to(o.m_LINK_LENGTH_TOO_LONG);
        o.m_LINK_LENGTH_TOO_LONGIsSet = true;
    } 
    if(j.find("LIST_PRICE_INVALID") != j.end())
    {
        j.at("LIST_PRICE_INVALID").get_to(o.m_LIST_PRICE_INVALID);
        o.m_LIST_PRICE_INVALIDIsSet = true;
    } 
    if(j.find("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED") != j.end())
    {
        j.at("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED").get_to(o.m_MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED);
        o.m_MAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDIsSet = true;
    } 
    if(j.find("PARSE_LINE_ERROR") != j.end())
    {
        j.at("PARSE_LINE_ERROR").get_to(o.m_PARSE_LINE_ERROR);
        o.m_PARSE_LINE_ERRORIsSet = true;
    } 
    if(j.find("PINJOIN_CONTENT_UNSAFE") != j.end())
    {
        j.at("PINJOIN_CONTENT_UNSAFE").get_to(o.m_PINJOIN_CONTENT_UNSAFE);
        o.m_PINJOIN_CONTENT_UNSAFEIsSet = true;
    } 
    if(j.find("PRICE_CANNOT_BE_DETERMINED") != j.end())
    {
        j.at("PRICE_CANNOT_BE_DETERMINED").get_to(o.m_PRICE_CANNOT_BE_DETERMINED);
        o.m_PRICE_CANNOT_BE_DETERMINEDIsSet = true;
    } 
    if(j.find("PRICE_MISSING") != j.end())
    {
        j.at("PRICE_MISSING").get_to(o.m_PRICE_MISSING);
        o.m_PRICE_MISSINGIsSet = true;
    } 
    if(j.find("PRODUCT_LINK_MISSING") != j.end())
    {
        j.at("PRODUCT_LINK_MISSING").get_to(o.m_PRODUCT_LINK_MISSING);
        o.m_PRODUCT_LINK_MISSINGIsSet = true;
    } 
    if(j.find("PRODUCT_PRICE_INVALID") != j.end())
    {
        j.at("PRODUCT_PRICE_INVALID").get_to(o.m_PRODUCT_PRICE_INVALID);
        o.m_PRODUCT_PRICE_INVALIDIsSet = true;
    } 
    if(j.find("TITLE_MISSING") != j.end())
    {
        j.at("TITLE_MISSING").get_to(o.m_TITLE_MISSING);
        o.m_TITLE_MISSINGIsSet = true;
    } 
    
}

org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getADULTINVALID() const
{
    return m_ADULT_INVALID;
}
void CatalogsItemValidationErrors::setADULTINVALID(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_ADULT_INVALID = value;
    m_ADULT_INVALIDIsSet = true;
}
bool CatalogsItemValidationErrors::aDULTINVALIDIsSet() const
{
    return m_ADULT_INVALIDIsSet;
}
void CatalogsItemValidationErrors::unsetADULT_INVALID()
{
    m_ADULT_INVALIDIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getADWORDSFORMATINVALID() const
{
    return m_ADWORDS_FORMAT_INVALID;
}
void CatalogsItemValidationErrors::setADWORDSFORMATINVALID(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_ADWORDS_FORMAT_INVALID = value;
    m_ADWORDS_FORMAT_INVALIDIsSet = true;
}
bool CatalogsItemValidationErrors::aDWORDSFORMATINVALIDIsSet() const
{
    return m_ADWORDS_FORMAT_INVALIDIsSet;
}
void CatalogsItemValidationErrors::unsetADWORDS_FORMAT_INVALID()
{
    m_ADWORDS_FORMAT_INVALIDIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getAVAILABILITYINVALID() const
{
    return m_AVAILABILITY_INVALID;
}
void CatalogsItemValidationErrors::setAVAILABILITYINVALID(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_AVAILABILITY_INVALID = value;
    m_AVAILABILITY_INVALIDIsSet = true;
}
bool CatalogsItemValidationErrors::aVAILABILITYINVALIDIsSet() const
{
    return m_AVAILABILITY_INVALIDIsSet;
}
void CatalogsItemValidationErrors::unsetAVAILABILITY_INVALID()
{
    m_AVAILABILITY_INVALIDIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getBLOCKLISTEDIMAGESIGNATURE() const
{
    return m_BLOCKLISTED_IMAGE_SIGNATURE;
}
void CatalogsItemValidationErrors::setBLOCKLISTEDIMAGESIGNATURE(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_BLOCKLISTED_IMAGE_SIGNATURE = value;
    m_BLOCKLISTED_IMAGE_SIGNATUREIsSet = true;
}
bool CatalogsItemValidationErrors::bLOCKLISTEDIMAGESIGNATUREIsSet() const
{
    return m_BLOCKLISTED_IMAGE_SIGNATUREIsSet;
}
void CatalogsItemValidationErrors::unsetBLOCKLISTED_IMAGE_SIGNATURE()
{
    m_BLOCKLISTED_IMAGE_SIGNATUREIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getDESCRIPTIONMISSING() const
{
    return m_DESCRIPTION_MISSING;
}
void CatalogsItemValidationErrors::setDESCRIPTIONMISSING(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_DESCRIPTION_MISSING = value;
    m_DESCRIPTION_MISSINGIsSet = true;
}
bool CatalogsItemValidationErrors::dESCRIPTIONMISSINGIsSet() const
{
    return m_DESCRIPTION_MISSINGIsSet;
}
void CatalogsItemValidationErrors::unsetDESCRIPTION_MISSING()
{
    m_DESCRIPTION_MISSINGIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getDUPLICATEPRODUCTS() const
{
    return m_DUPLICATE_PRODUCTS;
}
void CatalogsItemValidationErrors::setDUPLICATEPRODUCTS(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_DUPLICATE_PRODUCTS = value;
    m_DUPLICATE_PRODUCTSIsSet = true;
}
bool CatalogsItemValidationErrors::dUPLICATEPRODUCTSIsSet() const
{
    return m_DUPLICATE_PRODUCTSIsSet;
}
void CatalogsItemValidationErrors::unsetDUPLICATE_PRODUCTS()
{
    m_DUPLICATE_PRODUCTSIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getIMAGELINKINVALID() const
{
    return m_IMAGE_LINK_INVALID;
}
void CatalogsItemValidationErrors::setIMAGELINKINVALID(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_IMAGE_LINK_INVALID = value;
    m_IMAGE_LINK_INVALIDIsSet = true;
}
bool CatalogsItemValidationErrors::iMAGELINKINVALIDIsSet() const
{
    return m_IMAGE_LINK_INVALIDIsSet;
}
void CatalogsItemValidationErrors::unsetIMAGE_LINK_INVALID()
{
    m_IMAGE_LINK_INVALIDIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getIMAGELINKLENGTHTOOLONG() const
{
    return m_IMAGE_LINK_LENGTH_TOO_LONG;
}
void CatalogsItemValidationErrors::setIMAGELINKLENGTHTOOLONG(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_IMAGE_LINK_LENGTH_TOO_LONG = value;
    m_IMAGE_LINK_LENGTH_TOO_LONGIsSet = true;
}
bool CatalogsItemValidationErrors::iMAGELINKLENGTHTOOLONGIsSet() const
{
    return m_IMAGE_LINK_LENGTH_TOO_LONGIsSet;
}
void CatalogsItemValidationErrors::unsetIMAGE_LINK_LENGTH_TOO_LONG()
{
    m_IMAGE_LINK_LENGTH_TOO_LONGIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getIMAGELINKMISSING() const
{
    return m_IMAGE_LINK_MISSING;
}
void CatalogsItemValidationErrors::setIMAGELINKMISSING(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_IMAGE_LINK_MISSING = value;
    m_IMAGE_LINK_MISSINGIsSet = true;
}
bool CatalogsItemValidationErrors::iMAGELINKMISSINGIsSet() const
{
    return m_IMAGE_LINK_MISSINGIsSet;
}
void CatalogsItemValidationErrors::unsetIMAGE_LINK_MISSING()
{
    m_IMAGE_LINK_MISSINGIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getINVALIDDOMAIN() const
{
    return m_INVALID_DOMAIN;
}
void CatalogsItemValidationErrors::setINVALIDDOMAIN(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_INVALID_DOMAIN = value;
    m_INVALID_DOMAINIsSet = true;
}
bool CatalogsItemValidationErrors::iNVALIDDOMAINIsSet() const
{
    return m_INVALID_DOMAINIsSet;
}
void CatalogsItemValidationErrors::unsetINVALID_DOMAIN()
{
    m_INVALID_DOMAINIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getITEMIDMISSING() const
{
    return m_ITEMID_MISSING;
}
void CatalogsItemValidationErrors::setITEMIDMISSING(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_ITEMID_MISSING = value;
    m_ITEMID_MISSINGIsSet = true;
}
bool CatalogsItemValidationErrors::iTEMIDMISSINGIsSet() const
{
    return m_ITEMID_MISSINGIsSet;
}
void CatalogsItemValidationErrors::unsetITEMID_MISSING()
{
    m_ITEMID_MISSINGIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getITEMMAINIMAGEDOWNLOADFAILURE() const
{
    return m_ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
}
void CatalogsItemValidationErrors::setITEMMAINIMAGEDOWNLOADFAILURE(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE = value;
    m_ITEM_MAIN_IMAGE_DOWNLOAD_FAILUREIsSet = true;
}
bool CatalogsItemValidationErrors::iTEMMAINIMAGEDOWNLOADFAILUREIsSet() const
{
    return m_ITEM_MAIN_IMAGE_DOWNLOAD_FAILUREIsSet;
}
void CatalogsItemValidationErrors::unsetITEM_MAIN_IMAGE_DOWNLOAD_FAILURE()
{
    m_ITEM_MAIN_IMAGE_DOWNLOAD_FAILUREIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getLINKFORMATINVALID() const
{
    return m_LINK_FORMAT_INVALID;
}
void CatalogsItemValidationErrors::setLINKFORMATINVALID(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_LINK_FORMAT_INVALID = value;
    m_LINK_FORMAT_INVALIDIsSet = true;
}
bool CatalogsItemValidationErrors::lINKFORMATINVALIDIsSet() const
{
    return m_LINK_FORMAT_INVALIDIsSet;
}
void CatalogsItemValidationErrors::unsetLINK_FORMAT_INVALID()
{
    m_LINK_FORMAT_INVALIDIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getLINKLENGTHTOOLONG() const
{
    return m_LINK_LENGTH_TOO_LONG;
}
void CatalogsItemValidationErrors::setLINKLENGTHTOOLONG(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_LINK_LENGTH_TOO_LONG = value;
    m_LINK_LENGTH_TOO_LONGIsSet = true;
}
bool CatalogsItemValidationErrors::lINKLENGTHTOOLONGIsSet() const
{
    return m_LINK_LENGTH_TOO_LONGIsSet;
}
void CatalogsItemValidationErrors::unsetLINK_LENGTH_TOO_LONG()
{
    m_LINK_LENGTH_TOO_LONGIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getLISTPRICEINVALID() const
{
    return m_LIST_PRICE_INVALID;
}
void CatalogsItemValidationErrors::setLISTPRICEINVALID(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_LIST_PRICE_INVALID = value;
    m_LIST_PRICE_INVALIDIsSet = true;
}
bool CatalogsItemValidationErrors::lISTPRICEINVALIDIsSet() const
{
    return m_LIST_PRICE_INVALIDIsSet;
}
void CatalogsItemValidationErrors::unsetLIST_PRICE_INVALID()
{
    m_LIST_PRICE_INVALIDIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getMAXITEMSPERITEMGROUPEXCEEDED() const
{
    return m_MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
}
void CatalogsItemValidationErrors::setMAXITEMSPERITEMGROUPEXCEEDED(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = value;
    m_MAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDIsSet = true;
}
bool CatalogsItemValidationErrors::mAXITEMSPERITEMGROUPEXCEEDEDIsSet() const
{
    return m_MAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDIsSet;
}
void CatalogsItemValidationErrors::unsetMAX_ITEMS_PER_ITEM_GROUP_EXCEEDED()
{
    m_MAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getPARSELINEERROR() const
{
    return m_PARSE_LINE_ERROR;
}
void CatalogsItemValidationErrors::setPARSELINEERROR(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_PARSE_LINE_ERROR = value;
    m_PARSE_LINE_ERRORIsSet = true;
}
bool CatalogsItemValidationErrors::pARSELINEERRORIsSet() const
{
    return m_PARSE_LINE_ERRORIsSet;
}
void CatalogsItemValidationErrors::unsetPARSE_LINE_ERROR()
{
    m_PARSE_LINE_ERRORIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getPINJOINCONTENTUNSAFE() const
{
    return m_PINJOIN_CONTENT_UNSAFE;
}
void CatalogsItemValidationErrors::setPINJOINCONTENTUNSAFE(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_PINJOIN_CONTENT_UNSAFE = value;
    m_PINJOIN_CONTENT_UNSAFEIsSet = true;
}
bool CatalogsItemValidationErrors::pINJOINCONTENTUNSAFEIsSet() const
{
    return m_PINJOIN_CONTENT_UNSAFEIsSet;
}
void CatalogsItemValidationErrors::unsetPINJOIN_CONTENT_UNSAFE()
{
    m_PINJOIN_CONTENT_UNSAFEIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getPRICECANNOTBEDETERMINED() const
{
    return m_PRICE_CANNOT_BE_DETERMINED;
}
void CatalogsItemValidationErrors::setPRICECANNOTBEDETERMINED(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_PRICE_CANNOT_BE_DETERMINED = value;
    m_PRICE_CANNOT_BE_DETERMINEDIsSet = true;
}
bool CatalogsItemValidationErrors::pRICECANNOTBEDETERMINEDIsSet() const
{
    return m_PRICE_CANNOT_BE_DETERMINEDIsSet;
}
void CatalogsItemValidationErrors::unsetPRICE_CANNOT_BE_DETERMINED()
{
    m_PRICE_CANNOT_BE_DETERMINEDIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getPRICEMISSING() const
{
    return m_PRICE_MISSING;
}
void CatalogsItemValidationErrors::setPRICEMISSING(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_PRICE_MISSING = value;
    m_PRICE_MISSINGIsSet = true;
}
bool CatalogsItemValidationErrors::pRICEMISSINGIsSet() const
{
    return m_PRICE_MISSINGIsSet;
}
void CatalogsItemValidationErrors::unsetPRICE_MISSING()
{
    m_PRICE_MISSINGIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getPRODUCTLINKMISSING() const
{
    return m_PRODUCT_LINK_MISSING;
}
void CatalogsItemValidationErrors::setPRODUCTLINKMISSING(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_PRODUCT_LINK_MISSING = value;
    m_PRODUCT_LINK_MISSINGIsSet = true;
}
bool CatalogsItemValidationErrors::pRODUCTLINKMISSINGIsSet() const
{
    return m_PRODUCT_LINK_MISSINGIsSet;
}
void CatalogsItemValidationErrors::unsetPRODUCT_LINK_MISSING()
{
    m_PRODUCT_LINK_MISSINGIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getPRODUCTPRICEINVALID() const
{
    return m_PRODUCT_PRICE_INVALID;
}
void CatalogsItemValidationErrors::setPRODUCTPRICEINVALID(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_PRODUCT_PRICE_INVALID = value;
    m_PRODUCT_PRICE_INVALIDIsSet = true;
}
bool CatalogsItemValidationErrors::pRODUCTPRICEINVALIDIsSet() const
{
    return m_PRODUCT_PRICE_INVALIDIsSet;
}
void CatalogsItemValidationErrors::unsetPRODUCT_PRICE_INVALID()
{
    m_PRODUCT_PRICE_INVALIDIsSet = false;
}
org::openapitools::server::model::CatalogsItemValidationDetails CatalogsItemValidationErrors::getTITLEMISSING() const
{
    return m_TITLE_MISSING;
}
void CatalogsItemValidationErrors::setTITLEMISSING(org::openapitools::server::model::CatalogsItemValidationDetails const& value)
{
    m_TITLE_MISSING = value;
    m_TITLE_MISSINGIsSet = true;
}
bool CatalogsItemValidationErrors::tITLEMISSINGIsSet() const
{
    return m_TITLE_MISSINGIsSet;
}
void CatalogsItemValidationErrors::unsetTITLE_MISSING()
{
    m_TITLE_MISSINGIsSet = false;
}


} // namespace org::openapitools::server::model

