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
 * OAIKeywordMetricsResponse.h
 *
 * 
 */

#ifndef OAIKeywordMetricsResponse_H
#define OAIKeywordMetricsResponse_H

#include <QJsonObject>

#include "OAIKeywordMetrics.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIKeywordMetricsResponse : public OAIObject {
public:
    OAIKeywordMetricsResponse();
    OAIKeywordMetricsResponse(QString json);
    ~OAIKeywordMetricsResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getKeyword() const;
    void setKeyword(const QString &keyword);
    bool is_keyword_Set() const;
    bool is_keyword_Valid() const;

    OAIKeywordMetrics getMetrics() const;
    void setMetrics(const OAIKeywordMetrics &metrics);
    bool is_metrics_Set() const;
    bool is_metrics_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString keyword;
    bool m_keyword_isSet;
    bool m_keyword_isValid;

    OAIKeywordMetrics metrics;
    bool m_metrics_isSet;
    bool m_metrics_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIKeywordMetricsResponse)

#endif // OAIKeywordMetricsResponse_H
