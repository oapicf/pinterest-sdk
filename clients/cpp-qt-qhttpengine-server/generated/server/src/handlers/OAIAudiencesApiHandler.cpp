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

#include "OAIAudiencesApiHandler.h"
#include "OAIAudiencesApiRequest.h"

namespace OpenAPI {

OAIAudiencesApiHandler::OAIAudiencesApiHandler(){

}

OAIAudiencesApiHandler::~OAIAudiencesApiHandler(){

}

void OAIAudiencesApiHandler::audiences_create(QString ad_account_id, OAIAudienceCreateRequest oai_audience_create_request) {
    Q_UNUSED(ad_account_id);
    Q_UNUSED(oai_audience_create_request);
    auto reqObj = qobject_cast<OAIAudiencesApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIAudience res;
        reqObj->audiences_createResponse(res);
    }
}
void OAIAudiencesApiHandler::audiences_createCustom(QString ad_account_id, OAIAudienceCreateCustomRequest oai_audience_create_custom_request) {
    Q_UNUSED(ad_account_id);
    Q_UNUSED(oai_audience_create_custom_request);
    auto reqObj = qobject_cast<OAIAudiencesApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIAudience res;
        reqObj->audiences_createCustomResponse(res);
    }
}
void OAIAudiencesApiHandler::audiences_get(QString ad_account_id, QString audience_id) {
    Q_UNUSED(ad_account_id);
    Q_UNUSED(audience_id);
    auto reqObj = qobject_cast<OAIAudiencesApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIAudience res;
        reqObj->audiences_getResponse(res);
    }
}
void OAIAudiencesApiHandler::audiences_list(QString ad_account_id, QString bookmark, QString order, qint32 page_size, QString ownership_type) {
    Q_UNUSED(ad_account_id);
    Q_UNUSED(bookmark);
    Q_UNUSED(order);
    Q_UNUSED(page_size);
    Q_UNUSED(ownership_type);
    auto reqObj = qobject_cast<OAIAudiencesApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIAudiences_list_200_response res;
        reqObj->audiences_listResponse(res);
    }
}
void OAIAudiencesApiHandler::audiences_update(QString ad_account_id, QString audience_id, OAIAudienceUpdateRequest oai_audience_update_request) {
    Q_UNUSED(ad_account_id);
    Q_UNUSED(audience_id);
    Q_UNUSED(oai_audience_update_request);
    auto reqObj = qobject_cast<OAIAudiencesApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIAudience res;
        reqObj->audiences_updateResponse(res);
    }
}


}
