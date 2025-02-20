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
 * Board_media.h
 *
 * Board media.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Board_media_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Board_media_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Board media.
/// </summary>
class  Board_media
    : public ModelBase
{
public:
    Board_media();
    virtual ~Board_media();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Board_media members

    /// <summary>
    /// Board cover image.
    /// </summary>
    utility::string_t getImageCoverUrl() const;
    bool imageCoverUrlIsSet() const;
    void unsetImage_cover_url();

    void setImageCoverUrl(const utility::string_t& value);

    /// <summary>
    /// Board pin thumbnail urls.
    /// </summary>
    std::vector<utility::string_t>& getPinThumbnailUrls();
    bool pinThumbnailUrlsIsSet() const;
    void unsetPin_thumbnail_urls();

    void setPinThumbnailUrls(const std::vector<utility::string_t>& value);


protected:
    utility::string_t m_Image_cover_url;
    bool m_Image_cover_urlIsSet;
    std::vector<utility::string_t> m_Pin_thumbnail_urls;
    bool m_Pin_thumbnail_urlsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Board_media_H_ */
