/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * KeywordUpdate.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_KeywordUpdate_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_KeywordUpdate_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  KeywordUpdate
    : public ModelBase
{
public:
    KeywordUpdate();
    virtual ~KeywordUpdate();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// KeywordUpdate members

    /// <summary>
    /// Keyword ID.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// Is keyword archived?
    /// </summary>
    bool isArchived() const;
    bool archivedIsSet() const;
    void unsetArchived();

    void setArchived(bool value);

    /// <summary>
    /// Keyword custom bid in microcurrency - null if inherited from parent ad group.
    /// </summary>
    int32_t getBid() const;
    bool bidIsSet() const;
    void unsetBid();

    void setBid(int32_t value);


protected:
    utility::string_t m_Id;
    bool m_IdIsSet;
    bool m_Archived;
    bool m_ArchivedIsSet;
    int32_t m_Bid;
    bool m_BidIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_KeywordUpdate_H_ */