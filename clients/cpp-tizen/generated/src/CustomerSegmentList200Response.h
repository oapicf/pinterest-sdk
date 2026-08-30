/*
 * Customer_segment_list_200_response.h
 *
 * 
 */

#ifndef _Customer_segment_list_200_response_H_
#define _Customer_segment_list_200_response_H_


#include <string>
#include "CustomerSegment.h"
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

class Customer_segment_list_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Customer_segment_list_200_response();
	Customer_segment_list_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Customer_segment_list_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);
	/*! \brief Get 
	 */
	std::list<CustomerSegment> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <CustomerSegment> items);

private:
	std::string bookmark;
	std::list <CustomerSegment>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Customer_segment_list_200_response_H_ */
