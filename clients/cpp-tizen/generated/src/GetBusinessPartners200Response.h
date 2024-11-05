/*
 * Get_business_partners_200_response.h
 *
 * 
 */

#ifndef _Get_business_partners_200_response_H_
#define _Get_business_partners_200_response_H_


#include <string>
#include "UserBusinessRoleBinding.h"
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

class Get_business_partners_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Get_business_partners_200_response();
	Get_business_partners_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Get_business_partners_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of business partners.
	 */
	std::list<UserBusinessRoleBinding> getItems();

	/*! \brief Set List of business partners.
	 */
	void setItems(std::list <UserBusinessRoleBinding> items);
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <UserBusinessRoleBinding>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Get_business_partners_200_response_H_ */
