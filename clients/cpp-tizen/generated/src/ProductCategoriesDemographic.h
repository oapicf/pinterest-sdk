/*
 * ProductCategoriesDemographic.h
 *
 * Age and gender distribution who engaged with this product category in the past 3 months
 */

#ifndef _ProductCategoriesDemographic_H_
#define _ProductCategoriesDemographic_H_


#include <string>
#include "GenderDemographics.h"
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Age and gender distribution who engaged with this product category in the past 3 months
 *
 *  \ingroup Models
 *
 */

class ProductCategoriesDemographic : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductCategoriesDemographic();
	ProductCategoriesDemographic(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductCategoriesDemographic();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Age demographic distribution
	 */
	std::map<std::string, std::string> getAge();

	/*! \brief Set Age demographic distribution
	 */
	void setAge(std::map <std::string, std::string> age);
	/*! \brief Get 
	 */
	GenderDemographics getGender();

	/*! \brief Set 
	 */
	void setGender(GenderDemographics  gender);

private:
	std::map <std::string, std::string>age;
	GenderDemographics gender;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductCategoriesDemographic_H_ */
