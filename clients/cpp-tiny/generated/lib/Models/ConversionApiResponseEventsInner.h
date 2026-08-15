
/*
 * ConversionApiResponse_events_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ConversionApiResponse_events_inner_H_
#define TINY_CPP_CLIENT_ConversionApiResponse_events_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ConversionApiResponse_events_inner{
public:

    /*! \brief Constructor.
	 */
    ConversionApiResponse_events_inner();
    ConversionApiResponse_events_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionApiResponse_events_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Error message containing more information about why the event failed to be processed.
	 */
	std::string getErrorMessage();

	/*! \brief Set Error message containing more information about why the event failed to be processed.
	 */
	void setErrorMessage(std::string  error_message);
	/*! \brief Get Whether the event was processed successfully.
	 */
	std::string getStatus();

	/*! \brief Set Whether the event was processed successfully.
	 */
	void setStatus(std::string  status);
	/*! \brief Get Warning messages about any fields in the event which are not standard. These are not critical to event processing.
	 */
	std::string getWarningMessage();

	/*! \brief Set Warning messages about any fields in the event which are not standard. These are not critical to event processing.
	 */
	void setWarningMessage(std::string  warning_message);


    private:
    std::string error_message{};
    std::string status{};
    std::string warning_message{};
};
}

#endif /* TINY_CPP_CLIENT_ConversionApiResponse_events_inner_H_ */
