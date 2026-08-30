
/*
 * BudgetDurationType.h
 *
 * Budget duration type for delivery estimates.
 */

#ifndef TINY_CPP_CLIENT_BudgetDurationType_H_
#define TINY_CPP_CLIENT_BudgetDurationType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Budget duration type for delivery estimates.
 *
 *  \ingroup Models
 *
 */

class BudgetDurationType{
public:

    /*! \brief Constructor.
	 */
    BudgetDurationType();
    BudgetDurationType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BudgetDurationType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BudgetDurationType_H_ */
