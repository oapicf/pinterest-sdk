/*
 * Get_invites_200_response.h
 *
 * 
 */

#ifndef _Get_invites_200_response_H_
#define _Get_invites_200_response_H_


#include <string>
#include "InviteResponse.h"
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

class Get_invites_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Get_invites_200_response();
	Get_invites_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Get_invites_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of invite and request data.
	 */
	std::list<InviteResponse> getItems();

	/*! \brief Set List of invite and request data.
	 */
	void setItems(std::list <InviteResponse> items);
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <InviteResponse>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Get_invites_200_response_H_ */
