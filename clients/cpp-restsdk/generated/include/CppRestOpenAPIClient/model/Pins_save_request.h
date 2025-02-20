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
 * Pins_save_request.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Pins_save_request_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Pins_save_request_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// 
/// </summary>
class  Pins_save_request
    : public ModelBase
{
public:
    Pins_save_request();
    virtual ~Pins_save_request();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Pins_save_request members

    /// <summary>
    /// Unique identifier of the board to which the pin will be saved.
    /// </summary>
    utility::string_t getBoardId() const;
    bool boardIdIsSet() const;
    void unsetBoard_id();

    void setBoardId(const utility::string_t& value);

    /// <summary>
    /// Unique identifier of the board section to which the pin will be saved.
    /// </summary>
    utility::string_t getBoardSectionId() const;
    bool boardSectionIdIsSet() const;
    void unsetBoard_section_id();

    void setBoardSectionId(const utility::string_t& value);


protected:
    utility::string_t m_Board_id;
    bool m_Board_idIsSet;
    utility::string_t m_Board_section_id;
    bool m_Board_section_idIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Pins_save_request_H_ */
