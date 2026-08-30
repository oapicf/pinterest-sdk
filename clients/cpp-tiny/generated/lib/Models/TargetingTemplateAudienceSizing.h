
/*
 * TargetingTemplateAudienceSizing.h
 *
 * Gets an audience size estimate for a set of given targeting spec data. **Returns:** An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate.
 */

#ifndef TINY_CPP_CLIENT_TargetingTemplateAudienceSizing_H_
#define TINY_CPP_CLIENT_TargetingTemplateAudienceSizing_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TargetingTemplateAudienceSizingReachEstimate.h"

namespace Tiny {


/*! \brief Gets an audience size estimate for a set of given targeting spec data. **Returns:** An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate.
 *
 *  \ingroup Models
 *
 */

class TargetingTemplateAudienceSizing{
public:

    /*! \brief Constructor.
	 */
    TargetingTemplateAudienceSizing();
    TargetingTemplateAudienceSizing(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TargetingTemplateAudienceSizing();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	TargetingTemplateAudienceSizingReachEstimate getReachEstimate();

	/*! \brief Set 
	 */
	void setReachEstimate(TargetingTemplateAudienceSizingReachEstimate reach_estimate);


    private:
    TargetingTemplateAudienceSizingReachEstimate reach_estimate;
};
}

#endif /* TINY_CPP_CLIENT_TargetingTemplateAudienceSizing_H_ */
