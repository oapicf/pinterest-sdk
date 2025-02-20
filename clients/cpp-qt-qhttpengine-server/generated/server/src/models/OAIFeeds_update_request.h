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

/*
 * OAIFeeds_update_request.h
 *
 * 
 */

#ifndef OAIFeeds_update_request_H
#define OAIFeeds_update_request_H

#include <QJsonObject>

#include "OAICatalogsFeedCredentials.h"
#include "OAICatalogsFeedProcessingSchedule.h"
#include "OAICatalogsFeedsUpdateRequest.h"
#include "OAICatalogsFormat.h"
#include "OAICatalogsStatus.h"
#include "OAICatalogsType.h"
#include "OAICatalogsVerticalFeedsUpdateRequest.h"
#include "OAINullableCurrency.h"
#include "OAIProductAvailabilityType.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIFeeds_update_request : public OAIObject {
public:
    OAIFeeds_update_request();
    OAIFeeds_update_request(QString json);
    ~OAIFeeds_update_request() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAINullableCurrency getDefaultCurrency() const;
    void setDefaultCurrency(const OAINullableCurrency &default_currency);
    bool is_default_currency_Set() const;
    bool is_default_currency_Valid() const;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    OAICatalogsFormat getFormat() const;
    void setFormat(const OAICatalogsFormat &format);
    bool is_format_Set() const;
    bool is_format_Valid() const;

    OAICatalogsFeedCredentials getCredentials() const;
    void setCredentials(const OAICatalogsFeedCredentials &credentials);
    bool is_credentials_Set() const;
    bool is_credentials_Valid() const;

    QString getLocation() const;
    void setLocation(const QString &location);
    bool is_location_Set() const;
    bool is_location_Valid() const;

    OAICatalogsFeedProcessingSchedule getPreferredProcessingSchedule() const;
    void setPreferredProcessingSchedule(const OAICatalogsFeedProcessingSchedule &preferred_processing_schedule);
    bool is_preferred_processing_schedule_Set() const;
    bool is_preferred_processing_schedule_Valid() const;

    OAICatalogsStatus getStatus() const;
    void setStatus(const OAICatalogsStatus &status);
    bool is_status_Set() const;
    bool is_status_Valid() const;

    OAICatalogsType getCatalogType() const;
    void setCatalogType(const OAICatalogsType &catalog_type);
    bool is_catalog_type_Set() const;
    bool is_catalog_type_Valid() const;

    OAIProductAvailabilityType getDefaultAvailability() const;
    void setDefaultAvailability(const OAIProductAvailabilityType &default_availability);
    bool is_default_availability_Set() const;
    bool is_default_availability_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAINullableCurrency default_currency;
    bool m_default_currency_isSet;
    bool m_default_currency_isValid;

    QString name;
    bool m_name_isSet;
    bool m_name_isValid;

    OAICatalogsFormat format;
    bool m_format_isSet;
    bool m_format_isValid;

    OAICatalogsFeedCredentials credentials;
    bool m_credentials_isSet;
    bool m_credentials_isValid;

    QString location;
    bool m_location_isSet;
    bool m_location_isValid;

    OAICatalogsFeedProcessingSchedule preferred_processing_schedule;
    bool m_preferred_processing_schedule_isSet;
    bool m_preferred_processing_schedule_isValid;

    OAICatalogsStatus status;
    bool m_status_isSet;
    bool m_status_isValid;

    OAICatalogsType catalog_type;
    bool m_catalog_type_isSet;
    bool m_catalog_type_isValid;

    OAIProductAvailabilityType default_availability;
    bool m_default_availability_isSet;
    bool m_default_availability_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIFeeds_update_request)

#endif // OAIFeeds_update_request_H
