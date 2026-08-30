
/*
 * CampaignPlanningPointEstimate.h
 *
 * A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
 */

#ifndef TINY_CPP_CLIENT_CampaignPlanningPointEstimate_H_
#define TINY_CPP_CLIENT_CampaignPlanningPointEstimate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningPointEstimate{
public:

    /*! \brief Constructor.
	 */
    CampaignPlanningPointEstimate();
    CampaignPlanningPointEstimate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignPlanningPointEstimate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The budget value of the point.
	 */
	int getBudget();

	/*! \brief Set The budget value of the point.
	 */
	void setBudget(int budget);
	/*! \brief Get Y value as a decimal.
	 */
	double getDoubleY();

	/*! \brief Set Y value as a decimal.
	 */
	void setDoubleY(double double_y);
	/*! \brief Get The maximum Y value of the point.
	 */
	int getMaxY();

	/*! \brief Set The maximum Y value of the point.
	 */
	void setMaxY(int max_y);
	/*! \brief Get The minimum Y value of the point.
	 */
	int getMinY();

	/*! \brief Set The minimum Y value of the point.
	 */
	void setMinY(int min_y);
	/*! \brief Get The expected Y value of the point.
	 */
	int getY();

	/*! \brief Set The expected Y value of the point.
	 */
	void setY(int y);


    private:
    int budget{};
    double double_y{};
    int max_y{};
    int min_y{};
    int y{};
};
}

#endif /* TINY_CPP_CLIENT_CampaignPlanningPointEstimate_H_ */
