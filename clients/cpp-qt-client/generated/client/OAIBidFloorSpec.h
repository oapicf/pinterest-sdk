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
 * OAIBidFloorSpec.h
 *
 * 
 */

#ifndef OAIBidFloorSpec_H
#define OAIBidFloorSpec_H

#include <QJsonObject>

#include "OAIActionType.h"
#include "OAICountry.h"
#include "OAICreativeType.h"
#include "OAICurrency.h"
#include "OAIObjectiveType.h"
#include "OAIOptimizationGoalMetadata.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIOptimizationGoalMetadata;

class OAIBidFloorSpec : public OAIObject {
public:
    OAIBidFloorSpec();
    OAIBidFloorSpec(QString json);
    ~OAIBidFloorSpec() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAICountry> getCountries() const;
    void setCountries(const QList<OAICountry> &countries);
    bool is_countries_Set() const;
    bool is_countries_Valid() const;

    OAICurrency getCurrency() const;
    void setCurrency(const OAICurrency &currency);
    bool is_currency_Set() const;
    bool is_currency_Valid() const;

    OAIObjectiveType getObjectiveType() const;
    void setObjectiveType(const OAIObjectiveType &objective_type);
    bool is_objective_type_Set() const;
    bool is_objective_type_Valid() const;

    OAIActionType getBillableEvent() const;
    void setBillableEvent(const OAIActionType &billable_event);
    bool is_billable_event_Set() const;
    bool is_billable_event_Valid() const;

    OAIOptimizationGoalMetadata getOptimizationGoalMetadata() const;
    void setOptimizationGoalMetadata(const OAIOptimizationGoalMetadata &optimization_goal_metadata);
    bool is_optimization_goal_metadata_Set() const;
    bool is_optimization_goal_metadata_Valid() const;

    OAICreativeType getCreativeType() const;
    void setCreativeType(const OAICreativeType &creative_type);
    bool is_creative_type_Set() const;
    bool is_creative_type_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAICountry> m_countries;
    bool m_countries_isSet;
    bool m_countries_isValid;

    OAICurrency m_currency;
    bool m_currency_isSet;
    bool m_currency_isValid;

    OAIObjectiveType m_objective_type;
    bool m_objective_type_isSet;
    bool m_objective_type_isValid;

    OAIActionType m_billable_event;
    bool m_billable_event_isSet;
    bool m_billable_event_isValid;

    OAIOptimizationGoalMetadata m_optimization_goal_metadata;
    bool m_optimization_goal_metadata_isSet;
    bool m_optimization_goal_metadata_isValid;

    OAICreativeType m_creative_type;
    bool m_creative_type_isSet;
    bool m_creative_type_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIBidFloorSpec)

#endif // OAIBidFloorSpec_H
