/*
 * BrandAccountProfileImage.h
 *
 * Base64-encoded image media source
 */

#ifndef _BrandAccountProfileImage_H_
#define _BrandAccountProfileImage_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Base64-encoded image media source
 *
 *  \ingroup Models
 *
 */

class BrandAccountProfileImage : public Object {
public:
	/*! \brief Constructor.
	 */
	BrandAccountProfileImage();
	BrandAccountProfileImage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BrandAccountProfileImage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getContentType();

	/*! \brief Set 
	 */
	void setContentType(std::string  content_type);
	/*! \brief Get 
	 */
	std::string getData();

	/*! \brief Set 
	 */
	void setData(std::string  data);

private:
	std::string content_type;
	std::string data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BrandAccountProfileImage_H_ */
