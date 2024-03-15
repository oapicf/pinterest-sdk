/*
 * AdGroupAudienceSizingResponse.h
 *
 * 
 */

#ifndef _AdGroupAudienceSizingResponse_H_
#define _AdGroupAudienceSizingResponse_H_


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

class AdGroupAudienceSizingResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupAudienceSizingResponse();
	AdGroupAudienceSizingResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupAudienceSizingResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
	 */
	long long getAudienceSizeLowerBound();

	/*! \brief Set The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
	 */
	void setAudienceSizeLowerBound(long long  audience_size_lower_bound);
	/*! \brief Get The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
	 */
	long long getAudienceSizeUpperBound();

	/*! \brief Set The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
	 */
	void setAudienceSizeUpperBound(long long  audience_size_upper_bound);

private:
	long long audience_size_lower_bound;
	long long audience_size_upper_bound;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupAudienceSizingResponse_H_ */
