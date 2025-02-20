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

#ifndef OAI_OAIIntegrationsApiHandler_H
#define OAI_OAIIntegrationsApiHandler_H

#include <QObject>

#include "OAIDetailedError.h"
#include "OAIError.h"
#include "OAIIntegrationLogsRequest.h"
#include "OAIIntegrationLogsSuccessResponse.h"
#include "OAIIntegrationMetadata.h"
#include "OAIIntegrationRecord.h"
#include "OAIIntegrationRequest.h"
#include "OAIIntegrationRequestPatch.h"
#include "OAIIntegrations_get_list_200_response.h"
#include <QString>

namespace OpenAPI {

class OAIIntegrationsApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIIntegrationsApiHandler();
    virtual ~OAIIntegrationsApiHandler();


public Q_SLOTS:
    virtual void integrationsCommerce_del(QString external_business_id);
    virtual void integrationsCommerce_get(QString external_business_id);
    virtual void integrationsCommerce_patch(QString external_business_id, OAIIntegrationRequestPatch oai_integration_request_patch);
    virtual void integrationsCommerce_post(OAIIntegrationRequest oai_integration_request);
    virtual void integrationsLogs_post(OAIIntegrationLogsRequest oai_integration_logs_request);
    virtual void integrations_getById(QString id);
    virtual void integrations_getList(QString bookmark, qint32 page_size);
    

};

}

#endif // OAI_OAIIntegrationsApiHandler_H
