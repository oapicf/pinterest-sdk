/*
 * Paginated.h
 *
 * 
 */

#ifndef _Paginated_H_
#define _Paginated_H_


#include <string>
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

class Paginated : public Object {
public:
	/*! \brief Constructor.
	 */
	Paginated();
	Paginated(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Paginated();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<std::string> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <std::string> items);
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <std::string>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Paginated_H_ */
