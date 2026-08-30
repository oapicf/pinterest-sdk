
/*
 * CurrencyFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CurrencyFilter_H_
#define TINY_CPP_CLIENT_CurrencyFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupCurrencyCriteria.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CurrencyFilter{
public:

    /*! \brief Constructor.
	 */
    CurrencyFilter();
    CurrencyFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CurrencyFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupCurrencyCriteria getCURRENCY();

	/*! \brief Set 
	 */
	void setCURRENCY(CatalogsProductGroupCurrencyCriteria cURRENCY);


    private:
    CatalogsProductGroupCurrencyCriteria cURRENCY;
};
}

#endif /* TINY_CPP_CLIENT_CurrencyFilter_H_ */
