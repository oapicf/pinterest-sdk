
/*
 * AdArrayResponseElement.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdArrayResponseElement_H_
#define TINY_CPP_CLIENT_AdArrayResponseElement_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdResponse.h"
#include "Exception.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdArrayResponseElement{
public:

    /*! \brief Constructor.
	 */
    AdArrayResponseElement();
    AdArrayResponseElement(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdArrayResponseElement();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AdResponse getData();

	/*! \brief Set 
	 */
	void setData(AdResponse  data);
	/*! \brief Get 
	 */
	Exception getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(Exception  exceptions);


    private:
    AdResponse data;
    Exception exceptions;
};
}

#endif /* TINY_CPP_CLIENT_AdArrayResponseElement_H_ */
