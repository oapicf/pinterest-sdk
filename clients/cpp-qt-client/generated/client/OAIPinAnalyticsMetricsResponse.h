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
 * OAIPinAnalyticsMetricsResponse.h
 *
 * 
 */

#ifndef OAIPinAnalyticsMetricsResponse_H
#define OAIPinAnalyticsMetricsResponse_H

#include <QJsonObject>

#include "OAIPinAnalyticsMetricsResponse_daily_metrics_inner.h"
#include <QList>
#include <QMap>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIPinAnalyticsMetricsResponse_daily_metrics_inner;

class OAIPinAnalyticsMetricsResponse : public OAIObject {
public:
    OAIPinAnalyticsMetricsResponse();
    OAIPinAnalyticsMetricsResponse(QString json);
    ~OAIPinAnalyticsMetricsResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QMap<QString, qint32> getLifetimeMetrics() const;
    void setLifetimeMetrics(const QMap<QString, qint32> &lifetime_metrics);
    bool is_lifetime_metrics_Set() const;
    bool is_lifetime_metrics_Valid() const;

    QList<OAIPinAnalyticsMetricsResponse_daily_metrics_inner> getDailyMetrics() const;
    void setDailyMetrics(const QList<OAIPinAnalyticsMetricsResponse_daily_metrics_inner> &daily_metrics);
    bool is_daily_metrics_Set() const;
    bool is_daily_metrics_Valid() const;

    QMap<QString, double> getSummaryMetrics() const;
    void setSummaryMetrics(const QMap<QString, double> &summary_metrics);
    bool is_summary_metrics_Set() const;
    bool is_summary_metrics_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QMap<QString, qint32> m_lifetime_metrics;
    bool m_lifetime_metrics_isSet;
    bool m_lifetime_metrics_isValid;

    QList<OAIPinAnalyticsMetricsResponse_daily_metrics_inner> m_daily_metrics;
    bool m_daily_metrics_isSet;
    bool m_daily_metrics_isValid;

    QMap<QString, double> m_summary_metrics;
    bool m_summary_metrics_isSet;
    bool m_summary_metrics_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIPinAnalyticsMetricsResponse)

#endif // OAIPinAnalyticsMetricsResponse_H
