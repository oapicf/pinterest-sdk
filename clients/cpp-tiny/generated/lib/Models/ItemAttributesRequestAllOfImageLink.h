
/*
 * ItemAttributesRequest_allOf_image_link.h
 *
 * &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.&lt;/p&gt;
 */

#ifndef TINY_CPP_CLIENT_ItemAttributesRequest_allOf_image_link_H_
#define TINY_CPP_CLIENT_ItemAttributesRequest_allOf_image_link_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief <p><= 2000 characters</p> <p>The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p>
 *
 *  \ingroup Models
 *
 */

class ItemAttributesRequest_allOf_image_link{
public:

    /*! \brief Constructor.
	 */
    ItemAttributesRequest_allOf_image_link();
    ItemAttributesRequest_allOf_image_link(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemAttributesRequest_allOf_image_link();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ItemAttributesRequest_allOf_image_link_H_ */
