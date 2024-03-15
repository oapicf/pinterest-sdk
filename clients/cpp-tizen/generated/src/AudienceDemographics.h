/*
 * AudienceDemographics.h
 *
 * Audience demographics
 */

#ifndef _AudienceDemographics_H_
#define _AudienceDemographics_H_


#include <string>
#include "AudienceDemographicValue.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Audience demographics
 *
 *  \ingroup Models
 *
 */

class AudienceDemographics : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceDemographics();
	AudienceDemographics(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceDemographics();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Ages distribution.
	 */
	std::list<AudienceDemographicValue> getAges();

	/*! \brief Set Ages distribution.
	 */
	void setAges(std::list <AudienceDemographicValue> ages);
	/*! \brief Get Gender distribution.
	 */
	std::list<AudienceDemographicValue> getGenders();

	/*! \brief Set Gender distribution.
	 */
	void setGenders(std::list <AudienceDemographicValue> genders);
	/*! \brief Get Device usage distribution.
	 */
	std::list<AudienceDemographicValue> getDevices();

	/*! \brief Set Device usage distribution.
	 */
	void setDevices(std::list <AudienceDemographicValue> devices);
	/*! \brief Get Geographic metro area distribution.
	 */
	std::list<AudienceDemographicValue> getMetros();

	/*! \brief Set Geographic metro area distribution.
	 */
	void setMetros(std::list <AudienceDemographicValue> metros);
	/*! \brief Get Country area distribution.
	 */
	std::list<AudienceDemographicValue> getCountries();

	/*! \brief Set Country area distribution.
	 */
	void setCountries(std::list <AudienceDemographicValue> countries);

private:
	std::list <AudienceDemographicValue>ages;
	std::list <AudienceDemographicValue>genders;
	std::list <AudienceDemographicValue>devices;
	std::list <AudienceDemographicValue>metros;
	std::list <AudienceDemographicValue>countries;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AudienceDemographics_H_ */
