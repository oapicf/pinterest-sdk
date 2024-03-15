/*
 * PinMediaSourceImagesBase64.h
 *
 * Multiple Base64-encoded images media source
 */

#ifndef _PinMediaSourceImagesBase64_H_
#define _PinMediaSourceImagesBase64_H_


#include <string>
#include "PinMediaSourceImagesBase64_items_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Multiple Base64-encoded images media source
 *
 *  \ingroup Models
 *
 */

class PinMediaSourceImagesBase64 : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaSourceImagesBase64();
	PinMediaSourceImagesBase64(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaSourceImagesBase64();

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
	std::list<PinMediaSourceImagesBase64_items_inner> getItems();

	/*! \brief Set Array with image objects.
	 */
	void setItems(std::list <PinMediaSourceImagesBase64_items_inner> items);
	/*! \brief Get 
	 */
	int getIndex();

	/*! \brief Set 
	 */
	void setIndex(int  index);

private:
	std::string source_type;
	std::list <PinMediaSourceImagesBase64_items_inner>items;
	int index;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaSourceImagesBase64_H_ */
