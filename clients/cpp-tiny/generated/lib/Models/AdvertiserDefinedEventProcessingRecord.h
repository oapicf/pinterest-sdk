
/*
 * AdvertiserDefinedEventProcessingRecord.h
 *
 * Processing record for an advertiser defined event operation
 */

#ifndef TINY_CPP_CLIENT_AdvertiserDefinedEventProcessingRecord_H_
#define TINY_CPP_CLIENT_AdvertiserDefinedEventProcessingRecord_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Processing record for an advertiser defined event operation
 *
 *  \ingroup Models
 *
 */

class AdvertiserDefinedEventProcessingRecord{
public:

    /*! \brief Constructor.
	 */
    AdvertiserDefinedEventProcessingRecord();
    AdvertiserDefinedEventProcessingRecord(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdvertiserDefinedEventProcessingRecord();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of exception messages if the operation failed
	 */
	std::list<std::string> getExceptions();

	/*! \brief Set List of exception messages if the operation failed
	 */
	void setExceptions(std::list<std::string> exceptions);
	/*! \brief Get Name of the advertiser defined event
	 */
	std::string getName();

	/*! \brief Set Name of the advertiser defined event
	 */
	void setName(std::string name);
	/*! \brief Get Processing status (success or failure)
	 */
	std::string getStatus();

	/*! \brief Set Processing status (success or failure)
	 */
	void setStatus(std::string status);


    private:
    std::list<std::string> exceptions;
    std::string name{};
    std::string status{};
};
}

#endif /* TINY_CPP_CLIENT_AdvertiserDefinedEventProcessingRecord_H_ */
