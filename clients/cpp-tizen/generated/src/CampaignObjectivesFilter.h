/*
 * CampaignObjectivesFilter.h
 *
 * 
 */

#ifndef _CampaignObjectivesFilter_H_
#define _CampaignObjectivesFilter_H_


#include <string>
#include "ObjectiveType.h"
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

class CampaignObjectivesFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignObjectivesFilter();
	CampaignObjectivesFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignObjectivesFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
	 */
	std::list<ObjectiveType> getCampaignObjectiveTypes();

	/*! \brief Set List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
	 */
	void setCampaignObjectiveTypes(std::list <ObjectiveType> campaign_objective_types);

private:
	std::list <ObjectiveType>campaign_objective_types;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignObjectivesFilter_H_ */
