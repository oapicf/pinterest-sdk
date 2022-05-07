/*
 * PinMedia.h
 *
 * Pin media objects.
 */

#ifndef _PinMedia_H_
#define _PinMedia_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Pin media objects.
 *
 *  \ingroup Models
 *
 */

class PinMedia : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMedia();
	PinMedia(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMedia();

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

#endif /* _PinMedia_H_ */
