
/*
 * CatalogsProductGroupCurrencyCriteria.h
 *
 * A currency filter. This filter cannot be negated
 */

#ifndef TINY_CPP_CLIENT_CatalogsProductGroupCurrencyCriteria_H_
#define TINY_CPP_CLIENT_CatalogsProductGroupCurrencyCriteria_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "NonNullableCatalogsCurrency.h"

namespace Tiny {


/*! \brief A currency filter. This filter cannot be negated
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupCurrencyCriteria{
public:

    /*! \brief Constructor.
	 */
    CatalogsProductGroupCurrencyCriteria();
    CatalogsProductGroupCurrencyCriteria(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsProductGroupCurrencyCriteria();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	bool isNegated();

	/*! \brief Set 
	 */
	void setNegated(bool  negated);
	/*! \brief Get 
	 */
	NonNullableCatalogsCurrency getValues();

	/*! \brief Set 
	 */
	void setValues(NonNullableCatalogsCurrency  values);


    private:
    bool negated{};
    NonNullableCatalogsCurrency values;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsProductGroupCurrencyCriteria_H_ */
