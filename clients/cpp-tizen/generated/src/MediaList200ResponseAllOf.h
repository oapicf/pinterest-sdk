/*
 * Media_list_200_response_allOf.h
 *
 * 
 */

#ifndef _Media_list_200_response_allOf_H_
#define _Media_list_200_response_allOf_H_


#include <string>
#include "MediaUploadDetails.h"
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

class Media_list_200_response_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	Media_list_200_response_allOf();
	Media_list_200_response_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Media_list_200_response_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Media
	 */
	std::list<MediaUploadDetails> getItems();

	/*! \brief Set Media
	 */
	void setItems(std::list <MediaUploadDetails> items);

private:
	std::list <MediaUploadDetails>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Media_list_200_response_allOf_H_ */
