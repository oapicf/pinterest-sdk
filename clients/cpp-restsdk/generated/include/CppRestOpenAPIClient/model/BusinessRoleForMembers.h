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
 * BusinessRoleForMembers.h
 *
 * The access level a member has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_BusinessRoleForMembers_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_BusinessRoleForMembers_H_


#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  BusinessRoleForMembers
    : public ModelBase
{
public:
    BusinessRoleForMembers();
    virtual ~BusinessRoleForMembers();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eBusinessRoleForMembers
    {
        BusinessRoleForMembers_EMPLOYEE,
        BusinessRoleForMembers_BIZ_ADMIN,
    };

    eBusinessRoleForMembers getValue() const;
    void setValue(eBusinessRoleForMembers const value);

    protected:
        eBusinessRoleForMembers m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_BusinessRoleForMembers_H_ */
