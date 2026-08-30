/*
 * BidFloorSpec.h
 *
 * Bid floor specification for a given campaign configuration.
 */

#ifndef _BidFloorSpec_H_
#define _BidFloorSpec_H_


#include <string>
#include "ActionType.h"
#include "BidFloorObjectiveType.h"
#include "Country.h"
#include "CreativeType.h"
#include "Currency.h"
#include "OptimizationGoalMetadata.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Bid floor specification for a given campaign configuration.
 *
 *  \ingroup Models
 *
 */

class BidFloorSpec : public Object {
public:
	/*! \brief Constructor.
	 */
	BidFloorSpec();
	BidFloorSpec(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BidFloorSpec();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Ad group billable event type.
	 */
	ActionType getBillableEvent();

	/*! \brief Set Ad group billable event type.
	 */
	void setBillableEvent(ActionType  billable_event);
	/*! \brief Get List of ISO 3166-1 alpha-2 country codes.
	 */
	std::list<Country> getCountries();

	/*! \brief Set List of ISO 3166-1 alpha-2 country codes.
	 */
	void setCountries(std::list <Country> countries);
	/*! \brief Get Creative type for the bid floor request.
	 */
	CreativeType getCreativeType();

	/*! \brief Set Creative type for the bid floor request.
	 */
	void setCreativeType(CreativeType  creative_type);
	/*! \brief Get Currency for the bid floor value.
	 */
	Currency getCurrency();

	/*! \brief Set Currency for the bid floor value.
	 */
	void setCurrency(Currency  currency);
	/*! \brief Get Campaign objective type.
	 */
	BidFloorObjectiveType getObjectiveType();

	/*! \brief Set Campaign objective type.
	 */
	void setObjectiveType(BidFloorObjectiveType  objective_type);
	/*! \brief Get Optimization goal metadata.
	 */
	OptimizationGoalMetadata getOptimizationGoalMetadata();

	/*! \brief Set Optimization goal metadata.
	 */
	void setOptimizationGoalMetadata(OptimizationGoalMetadata  optimization_goal_metadata);

private:
	ActionType billable_event;
	std::list <Country>countries;
	CreativeType creative_type;
	Currency currency;
	BidFloorObjectiveType objective_type;
	OptimizationGoalMetadata optimization_goal_metadata;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BidFloorSpec_H_ */
