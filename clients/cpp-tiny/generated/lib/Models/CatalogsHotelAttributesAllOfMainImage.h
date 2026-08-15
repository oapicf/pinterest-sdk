
/*
 * CatalogsHotelAttributes_allOf_main_image.h
 *
 * The main hotel image
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelAttributes_allOf_main_image_H_
#define TINY_CPP_CLIENT_CatalogsHotelAttributes_allOf_main_image_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief The main hotel image
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelAttributes_allOf_main_image{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelAttributes_allOf_main_image();
    CatalogsHotelAttributes_allOf_main_image(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelAttributes_allOf_main_image();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string link{};
    std::list<std::string> tag;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelAttributes_allOf_main_image_H_ */
