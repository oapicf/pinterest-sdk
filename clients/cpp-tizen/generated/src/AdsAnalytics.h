/*
 * AdsAnalytics.h
 *
 * 
 */

#ifndef _AdsAnalytics_H_
#define _AdsAnalytics_H_


#include <string>
#include "Date.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdsAnalytics : public Object {
public:
	/*! \brief Constructor.
	 */
	AdsAnalytics();
	AdsAnalytics(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdsAnalytics();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getADID();

	/*! \brief Set 
	 */
	void setADID(std::string  aD_ID);
	/*! \brief Get 
	 */
	Date getDATE();

	/*! \brief Set 
	 */
	void setDATE(Date  dATE);

private:
	std::string aD_ID;
	Date dATE;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdsAnalytics_H_ */
