
/*
 * AudienceDemographics.h
 *
 * Audience demographics
 */

#ifndef TINY_CPP_CLIENT_AudienceDemographics_H_
#define TINY_CPP_CLIENT_AudienceDemographics_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AudienceDemographicValue.h"
#include <list>

namespace Tiny {


/*! \brief Audience demographics
 *
 *  \ingroup Models
 *
 */

class AudienceDemographics{
public:

    /*! \brief Constructor.
	 */
    AudienceDemographics();
    AudienceDemographics(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceDemographics();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Ages distribution.
	 */
	std::list<AudienceDemographicValue> getAges();

	/*! \brief Set Ages distribution.
	 */
	void setAges(std::list<AudienceDemographicValue> ages);
	/*! \brief Get Country area distribution.
	 */
	std::list<AudienceDemographicValue> getCountries();

	/*! \brief Set Country area distribution.
	 */
	void setCountries(std::list<AudienceDemographicValue> countries);
	/*! \brief Get Device usage distribution.
	 */
	std::list<AudienceDemographicValue> getDevices();

	/*! \brief Set Device usage distribution.
	 */
	void setDevices(std::list<AudienceDemographicValue> devices);
	/*! \brief Get Gender distribution.
	 */
	std::list<AudienceDemographicValue> getGenders();

	/*! \brief Set Gender distribution.
	 */
	void setGenders(std::list<AudienceDemographicValue> genders);
	/*! \brief Get Geographic metro area distribution.
	 */
	std::list<AudienceDemographicValue> getMetros();

	/*! \brief Set Geographic metro area distribution.
	 */
	void setMetros(std::list<AudienceDemographicValue> metros);


    private:
    std::list<AudienceDemographicValue> ages;
    std::list<AudienceDemographicValue> countries;
    std::list<AudienceDemographicValue> devices;
    std::list<AudienceDemographicValue> genders;
    std::list<AudienceDemographicValue> metros;
};
}

#endif /* TINY_CPP_CLIENT_AudienceDemographics_H_ */
