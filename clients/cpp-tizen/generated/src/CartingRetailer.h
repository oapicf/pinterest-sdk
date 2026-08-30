/*
 * CartingRetailer.h
 *
 * 
 */

#ifndef _CartingRetailer_H_
#define _CartingRetailer_H_


#include <string>
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

class CartingRetailer : public Object {
public:
	/*! \brief Constructor.
	 */
	CartingRetailer();
	CartingRetailer(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CartingRetailer();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier for the retailer
	 */
	std::string getRetailerId();

	/*! \brief Set Unique identifier for the retailer
	 */
	void setRetailerId(std::string  retailer_id);
	/*! \brief Get Name of the retailer
	 */
	std::string getRetailerName();

	/*! \brief Set Name of the retailer
	 */
	void setRetailerName(std::string  retailer_name);

private:
	std::string retailer_id;
	std::string retailer_name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CartingRetailer_H_ */
