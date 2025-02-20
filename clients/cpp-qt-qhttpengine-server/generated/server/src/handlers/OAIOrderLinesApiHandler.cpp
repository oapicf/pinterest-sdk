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

#include "OAIOrderLinesApiHandler.h"
#include "OAIOrderLinesApiRequest.h"

namespace OpenAPI {

OAIOrderLinesApiHandler::OAIOrderLinesApiHandler(){

}

OAIOrderLinesApiHandler::~OAIOrderLinesApiHandler(){

}

void OAIOrderLinesApiHandler::orderLines_get(QString ad_account_id, QString order_line_id) {
    Q_UNUSED(ad_account_id);
    Q_UNUSED(order_line_id);
    auto reqObj = qobject_cast<OAIOrderLinesApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIOrderLine res;
        reqObj->orderLines_getResponse(res);
    }
}
void OAIOrderLinesApiHandler::orderLines_list(QString ad_account_id, qint32 page_size, QString order, QString bookmark) {
    Q_UNUSED(ad_account_id);
    Q_UNUSED(page_size);
    Q_UNUSED(order);
    Q_UNUSED(bookmark);
    auto reqObj = qobject_cast<OAIOrderLinesApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIOrder_lines_list_200_response res;
        reqObj->orderLines_listResponse(res);
    }
}


}
