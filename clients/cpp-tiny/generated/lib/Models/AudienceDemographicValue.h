
/*
 * AudienceDemographicValue.h
 *
 * Demographic detail for a single audience demographic
 */

#ifndef TINY_CPP_CLIENT_AudienceDemographicValue_H_
#define TINY_CPP_CLIENT_AudienceDemographicValue_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Demographic detail for a single audience demographic
 *
 *  \ingroup Models
 *
 */

class AudienceDemographicValue{
public:

    /*! \brief Constructor.
	 */
    AudienceDemographicValue();
    AudienceDemographicValue(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceDemographicValue();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique key for demographic item
	 */
	std::string getKey();

	/*! \brief Set Unique key for demographic item
	 */
	void setKey(std::string  key);
	/*! \brief Get Display name for demographic
	 */
	std::string getName();

	/*! \brief Set Display name for demographic
	 */
	void setName(std::string  name);
	/*! \brief Get Value of demographic item as a percent of total audience
	 */
	long getRatio();

	/*! \brief Set Value of demographic item as a percent of total audience
	 */
	void setRatio(long  ratio);


    private:
    std::string key{};
    std::string name{};
    long ratio{};
};
}

#endif /* TINY_CPP_CLIENT_AudienceDemographicValue_H_ */
