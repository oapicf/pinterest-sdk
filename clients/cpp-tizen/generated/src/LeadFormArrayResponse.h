/*
 * LeadFormArrayResponse.h
 *
 * 
 */

#ifndef _LeadFormArrayResponse_H_
#define _LeadFormArrayResponse_H_


#include <string>
#include "LeadFormArrayResponse_items_inner.h"
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

class LeadFormArrayResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadFormArrayResponse();
	LeadFormArrayResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadFormArrayResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<LeadFormArrayResponse_items_inner> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <LeadFormArrayResponse_items_inner> items);

private:
	std::list <LeadFormArrayResponse_items_inner>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LeadFormArrayResponse_H_ */
