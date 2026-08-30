
/*
 * ErrorDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ErrorDetail_H_
#define TINY_CPP_CLIENT_ErrorDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ErrorDetail{
public:

    /*! \brief Constructor.
	 */
    ErrorDetail();
    ErrorDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ErrorDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Number of records with this error
	 */
	int getCount();

	/*! \brief Set Number of records with this error
	 */
	void setCount(int count);
	/*! \brief Get Numeric error code
	 */
	int getErrorCode();

	/*! \brief Set Numeric error code
	 */
	void setErrorCode(int error_code);
	/*! \brief Get Error message description
	 */
	std::string getMessage();

	/*! \brief Set Error message description
	 */
	void setMessage(std::string message);


    private:
    int count{};
    int error_code{};
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_ErrorDetail_H_ */
