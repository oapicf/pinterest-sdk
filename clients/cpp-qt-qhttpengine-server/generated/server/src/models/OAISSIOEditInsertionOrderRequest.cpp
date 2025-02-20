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

#include "OAISSIOEditInsertionOrderRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAISSIOEditInsertionOrderRequest::OAISSIOEditInsertionOrderRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAISSIOEditInsertionOrderRequest::OAISSIOEditInsertionOrderRequest() {
    this->initializeModel();
}

OAISSIOEditInsertionOrderRequest::~OAISSIOEditInsertionOrderRequest() {}

void OAISSIOEditInsertionOrderRequest::initializeModel() {

    m_start_date_isSet = false;
    m_start_date_isValid = false;

    m_end_date_isSet = false;
    m_end_date_isValid = false;

    m_po_number_isSet = false;
    m_po_number_isValid = false;

    m_budget_amount_isSet = false;
    m_budget_amount_isValid = false;

    m_billing_contact_firstname_isSet = false;
    m_billing_contact_firstname_isValid = false;

    m_billing_contact_lastname_isSet = false;
    m_billing_contact_lastname_isValid = false;

    m_billing_contact_email_isSet = false;
    m_billing_contact_email_isValid = false;

    m_media_contact_firstname_isSet = false;
    m_media_contact_firstname_isValid = false;

    m_media_contact_lastname_isSet = false;
    m_media_contact_lastname_isValid = false;

    m_media_contact_email_isSet = false;
    m_media_contact_email_isValid = false;

    m_agency_link_isSet = false;
    m_agency_link_isValid = false;

    m_user_email_isSet = false;
    m_user_email_isValid = false;

    m_oracle_line_id_isSet = false;
    m_oracle_line_id_isValid = false;

    m_salesforce_order_id_isSet = false;
    m_salesforce_order_id_isValid = false;

    m_salesforce_order_line_id_isSet = false;
    m_salesforce_order_line_id_isValid = false;

    m_ads_manager_order_line_id_isSet = false;
    m_ads_manager_order_line_id_isValid = false;
}

void OAISSIOEditInsertionOrderRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAISSIOEditInsertionOrderRequest::fromJsonObject(QJsonObject json) {

    m_start_date_isValid = ::OpenAPI::fromJsonValue(start_date, json[QString("start_date")]);
    m_start_date_isSet = !json[QString("start_date")].isNull() && m_start_date_isValid;

    m_end_date_isValid = ::OpenAPI::fromJsonValue(end_date, json[QString("end_date")]);
    m_end_date_isSet = !json[QString("end_date")].isNull() && m_end_date_isValid;

    m_po_number_isValid = ::OpenAPI::fromJsonValue(po_number, json[QString("po_number")]);
    m_po_number_isSet = !json[QString("po_number")].isNull() && m_po_number_isValid;

    m_budget_amount_isValid = ::OpenAPI::fromJsonValue(budget_amount, json[QString("budget_amount")]);
    m_budget_amount_isSet = !json[QString("budget_amount")].isNull() && m_budget_amount_isValid;

    m_billing_contact_firstname_isValid = ::OpenAPI::fromJsonValue(billing_contact_firstname, json[QString("billing_contact_firstname")]);
    m_billing_contact_firstname_isSet = !json[QString("billing_contact_firstname")].isNull() && m_billing_contact_firstname_isValid;

    m_billing_contact_lastname_isValid = ::OpenAPI::fromJsonValue(billing_contact_lastname, json[QString("billing_contact_lastname")]);
    m_billing_contact_lastname_isSet = !json[QString("billing_contact_lastname")].isNull() && m_billing_contact_lastname_isValid;

    m_billing_contact_email_isValid = ::OpenAPI::fromJsonValue(billing_contact_email, json[QString("billing_contact_email")]);
    m_billing_contact_email_isSet = !json[QString("billing_contact_email")].isNull() && m_billing_contact_email_isValid;

    m_media_contact_firstname_isValid = ::OpenAPI::fromJsonValue(media_contact_firstname, json[QString("media_contact_firstname")]);
    m_media_contact_firstname_isSet = !json[QString("media_contact_firstname")].isNull() && m_media_contact_firstname_isValid;

    m_media_contact_lastname_isValid = ::OpenAPI::fromJsonValue(media_contact_lastname, json[QString("media_contact_lastname")]);
    m_media_contact_lastname_isSet = !json[QString("media_contact_lastname")].isNull() && m_media_contact_lastname_isValid;

    m_media_contact_email_isValid = ::OpenAPI::fromJsonValue(media_contact_email, json[QString("media_contact_email")]);
    m_media_contact_email_isSet = !json[QString("media_contact_email")].isNull() && m_media_contact_email_isValid;

    m_agency_link_isValid = ::OpenAPI::fromJsonValue(agency_link, json[QString("agency_link")]);
    m_agency_link_isSet = !json[QString("agency_link")].isNull() && m_agency_link_isValid;

    m_user_email_isValid = ::OpenAPI::fromJsonValue(user_email, json[QString("user_email")]);
    m_user_email_isSet = !json[QString("user_email")].isNull() && m_user_email_isValid;

    m_oracle_line_id_isValid = ::OpenAPI::fromJsonValue(oracle_line_id, json[QString("oracle_line_id")]);
    m_oracle_line_id_isSet = !json[QString("oracle_line_id")].isNull() && m_oracle_line_id_isValid;

    m_salesforce_order_id_isValid = ::OpenAPI::fromJsonValue(salesforce_order_id, json[QString("salesforce_order_id")]);
    m_salesforce_order_id_isSet = !json[QString("salesforce_order_id")].isNull() && m_salesforce_order_id_isValid;

    m_salesforce_order_line_id_isValid = ::OpenAPI::fromJsonValue(salesforce_order_line_id, json[QString("salesforce_order_line_id")]);
    m_salesforce_order_line_id_isSet = !json[QString("salesforce_order_line_id")].isNull() && m_salesforce_order_line_id_isValid;

    m_ads_manager_order_line_id_isValid = ::OpenAPI::fromJsonValue(ads_manager_order_line_id, json[QString("ads_manager_order_line_id")]);
    m_ads_manager_order_line_id_isSet = !json[QString("ads_manager_order_line_id")].isNull() && m_ads_manager_order_line_id_isValid;
}

QString OAISSIOEditInsertionOrderRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAISSIOEditInsertionOrderRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_start_date_isSet) {
        obj.insert(QString("start_date"), ::OpenAPI::toJsonValue(start_date));
    }
    if (m_end_date_isSet) {
        obj.insert(QString("end_date"), ::OpenAPI::toJsonValue(end_date));
    }
    if (m_po_number_isSet) {
        obj.insert(QString("po_number"), ::OpenAPI::toJsonValue(po_number));
    }
    if (m_budget_amount_isSet) {
        obj.insert(QString("budget_amount"), ::OpenAPI::toJsonValue(budget_amount));
    }
    if (m_billing_contact_firstname_isSet) {
        obj.insert(QString("billing_contact_firstname"), ::OpenAPI::toJsonValue(billing_contact_firstname));
    }
    if (m_billing_contact_lastname_isSet) {
        obj.insert(QString("billing_contact_lastname"), ::OpenAPI::toJsonValue(billing_contact_lastname));
    }
    if (m_billing_contact_email_isSet) {
        obj.insert(QString("billing_contact_email"), ::OpenAPI::toJsonValue(billing_contact_email));
    }
    if (m_media_contact_firstname_isSet) {
        obj.insert(QString("media_contact_firstname"), ::OpenAPI::toJsonValue(media_contact_firstname));
    }
    if (m_media_contact_lastname_isSet) {
        obj.insert(QString("media_contact_lastname"), ::OpenAPI::toJsonValue(media_contact_lastname));
    }
    if (m_media_contact_email_isSet) {
        obj.insert(QString("media_contact_email"), ::OpenAPI::toJsonValue(media_contact_email));
    }
    if (m_agency_link_isSet) {
        obj.insert(QString("agency_link"), ::OpenAPI::toJsonValue(agency_link));
    }
    if (m_user_email_isSet) {
        obj.insert(QString("user_email"), ::OpenAPI::toJsonValue(user_email));
    }
    if (m_oracle_line_id_isSet) {
        obj.insert(QString("oracle_line_id"), ::OpenAPI::toJsonValue(oracle_line_id));
    }
    if (m_salesforce_order_id_isSet) {
        obj.insert(QString("salesforce_order_id"), ::OpenAPI::toJsonValue(salesforce_order_id));
    }
    if (m_salesforce_order_line_id_isSet) {
        obj.insert(QString("salesforce_order_line_id"), ::OpenAPI::toJsonValue(salesforce_order_line_id));
    }
    if (m_ads_manager_order_line_id_isSet) {
        obj.insert(QString("ads_manager_order_line_id"), ::OpenAPI::toJsonValue(ads_manager_order_line_id));
    }
    return obj;
}

QString OAISSIOEditInsertionOrderRequest::getStartDate() const {
    return start_date;
}
void OAISSIOEditInsertionOrderRequest::setStartDate(const QString &start_date) {
    this->start_date = start_date;
    this->m_start_date_isSet = true;
}

bool OAISSIOEditInsertionOrderRequest::is_start_date_Set() const{
    return m_start_date_isSet;
}

bool OAISSIOEditInsertionOrderRequest::is_start_date_Valid() const{
    return m_start_date_isValid;
}

