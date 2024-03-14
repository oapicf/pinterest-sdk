/*
 * Pin_media.h
 *
 * 
 */

#ifndef _Pin_media_H_
#define _Pin_media_H_


#include <string>
#include "PinMedia.h"
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

class Pin_media : public Object {
public:
	/*! \brief Constructor.
	 */
	Pin_media();
	Pin_media(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Pin_media();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getMediaType();

	/*! \brief Set 
	 */
	void setMediaType(std::string  media_type);

private:
	std::string media_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Pin_media_H_ */
