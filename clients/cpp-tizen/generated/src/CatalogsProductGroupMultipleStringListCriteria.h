/*
 * CatalogsProductGroupMultipleStringListCriteria.h
 *
 * 
 */

#ifndef _CatalogsProductGroupMultipleStringListCriteria_H_
#define _CatalogsProductGroupMultipleStringListCriteria_H_


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

class CatalogsProductGroupMultipleStringListCriteria : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupMultipleStringListCriteria();
	CatalogsProductGroupMultipleStringListCriteria(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupMultipleStringListCriteria();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<std::list> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <std::list> values);
	/*! \brief Get 
	 */
	bool getNegated();

	/*! \brief Set 
	 */
	void setNegated(bool  negated);

private:
	std::list <std::list>values;
	bool negated;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupMultipleStringListCriteria_H_ */
