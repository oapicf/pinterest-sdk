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

#include "OAILeadAdsApiHandler.h"
#include "OAILeadAdsApiRequest.h"

namespace OpenAPI {

OAILeadAdsApiHandler::OAILeadAdsApiHandler(){

}

OAILeadAdsApiHandler::~OAILeadAdsApiHandler(){

}

void OAILeadAdsApiHandler::adAccountsSubscriptions_delById(QString ad_account_id, QString subscription_id) {
    Q_UNUSED(ad_account_id);
    Q_UNUSED(subscription_id);
    auto reqObj = qobject_cast<OAILeadAdsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        
        reqObj->adAccountsSubscriptions_delByIdResponse();
    }
}
void OAILeadAdsApiHandler::adAccountsSubscriptions_getById(QString ad_account_id, QString subscription_id) {
    Q_UNUSED(ad_account_id);
    Q_UNUSED(subscription_id);
    auto reqObj = qobject_cast<OAILeadAdsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIAdAccountGetSubscriptionResponse res;
        reqObj->adAccountsSubscriptions_getByIdResponse(res);
    }
}
void OAILeadAdsApiHandler::adAccountsSubscriptions_getList(QString ad_account_id, qint32 page_size, QString bookmark) {
    Q_UNUSED(ad_account_id);
    Q_UNUSED(page_size);
    Q_UNUSED(bookmark);
    auto reqObj = qobject_cast<OAILeadAdsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIAd_accounts_subscriptions_get_list_200_response res;
        reqObj->adAccountsSubscriptions_getListResponse(res);
    }
}
void OAILeadAdsApiHandler::adAccountsSubscriptions_post(QString ad_account_id, OAIAdAccountCreateSubscriptionRequest oaiad_account_create_subscription_request) {
    Q_UNUSED(ad_account_id);
    Q_UNUSED(oaiad_account_create_subscription_request);
    auto reqObj = qobject_cast<OAILeadAdsApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIAdAccountCreateSubscriptionResponse res;
        reqObj->adAccountsSubscriptions_postResponse(res);
    }
}


}