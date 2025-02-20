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
#include "OAIAudiencesApiRequest.h"

namespace OpenAPI {

OAIAudiencesApiRequest::OAIAudiencesApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIAudiencesApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIAudiencesApiRequest::~OAIAudiencesApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIAudiencesApiRequest::~OAIAudiencesApiRequest()";
}

QMap<QString, QString>
OAIAudiencesApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIAudiencesApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIAudiencesApiRequest::getRawSocket(){
    return socket;
}


void OAIAudiencesApiRequest::audiences_createRequest(const QString& ad_account_idstr){
    qDebug() << "/v5/ad_accounts/{ad_account_id}/audiences";
    connect(this, &OAIAudiencesApiRequest::audiences_create, handler.data(), &OAIAudiencesApiHandler::audiences_create);

    
    QString ad_account_id;
    fromStringValue(ad_account_idstr, ad_account_id);
     
    
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIAudienceCreateRequest oai_audience_create_request;
    ::OpenAPI::fromJsonValue(oai_audience_create_request, obj);
    

    Q_EMIT audiences_create(ad_account_id, oai_audience_create_request);
}


void OAIAudiencesApiRequest::audiences_createCustomRequest(const QString& ad_account_idstr){
    qDebug() << "/v5/ad_accounts/{ad_account_id}/audiences/custom";
    connect(this, &OAIAudiencesApiRequest::audiences_createCustom, handler.data(), &OAIAudiencesApiHandler::audiences_createCustom);

    
    QString ad_account_id;
    fromStringValue(ad_account_idstr, ad_account_id);
     
    
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIAudienceCreateCustomRequest oai_audience_create_custom_request;
    ::OpenAPI::fromJsonValue(oai_audience_create_custom_request, obj);
    

    Q_EMIT audiences_createCustom(ad_account_id, oai_audience_create_custom_request);
}


void OAIAudiencesApiRequest::audiences_getRequest(const QString& ad_account_idstr, const QString& audience_idstr){
    qDebug() << "/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}";
    connect(this, &OAIAudiencesApiRequest::audiences_get, handler.data(), &OAIAudiencesApiHandler::audiences_get);

    
    QString ad_account_id;
    fromStringValue(ad_account_idstr, ad_account_id);
        QString audience_id;
    fromStringValue(audience_idstr, audience_id);
    

    Q_EMIT audiences_get(ad_account_id, audience_id);
}


void OAIAudiencesApiRequest::audiences_listRequest(const QString& ad_account_idstr){
    qDebug() << "/v5/ad_accounts/{ad_account_id}/audiences";
    connect(this, &OAIAudiencesApiRequest::audiences_list, handler.data(), &OAIAudiencesApiHandler::audiences_list);

    
    QString bookmark;
    if(socket->queryString().keys().contains("bookmark")){
        fromStringValue(socket->queryString().value("bookmark"), bookmark);
    }
    
    QString order;
    if(socket->queryString().keys().contains("order")){
        fromStringValue(socket->queryString().value("order"), order);
    }
    
    qint32 page_size;
    if(socket->queryString().keys().contains("page_size")){
        fromStringValue(socket->queryString().value("page_size"), page_size);
    }
    
    QString ownership_type;
    if(socket->queryString().keys().contains("ownership_type")){
        fromStringValue(socket->queryString().value("ownership_type"), ownership_type);
    }
    
    QString ad_account_id;
    fromStringValue(ad_account_idstr, ad_account_id);
    

    Q_EMIT audiences_list(ad_account_id, bookmark, order, page_size, ownership_type);
}


void OAIAudiencesApiRequest::audiences_updateRequest(const QString& ad_account_idstr, const QString& audience_idstr){
    qDebug() << "/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}";
    connect(this, &OAIAudiencesApiRequest::audiences_update, handler.data(), &OAIAudiencesApiHandler::audiences_update);

    
    QString ad_account_id;
    fromStringValue(ad_account_idstr, ad_account_id);
        QString audience_id;
    fromStringValue(audience_idstr, audience_id);
     
    
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIAudienceUpdateRequest oai_audience_update_request;
    ::OpenAPI::fromJsonValue(oai_audience_update_request, obj);
    

    Q_EMIT audiences_update(ad_account_id, audience_id, oai_audience_update_request);
}



void OAIAudiencesApiRequest::audiences_createResponse(const OAIAudience& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIAudiencesApiRequest::audiences_createCustomResponse(const OAIAudience& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIAudiencesApiRequest::audiences_getResponse(const OAIAudience& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIAudiencesApiRequest::audiences_listResponse(const OAIAudiences_list_200_response& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIAudiencesApiRequest::audiences_updateResponse(const OAIAudience& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIAudiencesApiRequest::audiences_createError(const OAIAudience& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIAudiencesApiRequest::audiences_createCustomError(const OAIAudience& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIAudiencesApiRequest::audiences_getError(const OAIAudience& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIAudiencesApiRequest::audiences_listError(const OAIAudiences_list_200_response& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIAudiencesApiRequest::audiences_updateError(const OAIAudience& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIAudiencesApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIAudiencesApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
