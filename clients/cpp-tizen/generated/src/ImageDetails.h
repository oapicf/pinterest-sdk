/*
 * ImageDetails.h
 *
 * 
 */

#ifndef _ImageDetails_H_
#define _ImageDetails_H_


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

class ImageDetails : public Object {
public:
	/*! \brief Constructor.
	 */
	ImageDetails();
	ImageDetails(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ImageDetails();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getWidth();

	/*! \brief Set 
	 */
	void setWidth(int  width);
	/*! \brief Get 
	 */
	int getHeight();

	/*! \brief Set 
	 */
	void setHeight(int  height);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);

private:
	int width;
	int height;
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ImageDetails_H_ */
