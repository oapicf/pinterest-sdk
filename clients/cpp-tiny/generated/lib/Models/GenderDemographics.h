
/*
 * GenderDemographics.h
 *
 * Gender demographic distribution
 */

#ifndef TINY_CPP_CLIENT_GenderDemographics_H_
#define TINY_CPP_CLIENT_GenderDemographics_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Gender demographic distribution
 *
 *  \ingroup Models
 *
 */

class GenderDemographics{
public:

    /*! \brief Constructor.
	 */
    GenderDemographics();
    GenderDemographics(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GenderDemographics();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Percentage of female users
	 */
	long getFemale();

	/*! \brief Set Percentage of female users
	 */
	void setFemale(long female);
	/*! \brief Get Percentage of male users
	 */
	long getMale();

	/*! \brief Set Percentage of male users
	 */
	void setMale(long male);
	/*! \brief Get Percentage of users with unspecified gender
	 */
	long getUnspecified();

	/*! \brief Set Percentage of users with unspecified gender
	 */
	void setUnspecified(long unspecified);


    private:
    long female{};
    long male{};
    long unspecified{};
};
}

#endif /* TINY_CPP_CLIENT_GenderDemographics_H_ */
