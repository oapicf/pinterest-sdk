
/*
 * TargetingTemplateAudienceSizing_reach_estimate.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TargetingTemplateAudienceSizing_reach_estimate_H_
#define TINY_CPP_CLIENT_TargetingTemplateAudienceSizing_reach_estimate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TargetingTemplateAudienceSizing_reach_estimate{
public:

    /*! \brief Constructor.
	 */
    TargetingTemplateAudienceSizing_reach_estimate();
    TargetingTemplateAudienceSizing_reach_estimate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TargetingTemplateAudienceSizing_reach_estimate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	long getEstimate();

	/*! \brief Set 
	 */
	void setEstimate(long  estimate);
	/*! \brief Get 
	 */
	long getLowerBound();

	/*! \brief Set 
	 */
	void setLowerBound(long  lower_bound);
	/*! \brief Get 
	 */
	long getUpperBound();

	/*! \brief Set 
	 */
	void setUpperBound(long  upper_bound);


    private:
    long estimate{};
    long lower_bound{};
    long upper_bound{};
};
}

#endif /* TINY_CPP_CLIENT_TargetingTemplateAudienceSizing_reach_estimate_H_ */
