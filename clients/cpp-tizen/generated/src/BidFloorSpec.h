/*
 * BidFloorSpec.h
 *
 * 
 */

#ifndef _BidFloorSpec_H_
#define _BidFloorSpec_H_


#include <string>
#include "ActionType.h"
#include "Country.h"
#include "CreativeType.h"
#include "Currency.h"
#include "ObjectiveType.h"
#include "OptimizationGoalMetadata.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
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

	/*! \brief Get 
	 */
	std::list<Country> getCountries();

	/*! \brief Set 
	 */
	void setCountries(std::list <Country> countries);
	/*! \brief Get 
	 */
	Currency getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(Currency  currency);
	/*! \brief Get 
	 */
	ObjectiveType getObjectiveType();

	/*! \brief Set 
	 */
	void setObjectiveType(ObjectiveType  objective_type);
	/*! \brief Get 
	 */
	ActionType getBillableEvent();

	/*! \brief Set 
	 */
	void setBillableEvent(ActionType  billable_event);
	/*! \brief Get 
	 */
	OptimizationGoalMetadata getOptimizationGoalMetadata();

	/*! \brief Set 
	 */
	void setOptimizationGoalMetadata(OptimizationGoalMetadata  optimization_goal_metadata);
	/*! \brief Get 
	 */
	CreativeType getCreativeType();

	/*! \brief Set 
	 */
	void setCreativeType(CreativeType  creative_type);

private:
	std::list <Country>countries;
	Currency currency;
	ObjectiveType objective_type;
	ActionType billable_event;
	OptimizationGoalMetadata optimization_goal_metadata;
	CreativeType creative_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BidFloorSpec_H_ */
