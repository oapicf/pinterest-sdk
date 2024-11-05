/*
 * SummaryPin.h
 *
 * Summarized pin information
 */

#ifndef _SummaryPin_H_
#define _SummaryPin_H_


#include <string>
#include "PinMedia.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Summarized pin information
 *
 *  \ingroup Models
 *
 */

class SummaryPin : public Object {
public:
	/*! \brief Constructor.
	 */
	SummaryPin();
	SummaryPin(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SummaryPin();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	PinMedia getMedia();

	/*! \brief Set 
	 */
	void setMedia(PinMedia  media);
	/*! \brief Get 
	 */
	std::string getAltText();

	/*! \brief Set 
	 */
	void setAltText(std::string  alt_text);
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
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);

private:
	PinMedia media;
	std::string alt_text;
	std::string link;
	std::string title;
	std::string description;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SummaryPin_H_ */
