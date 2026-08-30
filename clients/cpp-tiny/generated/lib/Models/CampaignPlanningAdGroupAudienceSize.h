
/*
 * CampaignPlanningAdGroupAudienceSize.h
 *
 * Range audience size for an ad group.
 */

#ifndef TINY_CPP_CLIENT_CampaignPlanningAdGroupAudienceSize_H_
#define TINY_CPP_CLIENT_CampaignPlanningAdGroupAudienceSize_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Range audience size for an ad group.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningAdGroupAudienceSize{
public:

    /*! \brief Constructor.
	 */
    CampaignPlanningAdGroupAudienceSize();
    CampaignPlanningAdGroupAudienceSize(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignPlanningAdGroupAudienceSize();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Lower bound of the audience size estimate.
	 */
	int getCountLower();

	/*! \brief Set Lower bound of the audience size estimate.
	 */
	void setCountLower(int count_lower);
	/*! \brief Get Upper bound of the audience size estimate.
	 */
	int getCountUpper();

	/*! \brief Set Upper bound of the audience size estimate.
	 */
	void setCountUpper(int count_upper);


    private:
    int count_lower{};
    int count_upper{};
};
}

#endif /* TINY_CPP_CLIENT_CampaignPlanningAdGroupAudienceSize_H_ */
