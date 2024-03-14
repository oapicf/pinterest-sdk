/*
 * PinMediaSourceImageBase64.h
 *
 * Base64-encoded image media source
 */

#ifndef _PinMediaSourceImageBase64_H_
#define _PinMediaSourceImageBase64_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Base64-encoded image media source
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
	std::string getSourceType();

	/*! \brief Set 
	 */
	void setSourceType(std::string  source_type);
	/*! \brief Get 
	 */
	std::string getContentType();

	/*! \brief Set 
	 */
	void setContentType(std::string  content_type);
	/*! \brief Get 
	 */
	std::string getData();

	/*! \brief Set 
	 */
	void setData(std::string  data);

private:
	std::string source_type;
	std::string content_type;
	std::string data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinMediaSourceImageBase64_H_ */
