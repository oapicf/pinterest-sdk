/*
 * Shared_audiences_for_business_list_200_response.h
 *
 * 
 */

#ifndef _Shared_audiences_for_business_list_200_response_H_
#define _Shared_audiences_for_business_list_200_response_H_


#include <string>
#include "Audience.h"
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

class Shared_audiences_for_business_list_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Shared_audiences_for_business_list_200_response();
	Shared_audiences_for_business_list_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Shared_audiences_for_business_list_200_response();

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
	std::list<Audience> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <Audience> items);

private:
	std::string bookmark;
	std::list <Audience>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Shared_audiences_for_business_list_200_response_H_ */
