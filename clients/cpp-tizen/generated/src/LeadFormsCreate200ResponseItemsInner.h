/*
 * Lead_forms_create_200_response_items_inner.h
 *
 * 
 */

#ifndef _Lead_forms_create_200_response_items_inner_H_
#define _Lead_forms_create_200_response_items_inner_H_


#include <string>
#include "LeadForm.h"
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

class Lead_forms_create_200_response_items_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	Lead_forms_create_200_response_items_inner();
	Lead_forms_create_200_response_items_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Lead_forms_create_200_response_items_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	LeadForm getData();

	/*! \brief Set 
	 */
	void setData(LeadForm  data);
	/*! \brief Get 
	 */
	std::list<Pinterest.Lib.BatchItemException> getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(std::list <Pinterest.Lib.BatchItemException> exceptions);

private:
	LeadForm data;
	std::list <Pinterest.Lib.BatchItemException>exceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Lead_forms_create_200_response_items_inner_H_ */
