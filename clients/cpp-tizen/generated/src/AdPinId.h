/*
 * AdPinId.h
 *
 * 
 */

#ifndef _AdPinId_H_
#define _AdPinId_H_


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

class AdPinId : public Object {
public:
	/*! \brief Constructor.
	 */
	AdPinId();
	AdPinId(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdPinId();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Pin ID.
	 */
	std::string getPinId();

	/*! \brief Set Pin ID.
	 */
	void setPinId(std::string  pin_id);

private:
	std::string pin_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdPinId_H_ */
