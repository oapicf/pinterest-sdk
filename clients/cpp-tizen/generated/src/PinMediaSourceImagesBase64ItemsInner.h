/*
 * PinMediaSourceImagesBase64_items_inner.h
 *
 * 
 */

#ifndef _PinMediaSourceImagesBase64_items_inner_H_
#define _PinMediaSourceImagesBase64_items_inner_H_


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

class PinMediaSourceImagesBase64_items_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaSourceImagesBase64_items_inner();
	PinMediaSourceImagesBase64_items_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaSourceImagesBase64_items_inner();

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
	/*! \brief Get 
	 */
	std::string getContentType();

	/*! \brief Set 
	 */
	void setContentType(std::string  content_type);
	/*! \brief Get Image to upload as base64 string.
	 */
	std::string getData();

	/*! \brief Set Image to upload as base64 string.
	 */
	void setData(std::string  data);

private:
	std::string title;
	std::string description;
	std::string link;
	std::string content_type;
	std::string data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaSourceImagesBase64_items_inner_H_ */
