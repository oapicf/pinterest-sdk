/*
 * PinMediaWithImage_allOf_images.h
 *
 * 
 */

#ifndef _PinMediaWithImage_allOf_images_H_
#define _PinMediaWithImage_allOf_images_H_


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

class PinMediaWithImage_allOf_images : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaWithImage_allOf_images();
	PinMediaWithImage_allOf_images(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaWithImage_allOf_images();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string get150x150();

	/*! \brief Set 
	 */
	void set150x150(std::string  150x150);
	/*! \brief Get 
	 */
	std::string get400x300();

	/*! \brief Set 
	 */
	void set400x300(std::string  400x300);
	/*! \brief Get 
	 */
	std::string get600x();

	/*! \brief Set 
	 */
	void set600x(std::string  600x);
	/*! \brief Get 
	 */
	std::string get1200x();

	/*! \brief Set 
	 */
	void set1200x(std::string  1200x);

private:
	std::string 150x150;
	std::string 400x300;
	std::string 600x;
	std::string 1200x;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaWithImage_allOf_images_H_ */
