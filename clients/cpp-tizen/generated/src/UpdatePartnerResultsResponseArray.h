/*
 * UpdatePartnerResultsResponseArray.h
 *
 * 
 */

#ifndef _UpdatePartnerResultsResponseArray_H_
#define _UpdatePartnerResultsResponseArray_H_


#include <string>
#include "UpdatePartnerResultsResponseArray_items_inner.h"
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

class UpdatePartnerResultsResponseArray : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdatePartnerResultsResponseArray();
	UpdatePartnerResultsResponseArray(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdatePartnerResultsResponseArray();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<UpdatePartnerResultsResponseArray_items_inner> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <UpdatePartnerResultsResponseArray_items_inner> items);

private:
	std::list <UpdatePartnerResultsResponseArray_items_inner>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdatePartnerResultsResponseArray_H_ */
