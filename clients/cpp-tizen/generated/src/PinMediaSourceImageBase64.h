/*
 * PinMediaSourceImageBase64.h
 *
 * Image Base64-based media source.
 */

#ifndef _PinMediaSourceImageBase64_H_
#define _PinMediaSourceImageBase64_H_


#include <string>
#include "ContentType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Image Base64-based media source.
 *
 *  \ingroup Models
 *
 */

class PinMediaSourceImageBase64 : public Object {
public:
	/*! \brief Constructor.
	 */
	PinMediaSourceImageBase64();
	PinMediaSourceImageBase64(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinMediaSourceImageBase64();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ContentType getContentType();

	/*! \brief Set 
	 */
	void setContentType(ContentType  content_type);
	/*! \brief Get 
	 */
	std::string getData();

	/*! \brief Set 
	 */
	void setData(std::string  data);
	/*! \brief Get Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
	 */
	bool getIsStandard();

	/*! \brief Set Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
	 */
	void setIsStandard(bool  is_standard);
	/*! \brief Get The source type of the media.
	 */
	std::string getSourceType();

	/*! \brief Set The source type of the media.
	 */
	void setSourceType(std::string  source_type);

private:
	ContentType content_type;
	std::string data;
	bool is_standard;
	std::string source_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaSourceImageBase64_H_ */
