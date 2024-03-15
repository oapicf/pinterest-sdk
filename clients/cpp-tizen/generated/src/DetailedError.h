/*
 * DetailedError.h
 *
 * Used for including extra details to a base error
 */

#ifndef _DetailedError_H_
#define _DetailedError_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Used for including extra details to a base error
 *
 *  \ingroup Models
 *
 */

class DetailedError : public Object {
public:
	/*! \brief Constructor.
	 */
	DetailedError();
	DetailedError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DetailedError();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getCode();

	/*! \brief Set 
	 */
	void setCode(int  code);
	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string  message);
	/*! \brief Get 
	 */
	std::string getDetails();

	/*! \brief Set 
	 */
	void setDetails(std::string  details);

private:
	int code;
	std::string message;
	std::string details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DetailedError_H_ */
