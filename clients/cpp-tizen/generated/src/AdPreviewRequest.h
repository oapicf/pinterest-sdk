/*
 * AdPreviewRequest.h
 *
 * 
 */

#ifndef _AdPreviewRequest_H_
#define _AdPreviewRequest_H_


#include <string>
#include "AdPreviewCreateFromImage.h"
#include "AdPreviewCreateFromPin.h"
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

class AdPreviewRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	AdPreviewRequest();
	AdPreviewRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdPreviewRequest();

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
	/*! \brief Get Pin ID.
	 */
	std::string getPinId();

	/*! \brief Set Pin ID.
	 */
	void setPinId(std::string  pin_id);

private:
	std::string image_url;
	std::string title;
	std::string pin_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdPreviewRequest_H_ */
