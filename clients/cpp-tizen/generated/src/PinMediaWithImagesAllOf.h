/*
 * PinMediaWithImages_allOf.h
 *
 * 
 */

#ifndef _PinMediaWithImages_allOf_H_
#define _PinMediaWithImages_allOf_H_


#include <string>
#include "ImageMetadata.h"
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

class PinMediaWithImages_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaWithImages_allOf();
	PinMediaWithImages_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaWithImages_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<ImageMetadata> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <ImageMetadata> items);

private:
	std::list <ImageMetadata>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaWithImages_allOf_H_ */
