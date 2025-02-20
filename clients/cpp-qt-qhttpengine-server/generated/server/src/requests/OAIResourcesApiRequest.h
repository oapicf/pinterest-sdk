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

#ifndef OAI_OAIResourcesApiRequest_H
#define OAI_OAIResourcesApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include "OAIAdAccountsCountryResponse.h"
#include "OAIBookClosedResponse.h"
#include "OAIDeliveryMetricsResponse.h"
#include "OAIError.h"
#include "OAIObject.h"
#include "OAISingleInterestTargetingOptionResponse.h"
#include <QList>
#include <QString>
#include "OAIResourcesApiHandler.h"

namespace OpenAPI {

class OAIResourcesApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIResourcesApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIResourcesApiHandler> handler);
    virtual ~OAIResourcesApiRequest();

    void adAccountCountries_getRequest();
    void deliveryMetrics_getRequest();
    void interestTargetingOptions_getRequest(const QString& interest_id);
    void leadFormQuestions_getRequest();
    void metricsReadyState_getRequest();
    void targetingOptions_getRequest(const QString& targeting_type);
    

    void adAccountCountries_getResponse(const OAIAdAccountsCountryResponse& res);
    void deliveryMetrics_getResponse(const OAIDeliveryMetricsResponse& res);
    void interestTargetingOptions_getResponse(const OAISingleInterestTargetingOptionResponse& res);
    void leadFormQuestions_getResponse();
    void metricsReadyState_getResponse(const OAIBookClosedResponse& res);
    void targetingOptions_getResponse(const QList<OAIObject>& res);
    

    void adAccountCountries_getError(const OAIAdAccountsCountryResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void deliveryMetrics_getError(const OAIDeliveryMetricsResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void interestTargetingOptions_getError(const OAISingleInterestTargetingOptionResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void leadFormQuestions_getError(QNetworkReply::NetworkError error_type, QString& error_str);
    void metricsReadyState_getError(const OAIBookClosedResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void targetingOptions_getError(const QList<OAIObject>& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

Q_SIGNALS:
    void adAccountCountries_get();
    void deliveryMetrics_get(QString report_type);
    void interestTargetingOptions_get(QString interest_id);
    void leadFormQuestions_get();
    void metricsReadyState_get(QString date);
    void targetingOptions_get(QString targeting_type, QString client_id, QString oauth_signature, QString timestamp, QString ad_account_id);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    QSharedPointer<OAIResourcesApiHandler> handler;

    inline void setSocketResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
    }
};

}

#endif // OAI_OAIResourcesApiRequest_H
