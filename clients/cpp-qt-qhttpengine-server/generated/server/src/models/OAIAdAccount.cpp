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

#include "OAIAdAccount.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIAdAccount::OAIAdAccount(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIAdAccount::OAIAdAccount() {
    this->initializeModel();
}

OAIAdAccount::~OAIAdAccount() {}

void OAIAdAccount::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;

    m_owner_isSet = false;
    m_owner_isValid = false;

    m_country_isSet = false;
    m_country_isValid = false;

    m_currency_isSet = false;
    m_currency_isValid = false;

    m_permissions_isSet = false;
    m_permissions_isValid = false;

    m_created_time_isSet = false;
    m_created_time_isValid = false;

    m_updated_time_isSet = false;
    m_updated_time_isValid = false;
}

void OAIAdAccount::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIAdAccount::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_owner_isValid = ::OpenAPI::fromJsonValue(owner, json[QString("owner")]);
    m_owner_isSet = !json[QString("owner")].isNull() && m_owner_isValid;

    m_country_isValid = ::OpenAPI::fromJsonValue(country, json[QString("country")]);
    m_country_isSet = !json[QString("country")].isNull() && m_country_isValid;

    m_currency_isValid = ::OpenAPI::fromJsonValue(currency, json[QString("currency")]);
    m_currency_isSet = !json[QString("currency")].isNull() && m_currency_isValid;

    m_permissions_isValid = ::OpenAPI::fromJsonValue(permissions, json[QString("permissions")]);
    m_permissions_isSet = !json[QString("permissions")].isNull() && m_permissions_isValid;

    m_created_time_isValid = ::OpenAPI::fromJsonValue(created_time, json[QString("created_time")]);
    m_created_time_isSet = !json[QString("created_time")].isNull() && m_created_time_isValid;

    m_updated_time_isValid = ::OpenAPI::fromJsonValue(updated_time, json[QString("updated_time")]);
    m_updated_time_isSet = !json[QString("updated_time")].isNull() && m_updated_time_isValid;
}

QString OAIAdAccount::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIAdAccount::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
    if (owner.isSet()) {
        obj.insert(QString("owner"), ::OpenAPI::toJsonValue(owner));
    }
    if (country.isSet()) {
        obj.insert(QString("country"), ::OpenAPI::toJsonValue(country));
    }
    if (currency.isSet()) {
        obj.insert(QString("currency"), ::OpenAPI::toJsonValue(currency));
    }
    if (permissions.size() > 0) {
        obj.insert(QString("permissions"), ::OpenAPI::toJsonValue(permissions));
    }
    if (m_created_time_isSet) {
        obj.insert(QString("created_time"), ::OpenAPI::toJsonValue(created_time));
    }
    if (m_updated_time_isSet) {
        obj.insert(QString("updated_time"), ::OpenAPI::toJsonValue(updated_time));
    }
    return obj;
}

QString OAIAdAccount::getId() const {
    return id;
}
void OAIAdAccount::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIAdAccount::is_id_Set() const{
    return m_id_isSet;
}

bool OAIAdAccount::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIAdAccount::getName() const {
    return name;
}
void OAIAdAccount::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool OAIAdAccount::is_name_Set() const{
    return m_name_isSet;
}

bool OAIAdAccount::is_name_Valid() const{
    return m_name_isValid;
}

OAIAd_account_owner OAIAdAccount::getOwner() const {
    return owner;
}
void OAIAdAccount::setOwner(const OAIAd_account_owner &owner) {
    this->owner = owner;
    this->m_owner_isSet = true;
}

bool OAIAdAccount::is_owner_Set() const{
    return m_owner_isSet;
}

bool OAIAdAccount::is_owner_Valid() const{
    return m_owner_isValid;
}

OAICountry OAIAdAccount::getCountry() const {
    return country;
}
void OAIAdAccount::setCountry(const OAICountry &country) {
    this->country = country;
    this->m_country_isSet = true;
}

bool OAIAdAccount::is_country_Set() const{
    return m_country_isSet;
}

bool OAIAdAccount::is_country_Valid() const{
    return m_country_isValid;
}

OAICurrency OAIAdAccount::getCurrency() const {
    return currency;
}
void OAIAdAccount::setCurrency(const OAICurrency &currency) {
    this->currency = currency;
    this->m_currency_isSet = true;
}

bool OAIAdAccount::is_currency_Set() const{
    return m_currency_isSet;
}

bool OAIAdAccount::is_currency_Valid() const{
    return m_currency_isValid;
}

QList<OAIBusinessAccessRole> OAIAdAccount::getPermissions() const {
    return permissions;
}
void OAIAdAccount::setPermissions(const QList<OAIBusinessAccessRole> &permissions) {
    this->permissions = permissions;
    this->m_permissions_isSet = true;
}

bool OAIAdAccount::is_permissions_Set() const{
    return m_permissions_isSet;
}

bool OAIAdAccount::is_permissions_Valid() const{
    return m_permissions_isValid;
}

qint32 OAIAdAccount::getCreatedTime() const {
    return created_time;
}
void OAIAdAccount::setCreatedTime(const qint32 &created_time) {
    this->created_time = created_time;
    this->m_created_time_isSet = true;
}

bool OAIAdAccount::is_created_time_Set() const{
    return m_created_time_isSet;
}

bool OAIAdAccount::is_created_time_Valid() const{
    return m_created_time_isValid;
}

qint32 OAIAdAccount::getUpdatedTime() const {
    return updated_time;
}
void OAIAdAccount::setUpdatedTime(const qint32 &updated_time) {
    this->updated_time = updated_time;
    this->m_updated_time_isSet = true;
}

bool OAIAdAccount::is_updated_time_Set() const{
    return m_updated_time_isSet;
}

bool OAIAdAccount::is_updated_time_Valid() const{
    return m_updated_time_isValid;
}

bool OAIAdAccount::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (owner.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (country.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (currency.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (permissions.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_created_time_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_updated_time_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIAdAccount::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
