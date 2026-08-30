
/*
 * CatalogsHotelMainImage.h
 *
 * The main hotel image
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelMainImage_H_
#define TINY_CPP_CLIENT_CatalogsHotelMainImage_H_


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

class CatalogsHotelMainImage{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelMainImage();
    CatalogsHotelMainImage(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelMainImage();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get <= 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
	 */
	std::string getLink();

	/*! \brief Set <= 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
	 */
	void setLink(std::string link);
	/*! \brief Get Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
	 */
	std::list<std::string> getTag();

	/*! \brief Set Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
	 */
	void setTag(std::list<std::string> tag);


    private:
    std::string link{};
    std::list<std::string> tag;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelMainImage_H_ */
