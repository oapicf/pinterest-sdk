/*
 * PinMediaWithImage_allOf.h
 *
 * 
 */

#ifndef _PinMediaWithImage_allOf_H_
#define _PinMediaWithImage_allOf_H_


#include <string>
#include "ImageDetails.h"
#include <map>
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

class PinMediaWithImage_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaWithImage_allOf();
	PinMediaWithImage_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaWithImage_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::map<std::string, std::string> getImages();

	/*! \brief Set 
	 */
	void setImages(std::map <std::string, std::string> images);

private:
	std::map <std::string, std::string>images;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaWithImage_allOf_H_ */
