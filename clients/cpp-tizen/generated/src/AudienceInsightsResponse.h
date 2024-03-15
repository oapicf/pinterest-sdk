/*
 * AudienceInsightsResponse.h
 *
 * Audience interests and demographics.
 */

#ifndef _AudienceInsightsResponse_H_
#define _AudienceInsightsResponse_H_


#include <string>
#include "AudienceCategory.h"
#include "AudienceDemographics.h"
#include "AudienceInsightType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Audience interests and demographics.
 *
 *  \ingroup Models
 *
 */

class AudienceInsightsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceInsightsResponse();
	AudienceInsightsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceInsightsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Category interest distribution
	 */
	std::list<AudienceCategory> getCategories();

	/*! \brief Set Category interest distribution
	 */
	void setCategories(std::list <AudienceCategory> categories);
	/*! \brief Get 
	 */
	AudienceDemographics getDemographics();

	/*! \brief Set 
	 */
	void setDemographics(AudienceDemographics  demographics);
	/*! \brief Get 
	 */
	AudienceInsightType getType();

	/*! \brief Set 
	 */
	void setType(AudienceInsightType  type);
	/*! \brief Get Generation date
	 */
	std::string getDate();

	/*! \brief Set Generation date
	 */
	void setDate(std::string  date);
	/*! \brief Get Population count.
	 */
	int getSize();

	/*! \brief Set Population count.
	 */
	void setSize(int  size);
	/*! \brief Get Indicates whether the audience size has been rounded up to the next highest upper boundary.
	 */
	bool getSizeIsUpperBound();

	/*! \brief Set Indicates whether the audience size has been rounded up to the next highest upper boundary.
	 */
	void setSizeIsUpperBound(bool  size_is_upper_bound);

private:
	std::list <AudienceCategory>categories;
	AudienceDemographics demographics;
	AudienceInsightType type;
	std::string date;
	int size;
	bool size_is_upper_bound;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AudienceInsightsResponse_H_ */
