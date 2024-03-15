/*
 * PinMediaSourceImageURL.h
 *
 * Image URL-based media source
 */

#ifndef _PinMediaSourceImageURL_H_
#define _PinMediaSourceImageURL_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Image URL-based media source
 *
 *  \ingroup Models
 *
 */

class PinMediaSourceImageURL : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaSourceImageURL();
	PinMediaSourceImageURL(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaSourceImageURL();

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
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);
	/*! \brief Get Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
	 */
	bool getIsStandard();

	/*! \brief Set Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
	 */
	void setIsStandard(bool  is_standard);

private:
	std::string source_type;
	std::string url;
	bool is_standard;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaSourceImageURL_H_ */
