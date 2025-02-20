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
 * OAIAdPreviewURLResponse.h
 *
 * 
 */

#ifndef OAIAdPreviewURLResponse_H
#define OAIAdPreviewURLResponse_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIAdPreviewURLResponse : public OAIObject {
public:
    OAIAdPreviewURLResponse();
    OAIAdPreviewURLResponse(QString json);
    ~OAIAdPreviewURLResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getUrl() const;
    void setUrl(const QString &url);
    bool is_url_Set() const;
    bool is_url_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString url;
    bool m_url_isSet;
    bool m_url_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIAdPreviewURLResponse)

#endif // OAIAdPreviewURLResponse_H
