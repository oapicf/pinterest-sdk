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
 * OAIQuizPinResult.h
 *
 * The result, and link out, based on the user’s choice.
 */

#ifndef OAIQuizPinResult_H
#define OAIQuizPinResult_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIQuizPinResult : public OAIObject {
public:
    OAIQuizPinResult();
    OAIQuizPinResult(QString json);
    ~OAIQuizPinResult() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getOrganicPinId() const;
    void setOrganicPinId(const QString &organic_pin_id);
    bool is_organic_pin_id_Set() const;
    bool is_organic_pin_id_Valid() const;

    QString getAndroidDeepLink() const;
    void setAndroidDeepLink(const QString &android_deep_link);
    bool is_android_deep_link_Set() const;
    bool is_android_deep_link_Valid() const;

    QString getIosDeepLink() const;
    void setIosDeepLink(const QString &ios_deep_link);
    bool is_ios_deep_link_Set() const;
    bool is_ios_deep_link_Valid() const;

    QString getDestinationUrl() const;
    void setDestinationUrl(const QString &destination_url);
    bool is_destination_url_Set() const;
    bool is_destination_url_Valid() const;

    double getResultId() const;
    void setResultId(const double &result_id);
    bool is_result_id_Set() const;
    bool is_result_id_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString organic_pin_id;
    bool m_organic_pin_id_isSet;
    bool m_organic_pin_id_isValid;

    QString android_deep_link;
    bool m_android_deep_link_isSet;
    bool m_android_deep_link_isValid;

    QString ios_deep_link;
    bool m_ios_deep_link_isSet;
    bool m_ios_deep_link_isValid;

    QString destination_url;
    bool m_destination_url_isSet;
    bool m_destination_url_isValid;

    double result_id;
    bool m_result_id_isSet;
    bool m_result_id_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIQuizPinResult)

#endif // OAIQuizPinResult_H
