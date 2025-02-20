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
 * OAIPinMediaMetadata.h
 *
 * 
 */

#ifndef OAIPinMediaMetadata_H
#define OAIPinMediaMetadata_H

#include <QJsonObject>

#include "OAIImageMetadata.h"
#include "OAIImageMetadata_images.h"
#include "OAIVideoMetadata.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIImageMetadata_images;

class OAIPinMediaMetadata : public OAIObject {
public:
    OAIPinMediaMetadata();
    OAIPinMediaMetadata(QString json);
    ~OAIPinMediaMetadata() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getItemType() const;
    void setItemType(const QString &item_type);
    bool is_item_type_Set() const;
    bool is_item_type_Valid() const;

    QString getTitle() const;
    void setTitle(const QString &title);
    bool is_title_Set() const;
    bool is_title_Valid() const;

    QString getDescription() const;
    void setDescription(const QString &description);
    bool is_description_Set() const;
    bool is_description_Valid() const;

    QString getLink() const;
    void setLink(const QString &link);
    bool is_link_Set() const;
    bool is_link_Valid() const;

    OAIImageMetadata_images getImages() const;
    void setImages(const OAIImageMetadata_images &images);
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

    QString m_item_type;
    bool m_item_type_isSet;
    bool m_item_type_isValid;

    QString m_title;
    bool m_title_isSet;
    bool m_title_isValid;

    QString m_description;
    bool m_description_isSet;
    bool m_description_isValid;

    QString m_link;
    bool m_link_isSet;
    bool m_link_isValid;

    OAIImageMetadata_images m_images;
    bool m_images_isSet;
    bool m_images_isValid;

    QString m_cover_image_url;
    bool m_cover_image_url_isSet;
    bool m_cover_image_url_isValid;

    QString m_video_url;
    bool m_video_url_isSet;
    bool m_video_url_isValid;

    double m_duration;
    bool m_duration_isSet;
    bool m_duration_isValid;

    qint32 m_height;
    bool m_height_isSet;
    bool m_height_isValid;

    qint32 m_width;
    bool m_width_isSet;
    bool m_width_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIPinMediaMetadata)

#endif // OAIPinMediaMetadata_H
