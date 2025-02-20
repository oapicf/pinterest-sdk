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



#include "CppRestOpenAPIClient/model/CatalogsFeedIngestionErrors.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CatalogsFeedIngestionErrors::CatalogsFeedIngestionErrors()
{
    m_LINE_LEVEL_INTERNAL_ERROR = 0;
    m_LINE_LEVEL_INTERNAL_ERRORIsSet = false;
    m_LARGE_PRODUCT_COUNT_DECREASE = 0;
    m_LARGE_PRODUCT_COUNT_DECREASEIsSet = false;
    m_ACCOUNT_FLAGGED = 0;
    m_ACCOUNT_FLAGGEDIsSet = false;
    m_IMAGE_LEVEL_INTERNAL_ERROR = 0;
    m_IMAGE_LEVEL_INTERNAL_ERRORIsSet = false;
    m_IMAGE_FILE_NOT_ACCESSIBLE = 0;
    m_IMAGE_FILE_NOT_ACCESSIBLEIsSet = false;
    m_IMAGE_MALFORMED_URL = 0;
    m_IMAGE_MALFORMED_URLIsSet = false;
    m_IMAGE_FILE_NOT_FOUND = 0;
    m_IMAGE_FILE_NOT_FOUNDIsSet = false;
    m_IMAGE_INVALID_FILE = 0;
    m_IMAGE_INVALID_FILEIsSet = false;
}

CatalogsFeedIngestionErrors::~CatalogsFeedIngestionErrors()
{
}

void CatalogsFeedIngestionErrors::validate()
{
    // TODO: implement validation
}

web::json::value CatalogsFeedIngestionErrors::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_LINE_LEVEL_INTERNAL_ERRORIsSet)
    {
        val[utility::conversions::to_string_t(U("LINE_LEVEL_INTERNAL_ERROR"))] = ModelBase::toJson(m_LINE_LEVEL_INTERNAL_ERROR);
    }
    if(m_LARGE_PRODUCT_COUNT_DECREASEIsSet)
    {
        val[utility::conversions::to_string_t(U("LARGE_PRODUCT_COUNT_DECREASE"))] = ModelBase::toJson(m_LARGE_PRODUCT_COUNT_DECREASE);
    }
    if(m_ACCOUNT_FLAGGEDIsSet)
    {
        val[utility::conversions::to_string_t(U("ACCOUNT_FLAGGED"))] = ModelBase::toJson(m_ACCOUNT_FLAGGED);
    }
    if(m_IMAGE_LEVEL_INTERNAL_ERRORIsSet)
    {
        val[utility::conversions::to_string_t(U("IMAGE_LEVEL_INTERNAL_ERROR"))] = ModelBase::toJson(m_IMAGE_LEVEL_INTERNAL_ERROR);
    }
    if(m_IMAGE_FILE_NOT_ACCESSIBLEIsSet)
    {
        val[utility::conversions::to_string_t(U("IMAGE_FILE_NOT_ACCESSIBLE"))] = ModelBase::toJson(m_IMAGE_FILE_NOT_ACCESSIBLE);
    }
    if(m_IMAGE_MALFORMED_URLIsSet)
    {
        val[utility::conversions::to_string_t(U("IMAGE_MALFORMED_URL"))] = ModelBase::toJson(m_IMAGE_MALFORMED_URL);
    }
    if(m_IMAGE_FILE_NOT_FOUNDIsSet)
    {
        val[utility::conversions::to_string_t(U("IMAGE_FILE_NOT_FOUND"))] = ModelBase::toJson(m_IMAGE_FILE_NOT_FOUND);
    }
    if(m_IMAGE_INVALID_FILEIsSet)
    {
        val[utility::conversions::to_string_t(U("IMAGE_INVALID_FILE"))] = ModelBase::toJson(m_IMAGE_INVALID_FILE);
    }

    return val;
}

