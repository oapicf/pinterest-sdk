/*
 * TrendingPin.h
 *
 * Pin image data for trending topics
 */

#ifndef _TrendingPin_H_
#define _TrendingPin_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Pin image data for trending topics
 *
 *  \ingroup Models
 *
 */

class TrendingPin : public Object {
public:
	/*! \brief Constructor.
	 */
	TrendingPin();
	TrendingPin(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TrendingPin();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Height of the pin image in pixels
	 */
	int getHeight();

	/*! \brief Set Height of the pin image in pixels
	 */
	void setHeight(int  height);
	/*! \brief Get Unique identifier for the pin
	 */
	std::string getId();

	/*! \brief Set Unique identifier for the pin
	 */
	void setId(std::string  id);
	/*! \brief Get URL of the pin image
	 */
	std::string getSrc();

	/*! \brief Set URL of the pin image
	 */
	void setSrc(std::string  src);
	/*! \brief Get Width of the pin image in pixels
	 */
	int getWidth();

	/*! \brief Set Width of the pin image in pixels
	 */
	void setWidth(int  width);

private:
	int height;
	std::string id;
	std::string src;
	int width;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TrendingPin_H_ */
