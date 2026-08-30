/*
 * ItemAttributesRequestImageLink.h
 *
 * &lt;&#x3D; 2000 characters The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.
 */

#ifndef _ItemAttributesRequestImageLink_H_
#define _ItemAttributesRequestImageLink_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief <= 2000 characters The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.
 *
 *  \ingroup Models
 *
 */

class ItemAttributesRequestImageLink : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemAttributesRequestImageLink();
	ItemAttributesRequestImageLink(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemAttributesRequestImageLink();

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

#endif /* _ItemAttributesRequestImageLink_H_ */
