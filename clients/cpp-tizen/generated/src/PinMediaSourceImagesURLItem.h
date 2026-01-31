/*
 * PinMediaSourceImagesURLItem.h
 *
 * 
 */

#ifndef _PinMediaSourceImagesURLItem_H_
#define _PinMediaSourceImagesURLItem_H_


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

class PinMediaSourceImagesURLItem : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaSourceImagesURLItem();
	PinMediaSourceImagesURLItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaSourceImagesURLItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	std::string getLink();

	/*! \brief Set 
	 */
	void setLink(std::string  link);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);

private:
	std::string description;
	std::string link;
	std::string title;
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaSourceImagesURLItem_H_ */
