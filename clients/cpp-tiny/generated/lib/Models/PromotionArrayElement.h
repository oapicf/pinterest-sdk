
/*
 * PromotionArrayElement.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PromotionArrayElement_H_
#define TINY_CPP_CLIENT_PromotionArrayElement_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Exception.h"
#include "Promotion.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PromotionArrayElement{
public:

    /*! \brief Constructor.
	 */
    PromotionArrayElement();
    PromotionArrayElement(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PromotionArrayElement();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Promotion getData();

	/*! \brief Set 
	 */
	void setData(Promotion data);
	/*! \brief Get 
	 */
	Exception getException();

	/*! \brief Set 
	 */
	void setException(Exception exception);


    private:
    Promotion data;
    Exception exception;
};
}

#endif /* TINY_CPP_CLIENT_PromotionArrayElement_H_ */
