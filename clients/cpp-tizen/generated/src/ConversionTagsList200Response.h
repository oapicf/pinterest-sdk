/*
 * Conversion_tags_list_200_response.h
 *
 * 
 */

#ifndef _Conversion_tags_list_200_response_H_
#define _Conversion_tags_list_200_response_H_


#include <string>
#include "ConversionTag.h"
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

class Conversion_tags_list_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Conversion_tags_list_200_response();
	Conversion_tags_list_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Conversion_tags_list_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<ConversionTag> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <ConversionTag> items);

private:
	std::list <ConversionTag>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Conversion_tags_list_200_response_H_ */
