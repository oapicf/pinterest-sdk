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
 * OAILeadFormResponse.h
 *
 * 
 */

#ifndef OAILeadFormResponse_H
#define OAILeadFormResponse_H

#include <QJsonObject>

#include "OAILeadFormQuestion.h"
#include "OAILeadFormStatus.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAILeadFormResponse : public OAIObject {
public:
    OAILeadFormResponse();
    OAILeadFormResponse(QString json);
    ~OAILeadFormResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    QString getPrivacyPolicyLink() const;
    void setPrivacyPolicyLink(const QString &privacy_policy_link);
    bool is_privacy_policy_link_Set() const;
    bool is_privacy_policy_link_Valid() const;

    bool isHasAcceptedTerms() const;
    void setHasAcceptedTerms(const bool &has_accepted_terms);
    bool is_has_accepted_terms_Set() const;
    bool is_has_accepted_terms_Valid() const;

    QString getCompletionMessage() const;
    void setCompletionMessage(const QString &completion_message);
    bool is_completion_message_Set() const;
    bool is_completion_message_Valid() const;

    OAILeadFormStatus getStatus() const;
    void setStatus(const OAILeadFormStatus &status);
    bool is_status_Set() const;
    bool is_status_Valid() const;

    QString getDisclosureLanguage() const;
    void setDisclosureLanguage(const QString &disclosure_language);
    bool is_disclosure_language_Set() const;
    bool is_disclosure_language_Valid() const;

    QList<OAILeadFormQuestion> getQuestions() const;
    void setQuestions(const QList<OAILeadFormQuestion> &questions);
    bool is_questions_Set() const;
    bool is_questions_Valid() const;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QString getAdAccountId() const;
    void setAdAccountId(const QString &ad_account_id);
    bool is_ad_account_id_Set() const;
    bool is_ad_account_id_Valid() const;

    qint32 getCreatedTime() const;
    void setCreatedTime(const qint32 &created_time);
    bool is_created_time_Set() const;
    bool is_created_time_Valid() const;

    qint32 getUpdatedTime() const;
    void setUpdatedTime(const qint32 &updated_time);
    bool is_updated_time_Set() const;
    bool is_updated_time_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString name;
    bool m_name_isSet;
    bool m_name_isValid;

    QString privacy_policy_link;
    bool m_privacy_policy_link_isSet;
    bool m_privacy_policy_link_isValid;

    bool has_accepted_terms;
    bool m_has_accepted_terms_isSet;
    bool m_has_accepted_terms_isValid;

    QString completion_message;
    bool m_completion_message_isSet;
    bool m_completion_message_isValid;

    OAILeadFormStatus status;
    bool m_status_isSet;
    bool m_status_isValid;

    QString disclosure_language;
    bool m_disclosure_language_isSet;
    bool m_disclosure_language_isValid;

    QList<OAILeadFormQuestion> questions;
    bool m_questions_isSet;
    bool m_questions_isValid;

    QString id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString ad_account_id;
    bool m_ad_account_id_isSet;
    bool m_ad_account_id_isValid;

    qint32 created_time;
    bool m_created_time_isSet;
    bool m_created_time_isValid;

    qint32 updated_time;
    bool m_updated_time_isSet;
    bool m_updated_time_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAILeadFormResponse)

#endif // OAILeadFormResponse_H