/*
 * CatalogsProductGroupMultipleGenderCriteria.h
 *
 * 
 */

#ifndef _CatalogsProductGroupMultipleGenderCriteria_H_
#define _CatalogsProductGroupMultipleGenderCriteria_H_


#include <string>
#include "Gender.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupMultipleGenderCriteria : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupMultipleGenderCriteria();
	CatalogsProductGroupMultipleGenderCriteria(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupMultipleGenderCriteria();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<Gender> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <Gender> values);
	/*! \brief Get 
	 */
	bool getNegated();

	/*! \brief Set 
	 */
	void setNegated(bool  negated);

private:
	std::list <Gender>values;
	bool negated;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupMultipleGenderCriteria_H_ */
