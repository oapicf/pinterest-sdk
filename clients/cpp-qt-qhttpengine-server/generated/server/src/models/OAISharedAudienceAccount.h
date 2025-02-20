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
 * OAISharedAudienceAccount.h
 *
 * 
 */

#ifndef OAISharedAudienceAccount_H
#define OAISharedAudienceAccount_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAISharedAudienceAccount : public OAIObject {
public:
    OAISharedAudienceAccount();
    OAISharedAudienceAccount(QString json);
    ~OAISharedAudienceAccount() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getAccountId() const;
    void setAccountId(const QString &account_id);
    bool is_account_id_Set() const;
    bool is_account_id_Valid() const;

    QString getAccountName() const;
    void setAccountName(const QString &account_name);
    bool is_account_name_Set() const;
    bool is_account_name_Valid() const;

    QString getAccountType() const;
    void setAccountType(const QString &account_type);
    bool is_account_type_Set() const;
    bool is_account_type_Valid() const;

    qint32 getSharedOnTimestamp() const;
    void setSharedOnTimestamp(const qint32 &shared_on_timestamp);
    bool is_shared_on_timestamp_Set() const;
    bool is_shared_on_timestamp_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString account_id;
    bool m_account_id_isSet;
    bool m_account_id_isValid;

    QString account_name;
    bool m_account_name_isSet;
    bool m_account_name_isValid;

    QString account_type;
    bool m_account_type_isSet;
    bool m_account_type_isValid;

    qint32 shared_on_timestamp;
    bool m_shared_on_timestamp_isSet;
    bool m_shared_on_timestamp_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAISharedAudienceAccount)

#endif // OAISharedAudienceAccount_H
