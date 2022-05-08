/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * BoardOwner.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_BoardOwner_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_BoardOwner_H_


#include "ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  BoardOwner
    : public ModelBase
{
public:
    BoardOwner();
    virtual ~BoardOwner();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// BoardOwner members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getUsername() const;
    bool usernameIsSet() const;
    void unsetUsername();

    void setUsername(const utility::string_t& value);


protected:
    utility::string_t m_Username;
    bool m_UsernameIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_BoardOwner_H_ */