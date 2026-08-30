
/*
 * ItemAttributesRequestImageLink.h
 *
 * &lt;&#x3D; 2000 characters The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.
 */

#ifndef TINY_CPP_CLIENT_ItemAttributesRequestImageLink_H_
#define TINY_CPP_CLIENT_ItemAttributesRequestImageLink_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief <= 2000 characters The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.
 *
 *  \ingroup Models
 *
 */

class ItemAttributesRequestImageLink{
public:

    /*! \brief Constructor.
	 */
    ItemAttributesRequestImageLink();
    ItemAttributesRequestImageLink(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemAttributesRequestImageLink();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ItemAttributesRequestImageLink_H_ */
