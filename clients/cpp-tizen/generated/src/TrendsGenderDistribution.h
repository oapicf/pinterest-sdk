/*
 * TrendsGenderDistribution.h
 *
 * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */

#ifndef _TrendsGenderDistribution_H_
#define _TrendsGenderDistribution_H_


#include <string>
#include "TrendsGender.h"
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 *
 *  \ingroup Models
 *
 */

class TrendsGenderDistribution : public Object {
public:
	/*! \brief Constructor.
	 */
	TrendsGenderDistribution();
	TrendsGenderDistribution(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TrendsGenderDistribution();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	TrendsGender getGenderDistribution();

	/*! \brief Set 
	 */
	void setGenderDistribution(TrendsGender  gender_distribution);

private:
	TrendsGender gender_distribution;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TrendsGenderDistribution_H_ */
