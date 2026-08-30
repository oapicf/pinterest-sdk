/*
 * TrendsAgeDistribution.h
 *
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */

#ifndef _TrendsAgeDistribution_H_
#define _TrendsAgeDistribution_H_


#include <string>
#include "TrendsAgeBucket.h"
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

class TrendsAgeDistribution : public Object {
public:
	/*! \brief Constructor.
	 */
	TrendsAgeDistribution();
	TrendsAgeDistribution(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TrendsAgeDistribution();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	TrendsAgeBucket getAgeDistribution();

	/*! \brief Set 
	 */
	void setAgeDistribution(TrendsAgeBucket  age_distribution);

private:
	TrendsAgeBucket age_distribution;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TrendsAgeDistribution_H_ */
