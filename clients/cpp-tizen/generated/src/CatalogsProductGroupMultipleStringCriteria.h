/*
 * CatalogsProductGroupMultipleStringCriteria.h
 *
 * 
 */

#ifndef _CatalogsProductGroupMultipleStringCriteria_H_
#define _CatalogsProductGroupMultipleStringCriteria_H_


#include <string>
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

class CatalogsProductGroupMultipleStringCriteria : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupMultipleStringCriteria();
	CatalogsProductGroupMultipleStringCriteria(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupMultipleStringCriteria();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<std::string> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <std::string> values);
	/*! \brief Get 
	 */
	bool getNegated();

	/*! \brief Set 
	 */
	void setNegated(bool  negated);

private:
	std::list <std::string>values;
	bool negated;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupMultipleStringCriteria_H_ */
