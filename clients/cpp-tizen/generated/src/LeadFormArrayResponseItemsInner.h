/*
 * LeadFormArrayResponse_items_inner.h
 *
 * 
 */

#ifndef _LeadFormArrayResponse_items_inner_H_
#define _LeadFormArrayResponse_items_inner_H_


#include <string>
#include "Exception.h"
#include "LeadFormResponse.h"
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

class LeadFormArrayResponse_items_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadFormArrayResponse_items_inner();
	LeadFormArrayResponse_items_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadFormArrayResponse_items_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	LeadFormResponse getData();

	/*! \brief Set 
	 */
	void setData(LeadFormResponse  data);
	/*! \brief Get 
	 */
	std::list<Exception> getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(std::list <Exception> exceptions);

private:
	LeadFormResponse data;
	std::list <Exception>exceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LeadFormArrayResponse_items_inner_H_ */
