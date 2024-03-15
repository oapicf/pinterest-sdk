/*
 * PinMediaSourceImagesURL.h
 *
 * Multiple images urls-based media source
 */

#ifndef _PinMediaSourceImagesURL_H_
#define _PinMediaSourceImagesURL_H_


#include <string>
#include "PinMediaSourceImagesURL_items_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Multiple images urls-based media source
 *
 *  \ingroup Models
 *
 */

class PinMediaSourceImagesURL : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaSourceImagesURL();
	PinMediaSourceImagesURL(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaSourceImagesURL();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getSourceType();

	/*! \brief Set 
	 */
	void setSourceType(std::string  source_type);
	/*! \brief Get Array with image objects.
	 */
	std::list<PinMediaSourceImagesURL_items_inner> getItems();

	/*! \brief Set Array with image objects.
	 */
	void setItems(std::list <PinMediaSourceImagesURL_items_inner> items);
	/*! \brief Get 
	 */
	int getIndex();

	/*! \brief Set 
	 */
	void setIndex(int  index);

private:
	std::string source_type;
	std::list <PinMediaSourceImagesURL_items_inner>items;
	int index;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaSourceImagesURL_H_ */
