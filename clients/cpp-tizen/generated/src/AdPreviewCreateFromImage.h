/*
 * AdPreviewCreateFromImage.h
 *
 * 
 */

#ifndef _AdPreviewCreateFromImage_H_
#define _AdPreviewCreateFromImage_H_


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

class AdPreviewCreateFromImage : public Object {
public:
	/*! \brief Constructor.
	 */
	AdPreviewCreateFromImage();
	AdPreviewCreateFromImage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdPreviewCreateFromImage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Image URL.
	 */
	std::string getImageUrl();

	/*! \brief Set Image URL.
	 */
	void setImageUrl(std::string  image_url);
	/*! \brief Get Title displayed below ad.
	 */
	std::string getTitle();

	/*! \brief Set Title displayed below ad.
	 */
	void setTitle(std::string  title);

private:
	std::string image_url;
	std::string title;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdPreviewCreateFromImage_H_ */
