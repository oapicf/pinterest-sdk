
/*
 * CustomLabel3Filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CustomLabel3Filter_H_
#define TINY_CPP_CLIENT_CustomLabel3Filter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupFilterOperatorTypeCriteria.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CustomLabel3Filter{
public:

    /*! \brief Constructor.
	 */
    CustomLabel3Filter();
    CustomLabel3Filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomLabel3Filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL3();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL3(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_3);


    private:
    CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_3;
};
}

#endif /* TINY_CPP_CLIENT_CustomLabel3Filter_H_ */
