/*
 * CatalogsProductGroupMultipleMediaTypesCriteria.h
 *
 * 
 */

#ifndef _CatalogsProductGroupMultipleMediaTypesCriteria_H_
#define _CatalogsProductGroupMultipleMediaTypesCriteria_H_


#include <string>
#include "MediaType.h"
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

class CatalogsProductGroupMultipleMediaTypesCriteria : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupMultipleMediaTypesCriteria();
	CatalogsProductGroupMultipleMediaTypesCriteria(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupMultipleMediaTypesCriteria();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<MediaType> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <MediaType> values);
	/*! \brief Get 
	 */
	bool getNegated();

	/*! \brief Set 
	 */
	void setNegated(bool  negated);

private:
	std::list <MediaType>values;
	bool negated;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupMultipleMediaTypesCriteria_H_ */
