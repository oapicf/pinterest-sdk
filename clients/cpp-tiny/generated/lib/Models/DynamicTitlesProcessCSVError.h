
/*
 * DynamicTitlesProcessCSVError.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DynamicTitlesProcessCSVError_H_
#define TINY_CPP_CLIENT_DynamicTitlesProcessCSVError_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DynamicTitlesProcessCSVError{
public:

    /*! \brief Constructor.
	 */
    DynamicTitlesProcessCSVError();
    DynamicTitlesProcessCSVError(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DynamicTitlesProcessCSVError();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
	 */
	std::string getErrorType();

	/*! \brief Set The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
	 */
	void setErrorType(std::string error_type);
	/*! \brief Get The row number with a validation error. -1 indicates a file-level error.
	 */
	int getRowNumber();

	/*! \brief Set The row number with a validation error. -1 indicates a file-level error.
	 */
	void setRowNumber(int row_number);


    private:
    std::string error_type{};
    int row_number{};
};
}

#endif /* TINY_CPP_CLIENT_DynamicTitlesProcessCSVError_H_ */
