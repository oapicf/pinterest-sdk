/*
 * PinMediaSourceImagesURL_items_inner.h
 *
 * 
 */

#ifndef _PinMediaSourceImagesURL_items_inner_H_
#define _PinMediaSourceImagesURL_items_inner_H_


#include <string>
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

class PinMediaSourceImagesURL_items_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaSourceImagesURL_items_inner();
	PinMediaSourceImagesURL_items_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaSourceImagesURL_items_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get Destination link for the image.
	 */
	std::string getLink();

	/*! \brief Set Destination link for the image.
	 */
	void setLink(std::string  link);
	/*! \brief Get URL of image to upload.
	 */
	std::string getUrl();

	/*! \brief Set URL of image to upload.
	 */
	void setUrl(std::string  url);

private:
	std::string title;
	std::string description;
	std::string link;
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaSourceImagesURL_items_inner_H_ */
