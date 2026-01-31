/*
 * PinMediaSourceImagesBase64Item.h
 *
 * 
 */

#ifndef _PinMediaSourceImagesBase64Item_H_
#define _PinMediaSourceImagesBase64Item_H_


#include <string>
#include "ContentType.h"
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

class PinMediaSourceImagesBase64Item : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaSourceImagesBase64Item();
	PinMediaSourceImagesBase64Item(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaSourceImagesBase64Item();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ContentType getContentType();

	/*! \brief Set 
	 */
	void setContentType(ContentType  content_type);
	/*! \brief Get 
	 */
	std::string getData();

	/*! \brief Set 
	 */
	void setData(std::string  data);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	std::string getLink();

	/*! \brief Set 
	 */
	void setLink(std::string  link);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);

private:
	ContentType content_type;
	std::string data;
	std::string description;
	std::string link;
	std::string title;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaSourceImagesBase64Item_H_ */
