
/*
 * PriceFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PriceFilter_H_
#define TINY_CPP_CLIENT_PriceFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PriceFilterPrice.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PriceFilter{
public:

    /*! \brief Constructor.
	 */
    PriceFilter();
    PriceFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PriceFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	PriceFilterPrice getPRICE();

	/*! \brief Set 
	 */
	void setPRICE(PriceFilterPrice pRICE);


    private:
    PriceFilterPrice pRICE;
};
}

#endif /* TINY_CPP_CLIENT_PriceFilter_H_ */