bool CatalogsFeedIngestionErrors::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("LINE_LEVEL_INTERNAL_ERROR"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("LINE_LEVEL_INTERNAL_ERROR")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setLINELEVELINTERNALERROR;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLINELEVELINTERNALERROR);
            setLINELEVELINTERNALERROR(refVal_setLINELEVELINTERNALERROR);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("LARGE_PRODUCT_COUNT_DECREASE"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("LARGE_PRODUCT_COUNT_DECREASE")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setLARGEPRODUCTCOUNTDECREASE;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLARGEPRODUCTCOUNTDECREASE);
            setLARGEPRODUCTCOUNTDECREASE(refVal_setLARGEPRODUCTCOUNTDECREASE);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("ACCOUNT_FLAGGED"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("ACCOUNT_FLAGGED")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setACCOUNTFLAGGED;
            ok &= ModelBase::fromJson(fieldValue, refVal_setACCOUNTFLAGGED);
            setACCOUNTFLAGGED(refVal_setACCOUNTFLAGGED);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("IMAGE_LEVEL_INTERNAL_ERROR"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("IMAGE_LEVEL_INTERNAL_ERROR")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setIMAGELEVELINTERNALERROR;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIMAGELEVELINTERNALERROR);
            setIMAGELEVELINTERNALERROR(refVal_setIMAGELEVELINTERNALERROR);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("IMAGE_FILE_NOT_ACCESSIBLE"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("IMAGE_FILE_NOT_ACCESSIBLE")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setIMAGEFILENOTACCESSIBLE;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIMAGEFILENOTACCESSIBLE);
            setIMAGEFILENOTACCESSIBLE(refVal_setIMAGEFILENOTACCESSIBLE);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("IMAGE_MALFORMED_URL"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("IMAGE_MALFORMED_URL")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setIMAGEMALFORMEDURL;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIMAGEMALFORMEDURL);
            setIMAGEMALFORMEDURL(refVal_setIMAGEMALFORMEDURL);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("IMAGE_FILE_NOT_FOUND"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("IMAGE_FILE_NOT_FOUND")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setIMAGEFILENOTFOUND;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIMAGEFILENOTFOUND);
            setIMAGEFILENOTFOUND(refVal_setIMAGEFILENOTFOUND);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("IMAGE_INVALID_FILE"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("IMAGE_INVALID_FILE")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setIMAGEINVALIDFILE;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIMAGEINVALIDFILE);
            setIMAGEINVALIDFILE(refVal_setIMAGEINVALIDFILE);
        }
    }
    return ok;
}

void CatalogsFeedIngestionErrors::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_LINE_LEVEL_INTERNAL_ERRORIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("LINE_LEVEL_INTERNAL_ERROR")), m_LINE_LEVEL_INTERNAL_ERROR));
    }
    if(m_LARGE_PRODUCT_COUNT_DECREASEIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("LARGE_PRODUCT_COUNT_DECREASE")), m_LARGE_PRODUCT_COUNT_DECREASE));
    }
    if(m_ACCOUNT_FLAGGEDIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("ACCOUNT_FLAGGED")), m_ACCOUNT_FLAGGED));
    }
    if(m_IMAGE_LEVEL_INTERNAL_ERRORIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("IMAGE_LEVEL_INTERNAL_ERROR")), m_IMAGE_LEVEL_INTERNAL_ERROR));
    }
    if(m_IMAGE_FILE_NOT_ACCESSIBLEIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("IMAGE_FILE_NOT_ACCESSIBLE")), m_IMAGE_FILE_NOT_ACCESSIBLE));
    }
    if(m_IMAGE_MALFORMED_URLIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("IMAGE_MALFORMED_URL")), m_IMAGE_MALFORMED_URL));
    }
    if(m_IMAGE_FILE_NOT_FOUNDIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("IMAGE_FILE_NOT_FOUND")), m_IMAGE_FILE_NOT_FOUND));
    }
    if(m_IMAGE_INVALID_FILEIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("IMAGE_INVALID_FILE")), m_IMAGE_INVALID_FILE));
    }
}

