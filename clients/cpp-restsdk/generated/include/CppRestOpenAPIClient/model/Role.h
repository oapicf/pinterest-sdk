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
 * Role.h
 *
 * An internal role type used on business access, EMPLOYEE, ADMIN.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Role_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Role_H_


#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  Role
    : public ModelBase
{
public:
    Role();
    virtual ~Role();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eRole
    {
        Role_UNKNOWN,
        Role_OWNER,
        Role_ADMIN,
        Role_ANALYST,
        Role_SOS_READER,
        Role_FINANCE_MANAGER,
        Role_AUDIENCE_MANAGER,
        Role_CAMPAIGN_MANAGER,
        Role_CATALOGS_MANAGER,
        Role_RESTRICTED_OWNER,
        Role_PROFILE_MANAGER,
        Role_PROFILE_PUBLISHER,
        Role_RESOURCE_PINNER_LIST_OWNER,
        Role_RESOURCE_PINNER_LIST_READER,
        Role_BIZ_PINNER_LIST_SHARER,
        Role_RESOURCE_CONVERSION_TAGS_READER,
    };

    eRole getValue() const;
    void setValue(eRole const value);

    protected:
        eRole m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Role_H_ */
