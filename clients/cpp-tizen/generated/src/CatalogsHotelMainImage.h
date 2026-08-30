/*
 * CatalogsHotelMainImage.h
 *
 * The main hotel image
 */

#ifndef _CatalogsHotelMainImage_H_
#define _CatalogsHotelMainImage_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The main hotel image
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelMainImage : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelMainImage();
	CatalogsHotelMainImage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelMainImage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get <= 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
	 */
	std::string getLink();

	/*! \brief Set <= 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
	 */
	void setLink(std::string  link);
	/*! \brief Get Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
	 */
	std::list<std::string> getTag();

	/*! \brief Set Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
	 */
	void setTag(std::list <std::string> tag);

private:
	std::string link;
	std::list <std::string>tag;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelMainImage_H_ */
