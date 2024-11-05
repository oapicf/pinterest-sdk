/*
 * ItemAttributesRequest_allOf_image_link.h
 *
 * &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.&lt;/p&gt;
 */

#ifndef _ItemAttributesRequest_allOf_image_link_H_
#define _ItemAttributesRequest_allOf_image_link_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief <p><= 2000 characters</p> <p>The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p>
 *
 *  \ingroup Models
 *
 */

class ItemAttributesRequest_allOf_image_link : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemAttributesRequest_allOf_image_link();
	ItemAttributesRequest_allOf_image_link(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemAttributesRequest_allOf_image_link();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemAttributesRequest_allOf_image_link_H_ */
