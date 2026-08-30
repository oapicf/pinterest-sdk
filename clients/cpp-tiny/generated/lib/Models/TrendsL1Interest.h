
/*
 * TrendsL1Interest.h
 *
 * L1 interest categories for filtering trends.
 */

#ifndef TINY_CPP_CLIENT_TrendsL1Interest_H_
#define TINY_CPP_CLIENT_TrendsL1Interest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief L1 interest categories for filtering trends.
 *
 *  \ingroup Models
 *
 */

class TrendsL1Interest{
public:

    /*! \brief Constructor.
	 */
    TrendsL1Interest();
    TrendsL1Interest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TrendsL1Interest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_TrendsL1Interest_H_ */
