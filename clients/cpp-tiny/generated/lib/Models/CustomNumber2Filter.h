
/*
 * CustomNumber2Filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CustomNumber2Filter_H_
#define TINY_CPP_CLIENT_CustomNumber2Filter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupUint32Criteria.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CustomNumber2Filter{
public:

    /*! \brief Constructor.
	 */
    CustomNumber2Filter();
    CustomNumber2Filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomNumber2Filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupUint32Criteria getCUSTOMNUMBER2();

	/*! \brief Set 
	 */
	void setCUSTOMNUMBER2(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_2);


    private:
    CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_2;
};
}

#endif /* TINY_CPP_CLIENT_CustomNumber2Filter_H_ */
