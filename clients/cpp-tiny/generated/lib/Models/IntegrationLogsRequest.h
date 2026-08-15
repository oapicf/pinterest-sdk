
/*
 * IntegrationLogsRequest.h
 *
 * Batch of logs sent from an integration application.
 */

#ifndef TINY_CPP_CLIENT_IntegrationLogsRequest_H_
#define TINY_CPP_CLIENT_IntegrationLogsRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "IntegrationLog.h"
#include <list>

namespace Tiny {


/*! \brief Batch of logs sent from an integration application.
 *
 *  \ingroup Models
 *
 */

class IntegrationLogsRequest{
public:

    /*! \brief Constructor.
	 */
    IntegrationLogsRequest();
    IntegrationLogsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~IntegrationLogsRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<IntegrationLog> getLogs();

	/*! \brief Set 
	 */
	void setLogs(std::list <IntegrationLog> logs);


    private:
    std::list<IntegrationLog> logs;
};
}

#endif /* TINY_CPP_CLIENT_IntegrationLogsRequest_H_ */
