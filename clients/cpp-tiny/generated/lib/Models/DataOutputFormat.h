
/*
 * DataOutputFormat.h
 *
 * Format of generated report
 */

#ifndef TINY_CPP_CLIENT_DataOutputFormat_H_
#define TINY_CPP_CLIENT_DataOutputFormat_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Format of generated report
 *
 *  \ingroup Models
 *
 */

class DataOutputFormat{
public:

    /*! \brief Constructor.
	 */
    DataOutputFormat();
    DataOutputFormat(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DataOutputFormat();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_DataOutputFormat_H_ */
