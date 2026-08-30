
/*
 * CatalogsFeedProcessingScheduleTimezone.h
 *
 * The timezone selected for the processing schedule time
 */

#ifndef TINY_CPP_CLIENT_CatalogsFeedProcessingScheduleTimezone_H_
#define TINY_CPP_CLIENT_CatalogsFeedProcessingScheduleTimezone_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The timezone selected for the processing schedule time
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedProcessingScheduleTimezone{
public:

    /*! \brief Constructor.
	 */
    CatalogsFeedProcessingScheduleTimezone();
    CatalogsFeedProcessingScheduleTimezone(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsFeedProcessingScheduleTimezone();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CatalogsFeedProcessingScheduleTimezone_H_ */
