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
#include "OAIConversionEventsApiRequest.h"

namespace OpenAPI {

OAIConversionEventsApiRequest::OAIConversionEventsApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIConversionEventsApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIConversionEventsApiRequest::~OAIConversionEventsApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIConversionEventsApiRequest::~OAIConversionEventsApiRequest()";
}

QMap<QString, QString>
OAIConversionEventsApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIConversionEventsApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIConversionEventsApiRequest::getRawSocket(){
    return socket;
}


void OAIConversionEventsApiRequest::events_createRequest(const QString& ad_account_idstr){
    qDebug() << "/v5/ad_accounts/{ad_account_id}/events";
    connect(this, &OAIConversionEventsApiRequest::events_create, handler.data(), &OAIConversionEventsApiHandler::events_create);

    
    bool test;
    if(socket->queryString().keys().contains("test")){
        fromStringValue(socket->queryString().value("test"), test);
    }
    
    QString ad_account_id;
    fromStringValue(ad_account_idstr, ad_account_id);
     
    
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIConversionEvents oai_conversion_events;
    ::OpenAPI::fromJsonValue(oai_conversion_events, obj);
    

    Q_EMIT events_create(ad_account_id, oai_conversion_events, test);
}



void OAIConversionEventsApiRequest::events_createResponse(const OAIConversionApiResponse& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIConversionEventsApiRequest::events_createError(const OAIConversionApiResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIConversionEventsApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIConversionEventsApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
