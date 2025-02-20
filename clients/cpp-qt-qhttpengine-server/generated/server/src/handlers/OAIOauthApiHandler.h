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

#ifndef OAI_OAIOauthApiHandler_H
#define OAI_OAIOauthApiHandler_H

#include <QObject>

#include "OAIError.h"
#include "OAIOauthAccessTokenResponse.h"
#include <QString>

namespace OpenAPI {

class OAIOauthApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIOauthApiHandler();
    virtual ~OAIOauthApiHandler();


public Q_SLOTS:
    virtual void oauth_token(QString grant_type);
    

};

}

#endif // OAI_OAIOauthApiHandler_H
