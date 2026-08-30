/*
 * AdUpdateRequestAllOf1.h
 *
 * 
 */

#ifndef _AdUpdateRequestAllOf1_H_
#define _AdUpdateRequestAllOf1_H_


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

class AdUpdateRequestAllOf1 : public Object {
public:
	/*! \brief Constructor.
	 */
	AdUpdateRequestAllOf1();
	AdUpdateRequestAllOf1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdUpdateRequestAllOf1();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of this ad.
	 */
	std::string getId();

	/*! \brief Set The ID of this ad.
	 */
	void setId(std::string  id);
	/*! \brief Get Pin ID. This field may only be updated for draft ads.
	 */
	std::string getPinId();

	/*! \brief Set Pin ID. This field may only be updated for draft ads.
	 */
	void setPinId(std::string  pin_id);

private:
	std::string id;
	std::string pin_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdUpdateRequestAllOf1_H_ */
