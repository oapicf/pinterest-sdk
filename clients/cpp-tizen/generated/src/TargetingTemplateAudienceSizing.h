/*
 * TargetingTemplateAudienceSizing.h
 *
 * Gets an audience size estimate for a set of given targeting spec data. &lt;p&gt;Returns:&lt;/p&gt; An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate. 
 */

#ifndef _TargetingTemplateAudienceSizing_H_
#define _TargetingTemplateAudienceSizing_H_


#include <string>
#include "TargetingTemplateAudienceSizing_reach_estimate.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Gets an audience size estimate for a set of given targeting spec data. <p>Returns:</p> An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate. 
 *
 *  \ingroup Models
 *
 */

class TargetingTemplateAudienceSizing : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingTemplateAudienceSizing();
	TargetingTemplateAudienceSizing(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingTemplateAudienceSizing();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	TargetingTemplateAudienceSizing_reach_estimate getReachEstimate();

	/*! \brief Set 
	 */
	void setReachEstimate(TargetingTemplateAudienceSizing_reach_estimate  reach_estimate);

private:
	TargetingTemplateAudienceSizing_reach_estimate reach_estimate;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingTemplateAudienceSizing_H_ */
