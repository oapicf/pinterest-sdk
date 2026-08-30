
/*
 * OptimizationType.h
 *
 * Optimization type for ad group delivery estimates. Supported types vary by objective.
 */

#ifndef TINY_CPP_CLIENT_OptimizationType_H_
#define TINY_CPP_CLIENT_OptimizationType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Optimization type for ad group delivery estimates. Supported types vary by objective.
 *
 *  \ingroup Models
 *
 */

class OptimizationType{
public:

    /*! \brief Constructor.
	 */
    OptimizationType();
    OptimizationType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OptimizationType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OptimizationType_H_ */
