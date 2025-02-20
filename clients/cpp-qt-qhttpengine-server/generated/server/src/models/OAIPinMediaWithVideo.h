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
 * OAIPinMediaWithVideo.h
 *
 * Pin with video.
 */

#ifndef OAIPinMediaWithVideo_H
#define OAIPinMediaWithVideo_H

#include <QJsonObject>

#include "OAIPinMedia.h"
#include "OAIPinMediaWithImage_allOf_images.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIPinMediaWithVideo : public OAIObject {
public:
    OAIPinMediaWithVideo();
    OAIPinMediaWithVideo(QString json);
    ~OAIPinMediaWithVideo() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getMediaType() const;
    void setMediaType(const QString &media_type);
    bool is_media_type_Set() const;
    bool is_media_type_Valid() const;

    OAIPinMediaWithImage_allOf_images getImages() const;
    void setImages(const OAIPinMediaWithImage_allOf_images &images);
    bool is_images_Set() const;
    bool is_images_Valid() const;

    QString getCoverImageUrl() const;
    void setCoverImageUrl(const QString &cover_image_url);
    bool is_cover_image_url_Set() const;
    bool is_cover_image_url_Valid() const;

    QString getVideoUrl() const;
    void setVideoUrl(const QString &video_url);
    bool is_video_url_Set() const;
    bool is_video_url_Valid() const;

    double getDuration() const;
    void setDuration(const double &duration);
    bool is_duration_Set() const;
    bool is_duration_Valid() const;

    qint32 getHeight() const;
    void setHeight(const qint32 &height);
    bool is_height_Set() const;
    bool is_height_Valid() const;

    qint32 getWidth() const;
    void setWidth(const qint32 &width);
    bool is_width_Set() const;
    bool is_width_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString media_type;
    bool m_media_type_isSet;
    bool m_media_type_isValid;

    OAIPinMediaWithImage_allOf_images images;
    bool m_images_isSet;
    bool m_images_isValid;

    QString cover_image_url;
    bool m_cover_image_url_isSet;
    bool m_cover_image_url_isValid;

    QString video_url;
    bool m_video_url_isSet;
    bool m_video_url_isValid;

    double duration;
    bool m_duration_isSet;
    bool m_duration_isValid;

    qint32 height;
    bool m_height_isSet;
    bool m_height_isValid;

    qint32 width;
    bool m_width_isSet;
    bool m_width_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIPinMediaWithVideo)

#endif // OAIPinMediaWithVideo_H
