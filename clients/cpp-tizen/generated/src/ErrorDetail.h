/*
 * ErrorDetail.h
 *
 * 
 */

#ifndef _ErrorDetail_H_
#define _ErrorDetail_H_


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

class ErrorDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	ErrorDetail();
	ErrorDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ErrorDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Number of records with this error
	 */
	int getCount();

	/*! \brief Set Number of records with this error
	 */
	void setCount(int  count);
	/*! \brief Get Numeric error code
	 */
	int getErrorCode();

	/*! \brief Set Numeric error code
	 */
	void setErrorCode(int  error_code);
	/*! \brief Get Error message description
	 */
	std::string getMessage();

	/*! \brief Set Error message description
	 */
	void setMessage(std::string  message);

private:
	int count;
	int error_code;
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ErrorDetail_H_ */
