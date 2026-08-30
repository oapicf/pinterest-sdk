
/*
 * CustomNumber3Filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CustomNumber3Filter_H_
#define TINY_CPP_CLIENT_CustomNumber3Filter_H_


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

class CustomNumber3Filter{
public:

    /*! \brief Constructor.
	 */
    CustomNumber3Filter();
    CustomNumber3Filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomNumber3Filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupUint32Criteria getCUSTOMNUMBER3();

	/*! \brief Set 
	 */
	void setCUSTOMNUMBER3(CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_3);


    private:
    CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_3;
};
}

#endif /* TINY_CPP_CLIENT_CustomNumber3Filter_H_ */
