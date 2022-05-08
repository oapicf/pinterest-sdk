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
 * PinMediaWithImage_allOf.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_PinMediaWithImage_allOf_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_PinMediaWithImage_allOf_H_


#include "ModelBase.h"

#include "model/ImageDetails.h"
#include <map>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  PinMediaWithImage_allOf
    : public ModelBase
{
public:
    PinMediaWithImage_allOf();
    virtual ~PinMediaWithImage_allOf();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// PinMediaWithImage_allOf members

    /// <summary>
    /// 
    /// </summary>
    std::map<utility::string_t, std::shared_ptr<ImageDetails>>& getImages();
    bool imagesIsSet() const;
    void unsetImages();

    void setImages(const std::map<utility::string_t, std::shared_ptr<ImageDetails>>& value);


protected:
    std::map<utility::string_t, std::shared_ptr<ImageDetails>> m_Images;
    bool m_ImagesIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_PinMediaWithImage_allOf_H_ */