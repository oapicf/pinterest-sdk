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
 * OAIQuizPinQuestion.h
 *
 * A specific quiz inquiry.
 */

#ifndef OAIQuizPinQuestion_H
#define OAIQuizPinQuestion_H

#include <QJsonObject>

#include "OAIQuizPinOption.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIQuizPinOption;

class OAIQuizPinQuestion : public OAIObject {
public:
    OAIQuizPinQuestion();
    OAIQuizPinQuestion(QString json);
    ~OAIQuizPinQuestion() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    double getQuestionId() const;
    void setQuestionId(const double &question_id);
    bool is_question_id_Set() const;
    bool is_question_id_Valid() const;

    QString getQuestionText() const;
    void setQuestionText(const QString &question_text);
    bool is_question_text_Set() const;
    bool is_question_text_Valid() const;

    QList<OAIQuizPinOption> getOptions() const;
    void setOptions(const QList<OAIQuizPinOption> &options);
    bool is_options_Set() const;
    bool is_options_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    double m_question_id;
    bool m_question_id_isSet;
    bool m_question_id_isValid;

    QString m_question_text;
    bool m_question_text_isSet;
    bool m_question_text_isValid;

    QList<OAIQuizPinOption> m_options;
    bool m_options_isSet;
    bool m_options_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIQuizPinQuestion)

#endif // OAIQuizPinQuestion_H
