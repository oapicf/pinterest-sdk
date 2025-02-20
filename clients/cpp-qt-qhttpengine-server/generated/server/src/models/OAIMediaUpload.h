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
 * OAIMediaUpload.h
 *
 * Media upload that has been registered but not uploaded/processed yet.
 */

#ifndef OAIMediaUpload_H
#define OAIMediaUpload_H

#include <QJsonObject>

#include "OAIMediaUploadType.h"
#include "OAIMediaUpload_allOf_upload_parameters.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIMediaUpload : public OAIObject {
public:
    OAIMediaUpload();
    OAIMediaUpload(QString json);
    ~OAIMediaUpload() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getMediaId() const;
    void setMediaId(const QString &media_id);
    bool is_media_id_Set() const;
    bool is_media_id_Valid() const;

    OAIMediaUploadType getMediaType() const;
    void setMediaType(const OAIMediaUploadType &media_type);
    bool is_media_type_Set() const;
    bool is_media_type_Valid() const;

    QString getUploadUrl() const;
    void setUploadUrl(const QString &upload_url);
    bool is_upload_url_Set() const;
    bool is_upload_url_Valid() const;

    OAIMediaUpload_allOf_upload_parameters getUploadParameters() const;
    void setUploadParameters(const OAIMediaUpload_allOf_upload_parameters &upload_parameters);
    bool is_upload_parameters_Set() const;
    bool is_upload_parameters_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString media_id;
    bool m_media_id_isSet;
    bool m_media_id_isValid;

    OAIMediaUploadType media_type;
    bool m_media_type_isSet;
    bool m_media_type_isValid;

    QString upload_url;
    bool m_upload_url_isSet;
    bool m_upload_url_isValid;

    OAIMediaUpload_allOf_upload_parameters upload_parameters;
    bool m_upload_parameters_isSet;
    bool m_upload_parameters_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIMediaUpload)

#endif // OAIMediaUpload_H
