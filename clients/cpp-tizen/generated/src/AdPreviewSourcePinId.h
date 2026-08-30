/*
 * AdPreviewSourcePinId.h
 *
 * Ad preview source from an existing Pin.
 */

#ifndef _AdPreviewSourcePinId_H_
#define _AdPreviewSourcePinId_H_


#include <string>
#include "AdPinPreviewCreativeType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ad preview source from an existing Pin.
 *
 *  \ingroup Models
 *
 */

class AdPreviewSourcePinId : public Object {
public:
	/*! \brief Constructor.
	 */
	AdPreviewSourcePinId();
	AdPreviewSourcePinId(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdPreviewSourcePinId();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Creative type of the ad preview.
	 */
	AdPinPreviewCreativeType getCreativeType();

	/*! \brief Set Creative type of the ad preview.
	 */
	void setCreativeType(AdPinPreviewCreativeType  creative_type);
	/*! \brief Get Pin ID.
	 */
	std::string getPinId();

	/*! \brief Set Pin ID.
	 */
	void setPinId(std::string  pin_id);

private:
	AdPinPreviewCreativeType creative_type;
	std::string pin_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdPreviewSourcePinId_H_ */
