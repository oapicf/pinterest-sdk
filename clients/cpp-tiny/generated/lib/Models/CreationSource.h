
/*
 * CreationSource.h
 *
 * The source of conversion events ingestion
 */

#ifndef TINY_CPP_CLIENT_CreationSource_H_
#define TINY_CPP_CLIENT_CreationSource_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The source of conversion events ingestion
 *
 *  \ingroup Models
 *
 */

class CreationSource{
public:

    /*! \brief Constructor.
	 */
    CreationSource();
    CreationSource(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreationSource();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreationSource_H_ */
