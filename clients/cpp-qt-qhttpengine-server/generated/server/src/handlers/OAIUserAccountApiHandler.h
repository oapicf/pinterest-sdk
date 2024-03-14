/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#ifndef OAI_OAIUserAccountApiHandler_H
#define OAI_OAIUserAccountApiHandler_H

#include <QObject>

#include "OAIAccount.h"
#include "OAIAnalyticsMetricsResponse.h"
#include "OAIError.h"
#include "OAITopPinsAnalyticsResponse.h"
#include "OAITopVideoPinsAnalyticsResponse.h"
#include <QList>
#include <QMap>
#include <QString>

namespace OpenAPI {

class OAIUserAccountApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIUserAccountApiHandler();
    virtual ~OAIUserAccountApiHandler();


public Q_SLOTS:
    virtual void userAccount_analytics(QDate start_date, QDate end_date, QString from_claimed_content, QString pin_format, QString app_types, QList<QString> metric_types, QString split_field, QString ad_account_id);
    virtual void userAccount_analytics_topPins(QDate start_date, QDate end_date, QString sort_by, QString from_claimed_content, QString pin_format, QString app_types, QList<QString> metric_types, qint32 num_of_pins, qint32 created_in_last_n_days, QString ad_account_id);
    virtual void userAccount_analytics_topVideoPins(QDate start_date, QDate end_date, QString sort_by, QString from_claimed_content, QString pin_format, QString app_types, QList<QString> metric_types, qint32 num_of_pins, qint32 created_in_last_n_days, QString ad_account_id);
    virtual void userAccount_get(QString ad_account_id);
    

};

}

#endif // OAI_OAIUserAccountApiHandler_H