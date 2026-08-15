
/*
 * BidFloorSpec.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BidFloorSpec_H_
#define TINY_CPP_CLIENT_BidFloorSpec_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ActionType.h"
#include "Country.h"
#include "CreativeType.h"
#include "Currency.h"
#include "ObjectiveType.h"
#include "OptimizationGoalMetadata.h"
#include <list>

namespace Tiny {


/*! \brief 
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

	/*! \brief Get 
	 */
	ActionType getBillableEvent();

	/*! \brief Set 
	 */
	void setBillableEvent(ActionType  billable_event);
	/*! \brief Get 
	 */
	std::list<Country> getCountries();

	/*! \brief Set 
	 */
	void setCountries(std::list <Country> countries);
	/*! \brief Get 
	 */
	CreativeType getCreativeType();

	/*! \brief Set 
	 */
	void setCreativeType(CreativeType  creative_type);
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
	OptimizationGoalMetadata getOptimizationGoalMetadata();

	/*! \brief Set 
	 */
	void setOptimizationGoalMetadata(OptimizationGoalMetadata  optimization_goal_metadata);


    private:
    ActionType billable_event;
    std::list<Country> countries;
    CreativeType creative_type;
    Currency currency;
    ObjectiveType objective_type;
    OptimizationGoalMetadata optimization_goal_metadata;
};
}

#endif /* TINY_CPP_CLIENT_BidFloorSpec_H_ */
