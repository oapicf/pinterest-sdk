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
/*
 * CatalogsFeedIngestionErrors.h
 *
 * 
 */

#ifndef CatalogsFeedIngestionErrors_H_
#define CatalogsFeedIngestionErrors_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  CatalogsFeedIngestionErrors
{
public:
    CatalogsFeedIngestionErrors();
    virtual ~CatalogsFeedIngestionErrors() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const CatalogsFeedIngestionErrors& rhs) const;
    bool operator!=(const CatalogsFeedIngestionErrors& rhs) const;

    /////////////////////////////////////////////
    /// CatalogsFeedIngestionErrors members

    /// <summary>
    /// We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
    /// </summary>
    int32_t getLINELEVELINTERNALERROR() const;
    void setLINELEVELINTERNALERROR(int32_t const value);
    bool lINELEVELINTERNALERRORIsSet() const;
    void unsetLINE_LEVEL_INTERNAL_ERROR();
    /// <summary>
    /// The product count has decreased by more than 99% compared to the last successful ingestion.
    /// </summary>
    int32_t getLARGEPRODUCTCOUNTDECREASE() const;
    void setLARGEPRODUCTCOUNTDECREASE(int32_t const value);
    bool lARGEPRODUCTCOUNTDECREASEIsSet() const;
    void unsetLARGE_PRODUCT_COUNT_DECREASE();
    /// <summary>
    /// We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
    /// </summary>
    int32_t getACCOUNTFLAGGED() const;
    void setACCOUNTFLAGGED(int32_t const value);
    bool aCCOUNTFLAGGEDIsSet() const;
    void unsetACCOUNT_FLAGGED();
    /// <summary>
    /// We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
    /// </summary>
    int32_t getIMAGELEVELINTERNALERROR() const;
    void setIMAGELEVELINTERNALERROR(int32_t const value);
    bool iMAGELEVELINTERNALERRORIsSet() const;
    void unsetIMAGE_LEVEL_INTERNAL_ERROR();
    /// <summary>
    /// Image files are unreadable. Please upload new files to continue.
    /// </summary>
    int32_t getIMAGEFILENOTACCESSIBLE() const;
    void setIMAGEFILENOTACCESSIBLE(int32_t const value);
    bool iMAGEFILENOTACCESSIBLEIsSet() const;
    void unsetIMAGE_FILE_NOT_ACCESSIBLE();
    /// <summary>
    /// Image files are unreadable. Please check your link and upload new files to continue.
    /// </summary>
    int32_t getIMAGEMALFORMEDURL() const;
    void setIMAGEMALFORMEDURL(int32_t const value);
    bool iMAGEMALFORMEDURLIsSet() const;
    void unsetIMAGE_MALFORMED_URL();
    /// <summary>
    /// Image files are unreadable. Please upload new files to continue.
    /// </summary>
    int32_t getIMAGEFILENOTFOUND() const;
    void setIMAGEFILENOTFOUND(int32_t const value);
    bool iMAGEFILENOTFOUNDIsSet() const;
    void unsetIMAGE_FILE_NOT_FOUND();
    /// <summary>
    /// Image files are unreadable. Please upload new files to continue.
    /// </summary>
    int32_t getIMAGEINVALIDFILE() const;
    void setIMAGEINVALIDFILE(int32_t const value);
    bool iMAGEINVALIDFILEIsSet() const;
    void unsetIMAGE_INVALID_FILE();

    friend  void to_json(nlohmann::json& j, const CatalogsFeedIngestionErrors& o);
    friend  void from_json(const nlohmann::json& j, CatalogsFeedIngestionErrors& o);
protected:
    int32_t m_LINE_LEVEL_INTERNAL_ERROR;
    bool m_LINE_LEVEL_INTERNAL_ERRORIsSet;
    int32_t m_LARGE_PRODUCT_COUNT_DECREASE;
    bool m_LARGE_PRODUCT_COUNT_DECREASEIsSet;
    int32_t m_ACCOUNT_FLAGGED;
    bool m_ACCOUNT_FLAGGEDIsSet;
    int32_t m_IMAGE_LEVEL_INTERNAL_ERROR;
    bool m_IMAGE_LEVEL_INTERNAL_ERRORIsSet;
    int32_t m_IMAGE_FILE_NOT_ACCESSIBLE;
    bool m_IMAGE_FILE_NOT_ACCESSIBLEIsSet;
    int32_t m_IMAGE_MALFORMED_URL;
    bool m_IMAGE_MALFORMED_URLIsSet;
    int32_t m_IMAGE_FILE_NOT_FOUND;
    bool m_IMAGE_FILE_NOT_FOUNDIsSet;
    int32_t m_IMAGE_INVALID_FILE;
    bool m_IMAGE_INVALID_FILEIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* CatalogsFeedIngestionErrors_H_ */
