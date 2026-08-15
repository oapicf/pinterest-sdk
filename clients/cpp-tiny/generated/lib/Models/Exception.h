
/*
 * Exception.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Exception_H_
#define TINY_CPP_CLIENT_Exception_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Exception{
public:

    /*! \brief Constructor.
	 */
    Exception();
    Exception(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Exception();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Exception error code.
	 */
	int getCode();

	/*! \brief Set Exception error code.
	 */
	void setCode(int  code);
	/*! \brief Get Exception message.
	 */
	std::string getMessage();

	/*! \brief Set Exception message.
	 */
	void setMessage(std::string  message);


    private:
    int code{};
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_Exception_H_ */
