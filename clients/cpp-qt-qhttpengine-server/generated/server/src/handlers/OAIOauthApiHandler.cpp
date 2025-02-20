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

#include "OAIOauthApiHandler.h"
#include "OAIOauthApiRequest.h"

namespace OpenAPI {

OAIOauthApiHandler::OAIOauthApiHandler(){

}

OAIOauthApiHandler::~OAIOauthApiHandler(){

}

void OAIOauthApiHandler::oauth_token(QString grant_type) {
    Q_UNUSED(grant_type);
    auto reqObj = qobject_cast<OAIOauthApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIOauthAccessTokenResponse res;
        reqObj->oauth_tokenResponse(res);
    }
}


}
