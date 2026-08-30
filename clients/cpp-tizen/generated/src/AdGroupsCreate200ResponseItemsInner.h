/*
 * Ad_groups_create_200_response_items_inner.h
 *
 * 
 */

#ifndef _Ad_groups_create_200_response_items_inner_H_
#define _Ad_groups_create_200_response_items_inner_H_


#include <string>
#include "AdGroup.h"
#include "Pinterest.Lib.BatchItemException.h"
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

class Ad_groups_create_200_response_items_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	Ad_groups_create_200_response_items_inner();
	Ad_groups_create_200_response_items_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Ad_groups_create_200_response_items_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AdGroup getData();

	/*! \brief Set 
	 */
	void setData(AdGroup  data);
	/*! \brief Get 
	 */
	std::list<Pinterest.Lib.BatchItemException> getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(std::list <Pinterest.Lib.BatchItemException> exceptions);

private:
	AdGroup data;
	std::list <Pinterest.Lib.BatchItemException>exceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Ad_groups_create_200_response_items_inner_H_ */
