
/*
 * PrimarySort.h
 *
 * Whether to first sort the report by date or by ID
 */

#ifndef TINY_CPP_CLIENT_PrimarySort_H_
#define TINY_CPP_CLIENT_PrimarySort_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Whether to first sort the report by date or by ID
 *
 *  \ingroup Models
 *
 */

class PrimarySort{
public:

    /*! \brief Constructor.
	 */
    PrimarySort();
    PrimarySort(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PrimarySort();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_PrimarySort_H_ */
