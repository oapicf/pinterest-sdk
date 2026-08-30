/*
 * CampaignPlanningPointEstimate.h
 *
 * A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
 */

#ifndef _CampaignPlanningPointEstimate_H_
#define _CampaignPlanningPointEstimate_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningPointEstimate : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignPlanningPointEstimate();
	CampaignPlanningPointEstimate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignPlanningPointEstimate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The budget value of the point.
	 */
	int getBudget();

	/*! \brief Set The budget value of the point.
	 */
	void setBudget(int  budget);
	/*! \brief Get Y value as a decimal.
	 */
	double getDoubleY();

	/*! \brief Set Y value as a decimal.
	 */
	void setDoubleY(double  double_y);
	/*! \brief Get The maximum Y value of the point.
	 */
	int getMaxY();

	/*! \brief Set The maximum Y value of the point.
	 */
	void setMaxY(int  max_y);
	/*! \brief Get The minimum Y value of the point.
	 */
	int getMinY();

	/*! \brief Set The minimum Y value of the point.
	 */
	void setMinY(int  min_y);
	/*! \brief Get The expected Y value of the point.
	 */
	int getY();

	/*! \brief Set The expected Y value of the point.
	 */
	void setY(int  y);

private:
	int budget;
	double double_y;
	int max_y;
	int min_y;
	int y;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignPlanningPointEstimate_H_ */
