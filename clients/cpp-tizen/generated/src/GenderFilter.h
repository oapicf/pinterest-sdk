/*
 * GenderFilter.h
 *
 * 
 */

#ifndef _GenderFilter_H_
#define _GenderFilter_H_


#include <string>
#include "CatalogsProductGroupMultipleGenderCriteria.h"
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

class GenderFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	GenderFilter();
	GenderFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenderFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleGenderCriteria getGENDER();

	/*! \brief Set 
	 */
	void setGENDER(CatalogsProductGroupMultipleGenderCriteria  gENDER);

private:
	CatalogsProductGroupMultipleGenderCriteria gENDER;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenderFilter_H_ */
