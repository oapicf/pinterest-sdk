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
 * OAILinkedBusiness.h
 *
 * 
 */

#ifndef OAILinkedBusiness_H
#define OAILinkedBusiness_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAILinkedBusiness : public OAIObject {
public:
    OAILinkedBusiness();
    OAILinkedBusiness(QString json);
    ~OAILinkedBusiness() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getUsername() const;
    void setUsername(const QString &username);
    bool is_username_Set() const;
    bool is_username_Valid() const;

    QString getImageSmallUrl() const;
    void setImageSmallUrl(const QString &image_small_url);
    bool is_image_small_url_Set() const;
    bool is_image_small_url_Valid() const;

    QString getImageMediumUrl() const;
    void setImageMediumUrl(const QString &image_medium_url);
    bool is_image_medium_url_Set() const;
    bool is_image_medium_url_Valid() const;

    QString getImageLargeUrl() const;
    void setImageLargeUrl(const QString &image_large_url);
    bool is_image_large_url_Set() const;
    bool is_image_large_url_Valid() const;

    QString getImageXlargeUrl() const;
    void setImageXlargeUrl(const QString &image_xlarge_url);
    bool is_image_xlarge_url_Set() const;
    bool is_image_xlarge_url_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString username;
    bool m_username_isSet;
    bool m_username_isValid;

    QString image_small_url;
    bool m_image_small_url_isSet;
    bool m_image_small_url_isValid;

    QString image_medium_url;
    bool m_image_medium_url_isSet;
    bool m_image_medium_url_isValid;

    QString image_large_url;
    bool m_image_large_url_isSet;
    bool m_image_large_url_isValid;

    QString image_xlarge_url;
    bool m_image_xlarge_url_isSet;
    bool m_image_xlarge_url_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAILinkedBusiness)

#endif // OAILinkedBusiness_H
