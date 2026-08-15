
/*
 * IngestionSourceOptions.h
 *
 * List of ingestion sources for a conversion event.
 */

#ifndef TINY_CPP_CLIENT_IngestionSourceOptions_H_
#define TINY_CPP_CLIENT_IngestionSourceOptions_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief List of ingestion sources for a conversion event.
 *
 *  \ingroup Models
 *
 */

class IngestionSourceOptions{
public:

    /*! \brief Constructor.
	 */
    IngestionSourceOptions();
    IngestionSourceOptions(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~IngestionSourceOptions();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_IngestionSourceOptions_H_ */
