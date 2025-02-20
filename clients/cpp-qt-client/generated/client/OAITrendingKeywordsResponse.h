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
 * OAITrendingKeywordsResponse.h
 *
 * 
 */

#ifndef OAITrendingKeywordsResponse_H
#define OAITrendingKeywordsResponse_H

#include <QJsonObject>

#include "OAITrendingKeywordsResponse_trends_inner.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAITrendingKeywordsResponse_trends_inner;

class OAITrendingKeywordsResponse : public OAIObject {
public:
    OAITrendingKeywordsResponse();
    OAITrendingKeywordsResponse(QString json);
    ~OAITrendingKeywordsResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAITrendingKeywordsResponse_trends_inner> getTrends() const;
    void setTrends(const QList<OAITrendingKeywordsResponse_trends_inner> &trends);
    bool is_trends_Set() const;
    bool is_trends_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAITrendingKeywordsResponse_trends_inner> m_trends;
    bool m_trends_isSet;
    bool m_trends_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAITrendingKeywordsResponse)

#endif // OAITrendingKeywordsResponse_H
