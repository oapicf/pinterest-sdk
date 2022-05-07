/*
 * ItemIdFilter.h
 *
 * 
 */

#ifndef _ItemIdFilter_H_
#define _ItemIdFilter_H_


#include <string>
#include "CatalogsProductGroupCurrencyCriteria.h"
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

class ItemIdFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemIdFilter();
	ItemIdFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemIdFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupCurrencyCriteria getITEMID();

	/*! \brief Set 
	 */
	void setITEMID(CatalogsProductGroupCurrencyCriteria  iTEM_ID);

private:
	CatalogsProductGroupCurrencyCriteria iTEM_ID;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemIdFilter_H_ */
