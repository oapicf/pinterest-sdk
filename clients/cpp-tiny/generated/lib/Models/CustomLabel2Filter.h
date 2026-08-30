
/*
 * CustomLabel2Filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CustomLabel2Filter_H_
#define TINY_CPP_CLIENT_CustomLabel2Filter_H_


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

class CustomLabel2Filter{
public:

    /*! \brief Constructor.
	 */
    CustomLabel2Filter();
    CustomLabel2Filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomLabel2Filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL2();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL2(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_2);


    private:
    CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_2;
};
}

#endif /* TINY_CPP_CLIENT_CustomLabel2Filter_H_ */
