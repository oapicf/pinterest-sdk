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

/*
 * OAICatalogsRetailFeed.h
 *
 * Catalogs Retail Feed object
 */

#ifndef OAICatalogsRetailFeed_H
#define OAICatalogsRetailFeed_H

#include <QJsonObject>

#include "OAICatalogsFeedCredentials.h"
#include "OAICatalogsFeedProcessingSchedule.h"
#include "OAICatalogsFormat.h"
#include "OAICatalogsStatus.h"
#include "OAICatalogsType.h"
#include "OAICountry.h"
#include "OAINullableCurrency.h"
#include "OAIProductAvailabilityType.h"
#include <QDateTime>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAICatalogsFeedCredentials;
class OAICatalogsFeedProcessingSchedule;

class OAICatalogsRetailFeed : public OAIObject {
public:
    OAICatalogsRetailFeed();
    OAICatalogsRetailFeed(QString json);
    ~OAICatalogsRetailFeed() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QDateTime getCreatedAt() const;
    void setCreatedAt(const QDateTime &created_at);
    bool is_created_at_Set() const;
    bool is_created_at_Valid() const;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QDateTime getUpdatedAt() const;
    void setUpdatedAt(const QDateTime &updated_at);
    bool is_updated_at_Set() const;
    bool is_updated_at_Valid() const;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    OAICatalogsFormat getFormat() const;
    void setFormat(const OAICatalogsFormat &format);
    bool is_format_Set() const;
    bool is_format_Valid() const;

    OAICatalogsType getCatalogType() const;
    void setCatalogType(const OAICatalogsType &catalog_type);
    bool is_catalog_type_Set() const;
    bool is_catalog_type_Valid() const;

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

    OAINullableCurrency getDefaultCurrency() const;
    void setDefaultCurrency(const OAINullableCurrency &default_currency);
    bool is_default_currency_Set() const;
    bool is_default_currency_Valid() const;

    QString getDefaultLocale() const;
    void setDefaultLocale(const QString &default_locale);
    bool is_default_locale_Set() const;
    bool is_default_locale_Valid() const;

    OAICountry getDefaultCountry() const;
    void setDefaultCountry(const OAICountry &default_country);
    bool is_default_country_Set() const;
    bool is_default_country_Valid() const;

    OAIProductAvailabilityType getDefaultAvailability() const;
    void setDefaultAvailability(const OAIProductAvailabilityType &default_availability);
    bool is_default_availability_Set() const;
    bool is_default_availability_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QDateTime m_created_at;
    bool m_created_at_isSet;
    bool m_created_at_isValid;

    QString m_id;
    bool m_id_isSet;
    bool m_id_isValid;

    QDateTime m_updated_at;
    bool m_updated_at_isSet;
    bool m_updated_at_isValid;

    QString m_name;
    bool m_name_isSet;
    bool m_name_isValid;

    OAICatalogsFormat m_format;
    bool m_format_isSet;
    bool m_format_isValid;

    OAICatalogsType m_catalog_type;
    bool m_catalog_type_isSet;
    bool m_catalog_type_isValid;

    OAICatalogsFeedCredentials m_credentials;
    bool m_credentials_isSet;
    bool m_credentials_isValid;

    QString m_location;
    bool m_location_isSet;
    bool m_location_isValid;

    OAICatalogsFeedProcessingSchedule m_preferred_processing_schedule;
    bool m_preferred_processing_schedule_isSet;
    bool m_preferred_processing_schedule_isValid;

    OAICatalogsStatus m_status;
    bool m_status_isSet;
    bool m_status_isValid;

    OAINullableCurrency m_default_currency;
    bool m_default_currency_isSet;
    bool m_default_currency_isValid;

    QString m_default_locale;
    bool m_default_locale_isSet;
    bool m_default_locale_isValid;

    OAICountry m_default_country;
    bool m_default_country_isSet;
    bool m_default_country_isValid;

    OAIProductAvailabilityType m_default_availability;
    bool m_default_availability_isSet;
    bool m_default_availability_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICatalogsRetailFeed)

#endif // OAICatalogsRetailFeed_H