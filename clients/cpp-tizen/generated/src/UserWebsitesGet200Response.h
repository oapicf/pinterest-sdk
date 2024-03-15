/*
 * User_websites_get_200_response.h
 *
 * 
 */

#ifndef _User_websites_get_200_response_H_
#define _User_websites_get_200_response_H_


#include <string>
#include "UserWebsiteSummary.h"
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

class User_websites_get_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	User_websites_get_200_response();
	User_websites_get_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~User_websites_get_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<UserWebsiteSummary> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <UserWebsiteSummary> items);
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <UserWebsiteSummary>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _User_websites_get_200_response_H_ */
