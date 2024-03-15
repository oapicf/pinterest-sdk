/*
 * CatalogsHotelAttributes_allOf_main_image.h
 *
 * The main hotel image
 */

#ifndef _CatalogsHotelAttributes_allOf_main_image_H_
#define _CatalogsHotelAttributes_allOf_main_image_H_


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

class CatalogsHotelAttributes_allOf_main_image : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelAttributes_allOf_main_image();
	CatalogsHotelAttributes_allOf_main_image(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelAttributes_allOf_main_image();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get <p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p>
	 */
	std::string getLink();

	/*! \brief Set <p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p>
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

#endif /* _CatalogsHotelAttributes_allOf_main_image_H_ */
