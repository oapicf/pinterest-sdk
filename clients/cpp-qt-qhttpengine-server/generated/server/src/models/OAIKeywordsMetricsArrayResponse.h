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
 * OAIKeywordsMetricsArrayResponse.h
 *
 * 
 */

#ifndef OAIKeywordsMetricsArrayResponse_H
#define OAIKeywordsMetricsArrayResponse_H

#include <QJsonObject>

#include "OAIKeywordMetricsResponse.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIKeywordsMetricsArrayResponse : public OAIObject {
public:
    OAIKeywordsMetricsArrayResponse();
    OAIKeywordsMetricsArrayResponse(QString json);
    ~OAIKeywordsMetricsArrayResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAIKeywordMetricsResponse> getData() const;
    void setData(const QList<OAIKeywordMetricsResponse> &data);
    bool is_data_Set() const;
    bool is_data_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAIKeywordMetricsResponse> data;
    bool m_data_isSet;
    bool m_data_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIKeywordsMetricsArrayResponse)

#endif // OAIKeywordsMetricsArrayResponse_H
