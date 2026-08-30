/*
 * DynamicTitlesProcessCSVError.h
 *
 * 
 */

#ifndef _DynamicTitlesProcessCSVError_H_
#define _DynamicTitlesProcessCSVError_H_


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

class DynamicTitlesProcessCSVError : public Object {
public:
	/*! \brief Constructor.
	 */
	DynamicTitlesProcessCSVError();
	DynamicTitlesProcessCSVError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DynamicTitlesProcessCSVError();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
	 */
	std::string getErrorType();

	/*! \brief Set The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
	 */
	void setErrorType(std::string  error_type);
	/*! \brief Get The row number with a validation error. -1 indicates a file-level error.
	 */
	int getRowNumber();

	/*! \brief Set The row number with a validation error. -1 indicates a file-level error.
	 */
	void setRowNumber(int  row_number);

private:
	std::string error_type;
	int row_number;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DynamicTitlesProcessCSVError_H_ */
