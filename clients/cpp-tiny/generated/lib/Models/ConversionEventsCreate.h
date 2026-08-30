
/*
 * ConversionEventsCreate.h
 *
 * Conversion events.
 */

#ifndef TINY_CPP_CLIENT_ConversionEventsCreate_H_
#define TINY_CPP_CLIENT_ConversionEventsCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConversionEventsDataItems.h"
#include <list>

namespace Tiny {


/*! \brief Conversion events.
 *
 *  \ingroup Models
 *
 */

class ConversionEventsCreate{
public:

    /*! \brief Constructor.
	 */
    ConversionEventsCreate();
    ConversionEventsCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionEventsCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A list of events (one or more) encapsulated by a data object.
	 */
	std::list<ConversionEventsDataItems> getData();

	/*! \brief Set A list of events (one or more) encapsulated by a data object.
	 */
	void setData(std::list<ConversionEventsDataItems> data);


    private:
    std::list<ConversionEventsDataItems> data;
};
}

#endif /* TINY_CPP_CLIENT_ConversionEventsCreate_H_ */
