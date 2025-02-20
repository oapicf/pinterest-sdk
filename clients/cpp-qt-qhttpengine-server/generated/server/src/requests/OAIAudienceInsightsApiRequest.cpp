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

#include <QJsonArray>
#include <QJsonDocument>
#include <QJsonObject>
#include <QVariantMap>
#include <QDebug>

#include "OAIHelpers.h"
#include "OAIAudienceInsightsApiRequest.h"

namespace OpenAPI {

OAIAudienceInsightsApiRequest::OAIAudienceInsightsApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIAudienceInsightsApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIAudienceInsightsApiRequest::~OAIAudienceInsightsApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIAudienceInsightsApiRequest::~OAIAudienceInsightsApiRequest()";
}

QMap<QString, QString>
OAIAudienceInsightsApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIAudienceInsightsApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIAudienceInsightsApiRequest::getRawSocket(){
    return socket;
}


void OAIAudienceInsightsApiRequest::audienceInsightsScopeAndType_getRequest(const QString& ad_account_idstr){
    qDebug() << "/v5/ad_accounts/{ad_account_id}/insights/audiences";
    connect(this, &OAIAudienceInsightsApiRequest::audienceInsightsScopeAndType_get, handler.data(), &OAIAudienceInsightsApiHandler::audienceInsightsScopeAndType_get);

    
    QString ad_account_id;
    fromStringValue(ad_account_idstr, ad_account_id);
    

    Q_EMIT audienceInsightsScopeAndType_get(ad_account_id);
}


void OAIAudienceInsightsApiRequest::audienceInsights_getRequest(const QString& ad_account_idstr){
    qDebug() << "/v5/ad_accounts/{ad_account_id}/audience_insights";
    connect(this, &OAIAudienceInsightsApiRequest::audienceInsights_get, handler.data(), &OAIAudienceInsightsApiHandler::audienceInsights_get);

    
    OAIAudienceInsightType audience_insight_type;
    if(socket->queryString().keys().contains("audience_insight_type")){
        fromStringValue(socket->queryString().value("audience_insight_type"), audience_insight_type);
    }
    
    QString ad_account_id;
    fromStringValue(ad_account_idstr, ad_account_id);
    

    Q_EMIT audienceInsights_get(ad_account_id, audience_insight_type);
}



void OAIAudienceInsightsApiRequest::audienceInsightsScopeAndType_getResponse(const OAIAudienceDefinitionResponse& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIAudienceInsightsApiRequest::audienceInsights_getResponse(const OAIAudienceInsightsResponse& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIAudienceInsightsApiRequest::audienceInsightsScopeAndType_getError(const OAIAudienceDefinitionResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIAudienceInsightsApiRequest::audienceInsights_getError(const OAIAudienceInsightsResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIAudienceInsightsApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIAudienceInsightsApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
