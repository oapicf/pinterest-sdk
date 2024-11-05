/*
 * TargetingTemplateAudienceSizing_reach_estimate.h
 *
 * 
 */

#ifndef _TargetingTemplateAudienceSizing_reach_estimate_H_
#define _TargetingTemplateAudienceSizing_reach_estimate_H_


#include <string>
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

class TargetingTemplateAudienceSizing_reach_estimate : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingTemplateAudienceSizing_reach_estimate();
	TargetingTemplateAudienceSizing_reach_estimate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingTemplateAudienceSizing_reach_estimate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	long long getEstimate();

	/*! \brief Set 
	 */
	void setEstimate(long long  estimate);
	/*! \brief Get 
	 */
	long long getLowerBound();

	/*! \brief Set 
	 */
	void setLowerBound(long long  lower_bound);
	/*! \brief Get 
	 */
	long long getUpperBound();

	/*! \brief Set 
	 */
	void setUpperBound(long long  upper_bound);

private:
	long long estimate;
	long long lower_bound;
	long long upper_bound;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingTemplateAudienceSizing_reach_estimate_H_ */
