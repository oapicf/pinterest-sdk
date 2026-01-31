/*
 * TrendingKeyword_demographics_age_distribution.h
 *
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */

#ifndef _TrendingKeyword_demographics_age_distribution_H_
#define _TrendingKeyword_demographics_age_distribution_H_


#include <string>
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 *
 *  \ingroup Models
 *
 */

class TrendingKeyword_demographics_age_distribution : public Object {
public:
	/*! \brief Constructor.
	 */
	TrendingKeyword_demographics_age_distribution();
	TrendingKeyword_demographics_age_distribution(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TrendingKeyword_demographics_age_distribution();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getAgeDistribution();

	/*! \brief Set 
	 */
	void setAgeDistribution(std::string  age_distribution);

private:
	std::string age_distribution;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TrendingKeyword_demographics_age_distribution_H_ */
