/*
 * ItemAttributes_allOf.h
 *
 * 
 */

#ifndef _ItemAttributes_allOf_H_
#define _ItemAttributes_allOf_H_


#include <string>
#include <list>
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

class ItemAttributes_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemAttributes_allOf();
	ItemAttributes_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemAttributes_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get <p><= 2000 characters</p> <p>The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.</p>
	 */
	std::list<std::string> getAdditionalImageLink();

	/*! \brief Set <p><= 2000 characters</p> <p>The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.</p>
	 */
	void setAdditionalImageLink(std::list <std::string> additional_image_link);
	/*! \brief Get <p><= 2000 characters</p> <p>The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p>
	 */
	std::list<std::string> getImageLink();

	/*! \brief Set <p><= 2000 characters</p> <p>The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p>
	 */
	void setImageLink(std::list <std::string> image_link);

private:
	std::list <std::string>additional_image_link;
	std::list <std::string>image_link;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemAttributes_allOf_H_ */