bool CatalogsFeedIngestionErrors::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("LINE_LEVEL_INTERNAL_ERROR"))))
    {
        int32_t refVal_setLINELEVELINTERNALERROR;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("LINE_LEVEL_INTERNAL_ERROR"))), refVal_setLINELEVELINTERNALERROR );
        setLINELEVELINTERNALERROR(refVal_setLINELEVELINTERNALERROR);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("LARGE_PRODUCT_COUNT_DECREASE"))))
    {
        int32_t refVal_setLARGEPRODUCTCOUNTDECREASE;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("LARGE_PRODUCT_COUNT_DECREASE"))), refVal_setLARGEPRODUCTCOUNTDECREASE );
        setLARGEPRODUCTCOUNTDECREASE(refVal_setLARGEPRODUCTCOUNTDECREASE);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("ACCOUNT_FLAGGED"))))
    {
        int32_t refVal_setACCOUNTFLAGGED;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("ACCOUNT_FLAGGED"))), refVal_setACCOUNTFLAGGED );
        setACCOUNTFLAGGED(refVal_setACCOUNTFLAGGED);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("IMAGE_LEVEL_INTERNAL_ERROR"))))
    {
        int32_t refVal_setIMAGELEVELINTERNALERROR;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("IMAGE_LEVEL_INTERNAL_ERROR"))), refVal_setIMAGELEVELINTERNALERROR );
        setIMAGELEVELINTERNALERROR(refVal_setIMAGELEVELINTERNALERROR);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("IMAGE_FILE_NOT_ACCESSIBLE"))))
    {
        int32_t refVal_setIMAGEFILENOTACCESSIBLE;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("IMAGE_FILE_NOT_ACCESSIBLE"))), refVal_setIMAGEFILENOTACCESSIBLE );
        setIMAGEFILENOTACCESSIBLE(refVal_setIMAGEFILENOTACCESSIBLE);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("IMAGE_MALFORMED_URL"))))
    {
        int32_t refVal_setIMAGEMALFORMEDURL;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("IMAGE_MALFORMED_URL"))), refVal_setIMAGEMALFORMEDURL );
        setIMAGEMALFORMEDURL(refVal_setIMAGEMALFORMEDURL);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("IMAGE_FILE_NOT_FOUND"))))
    {
        int32_t refVal_setIMAGEFILENOTFOUND;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("IMAGE_FILE_NOT_FOUND"))), refVal_setIMAGEFILENOTFOUND );
        setIMAGEFILENOTFOUND(refVal_setIMAGEFILENOTFOUND);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("IMAGE_INVALID_FILE"))))
    {
        int32_t refVal_setIMAGEINVALIDFILE;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("IMAGE_INVALID_FILE"))), refVal_setIMAGEINVALIDFILE );
        setIMAGEINVALIDFILE(refVal_setIMAGEINVALIDFILE);
    }
    return ok;
}

int32_t CatalogsFeedIngestionErrors::getLINELEVELINTERNALERROR() const
{
    return m_LINE_LEVEL_INTERNAL_ERROR;
}

void CatalogsFeedIngestionErrors::setLINELEVELINTERNALERROR(int32_t value)
{
    m_LINE_LEVEL_INTERNAL_ERROR = value;
    m_LINE_LEVEL_INTERNAL_ERRORIsSet = true;
}

bool CatalogsFeedIngestionErrors::lINELEVELINTERNALERRORIsSet() const
{
    return m_LINE_LEVEL_INTERNAL_ERRORIsSet;
}

void CatalogsFeedIngestionErrors::unsetLINE_LEVEL_INTERNAL_ERROR()
{
    m_LINE_LEVEL_INTERNAL_ERRORIsSet = false;
}
int32_t CatalogsFeedIngestionErrors::getLARGEPRODUCTCOUNTDECREASE() const
{
    return m_LARGE_PRODUCT_COUNT_DECREASE;
}

void CatalogsFeedIngestionErrors::setLARGEPRODUCTCOUNTDECREASE(int32_t value)
{
    m_LARGE_PRODUCT_COUNT_DECREASE = value;
    m_LARGE_PRODUCT_COUNT_DECREASEIsSet = true;
}

bool CatalogsFeedIngestionErrors::lARGEPRODUCTCOUNTDECREASEIsSet() const
{
    return m_LARGE_PRODUCT_COUNT_DECREASEIsSet;
}

void CatalogsFeedIngestionErrors::unsetLARGE_PRODUCT_COUNT_DECREASE()
{
    m_LARGE_PRODUCT_COUNT_DECREASEIsSet = false;
}
int32_t CatalogsFeedIngestionErrors::getACCOUNTFLAGGED() const
{
    return m_ACCOUNT_FLAGGED;
}

void CatalogsFeedIngestionErrors::setACCOUNTFLAGGED(int32_t value)
{
    m_ACCOUNT_FLAGGED = value;
    m_ACCOUNT_FLAGGEDIsSet = true;
}

