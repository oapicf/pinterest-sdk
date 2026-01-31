/*
 * ImageSize.h
 *
 * 
 */

#ifndef _ImageSize_H_
#define _ImageSize_H_


#include <string>
#include "ImageDetails.h"
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

class ImageSize : public Object {
public:
	/*! \brief Constructor.
	 */
	ImageSize();
	ImageSize(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ImageSize();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ImageDetails get1200x();

	/*! \brief Set 
	 */
	void set1200x(ImageDetails  1200x);
	/*! \brief Get 
	 */
	ImageDetails get150x150();

	/*! \brief Set 
	 */
	void set150x150(ImageDetails  150x150);
	/*! \brief Get 
	 */
	ImageDetails get400x300();

	/*! \brief Set 
	 */
	void set400x300(ImageDetails  400x300);
	/*! \brief Get 
	 */
	ImageDetails get600x();

	/*! \brief Set 
	 */
	void set600x(ImageDetails  600x);

private:
	ImageDetails 1200x;
	ImageDetails 150x150;
	ImageDetails 400x300;
	ImageDetails 600x;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ImageSize_H_ */
