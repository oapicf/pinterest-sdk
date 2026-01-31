/*
 * PinMediaSourceImagesURL.h
 *
 * Multiple URL-based images media source
 */

#ifndef _PinMediaSourceImagesURL_H_
#define _PinMediaSourceImagesURL_H_


#include <string>
#include "PinMediaSourceImagesURLItem.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Multiple URL-based images media source
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
	int getIndex();

	/*! \brief Set 
	 */
	void setIndex(int  index);
	/*! \brief Get Array with image objects.
	 */
	std::list<PinMediaSourceImagesURLItem> getItems();

	/*! \brief Set Array with image objects.
	 */
	void setItems(std::list <PinMediaSourceImagesURLItem> items);
	/*! \brief Get The source type of the media.
	 */
	std::string getSourceType();

	/*! \brief Set The source type of the media.
	 */
	void setSourceType(std::string  source_type);

private:
	int index;
	std::list <PinMediaSourceImagesURLItem>items;
	std::string source_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaSourceImagesURL_H_ */
