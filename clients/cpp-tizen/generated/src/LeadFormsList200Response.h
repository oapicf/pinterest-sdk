/*
 * Lead_forms_list_200_response.h
 *
 * 
 */

#ifndef _Lead_forms_list_200_response_H_
#define _Lead_forms_list_200_response_H_


#include <string>
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

class Lead_forms_list_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Lead_forms_list_200_response();
	Lead_forms_list_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Lead_forms_list_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<LeadFormResponse> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <LeadFormResponse> items);
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <LeadFormResponse>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Lead_forms_list_200_response_H_ */
