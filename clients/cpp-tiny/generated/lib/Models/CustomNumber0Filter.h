
/*
 * CustomNumber0Filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CustomNumber0Filter_H_
#define TINY_CPP_CLIENT_CustomNumber0Filter_H_


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

class CustomNumber0Filter{
public:

    /*! \brief Constructor.
	 */
    CustomNumber0Filter();
    CustomNumber0Filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomNumber0Filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupUint32Criteria getCUSTOMNUMBER0();

	/*! \brief Set 
	 */
	void setCUSTOMNUMBER0(CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_0);


    private:
    CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_0;
};
}

#endif /* TINY_CPP_CLIENT_CustomNumber0Filter_H_ */
