/*
 * GenderDemographics.h
 *
 * Gender demographic distribution
 */

#ifndef _GenderDemographics_H_
#define _GenderDemographics_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Gender demographic distribution
 *
 *  \ingroup Models
 *
 */

class GenderDemographics : public Object {
public:
	/*! \brief Constructor.
	 */
	GenderDemographics();
	GenderDemographics(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenderDemographics();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Percentage of female users
	 */
	long long getFemale();

	/*! \brief Set Percentage of female users
	 */
	void setFemale(long long  female);
	/*! \brief Get Percentage of male users
	 */
	long long getMale();

	/*! \brief Set Percentage of male users
	 */
	void setMale(long long  male);
	/*! \brief Get Percentage of users with unspecified gender
	 */
	long long getUnspecified();

	/*! \brief Set Percentage of users with unspecified gender
	 */
	void setUnspecified(long long  unspecified);

private:
	long long female;
	long long male;
	long long unspecified;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenderDemographics_H_ */