QString OAISSIOEditInsertionOrderRequest::getEndDate() const {
    return end_date;
}
void OAISSIOEditInsertionOrderRequest::setEndDate(const QString &end_date) {
    this->end_date = end_date;
    this->m_end_date_isSet = true;
}

bool OAISSIOEditInsertionOrderRequest::is_end_date_Set() const{
    return m_end_date_isSet;
}

bool OAISSIOEditInsertionOrderRequest::is_end_date_Valid() const{
    return m_end_date_isValid;
}

QString OAISSIOEditInsertionOrderRequest::getPoNumber() const {
    return po_number;
}
void OAISSIOEditInsertionOrderRequest::setPoNumber(const QString &po_number) {
    this->po_number = po_number;
    this->m_po_number_isSet = true;
}

bool OAISSIOEditInsertionOrderRequest::is_po_number_Set() const{
    return m_po_number_isSet;
}

bool OAISSIOEditInsertionOrderRequest::is_po_number_Valid() const{
    return m_po_number_isValid;
}

double OAISSIOEditInsertionOrderRequest::getBudgetAmount() const {
    return budget_amount;
}
void OAISSIOEditInsertionOrderRequest::setBudgetAmount(const double &budget_amount) {
    this->budget_amount = budget_amount;
    this->m_budget_amount_isSet = true;
}

bool OAISSIOEditInsertionOrderRequest::is_budget_amount_Set() const{
    return m_budget_amount_isSet;
}

bool OAISSIOEditInsertionOrderRequest::is_budget_amount_Valid() const{
    return m_budget_amount_isValid;
}

QString OAISSIOEditInsertionOrderRequest::getBillingContactFirstname() const {
    return billing_contact_firstname;
}
void OAISSIOEditInsertionOrderRequest::setBillingContactFirstname(const QString &billing_contact_firstname) {
    this->billing_contact_firstname = billing_contact_firstname;
    this->m_billing_contact_firstname_isSet = true;
}

bool OAISSIOEditInsertionOrderRequest::is_billing_contact_firstname_Set() const{
    return m_billing_contact_firstname_isSet;
}

bool OAISSIOEditInsertionOrderRequest::is_billing_contact_firstname_Valid() const{
    return m_billing_contact_firstname_isValid;
}

QString OAISSIOEditInsertionOrderRequest::getBillingContactLastname() const {
    return billing_contact_lastname;
}
void OAISSIOEditInsertionOrderRequest::setBillingContactLastname(const QString &billing_contact_lastname) {
    this->billing_contact_lastname = billing_contact_lastname;
    this->m_billing_contact_lastname_isSet = true;
}

bool OAISSIOEditInsertionOrderRequest::is_billing_contact_lastname_Set() const{
    return m_billing_contact_lastname_isSet;
}

bool OAISSIOEditInsertionOrderRequest::is_billing_contact_lastname_Valid() const{
    return m_billing_contact_lastname_isValid;
}

QString OAISSIOEditInsertionOrderRequest::getBillingContactEmail() const {
    return billing_contact_email;
}
void OAISSIOEditInsertionOrderRequest::setBillingContactEmail(const QString &billing_contact_email) {
    this->billing_contact_email = billing_contact_email;
    this->m_billing_contact_email_isSet = true;
}

bool OAISSIOEditInsertionOrderRequest::is_billing_contact_email_Set() const{
    return m_billing_contact_email_isSet;
}

bool OAISSIOEditInsertionOrderRequest::is_billing_contact_email_Valid() const{
    return m_billing_contact_email_isValid;
}

QString OAISSIOEditInsertionOrderRequest::getMediaContactFirstname() const {
    return media_contact_firstname;
}
void OAISSIOEditInsertionOrderRequest::setMediaContactFirstname(const QString &media_contact_firstname) {
    this->media_contact_firstname = media_contact_firstname;
    this->m_media_contact_firstname_isSet = true;
}

bool OAISSIOEditInsertionOrderRequest::is_media_contact_firstname_Set() const{
    return m_media_contact_firstname_isSet;
}

bool OAISSIOEditInsertionOrderRequest::is_media_contact_firstname_Valid() const{
    return m_media_contact_firstname_isValid;
}

QString OAISSIOEditInsertionOrderRequest::getMediaContactLastname() const {
    return media_contact_lastname;
}
void OAISSIOEditInsertionOrderRequest::setMediaContactLastname(const QString &media_contact_lastname) {
    this->media_contact_lastname = media_contact_lastname;
    this->m_media_contact_lastname_isSet = true;
}

bool OAISSIOEditInsertionOrderRequest::is_media_contact_lastname_Set() const{
    return m_media_contact_lastname_isSet;
}

bool OAISSIOEditInsertionOrderRequest::is_media_contact_lastname_Valid() const{
    return m_media_contact_lastname_isValid;
}

