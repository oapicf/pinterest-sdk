
/*
 * SSIOOrderLineType.h
 *
 * The type of an SSIO order line.
 */

#ifndef TINY_CPP_CLIENT_SSIOOrderLineType_H_
#define TINY_CPP_CLIENT_SSIOOrderLineType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The type of an SSIO order line.
 *
 *  \ingroup Models
 *
 */

class SSIOOrderLineType{
public:

    /*! \brief Constructor.
	 */
    SSIOOrderLineType();
    SSIOOrderLineType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SSIOOrderLineType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_SSIOOrderLineType_H_ */
