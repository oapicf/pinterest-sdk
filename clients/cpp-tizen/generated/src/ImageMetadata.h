/*
 * ImageMetadata.h
 *
 * 
 */

#ifndef _ImageMetadata_H_
#define _ImageMetadata_H_


#include <string>
#include "ImageSize.h"
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

class ImageMetadata : public Object {
public:
	/*! \brief Constructor.
	 */
	ImageMetadata();
	ImageMetadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ImageMetadata();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	ImageSize getImages();

	/*! \brief Set 
	 */
	void setImages(ImageSize  images);
	/*! \brief Get 
	 */
	std::string getItemType();

	/*! \brief Set 
	 */
	void setItemType(std::string  item_type);
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
	std::string description;
	ImageSize images;
	std::string item_type;
	std::string link;
	std::string title;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ImageMetadata_H_ */
