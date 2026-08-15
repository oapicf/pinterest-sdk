
/*
 * ConversionEvents.h
 *
 * A list of events (one or more) encapsulated by a data object.
 */

#ifndef TINY_CPP_CLIENT_ConversionEvents_H_
#define TINY_CPP_CLIENT_ConversionEvents_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConversionEvents_data_inner.h"
#include <list>

namespace Tiny {


/*! \brief A list of events (one or more) encapsulated by a data object.
 *
 *  \ingroup Models
 *
 */

class ConversionEvents{
public:

    /*! \brief Constructor.
	 */
    ConversionEvents();
    ConversionEvents(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionEvents();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<ConversionEvents_data_inner> getData();

	/*! \brief Set 
	 */
	void setData(std::list <ConversionEvents_data_inner> data);


    private:
    std::list<ConversionEvents_data_inner> data;
};
}

#endif /* TINY_CPP_CLIENT_ConversionEvents_H_ */
