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
 * SSIOAccountItem.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_SSIOAccountItem_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_SSIOAccountItem_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/SSIOAccountAddress.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class SSIOAccountAddress;


/// <summary>
/// 
/// </summary>
class  SSIOAccountItem
    : public ModelBase
{
public:
    SSIOAccountItem();
    virtual ~SSIOAccountItem();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// SSIOAccountItem members

    /// <summary>
    /// Salesforce id for billto_info
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// Salesforce id for IO Terms and Conditions
    /// </summary>
    utility::string_t getIoTermsId() const;
    bool ioTermsIdIsSet() const;
    void unsetIo_terms_id();

    void setIoTermsId(const utility::string_t& value);

    /// <summary>
    /// Salesforce text for IO Terms and Conditions
    /// </summary>
    utility::string_t getIoTerms() const;
    bool ioTermsIsSet() const;
    void unsetIo_terms();

    void setIoTerms(const utility::string_t& value);

    /// <summary>
    /// Salesforce id for US Terms and Conditions
    /// </summary>
    utility::string_t getUsTermsId() const;
    bool usTermsIdIsSet() const;
    void unsetUs_terms_id();

    void setUsTermsId(const utility::string_t& value);

    /// <summary>
    /// Salesforce text for US Terms and Conditions
    /// </summary>
    utility::string_t getUsTerms() const;
    bool usTermsIsSet() const;
    void unsetUs_terms();

    void setUsTerms(const utility::string_t& value);

    /// <summary>
    /// Salesforce id for Rest of the World Terms and Conditions
    /// </summary>
    utility::string_t getRowTermsId() const;
    bool rowTermsIdIsSet() const;
    void unsetRow_terms_id();

    void setRowTermsId(const utility::string_t& value);

    /// <summary>
    /// Salesforce text for Rest of the World Terms and Conditions
    /// </summary>
    utility::string_t getRowTerms() const;
    bool rowTermsIsSet() const;
    void unsetRow_terms();

    void setRowTerms(const utility::string_t& value);

    /// <summary>
    /// Insertion Order Type - Pinterest Paper or Agency Paper
    /// </summary>
    utility::string_t getIoType() const;
    bool ioTypeIsSet() const;
    void unsetIo_type();

    void setIoType(const utility::string_t& value);

    /// <summary>
    /// Address information that is associated with this account.
    /// </summary>
    std::vector<std::shared_ptr<SSIOAccountAddress>>& getAddresses();
    bool addressesIsSet() const;
    void unsetAddresses();

    void setAddresses(const std::vector<std::shared_ptr<SSIOAccountAddress>>& value);


protected:
    utility::string_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Io_terms_id;
    bool m_Io_terms_idIsSet;
    utility::string_t m_Io_terms;
    bool m_Io_termsIsSet;
    utility::string_t m_Us_terms_id;
    bool m_Us_terms_idIsSet;
    utility::string_t m_Us_terms;
    bool m_Us_termsIsSet;
    utility::string_t m_Row_terms_id;
    bool m_Row_terms_idIsSet;
    utility::string_t m_Row_terms;
    bool m_Row_termsIsSet;
    utility::string_t m_Io_type;
    bool m_Io_typeIsSet;
    std::vector<std::shared_ptr<SSIOAccountAddress>> m_Addresses;
    bool m_AddressesIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_SSIOAccountItem_H_ */
