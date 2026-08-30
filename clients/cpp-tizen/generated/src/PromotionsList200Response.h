/*
 * Promotions_list_200_response.h
 *
 * 
 */

#ifndef _Promotions_list_200_response_H_
#define _Promotions_list_200_response_H_


#include <string>
#include "Promotion.h"
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

class Promotions_list_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Promotions_list_200_response();
	Promotions_list_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Promotions_list_200_response();

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
	std::list<Promotion> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <Promotion> items);

private:
	std::string bookmark;
	std::list <Promotion>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Promotions_list_200_response_H_ */
