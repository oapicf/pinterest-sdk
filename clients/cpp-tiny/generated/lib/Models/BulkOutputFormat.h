
/*
 * BulkOutputFormat.h
 *
 * Bulk file output format
 */

#ifndef TINY_CPP_CLIENT_BulkOutputFormat_H_
#define TINY_CPP_CLIENT_BulkOutputFormat_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Bulk file output format
 *
 *  \ingroup Models
 *
 */

class BulkOutputFormat{
public:

    /*! \brief Constructor.
	 */
    BulkOutputFormat();
    BulkOutputFormat(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BulkOutputFormat();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BulkOutputFormat_H_ */
