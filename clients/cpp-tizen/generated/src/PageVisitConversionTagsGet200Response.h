/*
 * Page_visit_conversion_tags_get_200_response.h
 *
 * 
 */

#ifndef _Page_visit_conversion_tags_get_200_response_H_
#define _Page_visit_conversion_tags_get_200_response_H_


#include <string>
#include "ConversionEventResponse.h"
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

class Page_visit_conversion_tags_get_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Page_visit_conversion_tags_get_200_response();
	Page_visit_conversion_tags_get_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Page_visit_conversion_tags_get_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<ConversionEventResponse> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <ConversionEventResponse> items);
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <ConversionEventResponse>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Page_visit_conversion_tags_get_200_response_H_ */
