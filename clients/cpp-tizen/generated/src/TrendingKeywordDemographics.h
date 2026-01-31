/*
 * TrendingKeyword_demographics.h
 *
 * A mapping of demographic dimensions (e.g. \&quot;gender\&quot;, \&quot;age\&quot;) to their category distributions. &lt;br /&gt; For each dimension: &lt;br /&gt;   - Key: The category (e.g., \&quot;female\&quot;, \&quot;18-24\&quot;). &lt;br /&gt;   - Value: The proportion of search volume (e.g., 0.12 for 12%). &lt;br /&gt;     Values less than 0.05 are set to 0.04 for privacy. &lt;br /&gt;     The sum for all categories in a dimension will approximately equal 1. &lt;br /&gt;     Only applicable when &#x60;include_demographics&#x60; query parameter is set to &#x60;true&#x60;.
 */

#ifndef _TrendingKeyword_demographics_H_
#define _TrendingKeyword_demographics_H_


#include <string>
#include "TrendingKeyword_demographics_age_distribution.h"
#include "TrendingKeyword_demographics_gender_distribution.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. <br /> For each dimension: <br />   - Key: The category (e.g., \"female\", \"18-24\"). <br />   - Value: The proportion of search volume (e.g., 0.12 for 12%). <br />     Values less than 0.05 are set to 0.04 for privacy. <br />     The sum for all categories in a dimension will approximately equal 1. <br />     Only applicable when `include_demographics` query parameter is set to `true`.
 *
 *  \ingroup Models
 *
 */

class TrendingKeyword_demographics : public Object {
public:
	/*! \brief Constructor.
	 */
	TrendingKeyword_demographics();
	TrendingKeyword_demographics(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TrendingKeyword_demographics();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	TrendingKeyword_demographics_age_distribution getAgeDistribution();

	/*! \brief Set 
	 */
	void setAgeDistribution(TrendingKeyword_demographics_age_distribution  age_distribution);
	/*! \brief Get 
	 */
	TrendingKeyword_demographics_gender_distribution getGenderDistribution();

	/*! \brief Set 
	 */
	void setGenderDistribution(TrendingKeyword_demographics_gender_distribution  gender_distribution);

private:
	TrendingKeyword_demographics_age_distribution age_distribution;
	TrendingKeyword_demographics_gender_distribution gender_distribution;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TrendingKeyword_demographics_H_ */
