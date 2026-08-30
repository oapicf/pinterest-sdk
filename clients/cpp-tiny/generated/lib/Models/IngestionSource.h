
/*
 * IngestionSource.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_IngestionSource_H_
#define TINY_CPP_CLIENT_IngestionSource_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class IngestionSource{
public:

    /*! \brief Constructor.
	 */
    IngestionSource();
    IngestionSource(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~IngestionSource();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_IngestionSource_H_ */
