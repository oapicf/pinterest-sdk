
/*
 * CampaignObjectivesFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CampaignObjectivesFilter_H_
#define TINY_CPP_CLIENT_CampaignObjectivesFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ObjectiveType.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CampaignObjectivesFilter{
public:

    /*! \brief Constructor.
	 */
    CampaignObjectivesFilter();
    CampaignObjectivesFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignObjectivesFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
	 */
	std::list<ObjectiveType> getCampaignObjectiveTypes();

	/*! \brief Set List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
	 */
	void setCampaignObjectiveTypes(std::list <ObjectiveType> campaign_objective_types);


    private:
    std::list<ObjectiveType> campaign_objective_types;
};
}

#endif /* TINY_CPP_CLIENT_CampaignObjectivesFilter_H_ */
