/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
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
#include "OAIOrderLinesApiRequest.h"

namespace OpenAPI {

OAIOrderLinesApiRequest::OAIOrderLinesApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIOrderLinesApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIOrderLinesApiRequest::~OAIOrderLinesApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIOrderLinesApiRequest::~OAIOrderLinesApiRequest()";
}

QMap<QString, QString>
OAIOrderLinesApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIOrderLinesApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIOrderLinesApiRequest::getRawSocket(){
    return socket;
}


void OAIOrderLinesApiRequest::orderLines_getRequest(const QString& ad_account_idstr, const QString& order_line_idstr){
    qDebug() << "/v5/ad_accounts/{ad_account_id}/order_lines/{order_line_id}";
    connect(this, &OAIOrderLinesApiRequest::orderLines_get, handler.data(), &OAIOrderLinesApiHandler::orderLines_get);

    
    QString ad_account_id;
    fromStringValue(ad_account_idstr, ad_account_id);
        QString order_line_id;
    fromStringValue(order_line_idstr, order_line_id);
    

    Q_EMIT orderLines_get(ad_account_id, order_line_id);
}


void OAIOrderLinesApiRequest::orderLines_listRequest(const QString& ad_account_idstr){
    qDebug() << "/v5/ad_accounts/{ad_account_id}/order_lines";
    connect(this, &OAIOrderLinesApiRequest::orderLines_list, handler.data(), &OAIOrderLinesApiHandler::orderLines_list);

    
    qint32 page_size;
    if(socket->queryString().keys().contains("page_size")){
        fromStringValue(socket->queryString().value("page_size"), page_size);
    }
    
    QString order;
    if(socket->queryString().keys().contains("order")){
        fromStringValue(socket->queryString().value("order"), order);
    }
    
    QString bookmark;
    if(socket->queryString().keys().contains("bookmark")){
        fromStringValue(socket->queryString().value("bookmark"), bookmark);
    }
    
    QString ad_account_id;
    fromStringValue(ad_account_idstr, ad_account_id);
    

    Q_EMIT orderLines_list(ad_account_id, page_size, order, bookmark);
}



void OAIOrderLinesApiRequest::orderLines_getResponse(const OAIOrderLine& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIOrderLinesApiRequest::orderLines_listResponse(const OAIOrder_lines_list_200_response& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIOrderLinesApiRequest::orderLines_getError(const OAIOrderLine& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIOrderLinesApiRequest::orderLines_listError(const OAIOrder_lines_list_200_response& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIOrderLinesApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIOrderLinesApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}