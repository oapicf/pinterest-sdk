/*
 * TrendingKeywordDemographics.h
 *
 * A mapping of demographic dimensions (e.g. \&quot;gender\&quot;, \&quot;age\&quot;) to their category distributions. For each dimension: Key: The category (e.g., \&quot;female\&quot;, \&quot;18-24\&quot;). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when &#x60;include_demographics&#x60; query parameter is set to &#x60;true&#x60;.
 */

#ifndef _TrendingKeywordDemographics_H_
#define _TrendingKeywordDemographics_H_


#include <string>
#include "TrendsAgeDistribution.h"
#include "TrendsGenderDistribution.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. For each dimension: Key: The category (e.g., \"female\", \"18-24\"). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when `include_demographics` query parameter is set to `true`.
 *
 *  \ingroup Models
 *
 */

class TrendingKeywordDemographics : public Object {
public:
	/*! \brief Constructor.
	 */
	TrendingKeywordDemographics();
	TrendingKeywordDemographics(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TrendingKeywordDemographics();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	TrendsAgeDistribution getAgeDistribution();

	/*! \brief Set 
	 */
	void setAgeDistribution(TrendsAgeDistribution  age_distribution);
	/*! \brief Get 
	 */
	TrendsGenderDistribution getGenderDistribution();

	/*! \brief Set 
	 */
	void setGenderDistribution(TrendsGenderDistribution  gender_distribution);

private:
	TrendsAgeDistribution age_distribution;
	TrendsGenderDistribution gender_distribution;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TrendingKeywordDemographics_H_ */
