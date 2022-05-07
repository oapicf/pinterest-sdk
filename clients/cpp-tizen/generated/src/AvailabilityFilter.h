/*
 * AvailabilityFilter.h
 *
 * 
 */

#ifndef _AvailabilityFilter_H_
#define _AvailabilityFilter_H_


#include <string>
#include "CatalogsProductGroupMultipleStringCriteria.h"
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

class AvailabilityFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	AvailabilityFilter();
	AvailabilityFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AvailabilityFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getAVAILABILITY();

	/*! \brief Set 
	 */
	void setAVAILABILITY(CatalogsProductGroupMultipleStringCriteria  aVAILABILITY);

private:
	CatalogsProductGroupMultipleStringCriteria aVAILABILITY;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AvailabilityFilter_H_ */
