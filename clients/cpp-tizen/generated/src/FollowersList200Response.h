/*
 * Followers_list_200_response.h
 *
 * 
 */

#ifndef _Followers_list_200_response_H_
#define _Followers_list_200_response_H_


#include <string>
#include "UserSummary.h"
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

class Followers_list_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Followers_list_200_response();
	Followers_list_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Followers_list_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<UserSummary> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <UserSummary> items);
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <UserSummary>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Followers_list_200_response_H_ */
