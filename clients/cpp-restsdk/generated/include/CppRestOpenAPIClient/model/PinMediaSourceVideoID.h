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
 * PinMediaSourceVideoID.h
 *
 * Video ID-based media source
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_PinMediaSourceVideoID_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_PinMediaSourceVideoID_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// Video ID-based media source
/// </summary>
class  PinMediaSourceVideoID
    : public ModelBase
{
public:
    PinMediaSourceVideoID();
    virtual ~PinMediaSourceVideoID();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// PinMediaSourceVideoID members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getSourceType() const;
    bool sourceTypeIsSet() const;
    void unsetSource_type();

    void setSourceType(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getCoverImageUrl() const;
    bool coverImageUrlIsSet() const;
    void unsetCover_image_url();

    void setCoverImageUrl(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getMediaId() const;
    bool mediaIdIsSet() const;
    void unsetMedia_id();

    void setMediaId(const utility::string_t& value);


protected:
    utility::string_t m_Source_type;
    bool m_Source_typeIsSet;
    utility::string_t m_Cover_image_url;
    bool m_Cover_image_urlIsSet;
    utility::string_t m_Media_id;
    bool m_Media_idIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_PinMediaSourceVideoID_H_ */