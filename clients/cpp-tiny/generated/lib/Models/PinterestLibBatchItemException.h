
/*
 * Pinterest.Lib.BatchItemException.h
 *
 * Exception details for a batch operation item.
 */

#ifndef TINY_CPP_CLIENT_Pinterest.Lib.BatchItemException_H_
#define TINY_CPP_CLIENT_Pinterest.Lib.BatchItemException_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Exception details for a batch operation item.
 *
 *  \ingroup Models
 *
 */

class Pinterest.Lib.BatchItemException{
public:

    /*! \brief Constructor.
	 */
    Pinterest.Lib.BatchItemException();
    Pinterest.Lib.BatchItemException(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Pinterest.Lib.BatchItemException();


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
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string message);


    private:
    int code{};
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_Pinterest.Lib.BatchItemException_H_ */
