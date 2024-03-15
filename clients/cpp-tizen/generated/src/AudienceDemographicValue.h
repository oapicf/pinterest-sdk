/*
 * AudienceDemographicValue.h
 *
 * Demographic detail for a single audience demographic
 */

#ifndef _AudienceDemographicValue_H_
#define _AudienceDemographicValue_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Demographic detail for a single audience demographic
 *
 *  \ingroup Models
 *
 */

class AudienceDemographicValue : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceDemographicValue();
	AudienceDemographicValue(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceDemographicValue();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	long long getRatio();

	/*! \brief Set Value of demographic item as a percent of total audience
	 */
	void setRatio(long long  ratio);

private:
	std::string key;
	std::string name;
	long long ratio;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AudienceDemographicValue_H_ */
