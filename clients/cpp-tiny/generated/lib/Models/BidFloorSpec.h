
/*
 * BidFloorSpec.h
 *
 * Bid floor specification for a given campaign configuration.
 */

#ifndef TINY_CPP_CLIENT_BidFloorSpec_H_
#define TINY_CPP_CLIENT_BidFloorSpec_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ActionType.h"
#include "BidFloorObjectiveType.h"
#include "Country.h"
#include "CreativeType.h"
#include "Currency.h"
#include "OptimizationGoalMetadata.h"
#include <list>

namespace Tiny {


/*! \brief Bid floor specification for a given campaign configuration.
 *
 *  \ingroup Models
 *
 */

class BidFloorSpec{
public:

    /*! \brief Constructor.
	 */
    BidFloorSpec();
    BidFloorSpec(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BidFloorSpec();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Ad group billable event type.
	 */
	ActionType getBillableEvent();

	/*! \brief Set Ad group billable event type.
	 */
	void setBillableEvent(ActionType billable_event);
	/*! \brief Get List of ISO 3166-1 alpha-2 country codes.
	 */
	std::list<Country> getCountries();

	/*! \brief Set List of ISO 3166-1 alpha-2 country codes.
	 */
	void setCountries(std::list<Country> countries);
	/*! \brief Get Creative type for the bid floor request.
	 */
	CreativeType getCreativeType();

	/*! \brief Set Creative type for the bid floor request.
	 */
	void setCreativeType(CreativeType creative_type);
	/*! \brief Get Currency for the bid floor value.
	 */
	Currency getCurrency();

	/*! \brief Set Currency for the bid floor value.
	 */
	void setCurrency(Currency currency);
	/*! \brief Get Campaign objective type.
	 */
	BidFloorObjectiveType getObjectiveType();

	/*! \brief Set Campaign objective type.
	 */
	void setObjectiveType(BidFloorObjectiveType objective_type);
	/*! \brief Get Optimization goal metadata.
	 */
	OptimizationGoalMetadata getOptimizationGoalMetadata();

	/*! \brief Set Optimization goal metadata.
	 */
	void setOptimizationGoalMetadata(OptimizationGoalMetadata optimization_goal_metadata);


    private:
    ActionType billable_event;
    std::list<Country> countries;
    CreativeType creative_type;
    Currency currency;
    BidFloorObjectiveType objective_type;
    OptimizationGoalMetadata optimization_goal_metadata;
};
}

#endif /* TINY_CPP_CLIENT_BidFloorSpec_H_ */