bool CatalogsFeedIngestionErrors::aCCOUNTFLAGGEDIsSet() const
{
    return m_ACCOUNT_FLAGGEDIsSet;
}

void CatalogsFeedIngestionErrors::unsetACCOUNT_FLAGGED()
{
    m_ACCOUNT_FLAGGEDIsSet = false;
}
int32_t CatalogsFeedIngestionErrors::getIMAGELEVELINTERNALERROR() const
{
    return m_IMAGE_LEVEL_INTERNAL_ERROR;
}

void CatalogsFeedIngestionErrors::setIMAGELEVELINTERNALERROR(int32_t value)
{
    m_IMAGE_LEVEL_INTERNAL_ERROR = value;
    m_IMAGE_LEVEL_INTERNAL_ERRORIsSet = true;
}

bool CatalogsFeedIngestionErrors::iMAGELEVELINTERNALERRORIsSet() const
{
    return m_IMAGE_LEVEL_INTERNAL_ERRORIsSet;
}

void CatalogsFeedIngestionErrors::unsetIMAGE_LEVEL_INTERNAL_ERROR()
{
    m_IMAGE_LEVEL_INTERNAL_ERRORIsSet = false;
}
int32_t CatalogsFeedIngestionErrors::getIMAGEFILENOTACCESSIBLE() const
{
    return m_IMAGE_FILE_NOT_ACCESSIBLE;
}

void CatalogsFeedIngestionErrors::setIMAGEFILENOTACCESSIBLE(int32_t value)
{
    m_IMAGE_FILE_NOT_ACCESSIBLE = value;
    m_IMAGE_FILE_NOT_ACCESSIBLEIsSet = true;
}

bool CatalogsFeedIngestionErrors::iMAGEFILENOTACCESSIBLEIsSet() const
{
    return m_IMAGE_FILE_NOT_ACCESSIBLEIsSet;
}

void CatalogsFeedIngestionErrors::unsetIMAGE_FILE_NOT_ACCESSIBLE()
{
    m_IMAGE_FILE_NOT_ACCESSIBLEIsSet = false;
}
int32_t CatalogsFeedIngestionErrors::getIMAGEMALFORMEDURL() const
{
    return m_IMAGE_MALFORMED_URL;
}

void CatalogsFeedIngestionErrors::setIMAGEMALFORMEDURL(int32_t value)
{
    m_IMAGE_MALFORMED_URL = value;
    m_IMAGE_MALFORMED_URLIsSet = true;
}

bool CatalogsFeedIngestionErrors::iMAGEMALFORMEDURLIsSet() const
{
    return m_IMAGE_MALFORMED_URLIsSet;
}

void CatalogsFeedIngestionErrors::unsetIMAGE_MALFORMED_URL()
{
    m_IMAGE_MALFORMED_URLIsSet = false;
}
int32_t CatalogsFeedIngestionErrors::getIMAGEFILENOTFOUND() const
{
    return m_IMAGE_FILE_NOT_FOUND;
}

void CatalogsFeedIngestionErrors::setIMAGEFILENOTFOUND(int32_t value)
{
    m_IMAGE_FILE_NOT_FOUND = value;
    m_IMAGE_FILE_NOT_FOUNDIsSet = true;
}

bool CatalogsFeedIngestionErrors::iMAGEFILENOTFOUNDIsSet() const
{
    return m_IMAGE_FILE_NOT_FOUNDIsSet;
}

void CatalogsFeedIngestionErrors::unsetIMAGE_FILE_NOT_FOUND()
{
    m_IMAGE_FILE_NOT_FOUNDIsSet = false;
}
int32_t CatalogsFeedIngestionErrors::getIMAGEINVALIDFILE() const
{
    return m_IMAGE_INVALID_FILE;
}

void CatalogsFeedIngestionErrors::setIMAGEINVALIDFILE(int32_t value)
{
    m_IMAGE_INVALID_FILE = value;
    m_IMAGE_INVALID_FILEIsSet = true;
}

bool CatalogsFeedIngestionErrors::iMAGEINVALIDFILEIsSet() const
{
    return m_IMAGE_INVALID_FILEIsSet;
}

void CatalogsFeedIngestionErrors::unsetIMAGE_INVALID_FILE()
{
    m_IMAGE_INVALID_FILEIsSet = false;
}
}
}
}
}


