
/*
 * IntegrationLogsRequestCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_IntegrationLogsRequestCreate_H_
#define TINY_CPP_CLIENT_IntegrationLogsRequestCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "IntegrationLog.h"
#include <list>

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class IntegrationLogsRequestCreate{
public:

    /*! \brief Constructor.
	 */
    IntegrationLogsRequestCreate();
    IntegrationLogsRequestCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~IntegrationLogsRequestCreate();


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
	void setLogs(std::list<IntegrationLog> logs);


    private:
    std::list<IntegrationLog> logs;
};
}

#endif /* TINY_CPP_CLIENT_IntegrationLogsRequestCreate_H_ */
