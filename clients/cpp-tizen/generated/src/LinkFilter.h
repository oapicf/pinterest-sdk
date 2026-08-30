/*
 * LinkFilter.h
 *
 * 
 */

#ifndef _LinkFilter_H_
#define _LinkFilter_H_


#include <string>
#include "CatalogsProductGroupFilterOperatorTypeCriteria.h"
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

class LinkFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	LinkFilter();
	LinkFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LinkFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getLINK();

	/*! \brief Set 
	 */
	void setLINK(CatalogsProductGroupFilterOperatorTypeCriteria  lINK);

private:
	CatalogsProductGroupFilterOperatorTypeCriteria lINK;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LinkFilter_H_ */
