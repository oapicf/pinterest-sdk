
/*
 * DetailedError.h
 *
 * Used for including extra details to a base error
 */

#ifndef TINY_CPP_CLIENT_DetailedError_H_
#define TINY_CPP_CLIENT_DetailedError_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Object.h"

namespace Tiny {


/*! \brief Used for including extra details to a base error
 *
 *  \ingroup Models
 *
 */

class DetailedError{
public:

    /*! \brief Constructor.
	 */
    DetailedError();
    DetailedError(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DetailedError();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getCode();

	/*! \brief Set 
	 */
	void setCode(int code);
	/*! \brief Get 
	 */
	Object getDetails();

	/*! \brief Set 
	 */
	void setDetails(Object details);
	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string message);


    private:
    int code{};
    Object details;
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_DetailedError_H_ */
