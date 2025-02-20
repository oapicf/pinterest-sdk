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

#include "OAILeadFormsApiHandler.h"
#include "OAILeadFormsApiRequest.h"

namespace OpenAPI {

OAILeadFormsApiHandler::OAILeadFormsApiHandler(){

}

OAILeadFormsApiHandler::~OAILeadFormsApiHandler(){

}

void OAILeadFormsApiHandler::leadFormTest_create(QString ad_account_id, QString lead_form_id, OAILeadFormTestRequest oai_lead_form_test_request) {
    Q_UNUSED(ad_account_id);
    Q_UNUSED(lead_form_id);
    Q_UNUSED(oai_lead_form_test_request);
    auto reqObj = qobject_cast<OAILeadFormsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAILeadFormTestResponse res;
        reqObj->leadFormTest_createResponse(res);
    }
}
void OAILeadFormsApiHandler::leadForm_get(QString ad_account_id, QString lead_form_id) {
    Q_UNUSED(ad_account_id);
    Q_UNUSED(lead_form_id);
    auto reqObj = qobject_cast<OAILeadFormsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAILeadFormResponse res;
        reqObj->leadForm_getResponse(res);
    }
}
void OAILeadFormsApiHandler::leadForms_create(QString ad_account_id, QList<OAILeadFormCreateRequest> oai_lead_form_create_request) {
    Q_UNUSED(ad_account_id);
    Q_UNUSED(oai_lead_form_create_request);
    auto reqObj = qobject_cast<OAILeadFormsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAILeadFormArrayResponse res;
        reqObj->leadForms_createResponse(res);
    }
}
void OAILeadFormsApiHandler::leadForms_list(QString ad_account_id, qint32 page_size, QString order, QString bookmark) {
    Q_UNUSED(ad_account_id);
    Q_UNUSED(page_size);
    Q_UNUSED(order);
    Q_UNUSED(bookmark);
    auto reqObj = qobject_cast<OAILeadFormsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAILead_forms_list_200_response res;
        reqObj->leadForms_listResponse(res);
    }
}
void OAILeadFormsApiHandler::leadForms_update(QString ad_account_id, QList<OAILeadFormUpdateRequest> oai_lead_form_update_request) {
    Q_UNUSED(ad_account_id);
    Q_UNUSED(oai_lead_form_update_request);
    auto reqObj = qobject_cast<OAILeadFormsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAILeadFormArrayResponse res;
        reqObj->leadForms_updateResponse(res);
    }
}


}