QString OAISSIOEditInsertionOrderRequest::getMediaContactEmail() const {
    return media_contact_email;
}
void OAISSIOEditInsertionOrderRequest::setMediaContactEmail(const QString &media_contact_email) {
    this->media_contact_email = media_contact_email;
    this->m_media_contact_email_isSet = true;
}

bool OAISSIOEditInsertionOrderRequest::is_media_contact_email_Set() const{
    return m_media_contact_email_isSet;
}

bool OAISSIOEditInsertionOrderRequest::is_media_contact_email_Valid() const{
    return m_media_contact_email_isValid;
}

QString OAISSIOEditInsertionOrderRequest::getAgencyLink() const {
    return agency_link;
}
void OAISSIOEditInsertionOrderRequest::setAgencyLink(const QString &agency_link) {
    this->agency_link = agency_link;
    this->m_agency_link_isSet = true;
}

bool OAISSIOEditInsertionOrderRequest::is_agency_link_Set() const{
    return m_agency_link_isSet;
}

bool OAISSIOEditInsertionOrderRequest::is_agency_link_Valid() const{
    return m_agency_link_isValid;
}

QString OAISSIOEditInsertionOrderRequest::getUserEmail() const {
    return user_email;
}
void OAISSIOEditInsertionOrderRequest::setUserEmail(const QString &user_email) {
    this->user_email = user_email;
    this->m_user_email_isSet = true;
}

bool OAISSIOEditInsertionOrderRequest::is_user_email_Set() const{
    return m_user_email_isSet;
}

bool OAISSIOEditInsertionOrderRequest::is_user_email_Valid() const{
    return m_user_email_isValid;
}

QString OAISSIOEditInsertionOrderRequest::getOracleLineId() const {
    return oracle_line_id;
}
void OAISSIOEditInsertionOrderRequest::setOracleLineId(const QString &oracle_line_id) {
    this->oracle_line_id = oracle_line_id;
    this->m_oracle_line_id_isSet = true;
}

bool OAISSIOEditInsertionOrderRequest::is_oracle_line_id_Set() const{
    return m_oracle_line_id_isSet;
}

bool OAISSIOEditInsertionOrderRequest::is_oracle_line_id_Valid() const{
    return m_oracle_line_id_isValid;
}

QString OAISSIOEditInsertionOrderRequest::getSalesforceOrderId() const {
    return salesforce_order_id;
}
void OAISSIOEditInsertionOrderRequest::setSalesforceOrderId(const QString &salesforce_order_id) {
    this->salesforce_order_id = salesforce_order_id;
    this->m_salesforce_order_id_isSet = true;
}

bool OAISSIOEditInsertionOrderRequest::is_salesforce_order_id_Set() const{
    return m_salesforce_order_id_isSet;
}

bool OAISSIOEditInsertionOrderRequest::is_salesforce_order_id_Valid() const{
    return m_salesforce_order_id_isValid;
}

QString OAISSIOEditInsertionOrderRequest::getSalesforceOrderLineId() const {
    return salesforce_order_line_id;
}
void OAISSIOEditInsertionOrderRequest::setSalesforceOrderLineId(const QString &salesforce_order_line_id) {
    this->salesforce_order_line_id = salesforce_order_line_id;
    this->m_salesforce_order_line_id_isSet = true;
}

bool OAISSIOEditInsertionOrderRequest::is_salesforce_order_line_id_Set() const{
    return m_salesforce_order_line_id_isSet;
}

bool OAISSIOEditInsertionOrderRequest::is_salesforce_order_line_id_Valid() const{
    return m_salesforce_order_line_id_isValid;
}

QString OAISSIOEditInsertionOrderRequest::getAdsManagerOrderLineId() const {
    return ads_manager_order_line_id;
}
void OAISSIOEditInsertionOrderRequest::setAdsManagerOrderLineId(const QString &ads_manager_order_line_id) {
    this->ads_manager_order_line_id = ads_manager_order_line_id;
    this->m_ads_manager_order_line_id_isSet = true;
}

bool OAISSIOEditInsertionOrderRequest::is_ads_manager_order_line_id_Set() const{
    return m_ads_manager_order_line_id_isSet;
}

bool OAISSIOEditInsertionOrderRequest::is_ads_manager_order_line_id_Valid() const{
    return m_ads_manager_order_line_id_isValid;
}

bool OAISSIOEditInsertionOrderRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_start_date_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_end_date_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_po_number_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_budget_amount_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_billing_contact_firstname_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_billing_contact_lastname_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_billing_contact_email_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_media_contact_firstname_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_media_contact_lastname_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_media_contact_email_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_agency_link_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_user_email_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_oracle_line_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_salesforce_order_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_salesforce_order_line_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_ads_manager_order_line_id_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAISSIOEditInsertionOrderRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
