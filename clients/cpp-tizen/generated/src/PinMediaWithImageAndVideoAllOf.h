/*
 * PinMediaWithImageAndVideo_allOf.h
 *
 * 
 */

#ifndef _PinMediaWithImageAndVideo_allOf_H_
#define _PinMediaWithImageAndVideo_allOf_H_


#include <string>
#include "PinMediaMetadata.h"
#include <list>
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

class PinMediaWithImageAndVideo_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaWithImageAndVideo_allOf();
	PinMediaWithImageAndVideo_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaWithImageAndVideo_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<PinMediaMetadata> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <PinMediaMetadata> items);

private:
	std::list <PinMediaMetadata>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaWithImageAndVideo_allOf_H_ */
